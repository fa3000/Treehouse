package de.gaussian.later;

class Event {
    String name;
    String description;
    String creator;
    int picture;

    Event(String name, String creator, String description, int picture) {
        this.name = name;
        this.creator = creator;
        this.description = description;
        this.picture = picture;
    }
}