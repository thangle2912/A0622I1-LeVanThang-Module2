package src.case_module2.utils;

import src.case_test.exception.AccountInvalidException;
import src.case_test.exception.IDInvalidException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validate {
    private static final String SO_DANG_KY = "^[A-Z]\\d{1}-\\d{4}$";

    public static Date validateDate(String dateAsString) throws AccountInvalidException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        Date result = null;
        try {
            result = format.parse(dateAsString);
        } catch (ParseException e) {
            System.out.println("Ngày đăng ký chưa hợp lệ. Chưa đúng format dd/MM/yyyy");
            return null;
        }
        return result;
    }

    public static String validateSoDangKy(String soDangKy) {

        if (!soDangKy.matches(SO_DANG_KY)){
            return null;
        }
        return soDangKy;
    }

}
