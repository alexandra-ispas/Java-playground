package AdobeArchivesGeeksforGeeks;

/**
 * The atoi() function in C takes a string (which represents an integer) as an argument and returns
 * its value of type int. So basically the function is used to convert a string argument to an integer.
 */
public class MyAtoi {
    public static int _atoi(String s) throws AtoiException {
        int sign = 1, i = 0;
        if(s.charAt ( 0 ) == '-') {
            sign = -1;
            i = 1;
        }
        int number = 0;
        for(; i < s.length (); i++) {
            if(s.charAt ( i ) < '0' || s.charAt ( i ) > '9') {
                throw new AtoiException ( i );
            }

            if(number > Integer.MAX_VALUE / 10) {
                System.out.println ("Overflow");
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            number += Math.pow(10,  s.length () - i - 1) * ((int)(s.charAt ( i )) - '0');
        }
        return number * sign;
    }

    public static class AtoiException extends Exception {

        public AtoiException(int pos) {
            super("Invalid Character found at position " + pos);
        }
    }
}
