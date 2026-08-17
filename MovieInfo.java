import javax.swing.*;
import java.awt.event.*;

class MovieInfo extends JFrame implements ActionListener {
    JComboBox<String> movie;
    JTextField actor, actress, review;

    MovieInfo() {
        setLayout(null);

        JLabel lbl = new JLabel("Select Movie:");
        lbl.setBounds(30, 30, 100, 30);
        add(lbl);

        String[] movies = {"Inception", "Titanic", "Avatar"};
        movie = new JComboBox<>(movies);
        movie.setBounds(130, 30, 120, 30);
        add(movie);

        actor = new JTextField();
        actor.setBounds(30, 80, 220, 30);
        add(actor);

        actress = new JTextField();
        actress.setBounds(30, 120, 220, 30);
        add(actress);

        review = new JTextField();
        review.setBounds(30, 160, 220, 30);
        add(review);

        movie.addActionListener(this);

        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String m = (String) movie.getSelectedItem();
        if (m.equals("Inception")) {
            actor.setText("Leonardo DiCaprio");
            actress.setText("Elliot Page");
            review.setText("Excellent Sci-Fi Thriller!");
        } else if (m.equals("Titanic")) {
            actor.setText("Leonardo DiCaprio");
            actress.setText("Kate Winslet");
            review.setText("Romantic Masterpiece");
        } else {
            actor.setText("Sam Worthington");
            actress.setText("Zoe Saldana");
            review.setText("Stunning visuals!");
        }
    }

    public static void main(String[] args) {
        new MovieInfo();
    }
}
