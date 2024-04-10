//public class EnglishDictionaryTest {
//
//}
package imani.dictionary;

import org.testng.annotations.Test;

import java.util.List;

//import static org.junit.jupiter.api.Assertions.*;

class EnglishDictionaryTest {

    @Test
    public void getDefinition() {
        // given
        EnglishDictionary dictionary = new EnglishDictionary();

        // when
        List<String> definitions = dictionary.getDefinition("");

        // then
        //assert...
    }

}
