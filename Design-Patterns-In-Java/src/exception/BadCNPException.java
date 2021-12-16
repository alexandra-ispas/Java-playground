package exception;

public class BadCNPException extends ExceptionBase {

    public BadCNPException(String errorMessage, int code, Object... messageArgs) {
        super ( errorMessage, code, messageArgs );
    }


}
