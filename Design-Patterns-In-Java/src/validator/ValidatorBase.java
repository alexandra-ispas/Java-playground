package validator;

import exception.BadCNPException;
import exception.ExceptionBase;

public abstract class ValidatorBase<T> {
    public abstract void validate(T object) throws BadCNPException, ExceptionBase;
}
