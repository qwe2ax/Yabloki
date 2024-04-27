package enitites;

import java.util.Arrays;

public abstract class Phone {
    private int memory;

    private int megapixels;

    private double screenSize;

    private String[] features;

    public Phone(int memory, int megapixels, double screenSize, String[] features) {
        this.memory = memory;
        this.megapixels = megapixels;
        this.screenSize = screenSize;
        this.features = features;
    }

    public int getMemory() {
        return memory;
    }

    public int getMegapixels() {
        return megapixels;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String[] getFeatures() {
        return features;
    }



    @Override
    public String toString() {
        return "Phone{" +
                "memory=" + memory +
                ", megapixels=" + megapixels +
                ", screenSize=" + screenSize +
                ", features=" + Arrays.toString(features) +
                '}';
    }
}
