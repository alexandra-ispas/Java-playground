package service;

import exception.ExceptionBase;
import pojo.Location;
import pojo.User;
import validator.UserValidator;
import validator.location.LocationValidator;
import validator.location.LocationValidatorFactory;

public class UserService {

    private static UserService instance;

    private UserService() {}

    public static UserService getInstance() {
        if(instance == null) {
            instance = new UserService ();
        }
        return instance;
    }

    public void addNickname (User user, String nickname) throws ExceptionBase {
        user.setNickname ( nickname );
        UserValidator validator = new UserValidator ();
        validator.validate ( user );
    }

    public void addLocation (User user, Location location) throws ExceptionBase {
        LocationValidator locationValidator = LocationValidatorFactory.getValidator ( location.getLocationType () );
        locationValidator.validate ( location );
        // verific ca e ok inainte sa modific
        user.setLocation ( location );
    }
}
