import java.util.Scanner;
public class HostelManagement {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 StudentDAO studentDAO = new StudentDAO();
 RoomDAO roomDAO = new RoomDAO();
 while (true) {
 System.out.println("1. Add Student");
 System.out.println("2. View Students");
 System.out.println("3. Add Room");
 System.out.println("4. View Rooms");
 System.out.println("5. Exit");
 int choice = scanner.nextInt();
 scanner.nextLine(); // consume newline
 switch (choice) {
 case 1:
 System.out.println("Enter student details:");
 System.out.print("Name: ");
 String name = scanner.nextLine();
 System.out.print("Email: ");
 String email = scanner.nextLine();
 System.out.print("Phone: ");
 String phone = scanner.nextLine();
 System.out.print("Address: ");
 String address = scanner.nextLine();
 System.out.print("DOB (YYYY-MM-DD): ");
 String dob = scanner.nextLine();
 studentDAO.addStudent(name, email, phone, address, dob);
 break;
 case 2:
 studentDAO.viewStudents();
 break;
 case 3:
 System.out.println("Enter room details:");
 System.out.print("Room Number: ");
 String roomNumber = scanner.nextLine();
 System.out.print("Capacity: ");
 int capacity = scanner.nextInt();
 roomDAO.addRoom(roomNumber, capacity);
 break;
 case 4:
 roomDAO.viewRooms();
 break;
 case 5:
 System.out.println("Exiting...");
 scanner.close();
 System.exit(0);
 default:
 System.out.println("Invalid choice. Try again.");
 }
 }
 }
}