package solutions.solution2;
/*
здесь будет альтернативное решение(в этом пакете)
экземпляр Iphone 10 будет иметь начальные фишки, остальные же будут иметь
обновленные характеристки (от 1 до 6), больше массивом строк фишечки не храню((
ну и блок иницализации высрать сюда надо
 */

import solutions.solution2.comparator.PhoneComparer;
import solutions.solution2.entities.Phone;

public class Main {
    private static final Phone iphone10;
    private static final Phone iphone11;
    private static final Phone iphone12;
    private static final Phone iphone13;
    private static final Phone iphone14;
    private static final Phone iphone15;
    static {
        iphone10 = Phone.builder()
                .model("Iphone 10")
                .price(100)
                .cpu("A14")
                .display(5.8)
                .feature("Dual-Camera")
                .build();
        iphone11 = Phone.builder()
                .model("Iphone 11")
                .price(150)
                .cpu("A13")
                .display(6.1)
                .feature("Night Mode")
                .build();
        iphone12 = Phone.builder()
                .model("Iphone 12")
                .price(200)
                .cpu("A14")
                .feature("5G Support")
                .build();
        iphone13 = Phone.builder()
                .model("Iphone 13")
                .price(280)
                .cpu("A15")
                .feature("Improved battery life")
                .build();
        iphone14 = Phone.builder()
                .model("Iphone 14")
                .price(350)
                .feature("Cinematic mode")
                .build();
        iphone15 = Phone.builder()
                .model("Iphone 15")
                .price(1500)
                .cpu("A16")
                .feature("USB-C")
                .build();

        iphone10.setPrevPhone(null);
        iphone10.setNextPhone(iphone11);
        iphone11.setPrevPhone(iphone10);
        iphone11.setNextPhone(iphone12);
        iphone12.setPrevPhone(iphone11);
        iphone12.setNextPhone(iphone13);
        iphone13.setPrevPhone(iphone12);
        iphone13.setNextPhone(iphone14);
        iphone14.setPrevPhone(iphone13);
        iphone14.setNextPhone(iphone15);
        iphone15.setPrevPhone(iphone14);
        iphone15.setNextPhone(null);
    }

    public static void main(String[] args) {
        PhoneComparer phoneComparer = new PhoneComparer();
        phoneComparer.getDiffBetweenPhones(iphone13, iphone11);

    }
}
