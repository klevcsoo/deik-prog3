package org.example.journey;

import java.util.ArrayList;
import java.util.List;

public class Journey {
    private final List<JourneyDestination> destinationList = new ArrayList<>();

    public void addDestination(String destinationName) {
        this.destinationList.add(new JourneyDestination(destinationName));
    }

    public void addDestination(String destinationName, int lengthDays) {
        this.destinationList.add(new JourneyDestination(destinationName, lengthDays));
    }

    public int getDestinationCount() {
        return this.destinationList.size();
    }

    public int journeyLengthDays() {
        int sum = 0;

        for (JourneyDestination dest : this.destinationList) {
            sum += dest.getLengthDays();
        }

        return sum;
    }
}
