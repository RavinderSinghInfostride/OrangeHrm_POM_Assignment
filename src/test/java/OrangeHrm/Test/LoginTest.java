package OrangeHrm.Test;

public class LoginTest extends BaseClass {
    public static void main(String args[]) {
        setup();
        pageFactory.getLoginPage().login();
        verification("//h6", "PIM");
        close();
    }
}
