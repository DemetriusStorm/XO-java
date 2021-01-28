package io.hexlet.xo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        final String expectedInputValue = "Dima";

        final Player player = new Player(expectedInputValue, null);

        final String actualValue = player.getName();

        assertEquals(expectedInputValue, actualValue);
    }

    @Test
    void getFigure() {
        final Figure expectedInputValue = Figure.X;

        final Player player = new Player(null, expectedInputValue);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedInputValue, actualValue);
    }
}