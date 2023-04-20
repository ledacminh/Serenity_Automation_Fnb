package testcases;

import Program.StepLibraries;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestRunner {

    @Steps
    StepLibraries stepLibraries;


    @Test
    public void kiemTraTong() {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee " + variables.getProperty("username"));
        stepLibraries.themSoDauTien();
        stepLibraries.themSoDauThuHai();
        stepLibraries.tinhTong();

    }

    @Test
    public void kiemTraHieu() {
        stepLibraries.themSoDauTien();
        stepLibraries.themSoDauThuHai();
        stepLibraries.tinhHieu();
    }

}
