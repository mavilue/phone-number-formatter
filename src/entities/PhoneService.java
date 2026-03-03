package entities;

import java.util.Optional;

public class PhoneService {

    public static Optional<Phone> process(String input_user){
        String numbers = input_user.replaceAll("\\D","");
        int length_num = numbers.length();

        return switch (length_num){
            case 8 -> Optional.of(new Phone(
                    null,
                    numbers,
                    PhoneType.LANDLINE_PHONE
            ));
            case 9 -> Optional.of(new Phone(
                    null,
                    numbers,
                    PhoneType.MOBILE_PHONE
            ));

            case 10 -> Optional.of(new Phone(
                    numbers.substring(0,2),
                    numbers.substring(2),
                    PhoneType.LANDLINE_PHONE
            ));
            case 11 -> Optional.of(new Phone(
                    numbers.substring(0,2),
                    numbers.substring(2),
                    PhoneType.MOBILE_PHONE
            ));

            default -> Optional.empty();
        };
    }
}
