package org.rituraj.junit.advance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BankingTransactionTest {
    BankingTransaction bankingTransaction;
    double balance;
    double amount ;
    @BeforeEach
    void setup(){
        bankingTransaction = new BankingTransaction();
        balance = 1000.12;
        amount = 1000.88;
    }

    @Test
    @DisplayName("Testing deposit functionality")
    void testDeposit(){

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        bankingTransaction.deposit(balance, amount);

        assertEquals("Amount deposited successfully", outputStream.toString().trim());

        assertEquals(2001.00, bankingTransaction.deposit(balance, amount));

        System.setOut(System.out);
    }

    @Test
    @DisplayName("Testing successful withdrawal functionality")
    void testPositiveWithdrawal(){
        assertEquals(1000.00, bankingTransaction.withdraw(balance, 0.12));
    }

    @Test
    @DisplayName("Testing failed withdrawal functionality")
    void testNegativeWithdrawal(){
        assertThrows(IllegalArgumentException.class, () -> bankingTransaction.withdraw(balance, amount));
    }
}
