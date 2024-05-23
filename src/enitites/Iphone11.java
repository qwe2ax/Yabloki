package enitites;

public class Iphone11 extends Phone {
    private static final IphoneX prevPhone = new IphoneX();
    private final static Iphone12 nextPhone = new Iphone12();

    public Iphone11() {
        super(256, 18, 5.8, new String[]{
                "1 зарплата",
                "проц+",
                "нет кнопочки",
                "фейс айди",
                "монобровь",
                "дохуя камер"});
    }

    @Override
    public Phone getNextPhone() {
        return nextPhone;
    }

    @Override
    public Phone getPrevPhone() {
        return prevPhone;
    }
}
