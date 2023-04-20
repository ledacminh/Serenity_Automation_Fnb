package Program;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class StepLibraries {
    TinhToan tinhToan = new TinhToan();

    @Step("Học sinh thêm số đầu tiên là 1")
    public void themSoDauTien() {
        tinhToan.setNum1(1);
    }


    @Step("Học sinh thêm số thứ 2 là 2")
    public void themSoDauThuHai() {
        tinhToan.setNum2(2);
    }

    @Step("Cô giáo kiểm tra tính tổng")
    public void tinhTong() {
        Assert.assertEquals(3, tinhToan.ting_tong());
    }

    @Step("Cô giáo kiểm tra tính hiệu")
    public void tinhHieu() {
        Assert.assertEquals(-1, tinhToan.tinh_hieu());
    }
}
