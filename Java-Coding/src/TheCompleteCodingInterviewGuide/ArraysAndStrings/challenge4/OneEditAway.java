package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge4;

public class OneEditAway {
    public static boolean isOneEditAway(String s1, String s2) {
        if(Math.abs ( s1.length () - s2.length () ) > 1) {
            return false;
        }

        String longer = (s1.length () >= s2.length ()) ? s1 : s2;
        String shorter = (s1.length () < s2.length ()) ? s1 : s2;

        int i = 0, j = 0;
        boolean edited = false;
        while(i < shorter.length () && j < longer.length ()) {
            if(shorter.charAt ( i ) != longer.charAt ( j )) {
                if(edited) {
                    return false;
                } else {
                    edited = true;
                    if(shorter.length () == longer.length ()) {
                        i++;
                    }
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }
        return true;
    }
}
