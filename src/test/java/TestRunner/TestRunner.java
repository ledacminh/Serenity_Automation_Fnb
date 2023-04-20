package TestRunner;

import Program.StepLibraries;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestRunner {

    @Steps
    StepLibraries stepLibraries;

    @Test
    public void kiemTraTong(){
        stepLibraries.themSoDauTien();
        stepLibraries.themSoDauThuHai();
        stepLibraries.tinhTong();
    }

    @Test
    public void kiemTraHieu(){
        stepLibraries.themSoDauTien();
        stepLibraries.themSoDauThuHai();
        stepLibraries.tinhHieu();
    }

}
