import java.util.ArrayList;
import java.util.Scanner;

class employ{

    int code;
    String name;
    String designation;
    double salary;
    String companyName;
    long phnNo;
    String emailId;

    public employ(int code, String name, String designation, double salary, String companyName, long phnNo, String emailId) {
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyName = companyName;
        this.phnNo = phnNo;
        this.emailId = emailId;
    }
}


public class Employee {
    public static void main(String[] args) {
        ArrayList<Employee> emparr = new ArrayList<Employee>();
        while (true) {
            System.out.println("Select an option \n 1 - Add Employee \n 2 - View Employee \n 3 - Search an Employee \n" +
                    "4 - Delete an Employee \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();


            switch (n) {

            }

        }
    }
}
