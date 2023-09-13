package com.example.model;

import com.example.entity.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CustomException extends Exception {
    public static final long serialVersionUID = 1L;
    public CustomException(String str) {
        super();
        System.out.println(str);
        EmployeeSystem.operations();
    }
}
public class EmployeeSystem {
    public static Map<Integer, Employee> map = new HashMap<>();
    public static void addEmployee(String name, int age, int id) {
        Employee employee = new Employee(name, age, id);
        map.put(id, employee);
        operations();
    }

    public static void deleteEmployee(int employeeId) throws CustomException {
        if(map.containsKey(employeeId)) {
            map.remove(employeeId);
            System.out.println("Deleted successfully");
        } else {
            throw new CustomException("Not found Exception");
        }
        operations();
    }

    public static void searchEmployee(int employeeId) throws CustomException {
        if (map.containsKey(employeeId)) {
            // map.get(employeeId)
            System.out.println("Employee details: " + map.get(employeeId));
        } else {
            throw new CustomException("Not found Exception");
        }
        operations();
    }

    public static void employeeList() {
        System.out.println(map.toString());
        operations();
    }

    public static void operations() {
        System.out.println("********************");
        System.out.println("1. Add Employee");
        System.out.println("2. Delete Employee");
        System.out.println("3. Search Employee");
        System.out.println("4. Employee list");

        Scanner sc = new Scanner(System.in);
        int userInput = Integer.parseInt(sc.nextLine());

        if(userInput == 1) {
            System.out.println("Enter employee details(name, age, id)");
            Scanner sc1 = new Scanner(System.in);

            String name = sc1.nextLine();
            int age = Integer.parseInt(sc1.nextLine());
            int id = Integer.parseInt(sc1.nextLine());

            if(!name.equals("") && age != 0 && id != 0) {
                addEmployee(name, age, id);
            }
        } else if (userInput == 2) {
            System.out.println("Enter employee id");
            Scanner sc2 = new Scanner(System.in);
            int id = Integer.parseInt(sc2.nextLine());
            try {
                deleteEmployee(id);
            } catch (CustomException e) {
                e.printStackTrace();
            }
        } else if (userInput == 3) {
            System.out.println("Enter employee id");
            Scanner sc3 = new Scanner(System.in);
            int id = Integer.parseInt(sc3.nextLine());
            try {
                searchEmployee(id);
            } catch (CustomException e) {
                e.printStackTrace();
            }
        } else if (userInput == 4) {
            employeeList();
        }
    }
    public static void main(String[] args) {
        operations();
    }

}

