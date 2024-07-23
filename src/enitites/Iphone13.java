package enitites;

public class Iphone13 extends Phone {
    private static final Iphone12 prevPhone = new Iphone12();
    private static final Iphone14 nextPhone = new Iphone14();

    public Iphone13() {
        super(512, 21, 6.1, new String[]{
                "1 зарплата",
                "проц++",
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
