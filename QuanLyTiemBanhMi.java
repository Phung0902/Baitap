package main;
import model.KhoBanhMi;
import worker.ThoLamBanh;
import worker.KhachHang;

public class QuanLyTiemBanhMi {
    public static void main(String[] args) {
        KhoBanhMi kho = new KhoBanhMi();
        new ThoLamBanh(kho, "Thợ làm bánh").start();
        new KhachHang(kho, "Khách hàng").start();
    }
}
