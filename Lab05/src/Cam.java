
import java.util.Date;

public class Cam extends Hoaqua       {
    public  Cam(){
        this.setGia_tien(30);
        this.setNguon_goc("VN");
        this.setNgay_nhap("1/1/2018");
        this.setSo_luong(1);
    }
    public void in(){
        System.out.println("ten qua: cam");
        super.in();
    }
}