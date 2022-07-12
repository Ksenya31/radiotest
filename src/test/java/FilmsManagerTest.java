import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmsManagerTest {
    @Test
    public void film(){
        FilmManager manager = new FilmManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        String[] expected = {"First","Second","Third"};
        String[]actual = manager.findAll();


        assertArrayEquals(expected, actual);
    }
    @Test
    public void filmNull(){
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[]actual = manager.findAll();


        assertArrayEquals(expected, actual);
    }
    @Test
    public void filmTen(){
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[]actual = manager.findLast(10);


        assertArrayEquals(expected, actual);
    }
}
