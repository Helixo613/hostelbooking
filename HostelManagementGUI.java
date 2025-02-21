import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HostelManagementGUI {
 
 private JFrame frame;
 private JTextField nameField;
 private JTextField emailField;
 private JTextField phoneField;
 private JTextField addressField;
 private JTextField dobField;
 private StudentDAO studentDAO;
 public HostelManagementGUI() {
 studentDAO = new StudentDAO();
 initialize();
 }
 private void initialize() {
 frame = new JFrame();
 frame.setTitle("Hostel Management System");
 frame.setBounds(100, 100, 450, 400);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.getContentPane().setLayout(null);
 JLabel lblTitle = new JLabel("Add Student");
 lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
 lblTitle.setBounds(150, 20, 200, 30);
 frame.getContentPane().add(lblTitle);
 JLabel lblName = new JLabel("Name:");
 lblName.setBounds(30, 70, 80, 20);
 frame.getContentPane().add(lblName);
 nameField = new JTextField();
 nameField.setBounds(120, 70, 200, 20);
 frame.getContentPane().add(nameField);
 nameField.setColumns(10);
 JLabel lblEmail = new JLabel("Email:");
 lblEmail.setBounds(30, 110, 80, 20);
 frame.getContentPane().add(lblEmail);
 emailField = new JTextField();
 emailField.setBounds(120, 110, 200, 20);
 frame.getContentPane().add(emailField);
 emailField.setColumns(10);
 JLabel lblPhone = new JLabel("Phone:");
 lblPhone.setBounds(30, 150, 80, 20);
 frame.getContentPane().add(lblPhone);
 phoneField = new JTextField();
 phoneField.setBounds(120, 150, 200, 20);
 frame.getContentPane().add(phoneField);
 phoneField.setColumns(10);
 JLabel lblAddress = new JLabel("Address:");
 lblAddress.setBounds(30, 190, 80, 20);
 frame.getContentPane().add(lblAddress);
 addressField = new JTextField();
 addressField.setBounds(120, 190, 200, 20);
 frame.getContentPane().add(addressField);
 addressField.setColumns(10);
 JLabel lblDob = new JLabel("DOB (YYYY-MM-DD):");
 lblDob.setBounds(30, 230, 150, 20);
 frame.getContentPane().add(lblDob);
 dobField = new JTextField();
 dobField.setBounds(180, 230, 140, 20);
 frame.getContentPane().add(dobField);
 dobField.setColumns(10);
 JButton btnAddStudent = new JButton("Add Student");
 btnAddStudent.setBounds(150, 280, 130, 30);
 frame.getContentPane().add(btnAddStudent);
 // Add action listener to button
 btnAddStudent.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 String name = nameField.getText();
 String email = emailField.getText();
 String phone = phoneField.getText();
 String address = addressField.getText();
 String dob = dobField.getText();
 
 if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || 
dob.isEmpty()) {
 JOptionPane.showMessageDialog(frame, "Please fill all fields.");
 } else {
 studentDAO.addStudent(name, email, phone, address, dob);
 JOptionPane.showMessageDialog(frame, "Student added successfully.");
 }
 }
 });
 frame.setVisible(true);
 }
 public static void main(String[] args) {
 EventQueue.invokeLater(new Runnable() {
 public void run() {
 try {
 HostelManagementGUI window = new HostelManagementGUI();
 window.frame.setVisible(true);
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
 });
 }
}
