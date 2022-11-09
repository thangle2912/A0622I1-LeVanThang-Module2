package src.case_module2.service;

import src.case_module2.models.GiayDangKy;
import src.case_module2.models.OTo;
import src.case_module2.models.PhuongTien;
import src.case_module2.models.XeTai;
import src.case_module2.utils.*;
import src.case_test.exception.AccountInvalidException;
import src.case_test.models.AccountLessor;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PhuongTienService {
    private static final String SO_DANG_KY = "^[A-Z]\\d{1}-\\d{4}$";
    String giayDangKyUrl = "src\\case_module2\\data\\gdkpt.csv";
    private static List<PhuongTien> phuongTienList = ReadFilePhuongTien.readFilePhuongTien("src\\case_module2\\data\\phuongTien.csv");
    private static List<OTo> oToList = ReadFileOTo.readFileOTo("src\\case_module2\\data\\phuongTien.csv");
    private static List<XeTai> xeTaiList = ReadFileXeTai.readFileXeTai("src\\case_module2\\data\\phuongTien.csv");
    private static List<GiayDangKy> giayDangKyList = GiayDangKyFileUtils.readFile("src\\case_module2\\data\\gdkpt.csv");
    private static Scanner scanner = new Scanner(System.in);

    public void dangKy() {
        System.out.println("Lựa chọn : ");
        System.out.println("1.\tĐăng ký ô tô\n" +
                "2.\tĐăng ký xe tải\n" +
                "3.\tTrở về menu chính\n");
        System.out.println();
        dangKyPhuongTien();
    }

    public void dangKyPhuongTien() {
        String mess = null;
        try {
            System.out.printf("Your choice : ");
            int yourChoice = Integer.parseInt(scanner.nextLine());
            switch (yourChoice) {
                case 1:
                    dangKyOTo();
                    dangKy();
                    break;
                case 2:
                    dangKyXeTai();
                    dangKy();
                    break;
                case 3:
                    mess = "Back to menu";
                    break;
                default:
                    System.out.println("Choice Again !");
                    dangKy();
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String dangKyOTo() {
        System.out.println("Đăng kí o to");
        try {

            String maDangKy = null;
            while (maDangKy == null) {
                maDangKy = inputMa();
            }
            System.out.printf("Họ và tên :");
            String hoTen = scanner.nextLine();
            Date ngayDangKy = null;
            while (ngayDangKy == null) {
                ngayDangKy = inputDate();
            }

            String maPhuongTien = getMaPhuongTien();
            while (maPhuongTien == null) {
                maPhuongTien = getMaPhuongTien();
            }
            GiayDangKy giayDangKy = new GiayDangKy(maDangKy, hoTen, ngayDangKy, maPhuongTien);
            giayDangKyList.add(giayDangKy);

            GiayDangKyFileUtils.writeFileAccount(giayDangKyList, giayDangKyUrl);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Add AccountLessor Fail");
        }
        return "Success";
    }

    public String dangKyXeTai() {
        System.out.println("Đăng kí xe tai");
        try {

            String maDangKy = null;
            while (maDangKy == null) {
                maDangKy = inputMa();
            }
            System.out.printf("Họ và tên :");
            String hoTen = scanner.nextLine();
            Date ngayDangKy = null;
            while (ngayDangKy == null) {
                ngayDangKy = inputDate();
            }

            String maPhuongTien = getMaPhuongTienXeTai();
            while (maPhuongTien == null) {
                maPhuongTien = getMaPhuongTienXeTai();
            }
            GiayDangKy giayDangKy = new GiayDangKy(maDangKy, hoTen, ngayDangKy, maPhuongTien);
            giayDangKyList.add(giayDangKy);

            GiayDangKyFileUtils.writeFileAccount(giayDangKyList, giayDangKyUrl);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Add AccountLessor Fail");
        }
        return "Success";
    }

    public void display() {
    }

    public Date inputDate() {
        Date ngayDangKy = null;
        System.out.printf("Ngày Đăng Ký(dd/mm/yyyy) :");
        String dateAsString = scanner.nextLine();
        try {
            ngayDangKy = Validate.validateDate(dateAsString);
        } catch (AccountInvalidException e) {
            System.out.println(e.getMessage());
        }
        return ngayDangKy;
    }

    public String inputMa() {
        System.out.printf("Số Đăng Ký : ");
        String soDangKy = scanner.nextLine();
        String result = null;

        if (!soDangKy.matches(SO_DANG_KY)) {
            System.out.println("Nhập sai cú pháp (Yx-xxxx) !");
            return null;
        } else {
            result = soDangKy;
        }

        for (GiayDangKy giayDangKy : giayDangKyList) {
            if (giayDangKy.getSoDangKy().equals(result)) {
                return null;
            }
        }

        return result;
    }

    public String getMaPhuongTien() {
        displayOTo();
        System.out.printf("Nhập mã phương tiện đăng kí : ");
        String maPhuongTien = scanner.nextLine();
        for (OTo o : oToList) {
            System.out.println(o.getMaPhuongTien());
            if (o.getMaPhuongTien().equals(maPhuongTien)) {
                return maPhuongTien;
            }
        }
        return null;
    }

    public String getMaPhuongTienXeTai() {
        displayOTo();
        System.out.printf("Nhập mã phương tiện đăng kí : ");
        String maPhuongTien = scanner.nextLine();
        for (XeTai o : xeTaiList) {
            System.out.println(o.getMaPhuongTien());
            if (o.getMaPhuongTien().equals(maPhuongTien)) {
                return maPhuongTien;
            }
        }
        return null;
    }


    public void displayOTo() {
        for (OTo oto : oToList) {
            System.out.println(oto.toString());
        }
    }

}
