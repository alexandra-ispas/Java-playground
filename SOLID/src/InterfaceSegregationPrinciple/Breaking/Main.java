package InterfaceSegregationPrinciple.Breaking;

public class Main {
    public static void main(String[] args) {
        WwwPingConnection www = new WwwPingConnection ("www.yahoo.com");
        www.socket(); // we can call this method!
        www.connect();
    }
}
