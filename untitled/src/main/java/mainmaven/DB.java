package mainmaven;

import java.sql.*;
import java.util.Scanner;

public class DB {
    Connection con;

    public DB() throws SQLException {
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/internship", "root", "nada2992020");
    }

    public void addinterndb(intern intern) throws SQLException {

        Statement stmt = con.createStatement();
        stmt.execute("insert into internstudents values(" + intern.getId() + ",'" + intern.getName() + "'," + intern.getGPA() + ",'" + intern.getCvUrl() + "','" + intern.getUniversity() + "','" + intern.getDesiredTrack() + "','" + (intern.isAccepted()?1:0) + "')");
    }

    public void listdb() throws SQLException {

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select id , name, desiredtrack  from internstudents");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
    }

    public void partofdb() throws SQLException {
        System.out.println("please enter University name ");
        Scanner sc = new Scanner(System.in);
        String unversity = sc.nextLine();

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT *  FROM  internstudents WHERE university = '" + unversity + "' ORDER BY  gpa  ASC;");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
    }
    public void getInternsByUniversityAndTrack() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter University name ");
        String unversity = sc.nextLine();
        System.out.println("please enter track ");
        String desiredtrack = sc.nextLine();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select id , name, desiredtrack  from internstudents");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
    }
    public void acceptdb() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter  id ");
        String id = sc.nextLine();
        System.out.println("please enter  chosse accpet or reject ");
        String chosse = sc.nextLine();
        Statement stmt = con.createStatement();
        if (chosse.equals("accpet")) {
            stmt.execute("UPDATE internstudents  SET isAccepted = 1  WHERE id = '" + id + "';");
        } else {
            if (chosse.equals("reject")) {
                stmt.execute("UPDATE internstudents  SET isAccepted = 0  WHERE id = '" + id + "';");
            }
        }

    }
}