package pojo;

import exception.ExceptionBase;
import validator.UserValidator;

import java.util.Date;

public class User {
    private final String firstName;
    private final String lastName;
    private final String cnp;
    private final Date dateOfBirth;
    private String nickname;
    private Car car;
    private Location location;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.cnp = userBuilder.cnp;
        this.dateOfBirth = userBuilder.dateOfBirth;
        this.nickname = userBuilder.nickname;
        this.car = userBuilder.car;
        this.location = userBuilder.location;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp='" + cnp + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", nickname='" + nickname + '\'' +
                ", car=" + car +
                ", location=" + location +
                '}';
    }

    // nested class -> parent class has access to these fields
    // but UserBuilder does not have access to the User's private fields
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private final String cnp;
        private final Date dateOfBirth;
        private String nickname;
        private Car car;
        private Location location;

        // only mandatory fields
        public UserBuilder(String firstName, String lastName, String cnp, Date date) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.cnp = cnp;
            this.dateOfBirth = date;
        }
        // non-mandatory fields
        public UserBuilder withNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public UserBuilder withCar(Car car) {
            this.car = car;
            return this;
        }

        public UserBuilder withLocation(Location location) {
            this.location = location;
            return this;
        }

        public User build() throws ExceptionBase {
            User user = new User (this);
            UserValidator userValidator = new UserValidator ();
            userValidator.validate ( user );
            return user;
        }
    }
}
