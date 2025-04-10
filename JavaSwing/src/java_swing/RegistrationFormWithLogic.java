package java_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationFormWithLogic {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(6, 2)); // Grid layout with 6 rows and 2 columns

        // Add form elements
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel genderLabel = new JLabel("Gender:");
        JComboBox<String> genderBox = new JComboBox<>(new String[]{"Male", "Female", "Other"});

        JToggleButton submitButton = new JToggleButton("Submit");

        JLabel messageLabel = new JLabel("");

        // Add components to frame
        frame.getContentPane().add(nameLabel);
        frame.getContentPane().add(nameField);

        frame.getContentPane().add(emailLabel);
        frame.getContentPane().add(emailField);

        frame.getContentPane().add(passwordLabel);
        frame.getContentPane().add(passwordField);

        frame.getContentPane().add(genderLabel);
        frame.getContentPane().add(genderBox);

        frame.getContentPane().add(submitButton);
        frame.getContentPane().add(messageLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
