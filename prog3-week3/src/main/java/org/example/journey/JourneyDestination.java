package org.example.journey;

public class JourneyDestination {

    private String name;
    private int lengthDays;

    public JourneyDestination(String name, int lengthDays) {
        this.name = name;
        this.lengthDays = lengthDays;
    }

    public JourneyDestination(String name) {
        this.name = name;
        this.lengthDays = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthDays() {
        return lengthDays;
    }

    public void setLengthDays(int lengthDays) {
        this.lengthDays = lengthDays;
    }
}
