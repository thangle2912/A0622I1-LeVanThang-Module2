package src.case_study.furama_resort.services.impl;

import src.case_study.furama_resort.models.Employee;
import src.case_study.furama_resort.services.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static ArrayList<Employee> arrayList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        if (!arrayList.isEmpty()) {
            System.out.printf("%5s %15s %7s %10s %10s %10s %20s %10s %10s %10s",
                    "ID", "NAME", "AGE", "GENDER", "CMND", "PHONE NUMBER", "EMAIL", "DEGREE", "POSITIONS", "SALARY");
            System.out.println();
            for (Employee employee : arrayList) {
                System.out.format("%5s %15s %7s %10s %10s %10s %20s %10s %10s %10s",
                        employee.getId(),
                        employee.getName(),
                        employee.getAge(),
                        employee.getGender(),
                        employee.getCmnd(),
                        employee.getPhoneNumber(),
                        employee.getEmail(),
                        employee.getDegree(),
                        employee.getPositions(),
                        employee.getSalary());
                System.out.println();
            }
        } else {
            System.out.println("Employee Is Empty !");
        }

    }

    @Override
    public String addNew() {
        int temp = arrayList.size();
        System.out.println("Add New Employee :");
        System.out.printf("ID Employee : ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Employee employee : arrayList) {
            if (!(employee.getId() == id)) {
                return "Id already exists";
            }
        }
        System.out.printf("Name : ");
        String name = scanner.nextLine();
        System.out.printf("Age : ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("Gender : ");
        String gender = scanner.nextLine();
        System.out.printf("CMND : ");
        String cmnd = scanner.nextLine();
        System.out.printf("Phone Number : ");
        String phoneNumber = scanner.nextLine();
        System.out.printf("Email : ");
        String email = scanner.nextLine();
        System.out.printf("Degree : ");
        String degree = inputDegree();
        System.out.printf("Positions : ");
        String positions = inputPosition();
        System.out.printf("Salary : ");
        float salary = Float.parseFloat(scanner.nextLine());
        Employee employee = new Employee(id, name, age, gender, cmnd, phoneNumber, email, degree, positions, salary);
//        Employee employee = new Employee(1,"Winn",22,"Male","1231233","123123123","thangle2912@gmail.com","null","null",12313);
        arrayList.add(employee);
        if ((arrayList.size() - temp) > 0) {
            return "Add Employee Success";
        }
        return "Add Employee Fails";
    }

    @Override
    public String edit() {
        System.out.printf("Input Id Employee Edit : ");
        int index = Integer.parseInt(scanner.nextLine());
        if (checkIndex(index)) {
            return "Index not found";
        }
        for (Employee employee : arrayList) {
            if (employee.getId() == index) {
                System.out.println("Edit Employee ID : " + employee.getId());
                System.out.printf("New name : ");
                String name = scanner.nextLine();
                System.out.printf("Age : ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.printf("Gender : ");
                String gender = scanner.nextLine();
                System.out.printf("CMND : ");
                String cmnd = scanner.nextLine();
                System.out.printf("Phone Number : ");
                String phoneNumber = scanner.nextLine();
                System.out.printf("Email : ");
                String email = scanner.nextLine();
                System.out.printf("Degree : ");
                String degree = inputDegree();
                System.out.printf("Positions : ");
                String positions = inputPosition();
                System.out.printf("Salary : ");
                float salary = Float.parseFloat(scanner.nextLine());
                employee.setEmployee(name, age, gender, cmnd, phoneNumber, email, degree, positions, salary);
                return "Edit Employee Success !";
            }
        }
        return "Edit Employee Fails !";
    }

    @Override
    public void delete() {

    }

    @Override
    public String inputDegree() {
        System.out.println("Choice one ");
        System.out.println("1. Trung c???p " +
                "- 2. Cao ?????ng" +
                "- 3. ?????i h???c" +
                "- 4. Sau ?????i h???c");
        int choiceDegree = Integer.parseInt(scanner.nextLine());
        String degree = "";
        switch (choiceDegree) {
            case 1:
                degree = "Trung c???p";
                break;
            case 2:
                degree = "Cao ?????ng";
                break;
            case 3:
                degree = "?????i h???c";
                break;
            case 4:
                degree = "Sau ?????i h???c";
                break;
            default:
                System.out.println("Choice again !");
                inputDegree();
                break;
        }
        return degree;
    }

    @Override
    public String inputPosition() {
        System.out.println("Choice one ");
        System.out.println("1. L??? T??n " +
                "- 2. Ph???c v???" +
                "- 3. Chuy??n vi??n " +
                "- 4. Gi??m s??t" +
                "- 5. Qu???n l??" +
                "- 6. Gi??m ?????c");
        int choicePosition = Integer.parseInt(scanner.nextLine());
        String position = "";
        switch (choicePosition) {
            case 1:
                position = "L??? t??n";
                break;
            case 2:
                position = "Ph???c v???";
                break;
            case 3:
                position = "Chuy??n vi??n";
                break;
            case 4:
                position = "Gi??m s??t";
                break;
            case 5:
                position = "Qu???n l??";
                break;
            case 6:
                position = "Gi??m ?????c";
                break;
            default:
                System.out.println("Choice again !");
                inputPosition();
                break;
        }
        return position;
    }

    boolean checkIndex(int index) {
        for (Employee employee : arrayList) {
            if (employee.getId() == index) {
                return true;
            }
        }
        return false;
    }
}
