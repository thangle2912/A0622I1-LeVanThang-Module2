package src.case_module2.utils;

import src.case_module2.models.OTo;
import src.case_module2.models.PhuongTien;
import src.case_module2.models.XeTai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileOTo {
//        public static void writeFileAccount(List<PhuongTien> phuongTienList, String filename) {
//            try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filename, false))) {
//                for (PhuongTien phuongTien : phuongTienList) {
//                    buffered.write(phuongTien.getInfo());
//                    buffered.newLine();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        public static List<OTo> readFileOTo(String filename) {
            List<OTo> list = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line = null;
                while ((line = reader.readLine()) != null) {
                    if (line.trim().equals("")) {
                        continue;
                    }
                    String[] data = line.split(",");
                    int loaiPhuongTien = Integer.parseInt(data[6]);
                    if (loaiPhuongTien==0) {
                        list.add(new OTo(line));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list;
        }

}
