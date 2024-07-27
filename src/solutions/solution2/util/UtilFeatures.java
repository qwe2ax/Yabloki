package solutions.solution2.util;

import solutions.solution2.entities.Phone;

/*
Я не могу придумать как реализовать свою идею с тем, чтобы находить характеристики телефонов проходясь по прошлым экземплярам,
т.к если например взять айфон 12 и попытаться найти процессор среди предыдущих телефонов,
то первый телефон на который я наткнусь проходясь по предыдущим телефонам будет айфон 11, у которого процессор А13,
но у 12 айфона процессор А14 который находится в айфоне 10. Хотя сейчас я понял, что это тоже можно считать снапшотом, наверное это он и есть,
в общем проблема решена, но я не уверен в том насколько это подходит под твоё условие, пока что оставлю так.
В любом случае либо так, либо как мне кажется это невозможно,
ведь я никак не могу заставить программу понять стоит ли брать процессор из этого телефона или стоит сделать еще один шаг назад,
добавлять какие-то "подсказки" вряд-ли подойдет под условия задачи.
Всё таки оставлю этот комментарий здесь, надеясь, что мне не придётся пересказывать это в диалоге.
Стоит ли делать комментарии на английском через гугл переводчик или пока можно и так?
*/


public class UtilFeatures {
    public static String getCPUFromPrevious(Phone phone) {
        if (phone.getPrevPhone() == null) {
            return "wtf";
        }
        boolean find = false;
        while (!find) {
            phone = phone.getPrevPhone();
            find = phone.getCPU() != null;
        }
        return phone.getCPU();
    }

    public static String getDisplayFromPrevious(Phone phone) {
        if (phone.getPrevPhone() == null) {
            return "wtf";
        }
        boolean find = false;
        while (!find) {
            phone = phone.getPrevPhone();
            find = phone.getDisplay() != 0.0;
        }
        return String.valueOf(phone.getDisplay());
    }
}
