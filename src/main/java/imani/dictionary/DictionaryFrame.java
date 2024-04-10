
package imani.dictionary;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DictionaryFrame extends JFrame {
    private final JSlider velocitySlider;
    private final JTextField secondsField;
    private final JSlider angleSlider;
    private final JLabel fieldX;
    private final JLabel fieldY;
    private final JLabel peakyField;
    private final JLabel interceptxField;
    private final ProjectileGraph graph = new ProjectileGraph();

    public ProjectileFrame() {
        setSize(1000, 600);
        setTitle("Projectile Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());

            JPanel west = new JPanel();
            main.add(west, BorderLayout.WEST);

            //tells the JFrame to use this JPanel
            setContentPane(main);

            west.setLayout(new GridLayout(7, 2));

            JLabel velocityLabel = new JLabel("Velocity");
}
