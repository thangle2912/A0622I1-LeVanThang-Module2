package src.ss19_string_regex.bai_tap.validate_name_class;

public class ValidateNameClassTest {
    private static  ValidateNameClass validateNameClass;
    public static final String [] validClass = new String[]{"C0318G", "A042H","P5678K"};

    public static void main(String[] args) {
        validateNameClass = new ValidateNameClass();

        for (String className: validClass){
            boolean valid = validateNameClass.validate(className);
            System.out.println("Class name : "+ className +" : "+ valid);
        }
    }
}
