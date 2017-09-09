import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.function.Function;

import static java.util.stream.Collectors.toSet;

/**
 * Created by kihoonkim on 2017-09-06.
 */
public class FunctionExceptionWrapper4 {

    public interface ExceptionFunction<T, R> {
        R apply(T r) throws Exception;
    }
    public static <T, R> Function<T, R> wrap(ExceptionFunction<T, R> f) {
        return (T r) -> {
            try {
                return f.apply(r);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
    public static void main(String[] args) {
        String[] allowed = {"127.0.0.1", "::1"};

        Arrays.stream(allowed)
                .map(wrap(InetAddress::getByName))
                .collect(toSet());
    }
}
