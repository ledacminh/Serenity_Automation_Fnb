package testcases;

import Program.StepLibraries;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestRunner2 {

    @Steps
    StepLibraries stepLibraries2;

    @WithTag("01")
    @Test
    public void kiemTraTong(){
        stepLibraries2.themSoDauTien();
        stepLibraries2.themSoDauThuHai();
        stepLibraries2.tinhTong();
        System.out.println("TestRunner 222222222222222222222222222222222222222222222222");
    }

    @Test
    public void kiemTraHieu(){
        stepLibraries2.themSoDauTien();
        stepLibraries2.themSoDauThuHai();
        stepLibraries2.tinhHieu();
        System.out.println("TestRunner 222222222222222222222222222222222222222222222222");

    }

}
