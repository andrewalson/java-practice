package codewars_katas.yellow;

public class DigitalRoot {
    public static int digital_root(int n) {
        if (n > 9) {
            String string = String.valueOf(n);
            String[] splitString = string.split("");

            int sum = 0;
            for (int i = 0; i < splitString.length; i++) {
                sum = sum + Integer.parseInt(splitString[i]);
                //System.out.println(splitString[i]);
            }

            return digital_root(sum);
        }
        else {
            return n;
        }
    }
}