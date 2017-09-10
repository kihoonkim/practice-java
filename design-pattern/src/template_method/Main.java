package template_method;

import template_method.helper.AbstractGameConnectHelper;
import template_method.helper.DefaultGameConnectionHelper;

/**
 * Created by kihoonkim on 2017-09-10.
 */
public class Main {
    public static void main(String[] args) {
        // 알고리즘이 일정한 프로세스가 있다
        // 알고리즘은 변경가능성이 있다
        AbstractGameConnectHelper helper = new DefaultGameConnectionHelper();
        helper.requestConnection("접속 정보");
    }
}
