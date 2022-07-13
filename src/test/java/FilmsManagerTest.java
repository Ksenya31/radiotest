import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmsManagerTest {
    @Test
    public void film() {
        FilmManager manager = new FilmManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Four");
        manager.add("Five");
        manager.add("Six");
        manager.add("Seven");
        manager.add("Eight");
        manager.add("Nine");
        manager.add("Ten");
        String[] expected = {"First", "Second", "Third", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String[] actual = manager.findAll();


        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmOne() {
        FilmManager manager = new FilmManager();
        manager.add("First");
        String[] expected = {"First"};
        String[] actual = manager.findAll();


        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmNull() {
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();


        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmMax() {
        FilmManager manager = new FilmManager(10);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Four");
        manager.add("Five");
        manager.add("Six");
        manager.add("Seven");
        manager.add("Eight");
        manager.add("Nine");
        manager.add("Ten");
        manager.add("Eleven");
        String[] expected = {"Eleven", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Third", "Second"};
        String[] actual = manager.findLast();


        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmMin() {
        FilmManager manager = new FilmManager(10);
        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"Third", "Second", "First"};
        String[] actual = manager.findLast();


        assertArrayEquals(expected, actual);
    }
}
