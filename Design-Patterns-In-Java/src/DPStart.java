import exception.ExceptionBase;
import pojo.Car;
import pojo.ImmutableExample;
import pojo.Location;
import pojo.LocationType;
import pojo.User;
import service.LocationService;
import service.UserService;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DPStart {
    // din metode statice nu putem apela decat metode statice
    // astea sunt statice ca sa poata fi apelate din main

    public static void updateNickname (User user, String nickname) throws ExceptionBase {
        UserService userService = UserService.getInstance ();
        userService.addNickname ( user, nickname );
        System.out.println ( userService );
    }

    public static void updateLocation (User user, Location location) throws ExceptionBase {
        UserService userService = UserService.getInstance ();
        userService.addLocation ( user, location );
        System.out.println( userService );
    }

    public static void updateLocationPrice (Location location, float price) throws ExceptionBase {
        LocationService locationService = LocationService.getInstance ();
        locationService.addPrice ( location, price );
        System.out.println(locationService );
    }

    public static void updateLocationSize (Location location, int space) throws ExceptionBase {
        LocationService locationService = LocationService.getInstance ();
        locationService.addSpace ( location, space );
        System.out.println(locationService );
    }

    public static void main(String[] args) throws ExceptionBase {
//        Animal animal = new Animal();   // se pune in heap un obj Animal si are null pe toate field-urile initial
//        animal.setType("aa");
//        animal.setName("name");
//        animal.setAge(2);
//
//        // fara override la toString()
//        System.out.println (animal); //tipul de obiect@zona de memorie
//        System.out.println (animal);
//
//        System.out.println (animal.makeSound ());

//        Dog d1 = new Dog ();
//        d1.setAge ( 2 );
//        d1.setName ( "d" );
//        d1.setType ( "c" );
//
//        Dog d2 = new Dog ();
//        d2.setAge ( 2 );
//        d2.setName ( "d" );
//        d2.setType ( "c" );
//
//        System.out.println (d1.equals ( d2 ));

        Car car = new Car ();
        Location location = new Location.LocationBuilder ("Bucharest", "Romania",
                LocationType.DUPLEX)
                .withAddress ( "Some address" )
                .build ();

        User user = new User.UserBuilder ( "Ana", "Pop",
                "1234567891230", Date.from ( Instant.now () ) )
                .withNickname ( "annn" )
                .withCar ( car )
                .withLocation ( location )
                .build ();

        Location location1 = new Location.LocationBuilder ("Bucharest", "Romania",
                LocationType.DUPLEX)
                .withSpace ( 170 )
                .withPrice ( 150000 )
                .withAddress ( "Some address" )
                .build ();

        updateLocationPrice ( location1, 175000 );
        updateLocationSize ( location1, 200 );

        System.out.println(location1 );

        updateLocation ( user, location );
        updateNickname ( user, "new_nickname" );

        System.out.println (user);

        /*
        * user1, user2
        * sunt in acelasi grup
        * grupul are descriere si nume
        * user1-> nume1, descriere1;
        * user2->nume2, descriere2
        * vor sa faca asta in acelasi timp
        *
        * grup->nume1, descriere1 / nume2, descriere2 ---cazul fericit
        * grup->nume1, descriere2 / nume2, descriere1 / nume1, null / null, null ---worst case
        */


        //Exceptions example - checked - o arata IDE-ul dinainte
//        try {
//            FileReader fileReader = new FileReader ( "a.txt" );
//        } catch (FileNotFoundException e) {
//            e.printStackTrace ();
//        }
//
//        //unchecked - se observa la executie
//        int x = 10;
//        int y = 0;
//        int z = x/y;
        List<String> courses = new ArrayList<> ();
        courses.add ( "course1" );
        courses.add ( "course2" );
        courses.add ( "course3" );

        ImmutableExample instance = new ImmutableExample ( "name", "type",  courses);

        // pot sa adaug un nou curs, deci nu e immutable lista
        instance.getCourses ().add ( "course4" ); // se adauga in alta referinta, deci nu o sa fie pusa
        System.out.println (instance);

    }
}
