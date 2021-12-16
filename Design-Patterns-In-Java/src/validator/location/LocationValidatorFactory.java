package validator.location;

import pojo.LocationType;

public final class LocationValidatorFactory {

    public static LocationValidator getValidator(LocationType locationType) {
        return switch (locationType) {
            case HOUSE -> new LocationValidator ();
            case APARTMENT -> new ApartmentValidator ();
            case DUPLEX -> new DuplexValidator ();
        };
    }
}
