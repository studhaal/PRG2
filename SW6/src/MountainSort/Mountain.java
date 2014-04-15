package MountainSort;

import java.util.Objects;

public class Mountain implements Comparable<Mountain> {

    private String name;
    private int height;
    private double latitude, longitude;

    public Mountain(String name, int height) {

        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (other instanceof Mountain) {
            Mountain mountain = (Mountain) other;
            if (mountain.getName().equals(this.getName())) {
                return mountain.getHeight() == this.getHeight();
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + this.height;
        return hash;
    }

    @Override
    public int compareTo(Mountain other) {
        if (this == other) {
            return 0;
        }
        if (other == null) {
            return -1;
        }
        return this.getName().compareTo(other.getName());
    }
}
