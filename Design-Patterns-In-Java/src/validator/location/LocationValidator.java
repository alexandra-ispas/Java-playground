package validator.location;

import exception.BadCNPException;
import exception.ExceptionBase;
import exception.InvalidYearException;
import exception.NegativeFieldException;
import pojo.Location;
import validator.ValidatorBase;

import java.util.Calendar;

public class LocationValidator extends ValidatorBase<Location> {

    @Override
    public void validate(Location object) throws ExceptionBase {
        //an, pret, space > 0

        enforcePositive ( object.getPrice (), "price" );
        enforcePositive ( object.getYear (), "year" );
        enforcePositive ( object.getSpace (), "space" );
        enforceValidYear ( object.getYear () );

    }

    protected void enforcePositive(float field, String fieldName) throws NegativeFieldException {
        if(field < 0) {
            throw new NegativeArraySizeException ("The value for the field " + fieldName + " must be positive!");
        }
    }

    protected void enforceValidYear(int year) throws InvalidYearException {
        int currentYear = Calendar.getInstance ().get ( Calendar.YEAR );
        if(year > currentYear) {
            throw  new InvalidYearException ( "The year {0} is invalid! It must be lass than {1}!", year, currentYear );
        }
    }
}
