package enitites;

import java.util.Arrays;

public  class Phone {
    private String model;
    private Phone nextPhone;
    private Phone prevPhone;
    private final String[] features;

    public Phone(String model, String[] features) {
        this.model = model;
        this.features = features;
    }

    public void setNextPhone(Phone nextPhone) {
        this.nextPhone = nextPhone;
    }

    public void setPrevPhone(Phone prevPhone) {
        this.prevPhone = prevPhone;
    }

    public String getModel() { return model; }

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
        return "Model: " + model + ", Features: " + String.join(", ", features);
    }
}
