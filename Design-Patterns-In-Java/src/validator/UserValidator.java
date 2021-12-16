package validator;

import exception.BadCNPException;
import exception.ExceptionBase;
import pojo.User;

public class UserValidator extends ValidatorBase<User> {

    @Override
    public void validate(User object) throws ExceptionBase {
        // verific daca cnp-ul are exact 13 caractere
        enforceCnpLength ( object.getCnp () );
    }

    private void enforceCnpLength(String cnp) throws BadCNPException {
        if(cnp.length () != 13) {
            // la message format o sa puna cnp in loc de {0}
            throw new BadCNPException ( "The cnp {0} is wrong! The length mush be 13", 1, cnp );
        }
    }
}
