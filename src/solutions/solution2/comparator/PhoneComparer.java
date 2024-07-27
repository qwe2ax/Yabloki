package solutions.solution2.comparator;

import solutions.solution2.entities.Phone;
import solutions.solution2.util.UtilFeatures;

public class PhoneComparer {
    public void getDiffBetweenPhones(Phone phone, Phone comprasionPhone) {
        if (phone.equals(comprasionPhone)) {
            System.out.println("the same phone is compared, no changes");
            return;
        }
        if (comprasionPhone.compareTo(phone) == -1) {
            getDiffBetweenPhones(comprasionPhone, phone);
            return;
        }
        Phone phone1 = phone.getNextPhone();
        String[] featuresOfCurrentPhone = new String[4];
        featuresOfCurrentPhone[0] = String.valueOf(phone.getPrice());
        featuresOfCurrentPhone[1] = phone.getCPU() == null ? UtilFeatures.getCPUFromPrevious(phone) : phone.getCPU();
        featuresOfCurrentPhone[2] = phone.getDisplay() == 0.0 ? UtilFeatures.getDisplayFromPrevious(phone) : String.valueOf(phone.getDisplay());
        featuresOfCurrentPhone[3] = phone.getFeature();

        StringBuilder result = new StringBuilder();
        while (phone1 != comprasionPhone.getNextPhone()) {
            result.setLength(0);
            String[] featuresOfNextPhone = new String[4];
            featuresOfNextPhone[0] = String.valueOf(phone1.getPrice());
            featuresOfNextPhone[1] = phone1.getCPU() == null ? UtilFeatures.getCPUFromPrevious(phone1) : phone1.getCPU();
            featuresOfNextPhone[2] = phone1.getDisplay() == 0.0 ? UtilFeatures.getDisplayFromPrevious(phone1) : String.valueOf(phone1.getDisplay());
            featuresOfNextPhone[3] = phone1.getFeature();
            result.append("New changes in ").append(phone1.getModel()).append(":\n");

            for (int i = 0; i < featuresOfNextPhone.length; i++) {
                if (!featuresOfNextPhone[i].equals(featuresOfCurrentPhone[i])) {
                result.append("- ").append(featuresOfNextPhone[i]).append("\n");
                }
            }

            phone1 = phone1.getNextPhone();
        }
        if (!result.isEmpty()) {
            System.out.println(result.toString().trim());
        }
    }

}
