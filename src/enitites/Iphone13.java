package enitites;

public class Iphone13 extends Phone {
    private static final Iphone12 prevPhone = new Iphone12();
    private static final Iphone14 nextPhone = new Iphone14();

    public Iphone13() {
        super(512, 21, 6.1, new String[]{
                "1 зарплата",
                "проц++",
                "нет кнопочки",
                "фейс айди",
                "монобровь",
                "дохуя камер++",
                "фишечка3"});
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
