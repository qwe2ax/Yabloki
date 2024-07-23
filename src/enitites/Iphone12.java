package enitites;

public class Iphone12 extends Phone {
    private static final Iphone11 prevPhone = new Iphone11();
    private static final Iphone13 nextPhone = new Iphone13();

    public Iphone12() {
        super(512, 21, 6.1, new String[]{
                "1 зарплата",
                "ОЗУ 4ГБ",
                "нет кнопочки",
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
