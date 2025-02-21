import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class RoomDAO {
 public void addRoom(String roomNumber, int capacity) {
 try (Connection conn = DBConnection.getConnection()) {
 String query = "INSERT INTO Rooms (room_number, capacity) VALUES (?, ?)";
 PreparedStatement stmt = conn.prepareStatement(query);
 stmt.setString(1, roomNumber);
 stmt.setInt(2, capacity);
 stmt.executeUpdate();
 System.out.println("Room added successfully.");
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
 public void viewRooms() {
 try (Connection conn = DBConnection.getConnection()) {
 String query = "SELECT * FROM Rooms";
 PreparedStatement stmt = conn.prepareStatement(query);
 ResultSet rs = stmt.executeQuery();
 while (rs.next()) {
 System.out.println("Room ID: " + rs.getInt("room_id") + 
 ", Room Number: " + rs.getString("room_number") +
 ", Capacity: " + rs.getInt("capacity") +
 ", Occupancy: " + rs.getInt("occupancy"));
 }
 } catch (SQLException e) {
 e.printStackTrace();
 }
 }
}