package OrangeHrm.Test;

public class TestToAddAndVerifyUser extends BaseClass{
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.getLoginPage().login();
        verification("//h6","PIM");
        pageFactory.getPimPage().clickAdminMenuOption();
        verification("//h6[1]","Admin");
        pageFactory.getAdminPage().clickAddButton();
        verification("(//h6)[2]","Add User");
        pageFactory.getAddUserPage().AddUser();
        verification("//h6[1]","Admin");
        pageFactory.getAdminPage().searchEmployee();
        close();
    }
}
