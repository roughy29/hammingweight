package com.example.hammingweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammingWeightControllerTest {

    private hammingweightcontroller hammingweightcontroller = new hammingweightcontroller();


    @Test
    public void testCalculateHammingWeight() {
        // Arrange
        String number = "01234";
        int expectedWeight = 4;

        // Act
        int actualWeight = hammingweightcontroller.calculateHammingWeight(number);

        // Assert
        Assertions.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testGetLastString() {
        // Arrange
        String expectedLastString = "01234";

        // Act
        hammingweightcontroller.calculateHammingWeight(expectedLastString);
        String actualLastString = hammingweightcontroller.getLastString();

        // Assert
        Assertions.assertEquals(expectedLastString, actualLastString);
    }
}
