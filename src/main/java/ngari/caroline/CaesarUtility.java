package ngari.caroline;

public class CaesarUtility {
    public static String encode(String input, int shiftKey) {
        String encodedString = "";
        for (int i = 0; i < input.length(); i++) {
            int position = Constants.ALPHABET.indexOf(input.charAt(i));
            int encryptPosition = (shiftKey + position) % 26;
            char encryptCharacter = Constants.ALPHABET.charAt(encryptPosition);
            encodedString += encryptCharacter;
        }
        return encodedString;
    }

    public static String decode(String input, int shiftKey) {
        String decodedString = "";
        for (int i = 0; i < input.length(); i++) {
            int pos = Constants.ALPHABET.indexOf(input.charAt(i));
            int decryptPosition = (pos - shiftKey) % 26;
            if (decryptPosition < 0) {
                decryptPosition = Constants.ALPHABET.length() + decryptPosition;
            }
            char decryptCharacter = Constants.ALPHABET.charAt(decryptPosition);
            decodedString += decryptCharacter;
        }
        return decodedString;
    }

    public static String run(UserInput userInput) {
        switch (userInput.getOption()) {
            case encode:
                return encode(userInput.getInput(), userInput.getShiftKey());
            case decode:
                return decode(userInput.getInput(), userInput.getShiftKey());
            default:
                return null;
        }
    }
}
