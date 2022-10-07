package src.ss11_stack_queue.bai_tap;

import java.util.*;

public class CountWordUseMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] arrWords = string.toLowerCase().split(" ");
        System.out.println(Arrays.toString(arrWords));

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arrWords.length; i++) {
            if (map.containsKey(arrWords[i])){
                map.put(arrWords[i], map.get(arrWords[i]) + 1);
            }else {
                map.put(arrWords[i],1);
            }
        }
        outputMap(map);
    }

    public static void outputMap(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> wordsList = map.entrySet();
        for (Map.Entry<String, Integer> entry : wordsList) {
            System.out.println("Key :" + entry.getKey() + " | " + "Value : " + entry.getValue());
        }
    }
}
