import java.net.UnknownHostException;

/**
 * Created by kihoonkim on 2017-09-09.
 */
public class InetAddress {
    public static String getByName(String host) throws UnknownHostException {
        if(1==1) throw new UnknownHostException(host);
        return "localhost";
    }
}
