////////////////////////////////////////////////////////////////////
// Alessandro Ravenna 2111930
// Eleonora Bellet 2111002
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

    @Test
    public void testRomanPrinterInstatiation() {
        RomanPrinter printer = new RomanPrinter();
        assertNotNull(printer);
    }

    @Test
    public void testPrintAsciiArtI() {
        String expected =
            " ___  \n" +
            "|_ _| \n" +
            " | |  \n" +
            " | |  \n" +
            "|___| \n";

        assertEquals(expected.trim(), RomanPrinter.print(1).trim());
    }

    @Test
    public void testPrintAsciiArtV() {
        String expected =
            "__   __ \n" +
            "\\ \\ / / \n" +
            " \\ V /  \n" +
            "  | |   \n" +
            "  |_|   \n";

        assertEquals(expected.trim(), RomanPrinter.print(5).trim());
    }

    @Test
    public void testPrintAsciiArtX() {
        String expected =
            "__  __ \n" +
            "\\ \\/ / \n" +
            " >  <  \n" +
            "/ . \\  \n" +
            "/_/\\_\\ \n";

        assertEquals(expected.trim(), RomanPrinter.print(10).trim());
    }

    @Test
    public void testPrintAsciiArtL() {
        String expected =
            " _      \n" +
            "| |     \n" +
            "| |     \n" +
            "| |___  \n" +
            "|_____| \n";

        assertEquals(expected.trim(), RomanPrinter.print(50).trim());
    }

    @Test
    public void testPrintAsciiArtC() {
        String expected =
            "  ____  \n" +
            " / ___| \n" +
            "| |     \n" +
            "| |___  \n" +
            " \\____| \n";

        assertEquals(expected.trim(), RomanPrinter.print(100).trim());
    }

    @Test
    public void testPrintAsciiArtD() {
        String expected =
            " ____  \n" +
            "|  _ \\ \n" +
            "| | | |\n" +
            "| |_| |\n" +
            "|____/ \n";

        assertEquals(expected.trim(), RomanPrinter.print(500).trim());
    }

    @Test
    public void testPrintAsciiArtM() {
        String expected =
            " __  __ \n" +
            "|  \\/  |\n" +
            "| |\\/| |\n" +
            "| |  | |\n" +
            "|_|  |_|\n";

        assertEquals(expected.trim(), RomanPrinter.print(1000).trim());

    }
}