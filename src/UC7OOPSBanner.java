public class UC7OOPSBanner {

    /**
     * CharacterPatternMap – Inner class for storing character-to-pattern mappings
     * Encapsulates a single character and its corresponding ASCII art pattern.
     */
    static class CharacterPatternMap {

        // The character being represented
        private char character;

        // The ASCII art pattern lines for the character
        private String[] pattern;
        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array
     * for characters: O, P, S and space.
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPatternMap space = new CharacterPatternMap(' ', new String[]{
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        });

        return new CharacterPatternMap[]{o, p, s, space};
    }

    /**
     * Returns ASCII pattern for given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // If character not found, return space pattern
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints banner message using ASCII patterns
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        message = message.toUpperCase();

        for (int i = 0; i < 7; i++) {   // 7 lines per character
            for (int j = 0; j < message.length(); j++) {
                String[] pattern = getCharacterPattern(message.charAt(j), charMaps);
                System.out.print(pattern[i] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Main method – Entry point
     */
    public static void main(String[] args) {

        // Create character pattern array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Define message
        String message = "OOPS";

        // Print banner
        printMessage(message, charMaps);
    }
}