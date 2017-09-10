import java.util.Arrays;

import static java.util.stream.Collectors.toSet;

/**
 * Created by kihoonkim on 2017-09-06.
 */
public class FunctionExceptionWrapper1 {

    public static void main(String[] args) {
        String[] allowed = {"127.0.0.1", "::1"};

        Arrays.stream(allowed)
     //           .map(InetAddress::getByName)    // compile error
                .collect(toSet());
    }
}
