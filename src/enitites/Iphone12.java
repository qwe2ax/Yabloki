package enitites;

public class Iphone12 extends Phone {
    private static final Iphone11 prevPhone = new Iphone11();
    private static final Iphone13 nextPhone = new Iphone13();

    public Iphone12() {
        super(512, 21, 6.1, new String[]{
                "1 зарплата",
                "проц++",
                "нет кнопочки",
                "фейс айди",
                "монобровь",
                "дохуя камер+",
                "фишечка2"});
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
