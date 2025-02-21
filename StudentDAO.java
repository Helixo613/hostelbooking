import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class StudentDAO {
 public void addStudent(String name, String email, String phone, String address, String dob) {
 try (Connection conn = DBConnection.getConnection()) {
 String query = "INSERT INTO Students (name, email, phone, address, dob) VALUES (?, ?, ?, ?, ?)";
 PreparedStatement stmt = conn.prepareStatement(query);
 stmt.setString(1, name);
 stmt.setString(2, email);
 stmt.setString(3, phone);
 stmt.setString(4, address);
 stmt.setString(5, dob);
 stmt.executeUpdate();
 System.out.println("Student added successfully.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 public void viewStudents() {
 try (Connection conn = DBConnection.getConnection()) {
 String query = "SELECT * FROM Students";
 PreparedStatement stmt = conn.prepareStatement(query);
 ResultSet rs = stmt.executeQuery();
 while (rs.next()) {
 System.out.println("ID: " + rs.getInt("student_id") + 
 ", Name: " + rs.getString("name") +
 ", Email: " + rs.getString("email"));
 }
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
}
