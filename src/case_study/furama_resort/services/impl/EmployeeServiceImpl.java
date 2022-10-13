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
        System.out.println("1. Trung cấp " +
                "- 2. Cao đẳng" +
                "- 3. Đại học" +
                "- 4. Sau đại học");
        int choiceDegree = Integer.parseInt(scanner.nextLine());
        String degree = "";
        switch (choiceDegree) {
            case 1:
                degree = "Trung cấp";
                break;
            case 2:
                degree = "Cao đẳng";
                break;
            case 3:
                degree = "Đại học";
                break;
            case 4:
                degree = "Sau đại học";
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
        System.out.println("1. Lễ Tân " +
                "- 2. Phục vụ" +
                "- 3. Chuyên viên " +
                "- 4. Giám sát" +
                "- 5. Quản lý" +
                "- 6. Giám đốc");
        int choicePosition = Integer.parseInt(scanner.nextLine());
        String position = "";
        switch (choicePosition) {
            case 1:
                position = "Lễ tân";
                break;
            case 2:
                position = "Phục vụ";
                break;
            case 3:
                position = "Chuyên viên";
                break;
            case 4:
                position = "Giám sát";
                break;
            case 5:
                position = "Quản lý";
                break;
            case 6:
                position = "Giám đốc";
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
