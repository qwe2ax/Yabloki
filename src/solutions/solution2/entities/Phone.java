package solutions.solution2.entities;

public class Phone {
    private final String model;
    private final double display;
    private final int price;
    private final String cpu;
    private final String feature;
    private Phone nextPhone;
    private Phone prevPhone;

    public Phone(String model, int price, String cpu, double display, String feature) {
        this.model = model;
        this.display = display;
        this.price = price;
        this.cpu = cpu;
        this.feature = feature;
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
        return cpu;
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

    public int compareTo(Phone other) {
        int thisModelNumber = Integer.parseInt(this.model.replaceAll("\\D+", ""));
        int otherModelNumber = Integer.parseInt(other.model.replaceAll("\\D+", ""));
        return Integer.compare(thisModelNumber, otherModelNumber);
    }

    public static PhoneBuilder builder() {
        return new PhoneBuilder();
    }

    public static class PhoneBuilder{
        private String model;
        private double display;
        private int price;
        private String cpu;
        private String feature;

        public PhoneBuilder model(String model){
            this.model = model;
            return this;
        }

        public PhoneBuilder display(double display){
            this.display = display;
            return this;
        }

        public PhoneBuilder price(int price){
            this.price = price;
            return this;
        }

        public PhoneBuilder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public PhoneBuilder feature(String feature){
            this.feature = feature;
            return this;
        }

        public Phone build() {
            return new Phone(model, price, cpu, display, feature);
        }
    }
}
