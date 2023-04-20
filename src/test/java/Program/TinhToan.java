package Program;

public class TinhToan {
    private int num1;
    private int num2;
    public int tong;
    public int hieu;

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int ting_tong() {
        return num1 + num2;
    }

    public int tinh_hieu() {
        return num1 - num2;
    }
}
