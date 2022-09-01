package OrangeHrm.Test;

public class ClickAdminOnMenu extends BaseClass {
    public static void main(String[] args) {
        setup();
        pageFactory.getLoginPage().login();
        pageFactory.getPimPage().clickAdminMenuOption();
        verification("//h6[1]", "Admin");
        close();
    }
}
