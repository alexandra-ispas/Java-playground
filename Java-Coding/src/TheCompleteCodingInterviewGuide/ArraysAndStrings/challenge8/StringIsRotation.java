package TheCompleteCodingInterviewGuide.ArraysAndStrings.challenge8;

public class StringIsRotation {
    public static boolean isRotation(String s1, String s2) {
        return (s2 + s2).contains ( s1 );
    }
}
