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





    public static void main(String[] args) {
        ArrayList<employ> emparr = new ArrayList<employ>();
        while (true) {
            System.out.println("Select an option \n 1 - Add Employee \n 2 - View Employee \n 3 - Search an Employee \n" +
                    "4 - Delete an Employee \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();


            switch (n) {
                case 1:
                System.out.println("Enter employee details");

                System.out.println("enter the code");
                int code = input.nextInt();
                System.out.println("Enter name");
                String name = input.next();
                System.out.println("Give the designation");
                String designation = input.next();
                System.out.println("Enter the salary");
                double salary = input.nextDouble();
                System.out.println("Enter company name");
                String companyName = input.next();
                System.out.println("Enter phn No");
                long phnNo= input.nextLong();
                System.out.println("Enter email Id");
                String emailId = input.next();
                employ e = new employ(code, name, designation, salary, companyName, phnNo, emailId);
                emparr.add(e);
                break;

                case 2 :

                    for (employ em : emparr) {
                        System.out.println("Printing details of employee " );
                        System.out.println(em.code);
                        System.out.println(em.name);
                        System.out.println(em.designation);
                        System.out.println(em.salary);
                        System.out.println(em.companyName);
                        System.out.println(em.phnNo);
                        System.out.println(em.emailId);
                    }
                    break;

            }

        }
    }
}
