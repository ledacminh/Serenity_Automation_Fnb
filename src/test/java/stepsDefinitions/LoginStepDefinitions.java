package stepsDefinitions;

import actions.LoginPage;
import actions.PageGenerateManager;
import commons.Hooks;
import commons.ListGlobalScenarioVariable;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {
    private final WebDriver driver;

    @Steps
    LoginPage loginPage;

    public enum TestData {
        USERID, PASSWORD
    }

    public LoginStepDefinitions() {
        driver = Hooks.getDriver();
        loginPage = PageGenerateManager.getLoginPage(driver);
    }

    @Before
    public void openBrowser() {
        loginPage.openBrowser(driver);
    }

    @When("Input to name store")
    public void inputToNameStore() {
        loginPage.nhapTenGianHang("autotest1111");
    }

    @When("Input to user name")
    public void inputToUserName() {
        loginPage.nhapTenDangNhap("0966152432");
    }

    @When("Input to password")
    public void inputToPassword() {
        loginPage.nhapMatKhau("HaNoi@2023");
    }

    @When("Click to button manage")
    public void clickToButtonManage() {
        loginPage.clickButtonLogin();
    }

    @When("Close application")
    public void closeApplication() {
        System.out.println("Qqqqqqqqqqqqqqqqqqq" + ListGlobalScenarioVariable.getValue(TestData.USERID.toString()));
    }


}
