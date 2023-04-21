package actions;

import commons.BasePage;
import interfaces.LoginUI;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void openBrowser(WebDriver driver) {
        getBrowser(driver);
    }

    @Step
    public void nhapTenGianHang(String tenGianHang) {
        enterTextToElement(driver, LoginUI.TEN_GIAN_HANG, tenGianHang);
        SleepInSecond(0.5);
    }

    @Step
    public void nhapTenDangNhap(String tenDangNhap) {
        enterTextToElement(driver, LoginUI.TEN_DANG_NHAP, tenDangNhap);
        SleepInSecond(0.5);
    }

    @Step
    public void nhapMatKhau(String matKhau) {
        enterTextToElement(driver, LoginUI.MAT_KHAU, matKhau);
        SleepInSecond(0.5);
    }

    @Step
    public void clickButtonLogin() {
        clickToElement(driver, LoginUI.BUTTON_QUAN_LY);
        SleepInSecond(3);
    }

}
