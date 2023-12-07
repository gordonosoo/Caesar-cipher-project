package ke.co.safaricom;

public class CaesarEncoding {
    private String input;
    private int key;

    public CaesarEncoding(String input, int key) {
        this.input = input;
        this.key = key;
    }

    public String encrypt() {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) ((Character.toUpperCase(c) - 'A' + key) % 26 + 'A');
                if (Character.isLowerCase(c)) {
                    result.append(Character.toLowerCase(shiftedChar));
                } else {
                    result.append(shiftedChar);
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public int getKey() {
        return key;
    }
}

