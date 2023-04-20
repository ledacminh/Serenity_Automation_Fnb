package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.StepLogin;

@RunWith(SerenityRunner.class)
public class SuiteLogin {

    @Steps
    StepLogin stepLogin;

    @Test
    public void loginSucessfully() {
        stepLogin.diChuyenDenTrangDangNhap();
        stepLogin.nhapTenGianHang("autotest11111");
        stepLogin.nhapTenDangNhap("0966152432");
        stepLogin.nhapMatKhau("HaNoi@20223");
        stepLogin.clickButtonLogin();
        stepLogin.closeBrowsers();
    }

    @Test
    public void loginSucessfullyy() {
        stepLogin.diChuyenDenTrangDangNhap();
        stepLogin.nhapTenGianHang("autotest11111");
        stepLogin.nhapTenDangNhap("0966152432");
        stepLogin.nhapMatKhau("HaNoi@20223");
        stepLogin.clickButtonLogin();
        stepLogin.closeBrowsers();
    }
}
