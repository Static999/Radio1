package ru.netology;

public class Radio2 {


    private int currentRadioStationNumber;
    private int radioStationNumber = 10;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 9;
    private int currentVolume = 50;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio2(int number) {
        this.radioStationNumber = number;
        this.maxRadioStationNumber = number - 1;
    }

    public Radio2() {

    }


    public void setCurrentRadioStation(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        setCurrentRadioStation(currentRadioStationNumber + 1);
    }

    public void prev() {
        setCurrentRadioStation(currentRadioStationNumber - 1);
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        this.radioStationNumber = radioStationNumber;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public void setMinRadioStationNumber(int minRadioStationNumber) {
        this.minRadioStationNumber = minRadioStationNumber;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public void setMaxRadioStationNumber(int maxRadioStationNumber) {
        this.maxRadioStationNumber = maxRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

}
