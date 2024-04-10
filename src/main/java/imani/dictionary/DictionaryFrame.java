
package imani.dictionary;

import com.opencsv.exceptions.CsvValidationException;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DictionaryFrame extends JFrame {
    private final JTextField wordField;
    private final JTextField defintionField;


    public DictionaryFrame() {
        setSize(1000, 600);
        setTitle("English Dictionary");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());

            JPanel north = new JPanel();
            main.add(north, BorderLayout.NORTH);

            //tells the JFrame to use this JPanel
            setContentPane(main);

            north.setLayout(new BorderLayout());

            wordField = new JTextField();
            north.add(wordField);
            //wordField.setPreferredSize();

            defintionField = new JTextField();
            main.add(defintionField);

            wordField.addActionListener(e -> {
                try {
                    updateDictionary();
                } catch (CsvValidationException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });


        }

        public void updateDictionary() throws CsvValidationException, IOException {
            EnglishDictionary dictionary = new EnglishDictionary(
            );

            dictionary.getDefinition(wordField.getText());
            // this returns a list and I want to print it into the textfield as a string
            //defintionField.setText();

        }
}
