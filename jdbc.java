package bill;

import java.sql.*;

public class jdbc {

    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to DB
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "password");

            Statement stmt = con.createStatement();

            // 3. Create Table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Student(" +
                    "RollNo INT PRIMARY KEY, Name VARCHAR(50), Address VARCHAR(50))");

            // 4. Insert few records
            stmt.executeUpdate("INSERT INTO Student VALUES (1, 'Rahul', 'Pune')");
            stmt.executeUpdate("INSERT INTO Student VALUES (2, 'Amit', 'Mumbai')");

            // 5. Display records
            System.out.println("Records:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getString(3));
            }

            // 6. Insert two more records
            stmt.executeUpdate("INSERT INTO Student VALUES (3, 'Neha', 'Delhi')");
            stmt.executeUpdate("INSERT INTO Student VALUES (4, 'Priya', 'Chennai')");

            // 7. Update one record
            stmt.executeUpdate("UPDATE Student SET Address='Nagpur' WHERE RollNo=1");

            // 8. Delete one record
            stmt.executeUpdate("DELETE FROM Student WHERE RollNo=2");

            System.out.println("\nAfter Update & Delete:");

            // Display again
            rs = stmt.executeQuery("SELECT * FROM Student");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getString(3));
            }

            // Close
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
