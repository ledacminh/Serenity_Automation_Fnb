package steps;

import commons.GlobalConstants;
import interfaces.LoginIUI;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import steps.commons.BasePage;

public class StepLogin extends BasePage {

    private WebDriver driver;

    @Step("User di chuyển đến trang đăng nhập")
    public void diChuyenDenTrangDangNhap() {
        driver = getBrowserDriver("chrome");
        driver.get(GlobalConstants.PROJECT_URL);
    }
    @Step("Nhập tên gian hàng")
    public void nhapTenGianHang(String tenGianHang) {
        enterTextToElement(driver, LoginIUI.TEN_GIAN_HANG, tenGianHang);
        SleepInSecond(0.5);
    }

    @Step("Nhập tên đăng nhập")
    public void nhapTenDangNhap(String tenDangNhap) {
        enterTextToElement(driver, LoginIUI.TEN_DANG_NHAP, tenDangNhap);
        SleepInSecond(0.5);
    }

    @Step("Nhập mật khẩu")
    public void nhapMatKhau(String matKhau) {
        enterTextToElement(driver, LoginIUI.MAT_KHAU, matKhau);
        SleepInSecond(0.5);
    }

    @Step("Click button Login")
    public void clickButtonLogin() {
        clickToElement(driver, LoginIUI.BUTTON_QUAN_LY);
        SleepInSecond(5);
    }

    @Step("Click button Login")
    public void clickButtonLogin(String text) {
        clickToElement(driver, "");
        SleepInSecond(5);
    }

    @Step("Close browser")
    public void closeBrowsers() {
        closeBrowser(driver);
    }

}
