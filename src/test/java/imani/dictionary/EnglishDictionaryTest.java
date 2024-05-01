
package imani.dictionary;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.util.List;


class EnglishDictionaryTest {

    @Test
    public void getDefinition() throws CsvValidationException, IOException {
        // given
        EnglishDictionary dictionary = new EnglishDictionary();

        // when
        List<String> definitions = dictionary.getDefinition("Aback");

        // then
        // how do I want this to be returned?
        Assertions.assertEquals("Toward the back or rear; backward.", definitions.get(0));
        Assertions.assertEquals("Behind; in the rear.", definitions.get(1));
        Assertions.assertEquals("Backward against the mast; "
                + "-- said of the sails when pressed by the wind.", definitions.get(2));
        Assertions.assertEquals("An abacus.", definitions.get(3));
    }

}
