package validator.location;

import exception.BadCNPException;
import exception.ExceptionBase;
import exception.InvalidPriceException;
import exception.InvalidSpaceEXception;
import pojo.Location;

public class ApartmentValidator extends LocationValidator {

    public static final int LOCATION_PRICE_MIN = 50000;
    public static final int LOCATION_PRICE_MAX = 200000;

    @Override
    public void validate(Location object) throws BadCNPException, ExceptionBase {
        enforcePositive ( object.getPrice (), "price" );
        enforcePositive ( object.getYear (), "year" );
        enforcePositive ( object.getSpace (), "space" );
        enforceValidYear ( object.getYear () );
        validatePrice ( object.getPrice () );
        validateSpace ( object.getSpace () );
    }

    private void validatePrice(float price) throws InvalidPriceException {
        if(price != 0 && (price < LOCATION_PRICE_MIN || price > LOCATION_PRICE_MAX)) {
            throw new InvalidPriceException ( "The price is invalid! It mush be between {0} and {1}!", 5, 50000, 200000 );
        }
    }

    private void validateSpace(int space) throws InvalidSpaceEXception {
        if(space != 0 && (space < 50 || space > 150)) {
            throw new InvalidSpaceEXception ( "The space is invalid! It must be between {0} and {1}!", 5, 50, 150 );
        }
    }
}
