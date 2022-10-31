package src.ss17_io_binary_serialization.bai_tap.manager_product;

import java.io.*;
import java.util.List;

public class FileUtils {
    public static void writeFile(List<Product> products, String filename){
      try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(filename))){
          stream.writeObject(products);
          stream.flush();
      }catch (IOException e){
          e.printStackTrace();
      }
    }

    public static List<Product> readFile(String filename){
        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(filename))){
            return (List<Product>) stream.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
