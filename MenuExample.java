import javax.swing.*;
import java.awt.event.*;

class MenuExample extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu colors, sy;
    JMenuItem red, blue, android, java;
    JLabel lbl;

    MenuExample() {
        lbl = new JLabel("Select an option from Menu");
        lbl.setBounds(50, 100, 200, 30);
        add(lbl);

        mb = new JMenuBar();

        colors = new JMenu("Colors");
        sy = new JMenu("SY");

        red = new JMenuItem("Red");
        blue = new JMenuItem("Blue");
        android = new JMenuItem("Android");
        java = new JMenuItem("Java");

        colors.add(red);
        colors.add(blue);
        sy.add(android);
        sy.add(java);

        mb.add(colors);
        mb.add(sy);

        setJMenuBar(mb);

        red.addActionListener(this);
        blue.addActionListener(this);
        android.addActionListener(this);
        java.addActionListener(this);

        setLayout(null);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        lbl.setText(cmd + " menu item selected.");
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
