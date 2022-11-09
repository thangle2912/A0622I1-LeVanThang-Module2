package src.case_module2.utils;

import src.case_module2.models.GiayDangKy;
import src.case_module2.models.OTo;
import src.case_module2.models.PhuongTien;
import src.case_module2.models.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GiayDangKyFileUtils {
        public static void writeFileAccount(List<GiayDangKy> giayDangKyList, String filename) {
            try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
                for (GiayDangKy giayDangKy : giayDangKyList) {
                    buffered.write(giayDangKy.getInfo());
                    buffered.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static List<GiayDangKy> readFile(String filename) {
            List<GiayDangKy> list = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    if (line.trim().equals("")) {
                        continue;
                    }
                    list.add(new GiayDangKy(line));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list;
        }

}
