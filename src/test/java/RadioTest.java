import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void NextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previous();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetRadio() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void DicreseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.dicreseVolume();
        int expected =  0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void VolRadio() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

