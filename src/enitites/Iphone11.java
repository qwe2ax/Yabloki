package enitites;

public class Iphone11 extends Phone {

    private final IphoneX prevPhone;
    public Iphone11() {
        super(null, new IphoneX(), 256, 18, 5.8, new String[]{
                "1 зарплата",
                "доъуя камер",
                "а13",
                "нет кнопочки",
                "фейс айди",
                "монобровь",
                "фишечка 2"});
        prevPhone = new IphoneX();
    }
}
