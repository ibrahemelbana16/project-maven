package mainmaven;

import java.sql.SQLException;
import java.util.Scanner;



public class Main {
    static internServices intse;
    static DB db;
    static Scanner sc;
    public static void main(String[] args) throws SQLException {
         sc = new Scanner(System.in);
         db=new DB();
        intse=new internServices(db);
         Viewaction();

        while (true) {
            String title = sc.nextLine();
            intern intern;
            switch (title) {
                case "add":
                     intern= scan();
                    intse.addintern(intern);
                    break;
                case "list":
                  intse.list();
                    break;
                case "part of list":
                   intse.partof();
                    break;
                case "list gpa":
                    intse.gpa();
                    break;
                case "delete":
                    scan();
                    break;
                case "accept":
                    intse.accept();
                    break;


            }


        }

    }
    public static   void Viewaction(){

        System.out.println("Please Select one of the following :");
        System.out.println("To add a new intern to the database, write 'add'");
        System.out.println("To list all intern in the database, write 'list'");
        System.out.println("To list intern in a university( id , name ,desired track ), write 'part of list '");
        System.out.println(" to list all students in a certain university sorted by GPA , write 'list gpa'");
        System.out.println("To delete an intern , write 'delete'");
        System.out.println("To accept an intern, write 'accept or reject'");
        System.out.println("to list all intern projects by intern id, write join " );
    }
    public static intern scan(){

        System.out.println("Please enter intern id");
        int id =  Integer.parseInt(sc.nextLine());
        System.out.println("Please enter intern name");
        String name = sc.nextLine();
        System.out.println("Please enter intern jpa");
        double jpa = Double.parseDouble(sc.nextLine()) ;
        System.out.println("Please enter intern cvurl");
        String cvurl = sc.nextLine();
        System.out.println("Please enter intern unversity");
        String unversity = sc.nextLine();

        System.out.println("Please enter intern desired track");
        String desiredtrack = sc.nextLine();
        System.out.println("Please enter intern isAccepted");
        boolean isAccepted = sc.nextBoolean();
      intern object= new intern( id, name, jpa, cvurl,  unversity,desiredtrack, isAccepted);
            return object;
    }

}
