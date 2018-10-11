import java.util.Date;
import java.util.*;

public class Hoaqua {
            private float gia_tien;
            private int so_luong;
            private String ngay_nhap;
            private String nguon_goc;
            public Hoaqua(){
                this.gia_tien= 30;
                this.so_luong=1;
                this.nguon_goc="Viet Nam";
                this.ngay_nhap= "1/1/2018";
            }
            public Hoaqua(float gia_tien,int so_luong,String ngay_nhap,String nguon_goc){
                this.gia_tien=gia_tien;
                this.so_luong=so_luong;
                this.ngay_nhap=ngay_nhap;
                this.nguon_goc=nguon_goc;
            }

    public float getGia_tien() {
        return gia_tien;
    }

    public void setGia_tien(float gia_tien) {
        this.gia_tien = gia_tien;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String getNgay_nhap() {
        return ngay_nhap;
    }

    public void setNgay_nhap(String  ngay_nhap) {
        this.ngay_nhap = ngay_nhap;
    }

    public String getNguon_goc() {
        return nguon_goc;
    }

    public void setNguon_goc(String nguon_goc) {
        this.nguon_goc = nguon_goc;
    }
    public void in(){
                System.out.println(gia_tien+"\n"+so_luong+"\n"+ngay_nhap+"\n"+nguon_goc);
    }
}
