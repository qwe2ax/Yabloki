package enitites;

public class Iphone14 extends Phone {
    private static final Iphone13 prevPhone = new Iphone13();
    private static final Iphone15 nextPhone = new Iphone15();
    public Iphone14() {
        super(512, 21, 6.1, new String[]{
                "2 зарплаты",
                "проц+++",
                "нет кнопочки",
                "фейс айди",
                "монобровь-",
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
