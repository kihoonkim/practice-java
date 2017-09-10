package template_method.helper;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class DefaultGameConnectionHelper extends AbstractGameConnectHelper {
    @Override
    protected String doSecurity(String encodeStr) {
        System.out.println("보안 작업");
        return encodeStr;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("인증 작업");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 작업");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("연결 작업");
        return info;
    }
}
