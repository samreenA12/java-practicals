import javax.swing.*;
import java.awt.event.*;

class TriangleArea extends JFrame implements ActionListener {
    JTextField b, h, result;
    JButton calc;

    TriangleArea() {
        setLayout(null);

        JLabel lb1 = new JLabel("Base:");
        lb1.setBounds(30, 30, 100, 30);
        add(lb1);
        b = new JTextField();
        b.setBounds(100, 30, 100, 30);
        add(b);

        JLabel lb2 = new JLabel("Height:");
        lb2.setBounds(30, 70, 100, 30);
        add(lb2);
        h = new JTextField();
        h.setBounds(100, 70, 100, 30);
        add(h);

        calc = new JButton("Calculate");
        calc.setBounds(60, 110, 120, 30);
        add(calc);
        calc.addActionListener(this);

        result = new JTextField();
        result.setBounds(30, 150, 170, 30);
        add(result);

        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        double base = Double.parseDouble(b.getText());
        double height = Double.parseDouble(h.getText());
        double area = 0.5 * base * height;
        result.setText("Area = " + area);
    }

    public static void main(String[] args) {
        new TriangleArea();
    }
}
