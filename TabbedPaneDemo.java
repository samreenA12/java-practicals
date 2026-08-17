import javax.swing.*;

class TabbedPaneDemo extends JFrame {
    TabbedPaneDemo() {
        JTabbedPane tp = new JTabbedPane();

        JPanel p1 = new JPanel();
        p1.add(new JLabel("This is Java Tab"));

        JPanel p2 = new JPanel();
        p2.add(new JLabel("This is Python Tab"));

        JPanel p3 = new JPanel();
        p3.add(new JLabel("This is C++ Tab"));

        tp.add("Java", p1);
        tp.add("Python", p2);
        tp.add("C++", p3);

        add(tp);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
}
