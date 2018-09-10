package samples;

public class JavaPractice {
    public static void main(String[] args) {
        String[] names = new String[]{
                "Karthik", "Puneeth", "Karthik B", "Sarath", "Akshaya", "Karthik A"
                //"Karthik A", "Karthik"
        };
        sortNames(names);

    }

    public static String[] sortNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            //System.out.println(names[i]);
            for (int j = i + 1; j < names.length; j++) {
                //System.out.println(names[i]);
                if (isAlphabeticallyGreater(names[i], names[j])) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        for (int l = 0; l < names.length; l++)
            System.out.println(names[l] + " ");
        return names;
    }

    private static boolean isAlphabeticallyGreater(String string1, String string2) {
        // TODO Auto-generated method stub
        int limit = string1.length() <= string2.length() ? string1.length() : string2.length();
        int k;
        boolean result = false;
        for (k = 0; k < limit; k++) {
            if (!((int) string1.charAt(k) == (int) string2.charAt(k))) {
                result = ((int) string1.charAt(k) > (int) string2.charAt(k));
                break;
            }
        }
        if (string2.length() == limit && k == limit && result == false) {

            result = true;
        }
        return result;
    }
}
