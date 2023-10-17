package codewars_katas.grey;

public class JennysSecretMessage {

    public static String greet(String name) {

        if (name.equals("Johnny")){
            return "Hello, my love!";
        } else {
            return String.format("Hello, %s!", name);
        }
    }
}