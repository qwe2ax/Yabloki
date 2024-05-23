package enitites;

import java.util.Arrays;

public abstract class Phone {
    private final int memory;

    private Phone nextPhone;
    private Phone prevPhone;

    private final int megapixels;

    private final double screenSize;

    private final String[] features;

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

    public Phone getNextPhone() {
        return nextPhone;
    }

    public Phone getPrevPhone() {
        return prevPhone;
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
