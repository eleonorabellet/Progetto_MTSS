////////////////////////////////////////////////////////////////////
// Alessandro Ravenna 2111930
// Eleonora Bellet 2111002
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {

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
}