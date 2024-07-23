package enitites;

public class IphoneX extends Phone {
    private final static Iphone11 nextPhone = new Iphone11();

    public IphoneX() {
        super(256, 15, 5.8, new String[]{
                "> 1 зарплата",
                "проц",
                "ОЗУ 3ГБ",
                "фейс айди",
                "монобровь+",
                "Основная: 12 МП",
                "ПОЗОРНЫЙ ЗАРЯДНИК"});
    }

    @Override
    public Phone getNextPhone() {
        return nextPhone;
    }
}
