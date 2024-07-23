package enitites;

public class Iphone14 extends Phone {
    private static final Iphone13 prevPhone = new Iphone13();
    private static final Iphone15 nextPhone = new Iphone15();
    public Iphone14() {
        super(512, 21, 6.1, new String[]{
                "2 зарплаты",
                "проц+++",
                "ОЗУ 6ГБ",
                "фейс айди",
                "монобровь-",
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
