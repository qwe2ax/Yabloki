package enitites;

public class Iphone15 extends Phone {
    private static final Iphone14 prevPhone = new Iphone14();
    public Iphone15() {
        super(512, 21, 6.1, new String[]{
                "2 зарплаты",
                "проц+++",
                "ОЗУ 8ГБ",
                "фейс айди",
                "монобровь--",
                "Основная: 48 МП",
                "USB-C"});
    }

    @Override
    public Phone getPrevPhone() {
        return prevPhone;
    }

    @Override
    public Phone getNextPhone() {
        return null;
    }
}
