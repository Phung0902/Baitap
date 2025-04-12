package worker;
import model.KhoBanhMi;

public class ThoLamBanh extends Thread {
    private final KhoBanhMi khoBanh;
    private final String tenNguoiLam;

    public ThoLamBanh(KhoBanhMi kho, String ten) {
        this.khoBanh = kho;
        this.tenNguoiLam = ten;
    }

    public void run() {
        try {
            while (true) {
                khoBanh.sanXuatBanh(tenNguoiLam);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
