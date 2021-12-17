package DependencyInversionPrinciple.Breaking;

public class ConnectToDatabase {

    public void connect(PostgreSQLJdbcUrl postgresql) {
        System.out.println("Connecting to "
                + postgresql.get());
    }

    /*
    * If we create another type of JDBC URL (for example, MySQLJdbcUrl), then we cannot
        use the preceding connect(PostgreSQLJdbcUrl postgreSQL) method. So, we
        have to drop this dependency on concrete and create a dependency on abstraction.
     */

}
