package solutions.solution1.compare;

import solutions.solution1.enitites.Phone;

import java.util.HashMap;

public class PhoneComparison {

    public HashMap<String, Boolean> compareWithNextPhone(Phone phone) {
        HashMap<String, Boolean> difference = new HashMap<>();
        String[] phoneFeatures = phone.getNextPhone().getFeatures();
        String[] currentPhoneFeatures = phone.getFeatures();
        int minOfFeat = Math.min(currentPhoneFeatures.length, phoneFeatures.length);
        int maxOfFeat = Math.max(currentPhoneFeatures.length, phoneFeatures.length);
        for (int i = 0; i < minOfFeat; i++) {
            String currentFeature = currentPhoneFeatures[i];
            String nextFeature = phoneFeatures[i];

            if (currentFeature.equalsIgnoreCase(nextFeature)) {
                difference.put(nextFeature, true);
            } else {
                difference.put(nextFeature, false);
            }
        }
        if (phoneFeatures.length < currentPhoneFeatures.length) {
            for (int i = minOfFeat; i < maxOfFeat; i++) {
                difference.put(currentPhoneFeatures[i], false);
            }
        } else {
            for (int i = minOfFeat; i < maxOfFeat; i++) {
                difference.put(phoneFeatures[i], false);
            }
        }
        return difference;
    }

    public HashMap<String, Boolean> compareWithPrevPhone(Phone phone) {
        HashMap<String, Boolean> difference = new HashMap<>();
        String[] phoneFeatures = phone.getPrevPhone().getFeatures();
        String[] currentPhoneFeatures = phone.getFeatures();
        int minOfFeat = Math.min(currentPhoneFeatures.length, phoneFeatures.length);
        int maxOfFeat = Math.max(currentPhoneFeatures.length, phoneFeatures.length);
        for (int i = 0; i < minOfFeat; i++) {
            String currentFeature = currentPhoneFeatures[i];
            String nextFeature = phoneFeatures[i];

            if (currentFeature.equalsIgnoreCase(nextFeature)) {
                difference.put(nextFeature, true);
            } else {
                difference.put(nextFeature, false);
            }
        }
        if (phoneFeatures.length < currentPhoneFeatures.length) {
            for (int i = minOfFeat; i < maxOfFeat; i++) {
                difference.put(currentPhoneFeatures[i], false);
            }
        } else {
            for (int i = minOfFeat; i < maxOfFeat; i++) {
                difference.put(phoneFeatures[i], false);
            }
        }
        return difference;
    }

    public void getDiffWithIphone15(Phone phone) {
        Phone phone1 = phone.getNextPhone();
        String[] featuresOfCurrentPhone = phone.getFeatures();
        StringBuilder[] result = new StringBuilder[featuresOfCurrentPhone.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new StringBuilder();
        }
        int j = 0;
        while (phone1 != null) {
            String[] featuresOfNextPhone = phone1.getFeatures();
            result[j].append("New changes in ").append(phone1.getModel()).append(":\n");

            for (int i = 0; i < featuresOfCurrentPhone.length; i++) {
                if (!featuresOfCurrentPhone[i].equals(featuresOfNextPhone[i])) {
                    result[j].append("- ").append(featuresOfNextPhone[i]).append(i == 6 ? "" : "\n");
                }
            }
            j++;
            phone1 = phone1.getNextPhone();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(result[i]);
        }
    }


    public void getDiffWithPhone(Phone phone, Phone comprasionPhone) {
        Phone phone1 = phone.getNextPhone();
        String[] featuresOfCurrentPhone = phone.getFeatures();
        StringBuilder[] result = new StringBuilder[featuresOfCurrentPhone.length];
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = new StringBuilder();
        }
        while (!phone1.getModel().equals(comprasionPhone.getModel())) {
            String[] featuresOfNextPhone = phone1.getFeatures();
            result[j].append("New changes in ").append(phone1.getModel()).append(":\n");

            for (int i = 0; i < featuresOfCurrentPhone.length; i++) {
                if (!featuresOfCurrentPhone[i].equals(featuresOfNextPhone[i] )) {
                    result[j].append("- ").append(featuresOfNextPhone[i]).append(i == phone.getFeatures().length ? "" : "\n");
                }
            }
            j++;
            phone1 = phone1.getNextPhone();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(result[i]);
        }
    }
}
