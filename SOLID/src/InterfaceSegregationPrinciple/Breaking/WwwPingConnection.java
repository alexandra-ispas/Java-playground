package InterfaceSegregationPrinciple.Breaking;

public class WwwPingConnection implements Connection {

    private final String www;

    public WwwPingConnection(String www) {
        this.www = www;
    }

    @Override
    public void http() {
        System.out.println("Setup an HTTP connection to "
                + www);
    }
    @Override
    public void connect() {
        System.out.println("Connect to " + www);
    }

    /* this method breaks Interface Segregation Principle
     * because ping uses http, and it doesn't need sockets
    */
    @Override
    public void socket() {
    }
}
