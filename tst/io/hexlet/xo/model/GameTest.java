package io.hexlet.xo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    @Test
    void getPlayers() {
    }

    @Test
    void getField() {
        final Field expectedValue = new Field(3);

        final Game game = new Game(null, expectedValue, null);

        final Field actualValue = game.getField();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void getName() throws Exception {
        final String expectedValue = "XO";
        final String expectedNullValue = null;

        final Game game = new Game(null, null, expectedValue);

        final String actualValue = game.getName();

        assertEquals(expectedValue, actualValue);
        assertNull(expectedNullValue);
    }
}