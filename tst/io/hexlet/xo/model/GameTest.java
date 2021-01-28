package io.hexlet.xo.model;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {


    @Test
    void getPlayers() {
    }

    @Test
    void getField() {
        final Field expectedValue = new Field();

        final Game game = new Game(null, expectedValue, null);

        final Field actualValue = game.getField();

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void getName() {
        final String expectedValue = "Dima";

        final Game game = new Game(null, null, expectedValue);

        final String actualValue = game.getName();

        assertEquals(expectedValue, actualValue);
    }
}