import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    // Constructor
    Employee(int no, String name, double salary) {
        eNo = no;
        eName = name;
        eSalary = salary;
    }

    // Display method
    void display() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        // Reading employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of employee " + (i + 1));
            int no = sc.nextInt();
            sc.nextLine(); // consume newline
            String name = sc.nextLine();
            double salary = sc.nextDouble();

            emp[i] = new Employee(no, name, salary);
        }

        // Search by employee number
        System.out.print("Enter employee number to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == key) {
                System.out.println("Employee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }

        sc.close();
    }
}
