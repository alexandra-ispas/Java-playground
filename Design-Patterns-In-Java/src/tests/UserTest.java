package tests;

import exception.BadCNPException;
import exception.ExceptionBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import pojo.User;

import java.time.Instant;
import java.util.Date;
import org.junit.jupiter.api.Test; //!!

public class UserTest {

    // executes this before any test
    @BeforeEach
    void before() {
        System.out.println ("before");
    }

    @AfterEach
    void after() {
        System.out.println ("after");
    }


    @Test
    void createUser_success() throws ExceptionBase {
        User user = new User.UserBuilder ( "Ana", "Pop",
                "1234567891230", Date.from ( Instant.now () ) )
                .build ();

        Assertions.assertEquals ( "Ana", user.getFirstName () );
        Assertions.assertEquals ( "1234567891230", user.getCnp () );
       // Assertions.assertEquals ( Date.from ( Instant.now () ) , user.getDateOfBirth () );
    }

    @Test
    void createUser_withNickname_success() throws ExceptionBase {
        User user = new User.UserBuilder ( "Ana", "Pop",
                "1234567891230", Date.from ( Instant.now () ) )
                .withNickname ( "annna" )
                .build ();

        Assertions.assertEquals ( "Ana", user.getFirstName () );
        Assertions.assertEquals ( "123456789123", user.getCnp () );
        //Assertions.assertEquals ( Date.from ( Instant.parse ("2021-12-10T01:00:00.00Z) ) , user.getDateOfBirth () );
        Assertions.assertEquals ( "annna", user.getNickname () );
    }

    @Test
    void createUser_badCnp_failure() {
        Exception exception = Assertions.assertThrows ( BadCNPException.class, () -> {
            User user = new User.UserBuilder ( "Ana", "Pop",
                    "12345678913", Date.from ( Instant.now () ) )
                    .withNickname ( "annna" )
                    .build ();
        } );

        Assertions.assertEquals ( "The cnp 12345678913 is wrong! The length mush be 13", exception.getMessage () );
    }

    /**
     * Location testing:
     * test_valid house, duplex, apartment
     * test corner cases: for every bad model
     */

//    @Test
//    void createLocation_testValidHouse() {
//
//    }
}
