import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.function.Function;

import static java.util.stream.Collectors.toSet;

/**
 * Created by kihoonkim on 2017-09-06.
 */
public class FunctionExceptionWrapper3 {

    public interface ExceptionSupplier<T> {
        T apply() throws Exception;
    }
    public static <T> T wrap(ExceptionSupplier<T> z) {
        try {
            return z.apply();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String[] allowed = {"127.0.0.1", "::1"};

        Arrays.stream(allowed)
                .map(s -> wrap(()->InetAddress.getByName(s)))
                .collect(toSet());
    }
}
