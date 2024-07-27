package solutions.solution1.util;

import solutions.solution1.enitites.Phone;

public class PhoneInitializer {
    public static Phone[] initializePhones() {
        String[] featuresIphone10 = {"< 1 зарплата", "проц", "ОЗУ 3ГБ", "фейс айди", "монобровь+", "Основная: 12 МП", "ПОЗОРНЫЙ ЗАРЯДНИК"};
        String[] featuresIphone11 = {"< 1 зарплата", "проц+", "ОЗУ 4ГБ", "фейс айди", "монобровь", "Основная: 12 МП", "ПОЗОРНЫЙ ЗАРЯДНИК"};
        String[] featuresIphone12 = {"1 зарплата", "проц+", "ОЗУ 4ГБ", "фейс айди", "монобровь", "Основная: 12 МП", "ПОЗОРНЫЙ ЗАРЯДНИК"};
        String[] featuresIphone13 = {"1 зарплата", "проц++", "ОЗУ 4ГБ", "фейс айди", "монобровь", "Основная: 12 МП", "ПОЗОРНЫЙ ЗАРЯДНИК"};
        String[] featuresIphone14 = {"2 зарплаты", "проц+++", "ОЗУ 6ГБ", "фейс айди", "монобровь-", "Основная: 12 МП", "ПОЗОРНЫЙ ЗАРЯДНИК"};
        String[] featuresIphone15 = {"2 зарплаты", "проц+++", "ОЗУ 8ГБ", "фейс айди", "монобровь--", "Основная: 48 МП", "USB-C"};

        Phone iphone10 = new Phone("iPhone 10", featuresIphone10);
        Phone iphone11 = new Phone("iPhone 11", featuresIphone11);
        Phone iphone12 = new Phone("iPhone 12", featuresIphone12);
        Phone iphone13 = new Phone("iPhone 13", featuresIphone13);
        Phone iphone14 = new Phone("iPhone 14", featuresIphone14);
        Phone iphone15 = new Phone("iPhone 15", featuresIphone15);

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

        return new Phone[]{iphone10, iphone11, iphone12, iphone13, iphone14, iphone15};
    }
}

