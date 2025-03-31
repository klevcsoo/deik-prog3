package org.example.journey;

public class JourneyBuilder {
    private final Journey product = new Journey();

    public JourneyBuilder addDestination(String destinationName) {
        this.product.addDestination(destinationName);
        return this;
    }

    public JourneyBuilder addDestination(String destinationName, int lengthDays) {
        this.product.addDestination(destinationName, lengthDays);
        return this;
    }

    public Journey build() {
        return this.product;
    }
}
