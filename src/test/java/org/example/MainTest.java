package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void addNumbers_shouldReturnSumAsIntegerValue_whenCalledWith4_5(){
        //Given - what we know

        int num1, num2, expected;
        num1 = 4;
        num2 = 5;
        expected = 9;
        // When - the actual method to be test is being called
int actual = Main.addNumbers(num1, num2);
        // Then  - test the expected and actual results
        assertEquals(expected, actual);
    }

}