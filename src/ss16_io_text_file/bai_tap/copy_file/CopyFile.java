package src.ss16_io_text_file.bai_tap.copy_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("src\\ss16_io_text_file\\bai_tap\\copy_file\\student.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter("src\\ss16_io_text_file\\bai_tap\\copy_file\\student_copy.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try{
            String line;
            while (true){
                line = bufferedReader.readLine();
                if (line==null){
                    break;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
            bufferedReader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
