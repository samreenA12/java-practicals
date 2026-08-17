import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

class JTreeExample extends JFrame {
    JTree tree;
    JTextField tf;

    JTreeExample() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Subjects");
        DefaultMutableTreeNode sem1 = new DefaultMutableTreeNode("Sem 1");
        DefaultMutableTreeNode sem2 = new DefaultMutableTreeNode("Sem 2");

        DefaultMutableTreeNode java = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode python = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode dbms = new DefaultMutableTreeNode("DBMS");
        DefaultMutableTreeNode os = new DefaultMutableTreeNode("OS");

        sem1.add(java);
        sem1.add(python);
        sem2.add(dbms);
        sem2.add(os);
        root.add(sem1);
        root.add(sem2);

        tree = new JTree(root);
        tf = new JTextField();
        tf.setBounds(20, 220, 250, 30);

        JScrollPane sp = new JScrollPane(tree);
        sp.setBounds(20, 20, 250, 180);

        add(sp);
        add(tf);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                tf.setText(e.getPath().toString());
            }
        });
    }

    public static void main(String[] args) {
        new JTreeExample();
    }
}
