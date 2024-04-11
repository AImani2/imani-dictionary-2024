//public class EnglishDictionaryTest {
//
//}
package imani.dictionary;

import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

class EnglishDictionaryTest {

    @Test
    public void getDefinition() throws CsvValidationException, IOException {
        // given
        EnglishDictionary dictionary = new EnglishDictionary();

        // when
        List<String> definitions = dictionary.getDefinition("Aback");

        // then
        // how do I want this to be returned?
        assertEquals("Toward the back or rear; backward.\nBehind; in the rear.\nBackward against the mast; -- said of the sails when pressed by the wind.\nAn abacus.", dictionary.getDefinition("Aback"));
    }

}
