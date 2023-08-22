import java.awt.*;
import java.awt.event.*;

public class AWTEventHandlingExample extends Frame implements ActionListener {
    private TextField textField;
    private Button button;
    private Label label;

    public AWTEventHandlingExample() {
        setTitle("AWT Event Handling Example");
        setLayout(new FlowLayout());

        textField = new TextField(20);
        add(textField);

        button = new Button("Click Me!");
        add(button);

        label = new Label();
        add(label);

        button.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String text = textField.getText();
            label.setText("Button Clicked: " + text);
        }
    }

    public static void main(String[] args) {
        AWTEventHandlingExample frame = new AWTEventHandlingExample();
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
