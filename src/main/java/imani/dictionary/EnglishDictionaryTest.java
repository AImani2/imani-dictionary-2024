//public class EnglishDictionaryTest {
//
//}
package imani.dictionary;

import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;

class EnglishDictionaryTest {

    @Test
    public void getDefinition() throws CsvValidationException, IOException {
        // given
        EnglishDictionary dictionary = new EnglishDictionary();

        // when
        List<String> definitions = dictionary.getDefinition("");

        // then
        //assert...
    }

}
