package enitites;

public class IphoneX extends Phone {
    private final static Iphone11 nextPhone = new Iphone11();

    public IphoneX() {
        super(256, 15, 5.8, new String[]{
                "> 1 зарплата",
                "проц+",
                "нет кнопочки",
                "фейс айди",
                "монобровь",
                "фишечка2"});
    }

    @Override
    public Phone getNextPhone() {
        return nextPhone;
    }
}
