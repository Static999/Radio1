package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNotStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNotStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.nextVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.nextVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNotVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNotVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.beforeVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void lowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.beforeVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNotVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        radio.beforeVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNotVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.beforeVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
