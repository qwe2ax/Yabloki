package enitites;

public class Iphone11 extends Phone {
    private static final Iphone10 prevPhone = new Iphone10();
    private final static Iphone12 nextPhone = new Iphone12();

    public Iphone11() {
        super(256, 18, 5.8, new String[]{
                "> 1 зарплата",
                "проц+",
                "ОЗУ 4ГБ",
                "фейс айди",
                "монобровь",
                "Основная: 12 МП",
                "ПОЗОРНЫЙ ЗАРЯДНИК"});
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
