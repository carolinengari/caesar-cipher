package ngari.caroline;

import java.text.MessageFormat;
import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        try (Scanner scanner = new Scanner(System.in)) {
            Object[] options = new Object[] {
                    Option.encode.getId(),
                    Option.decode.getId(),
                    Option.exit.getId()
            };

            String cipherInputMessage = MessageFormat
                    .format("This is a ceasar cipher utility, please choose one of the below options:\n{0}: Encode \n{1}: Decode\n{2}: Exit", options);
            System.out.println(cipherInputMessage);
            Option option = Option.fromId(scanner.nextInt());
            System.out.println("Enter message: ");
            String message = scanner.next();
            System.out.println("Enter key: ");
            int key = scanner.nextInt();
            userInput.setOption(option);
            userInput.setInput(message);
            userInput.setShiftKey(key);
        }
        System.out.println(CaesarUtility.run(userInput));
        System.exit(0);
    }
}