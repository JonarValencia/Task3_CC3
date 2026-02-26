import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final String URL = "jdbc:sqlite:Student.db";

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try {
            Class.forName("org.sqlite.JDBC");

            try (Connection conn = DriverManager.getConnection(URL);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    students.add(new Student(
                        rs.getInt("stud_id"),
                        rs.getString("firstName"),
                        rs.getString("middleName"),
                        rs.getString("lastName"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("course"),
                        rs.getInt("yearLevel"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("phoneNumber")
                    ));
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return students;
    }
}