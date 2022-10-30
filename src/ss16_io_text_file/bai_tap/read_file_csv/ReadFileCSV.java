package src.ss16_io_text_file.bai_tap.read_file_csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Arrays;

public class ReadFileCSV {
    public static void main(String[] args) throws  Exception{
        FileReader fileReader = new FileReader("src\\ss16_io_text_file\\bai_tap\\read_file_csv\\student.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try{
            String line;
            while(true){
                line  = bufferedReader.readLine();
                if (line ==null){
                    break;
                }
                String [] array = line.split(",");
                System.out.println(Arrays.toString(array));
            }
            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
