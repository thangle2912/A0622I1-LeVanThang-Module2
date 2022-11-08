package src.ss19_string_regex.bai_tap.validate_phone_number;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";


    public ValidatePhoneNumber() {
    }
    public boolean validate(String phoneNumber){
        return phoneNumber.matches(PHONE_NUMBER);
    }
}
