import javax.swing.*;
public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To Do List");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.setVisible(true);

        JLabel enterLabel = new JLabel("Add to your to-do list : ");
        enterLabel.setBounds(120,10,250,25);
        JTextField textfield = new JTextField();
        textfield.setBounds(100,30,200,25);
        JButton button = new JButton("Enter");
        button.setBounds(315,30,60,25);

        frame.add(textfield);
        frame.add(enterLabel);
        frame.add(button);

        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(listPanel);
        scrollPane.setBounds(100, 60, 200, 300);
        frame.add(scrollPane);

        button.addActionListener(e -> {
            String action = textfield.getText();
            if (!(action.isEmpty())) {
                JCheckBox checkBox = new JCheckBox(action);
                listPanel.add(checkBox);
                listPanel.revalidate();
                listPanel.repaint();
            }
        });
        frame.setVisible(true);
    }
}
