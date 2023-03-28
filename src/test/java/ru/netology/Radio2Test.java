package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio2Test {


    @Test
    public void shouldSetDefaultRadioStationNumber() {
        Radio2 radio2 = new Radio2();

        int expected = 10;
        int actual = radio2.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationNumberZero() {
        Radio2 radio2 = new Radio2();

        radio2.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberOne() {
        Radio2 radio2 = new Radio2();

        radio2.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberEight() {
        Radio2 radio2 = new Radio2();

        radio2.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberNine() {
        Radio2 radio2 = new Radio2();

        radio2.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumberTen() {
        Radio2 radio2 = new Radio2();

        radio2.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNextFromMiddle() {
        Radio2 radio2 = new Radio2();
        radio2.setCurrentRadioStation(5);

        radio2.next();

        int expected = 6;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNextFromEnd() {
        Radio2 radio2 = new Radio2();
        radio2.setCurrentRadioStation(9);

        radio2.next();

        int expected = 0;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationPrevFromMiddle() {
        Radio2 radio2 = new Radio2();
        radio2.setCurrentRadioStation(5);

        radio2.prev();

        int expected = 4;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationPrevFromStart() {
        Radio2 radio2 = new Radio2();
        radio2.setCurrentRadioStation(0);

        radio2.prev();

        int expected = 9;
        int actual = radio2.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolumeFromMiddle() {
        Radio2 radio2 = new Radio2();
        radio2.setCurrentVolume(5);

        radio2.increaseVolume();

        int expected = 6;
        int actual = radio2.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromEnd() {
        Radio2 radio2 = new Radio2();
        radio2.setCurrentVolume(100);

        radio2.increaseVolume();

        int expected = 100;
        int actual = radio2.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromMiddle() {
        Radio2 radio2 = new Radio2();
        radio2.setCurrentVolume(5);

        radio2.decreaseVolume();

        int expected = 4;
        int actual = radio2.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromStart() {
        Radio2 radio2 = new Radio2();
        radio2.setCurrentVolume(0);

        radio2.decreaseVolume();

        int expected = 0;
        int actual = radio2.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
