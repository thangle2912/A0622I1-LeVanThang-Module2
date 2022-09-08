package src.ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        System.out.println("Input Number : ");
        Scanner scanner = new Scanner(System.in);
        int yourNumber = scanner.nextInt();
        int unit = yourNumber % 10;
        if (0 <= yourNumber && yourNumber < 10) {
            System.out.println(getUnit(yourNumber));
        } else {
            if (10 <= yourNumber && yourNumber < 20) {
                System.out.println(getDozen(yourNumber, unit));
            } else {
                if (20 <= yourNumber && yourNumber < 100) {
                    System.out.println(getDozen(yourNumber, unit));
                } else {
                    if (100 <= yourNumber && yourNumber < 1000) {
                        int hundred = yourNumber / 100;
                        int dozens = yourNumber % 100;
                        int units = dozens % 10;
                        if (dozens < 10 && units == 0) {
                            String strNumber = getUnit(hundred) + " hundred ";
                            System.out.println(strNumber);
                        } else if (dozens < 10 && units != 0) {
                            String strNumber = getUnit(hundred) + " hundred " + getUnit(units);
                            System.out.println(strNumber);
                        }else {
                            if (dozens >10 && units==0){
                                String strNumber = getUnit(hundred) + " hundred " + getDozen(dozens,units);

                                System.out.println(strNumber);
                            }else {
                                String strNumber = getUnit(hundred) + " hundred " + getDozen(dozens, units);
                                System.out.println(strNumber);
                            }
                        }

//                            {
//                            if (dozens < 10 && units != 0) {
//                                String strNumber = getUnit(hundred) + " hundred " + getUnit(units);
//                                System.out.println(strNumber);
//                            } else {
//                                String strNumber = getUnit(hundred) + " hundred " + getDozen(dozens, units);
//                                System.out.println(strNumber);
//                            }
//                        }
                    }
                }
            }
        }
    }

    static String getUnit(int number) {
        String mess = "";
        switch (number) {
            case 0:
                mess = "Zero";
                break;
            case 1:
                mess = "One";
                break;
            case 2:
                mess = "Two";
                break;
            case 3:
                mess = "Three";
                break;
            case 4:
                mess = "Four";
                break;
            case 5:
                mess = "Five";
                break;
            case 6:
                mess = "Six";
                break;
            case 7:
                mess = "Seven";
                break;
            case 8:
                mess = "Eight";
                break;
            case 9:
                mess = "Nine";
                break;
        }
        return mess;
    }

    static String getDozen(int number, int unit) {
        String mess = "";
        if (number < 20) {
            String strUnit = getUnit(unit);
            switch (strUnit) {
                case "Zero":
                    mess = "Ten";
                    break;
                case "One":
                    mess = "Eleven";
                    break;
                case "Two":
                    mess = "Twelve";
                    break;
                case "Three":
                    mess = "Thirteen";
                    break;
                case "Five":
                    mess = "Fifteen";
                    break;
                case "Four":
                case "Six":
                case "Seven":
                case "Eight":
                case "Nine":
                    mess = getUnit(unit) + "teen";
                    break;
            }
        } else {
            if (20 <= number && number < 100) {
                int numberDozens = number / 10;
                switch (numberDozens) {
                    case 2:
                        mess = "Twenty";
                        break;
                    case 3:
                        mess = "Thirty";
                        break;
                    case 5:
                        mess = "Fifty";
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        mess = getUnit(numberDozens) + "ty";
                        break;
                }
            }
        }
        if (getUnit(unit)=="Zero"){
            return mess;
        }
        return mess + " " + getUnit(unit);
    }
}
