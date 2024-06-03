import javax.swing.*;
import java.awt.*;

public class SpringForm {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Spring Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        // Etiquetas
        JLabel nameLabel = new JLabel("Name: ");
        JLabel telephoneLabel = new JLabel("Telephone: ");
        JLabel emailLabel = new JLabel("Email: ");
        JLabel addressLabel = new JLabel("Address: ");
        
        // Campos de texto
        JTextField nameField = new JTextField(15);
        JTextField telephoneField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JTextField addressField = new JTextField(15);

        // Agregar etiquetas y campos de texto al contenedor
        contentPane.add(nameLabel);
        contentPane.add(nameField);
        contentPane.add(telephoneLabel);
        contentPane.add(telephoneField);
        contentPane.add(emailLabel);
        contentPane.add(emailField);
        contentPane.add(addressLabel);
        contentPane.add(addressField);

        // Restricciones para nameLabel y nameField
        layout.putConstraint(SpringLayout.WEST, nameLabel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, nameField, 5, SpringLayout.EAST, nameLabel);
        layout.putConstraint(SpringLayout.NORTH, nameField, 5, SpringLayout.NORTH, contentPane);

        // Restricciones para telephoneLabel y telephoneField
        layout.putConstraint(SpringLayout.WEST, telephoneLabel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, telephoneLabel, 15, SpringLayout.SOUTH, nameLabel);
        layout.putConstraint(SpringLayout.WEST, telephoneField, 5, SpringLayout.EAST, telephoneLabel);
        layout.putConstraint(SpringLayout.NORTH, telephoneField, 15, SpringLayout.SOUTH, nameField);

        // Restricciones para emailLabel y emailField
        layout.putConstraint(SpringLayout.WEST, emailLabel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, emailLabel, 15, SpringLayout.SOUTH, telephoneLabel);
        layout.putConstraint(SpringLayout.WEST, emailField, 5, SpringLayout.EAST, emailLabel);
        layout.putConstraint(SpringLayout.NORTH, emailField, 15, SpringLayout.SOUTH, telephoneField);

        // Restricciones para addressLabel y addressField
        layout.putConstraint(SpringLayout.WEST, addressLabel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, addressLabel, 15, SpringLayout.SOUTH, emailLabel);
        layout.putConstraint(SpringLayout.WEST, addressField, 5, SpringLayout.EAST, addressLabel);
        layout.putConstraint(SpringLayout.NORTH, addressField, 15, SpringLayout.SOUTH, emailField);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}


