import javax.swing.*;
import java.awt.event.*;

class ComboBoxBill extends JFrame implements ActionListener {
    JComboBox<String> items;
    JTextField qty, total;
    JButton calc;

    ComboBoxBill() {
        setLayout(null);

        JLabel l1 = new JLabel("Select Item:");
        l1.setBounds(30, 30, 100, 30);
        add(l1);

        String[] itemList = {"Pen", "Pencil", "Eraser"};
        items = new JComboBox<>(itemList);
        items.setBounds(130, 30, 100, 30);
        add(items);

        JLabel l2 = new JLabel("Quantity:");
        l2.setBounds(30, 70, 100, 30);
        add(l2);

        qty = new JTextField();
        qty.setBounds(130, 70, 100, 30);
        add(qty);

        calc = new JButton("Calculate");
        calc.setBounds(70, 110, 120, 30);
        add(calc);

        total = new JTextField();
        total.setBounds(30, 150, 200, 30);
        add(total);

        calc.addActionListener(this);

        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String item = (String) items.getSelectedItem();
        int q = Integer.parseInt(qty.getText());
        int price = 0;

        if (item.equals("Pen")) price = 10;
        else if (item.equals("Pencil")) price = 5;
        else if (item.equals("Eraser")) price = 3;

        total.setText("Total = ₹" + (price * q));
    }

    public static void main(String[] args) {
        new ComboBoxBill();
    }
}
