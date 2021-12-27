package AdobeArchivesGeeksforGeeks;

public class CountWords {
    public static int getNumber(String s) {
        return s.split ( "\\s+" ).length;
    }
}
