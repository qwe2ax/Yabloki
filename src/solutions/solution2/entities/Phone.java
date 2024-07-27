package solutions.solution2.entities;

public class Phone {
    private String model;
    private double display = 5.8;
    private int price = 120;
    private String CPU = "A14";
    private String feature = "Dual-camera system";
    private Phone nextPhone;
    private Phone prevPhone;

    public Phone(String model, int price, String CPU, double display, String feature) {
        this.model = model;
        this.price = price;
        this.CPU = CPU;
        this.display = display;
        this.feature = feature;
    }

    public Phone(String model) {
        this.model = model;
    }

    public void setNextPhone(Phone nextPhone) {
        this.nextPhone = nextPhone;
    }

    public void setPrevPhone(Phone prevPhone) {
        this.prevPhone = prevPhone;
    }

    public String getFeature() {
        return feature;
    }

    public double getDisplay() {
        return display;
    }

    public int getPrice() {
        return price;
    }

    public String getCPU() {
        return CPU;
    }

    public String getModel() {
        return model;
    }

    public Phone getNextPhone() {
        return nextPhone;
    }

    public Phone getPrevPhone() {
        return prevPhone;
    }


    @Override
    public String toString() {
        return "Model: " + model;
    }
}
