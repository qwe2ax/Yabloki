package enitites;

public class Iphone15 extends Phone {
    private static final Iphone14 prevPhone = new Iphone14();
    public Iphone15() {
        super(512, 21, 6.1, new String[]{
                "2 зарплаты",
                "проц+++",
                "нет кнопочки",
                "фейс айди",
                "монобровь--",
                "дохуя камер++",
                "фишечка3"});
    }

    @Override
    public Phone getPrevPhone() {
        return prevPhone;
    }
}
