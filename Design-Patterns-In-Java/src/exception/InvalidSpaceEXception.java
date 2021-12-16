package exception;

public class InvalidSpaceEXception extends ExceptionBase {

    public InvalidSpaceEXception(String errorMessage, int code, Object... messageArgs) {
        super ( errorMessage, code, messageArgs );
    }
}
