
import java.util.List;


public class Task3 {
    public static void main(String[] args) {
        Repository repo = new Repository();
        List<Student> list = repo.getAllStudents();

        
        String headFormat = "%-4s | %-12s | %-12s | %-12s | %-3s | %-6s | %-8s | %-2s | %-28s | %-15s | %-12s%n";
        
        System.out.printf(headFormat, 
            "ID", "FirstName", "MiddleName", "LastName", "Age", "Gender", "Course", "Yr", "Email", "Address", "Phone");
        System.out.println("-".repeat(160));

        if (list.isEmpty()) {
            System.out.println("No records found. Verify Student.db is in the project root.");
        }

        for (Student s : list) {
            System.out.printf(headFormat, 
                s.getStudId(), s.getFirstName(), s.getMiddleName(), s.getLastName(), 
                s.getAge(), s.getGender(), s.getCourse(), s.getYearLevel(), 
                s.getEmail(), s.getAddress(), s.getPhoneNumber());
        }
    }
}
