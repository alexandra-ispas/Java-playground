package DependencyInversionPrinciple.Correct;

public class PostgreSQLJdbcUrl implements JdbcUrl {

    private final String dbName;

    public PostgreSQLJdbcUrl(String dbName) {
        this.dbName = dbName;
    }
    @Override
    public String get() {
        return "jdbc:// ... " + this.dbName;
    }
}
