package src.ss19_string_regex.bai_tap.validate_name_class;

public class ValidateNameClass {
    private static final String NAME_CLASS= "^[CAP]\\d{4}[GHIKLM]$";

    public ValidateNameClass() {
    }
    public boolean validate(String className){
        return className.matches(NAME_CLASS);
    }
}
