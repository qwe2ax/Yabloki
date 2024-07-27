package solutions.solution2.comparator;

import solutions.solution2.entities.Phone;

public class PhoneComparer {
    public void getDiffBetweenPhones(Phone phone, Phone comprasionPhone) {
        Phone phone1 = phone.getNextPhone();
        String[] featuresOfCurrentPhone = new String[4];
        featuresOfCurrentPhone[0] = String.valueOf(phone.getPrice());
        featuresOfCurrentPhone[1] = phone.getCPU();
        featuresOfCurrentPhone[2] = String.valueOf(phone.getDisplay());
        featuresOfCurrentPhone[3] = phone.getFeature();

        StringBuilder result = new StringBuilder();
        while (phone1 != null) {
            result.setLength(0);
            String[] featuresOfNextPhone = new String[4];
            featuresOfNextPhone[0] = String.valueOf(phone1.getPrice());
            featuresOfNextPhone[1] = phone1.getCPU();
            featuresOfNextPhone[2] = String.valueOf(phone1.getDisplay());
            featuresOfNextPhone[3] = phone1.getFeature();

            boolean hasChanges = false;
            result.append("New changes in ").append(phone1.getModel()).append(":\n");

            for (int i = 0; i < featuresOfCurrentPhone.length; i++) {
                if (!featuresOfCurrentPhone[i].equals(featuresOfNextPhone[i])) {
                    result.append("- ").append(featuresOfNextPhone[i]).append("\n");
                    hasChanges = true; // Изменения обнаружены
                }
            }
            if (!hasChanges) {
                result.setLength(result.length() - ("New changes in " + phone1.getModel() + ":\n").length());
            }

            phone1 = phone1.getNextPhone();
        }
        if (!result.isEmpty()) {
            System.out.println(result.toString().trim());
        }
    }
}
