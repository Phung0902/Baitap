package worker;
import model.KhoBanhMi;

public class KhachHang extends Thread {
    private final KhoBanhMi khoBanh;
    private final String tenNguoiAn;

    public KhachHang(KhoBanhMi kho, String ten) {
        this.khoBanh = kho;
        this.tenNguoiAn = ten;
    }

    public void run() {
        try {
            while (true) {
                khoBanh.tieuThuBanh(tenNguoiAn);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
