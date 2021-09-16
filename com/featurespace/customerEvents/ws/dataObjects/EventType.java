package com.featurespace.customerEvents.ws.dataObjects;

public enum EventType {
	transaction("transaction"), deposit("deposit");

    private String label;

    EventType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
