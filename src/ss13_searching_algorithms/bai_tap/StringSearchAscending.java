package src.ss13_searching_algorithms.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSearchAscending {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        ArrayList<Character> arrayListMax = new ArrayList<>();
        for (int i = 0; i <inputStr.length() ; i++) {

            ArrayList<Character> arrayListTemp = new ArrayList<>();
            arrayListTemp.add(inputStr.charAt(i));
            for (int j = 0; j <inputStr.length() ; j++) {
                if (inputStr.charAt(j)>arrayListTemp.get(arrayListTemp.size()-1)){
                    arrayListTemp.add(inputStr.charAt(j));
                }
            }
            if (arrayListTemp.size()>arrayListMax.size()){
                arrayListMax.clear();
                arrayListMax.addAll(arrayListTemp);
            }
            arrayListTemp.clear();
        }
        for (Character character : arrayListMax){
            System.out.print(character);
        }
        System.out.println();

    }
}