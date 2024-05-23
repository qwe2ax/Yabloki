package enitites;

public class Iphone12 extends Phone {
    private static final Iphone11 prevPhone = new Iphone11();

    public Iphone12() {
        super(512, 21, 6.1, new String[]{
                "2 зарплаты",
                "проц++",
                "нет кнопочки",
                "фейс айди",
                "монобровь",
                "дохуя камер+",
                "фишечка2"});
    }

    @Override
    public Phone getPrevPhone() {
        return prevPhone;
    }
}
