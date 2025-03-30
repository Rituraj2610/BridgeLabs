package org.rituraj.junit.basic;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    @DisplayName("Test connection is established")
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected.");
    }

    @Test
    @DisplayName("Test disconnection after test")
    void testConnectionClosed() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Database should be disconnected.");
    }
}

