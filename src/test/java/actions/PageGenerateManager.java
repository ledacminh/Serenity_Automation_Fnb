package actions;

import org.openqa.selenium.WebDriver;

public class PageGenerateManager {
        public static LoginPage getLoginPage(WebDriver driver) {
            return  new LoginPage(driver);
        }
}
