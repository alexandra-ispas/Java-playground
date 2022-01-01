package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge5;

public class ShrinkString {
    public static String shrink(String s) {
        StringBuilder str = new StringBuilder ();
        int counter, j;

        for(int i = 0; i < s.length (); i++) {
            counter = 1;
            char curr = s.charAt ( i );
            str.append ( curr );

            if(Character.isWhitespace ( curr ))
                continue;
            for(j = i + 1; j < s.length (); j++) {
                if(curr == s.charAt ( j )) {
                    counter++;
                } else {
                    break;
                }
            }
            i = j - 1;
            str.append ( counter );
        }
        return (str.length () > s.length ()) ? s : str.toString ();
    }
}
