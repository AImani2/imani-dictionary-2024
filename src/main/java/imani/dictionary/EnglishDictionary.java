
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

    ArrayList<String[]> csvToArray = new ArrayList<>();
    public EnglishDictionary() throws CsvValidationException, IOException { // do I always need to have these exceptions?
        // gets the file from the "resources" directory
        InputStream in = EnglishDictionary.class.getResourceAsStream(
                "englishDictionary.csv");

        CSVReader reader = new CSVReader(new InputStreamReader(in));
        String[] record = null;

        while ((record = reader.readNext()) != null) {
            csvToArray.add(record);
        }

        reader.close();
    }

    /**
     * @param word to look up.
     * @return a List of definitions, or an empty list if the word doesn't exist.
     */
    public List<String> getDefinition(String word) {
        List<String> definitions = new ArrayList<>();
        for (String[] currentWord : csvToArray ) {
            if (currentWord[0].equalsIgnoreCase(word)) {
                definitions.add(currentWord[2]);
            }
        }
        System.out.println(definitions);
        return definitions;
        //this method takes the word and gets the definition
        //return it in a list
        //make a GUI
        // then read through each line and find the word i put in
        //return the list of the definitions
        // how do I access englishdictionary from here?
        // its a class - or a constructor?
        // lets figure out how to use it.
    }

}