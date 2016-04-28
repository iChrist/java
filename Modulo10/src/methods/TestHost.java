package methods;

public class TestHost {

    public static void main(String[] args) {
        TestHost obj = new TestHost();
        HostConfiguration hostConfig = obj.conexionDB("royalweb.com.mx", "8080");
        System.out.println("Host: " + hostConfig.host);
        System.out.println("Post: " + hostConfig.port);
        System.out.println(new TestHost().conexionDB("royalweb.com.mx", "8080").host.charAt(4));
    }

    public HostConfiguration conexionDB(String h, String p) {
        HostConfiguration hc = new HostConfiguration();
        hc.host = h;
        hc.port = p;
        //hc = new HostConfiguration();
        return hc;
    }

    // no retorna valor.
    public void metodo() {
        return;
    }

    // retorna un int
    public int metodo2() {
        return 0;
    }

}

class HostConfiguration {

    public String host, port;
}
