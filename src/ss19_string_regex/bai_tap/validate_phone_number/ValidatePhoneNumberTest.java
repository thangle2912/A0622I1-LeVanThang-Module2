package src.ss19_string_regex.bai_tap.validate_phone_number;


public class ValidatePhoneNumberTest {

    private static ValidatePhoneNumber validatePhoneNumber;
    public static final String [] validPhoneNumber = new String[]{"(12)-(0123123123)", "(11)-(1123123123)","(12)-(0q)-23123123)"};

    public static void main(String[] args) {
        validatePhoneNumber = new ValidatePhoneNumber();

        for (String phoneNumber: validPhoneNumber){
            boolean valid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Phone number : "+ phoneNumber +" : "+ valid);
        }
    }
}
