package io.hexlet.xo.model;

import io.hexlet.xo.model.exceptions.InvalidPointException;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void getSize() {
        final Field field = new Field(3);

        assertEquals(3, field.getSize());
    }

    @Test
    void setFigure() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);

    }

    @Test
    void getFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, 0);

        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    void getFigureWhenXIsLessThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(-1, 0);
        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException ignored) {}
    }

    @Test
    void getFigureWhenYIsLessThanZero() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, -1);
        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException ignored) {}
    }

    @Test
    void getFigureWhenXIsMoreThanSize() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(field.getSize() + 1, 0);
        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException ignored) {}
    }

    @Test
    void getFigureWhenYIsMoreThanSize() throws Exception {
        final Field field = new Field(3);
        final Point inputPoint = new Point(0, field.getSize() + 1);
        try {
            field.getFigure(inputPoint);
            fail();
        } catch (final InvalidPointException ignored) {}
    }
}