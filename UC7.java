import java.util.*;
public class UC7 {
     static class CharacterPatternMap {

        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{

            new CharacterPatternMap('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "**** ",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ****",
                    "*    ",
                    " *** ",
                    "    *",
                    "**** "
            })

        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return new String[]{"     ","     ","     ","     ","     "};
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int patternHeight = getCharacterPattern(message.charAt(0), charMaps).length;

        for (int line = 0; line < patternHeight; line++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);

                System.out.print(pattern[line] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
    
}

