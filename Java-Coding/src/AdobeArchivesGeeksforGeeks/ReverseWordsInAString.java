package AdobeArchivesGeeksforGeeks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInAString {

    public static String reverseWord(char[] str) {
        for(int i = 0; i < str.length / 2; i++) {
            char aux = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = aux;
        }

        return new String (str);
    }

    public static String reverseWords(String s) {
        String[] words = s.split ( "\\s+" );
//        swap words
//        for(int i = 0; i < words.length / 2; i++) {
//            String aux = words[i];
//            words[i] = words[words.length - 1 - i];
//            words[words.length - 1 - i] = aux;
//        }
//        return String.join ( " ", words );
//----------------------------------------------------------

        // reverse on each word and on the final sentence
        for(int i = 0; i < words.length; i++) {
            words[i] = reverseWord ( words[i].toCharArray () );
        }
        return reverseWord ( String.join ( " ", words ).toCharArray ());
    }
}
