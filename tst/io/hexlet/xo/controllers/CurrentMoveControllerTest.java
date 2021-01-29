package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Figure;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CurrentMoveControllerTest {

    @Test
    public void currentMoveWhenNextMoveIsO() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();

        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);

            assertEquals(Figure.O, currentMoveController.currentMove(field));
        }
    }

    @Test
    public void currentMoveWhenNextMoveIsX() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();

        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);

            assertEquals(Figure.X, currentMoveController.currentMove(field));
        }
    }

    @Test
    public void currentMoveWhenNoNextMove() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        final Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.O);
        field.setFigure(new Point(0, 1), Figure.X);
        field.setFigure(new Point(0, 2), Figure.O);
        field.setFigure(new Point(1, 0), Figure.X);
        field.setFigure(new Point(1, 1), Figure.O);
        field.setFigure(new Point(1, 2), Figure.X);
        field.setFigure(new Point(2, 0), Figure.O);
        field.setFigure(new Point(2, 1), Figure.X);
        field.setFigure(new Point(2, 2), Figure.X);

        assertNull(currentMoveController.currentMove(field));
    }
}