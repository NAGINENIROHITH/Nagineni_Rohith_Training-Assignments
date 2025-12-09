package Java_Assignment5;

import java.util.regex.*;

public class PhoneValidation {
    public static void main(String[] args) {

        String[] numbers = {
            "001-765-989-3421",
            "+1-456-765-9345"
        };

        // Regex pattern
        String regex = "^(\\+?\\d{1,3})-\\d{3}-\\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);

        for (String num : numbers) {
            Matcher matcher = pattern.matcher(num);

            if (matcher.matches()) {
                System.out.println(num + " → Valid phone number");
            } else {
                System.out.println(num + " → Invalid phone number");
            }
        }
    }
}

