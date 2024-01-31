package mainmaven;

import java.sql.SQLException;

public class internServices {
    private DB db;
    public internServices(DB db) {
        this.db=db;
    }
    public void addintern(intern intern) throws SQLException {
        db.addinterndb(intern);
    }
    public void list() throws SQLException {
        db.listdb();
    }
    public void partof() throws SQLException {
        db.partofdb();
    }
    public void gpa() throws SQLException {
        db.jpadb();
    }
    public void accept() throws SQLException {
        db.acceptdb();
    }
}
