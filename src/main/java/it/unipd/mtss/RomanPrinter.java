////////////////////////////////////////////////////////////////////
// Alessandro Ravenna 2111930
// Eleonora Bellet 2111002
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] lines = new String[]{"", "", "", "", ""};

        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);
            String[] asciiChar = getAsciiChar(c);
            for (int j = 0; j < 5; j++) {
                lines[j] += asciiChar[j];
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result.append(lines[i]);
            if (i < 4) {
                result.append("\n");
            }
        }

        return result.toString();
    }

    private static String[] getAsciiChar(char c) {
        switch (c) {
            case 'I':
                return new String[]{
                    " ___  ",
                    "|_ _| ",
                    " | |  ",
                    " | |  ",
                    "|___| "
                };
            case 'V':
                return new String[]{
                    "__   __ ",
                    "\\ \\ / / ",
                    " \\ V /  ",
                    "  | |   ",
                    "  |_|   "
                };
            case 'X':
                return new String[]{
                    "__  __ ",
                    "\\ \\/ / ",
                    " >  <  ",
                    "/ . \\  ",
                    "/_/\\_\\ "
                };
            case 'L':
                return new String[]{
                    " _      ",
                    "| |     ",
                    "| |     ",
                    "| |___  ",
                    "|_____| "
                };
            case 'C':
                return new String[]{
                    "  ____  ",
                    " / ___| ",
                    "| |     ",
                    "| |___  ",
                    " \\____| "
                };
            case 'D':
                return new String[]{
                    " ____  ",
                    "|  _ \\ ",
                    "| | | |",
                    "| |_| |",
                    "|____/ "
                };
            case 'M':
                return new String[]{
                    " __  __ ",
                    "|  \\/  |",
                    "| |\\/| |",
                    "| |  | |",
                    "|_|  |_|"
                };
            default:
                return new String[]{"", "", "", "", ""};
        }
    }
}