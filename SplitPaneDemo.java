import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SplitPaneDemo extends JFrame implements ActionListener {
    JList<String> planetList;
    JLabel imgLabel;
    JSplitPane sp;

    SplitPaneDemo() {
        String planets[] = {"Mercury", "Venus", "Earth", "Mars"};
        planetList = new JList<>(planets);
        planetList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        imgLabel = new JLabel("Select a planet", JLabel.CENTER);

        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(planetList), imgLabel);
        sp.setDividerLocation(150);
        add(sp);

        planetList.addListSelectionListener(e -> {
            String planet = planetList.getSelectedValue();
            imgLabel.setText("Image of " + planet);
        });

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {}

    public static void main(String[] args) {
        new SplitPaneDemo();
    }
}
