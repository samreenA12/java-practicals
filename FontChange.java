import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FontChange extends JFrame implements ActionListener {
    JRadioButton rb1, rb2, rb3;
    JLabel lbl;

    FontChange() {
        setLayout(new FlowLayout());

        lbl = new JLabel("Welcome to Java Swing");
        add(lbl);

        rb1 = new JRadioButton("Bold");
        rb2 = new JRadioButton("Italic");
        rb3 = new JRadioButton("Plain");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        add(rb1);
        add(rb2);
        add(rb3);

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected())
            lbl.setFont(new Font("Arial", Font.BOLD, 18));
        else if (rb2.isSelected())
            lbl.setFont(new Font("Arial", Font.ITALIC, 18));
        else
            lbl.setFont(new Font("Arial", Font.PLAIN, 18));
    }

    public static void main(String[] args) {
        new FontChange();
    }
}
