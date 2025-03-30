package org.rituraj.junit.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaskProcessorTest {
    TaskProcessor taskProcessor;
    @BeforeEach
    void setup(){
        taskProcessor = new TaskProcessor();
    }

    @Test
    @DisplayName("Testing Timeout annotation")
    @Timeout(value = 4 , unit = TimeUnit.SECONDS)
    void testStimulateTask() throws InterruptedException{
        taskProcessor.stimulateTask();
    }


    // wont work as test is abolished by junit rather than the method being tested throws Interrupted exception
//    @Test
//    @DisplayName("Testing Timeout annotation")
//    @Timeout(value = 2, unit = TimeUnit.SECONDS)
//    void testStimulateTaskException() throws InterruptedException{
//        assertThrows(InterruptedException.class, () -> taskProcessor.stimulateTask());
//    }
}
