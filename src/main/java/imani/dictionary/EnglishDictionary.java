//package imani.dictionary;
//
//import java.util.List;
//
//public class EnglishDictionary {
//    public List<String> getDefinition(String word) {
//        // takes a word and returns a list of definitions or an empty list if no definitions
//    }
//}
//have to read the file IN THE CONSTRUCTOR.

package imani.dictionary;

        import com.opencsv.CSVReader;
        import com.opencsv.exceptions.CsvValidationException;

        import java.io.FileReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.List;

/**
 * Reads the englishDictionary file ONCE.
 */
public class EnglishDictionary {

    public EnglishDictionary() throws CsvValidationException, IOException {
        // gets the file from the "resources" directory
        InputStream in = EnglishDictionary.class.getResourceAsStream(
                "englishDictionary.csv");

        CSVReader reader = new CSVReader(new InputStreamReader(in));
        String[] record = null;

        while ((record = reader.readNext()) != null) {
            // record is ONE line of the CSV
            // is it already in its array and all I have to do is access the word at record[0]?
            // compare the word here to the word on the line
            // what am i doing here? am i using this as a for loop to store all the lines somewhere else or am i doing the
            // comparison here?
            String currentWord = record[0];
            String currentDefintion = record[2];
        }

        reader.close();
    }

    /**
     * @param word to look up.
     * @return a List of definitions, or an empty list if the word doesn't exist.
     */
    public List<String> getDefinition(String word) {
        List<String> definitions = new ArrayList<>();
        if () {

        }
        return definitions//this method takes the word and gets the definition
        //return it in a list
        //make a GUI
        // then read through each line and find the word i put in
        //return the list of the definitions
        // how do I access englishdictionary from here?
        // its a class - or a constructor?
        // lets figure out how to use it.
    }

    public static void main(String[] args) throws CsvValidationException, IOException {
        EnglishDictionary dictionary = new EnglishDictionary();

        // Use the instance to call getDefinition
        List<String> wordDefinitions = dictionary.getDefinition("word");
    }

}