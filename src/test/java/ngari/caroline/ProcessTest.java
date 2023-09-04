package ngari.caroline;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {

    @Test
    @DisplayName("Encoder Test")
    void testEncoding(){
        UserInput userInput = new UserInput();
        userInput.setOption(Option.encode);
        userInput.setInput("A");
        userInput.setShiftKey(1);
        String output = CaesarUtility.run(userInput);
        assertEquals("B", output);

    }

    @Test
    @DisplayName("Decoder Test")
    void testDecoding(){
        UserInput userInput = new UserInput();
        userInput.setOption(Option.decode);
        userInput.setInput("B");
        userInput.setShiftKey(1);
        String output = CaesarUtility.run(userInput);
        assertEquals("A", output);

    }

    @Test
    @DisplayName("Test if code for identifying invalid process works ok")
    void testInvalidProcess(){
        UserInput userInput = new UserInput();
        userInput.setOption(Option.exit);
        userInput.setInput("B");
        userInput.setShiftKey(1);
        String output = CaesarUtility.run(userInput);
        assertEquals(null, output);

    }

}