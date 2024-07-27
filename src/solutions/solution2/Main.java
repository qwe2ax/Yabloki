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
    static Phone iphone10 = new Phone("Iphone 10");
    static Phone iphone11 = new Phone("Iphone 11", 150, "A13", 6.1, "Night Mode");
    static Phone iphone12 = new Phone("Iphone 12", 200, iphone10.getCPU(), iphone11.getDisplay(), "5G Support");
    static Phone iphone13 = new Phone("Iphone 13", 280, "A15", iphone11.getDisplay(), "Improved battery life");
    static Phone iphone14 = new Phone("Iphone 14", 350, iphone13.getCPU(), iphone11.getDisplay(), "Cinematic mode");
    static Phone iphone15 = new Phone("Iphone 15", 1500, "A16", iphone11.getDisplay(), "USB-C");
    static {
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
        phoneComparer.getDiffBetweenPhones(iphone15, iphone10);
        System.out.println(iphone15.compareTo(iphone10));
    }
}
