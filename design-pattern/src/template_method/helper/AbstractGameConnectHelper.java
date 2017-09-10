package template_method.helper;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public abstract class AbstractGameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    // Template Method
    public String requestConnection(String info) {
        doSecurity("");
        if(!authentication("", "")){
            throw new Error("인증에러");
        }
        authorization("");
        return connection("");
    }
}
