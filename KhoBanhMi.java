package model;
import java.util.LinkedList;
import java.util.Queue;

public class KhoBanhMi {
    private final Queue<String> khoBanh = new LinkedList<>();
    private final int sucChuaToiDa = 5;

    public synchronized void sanXuatBanh(String tenNguoiLam) throws InterruptedException {
        while (khoBanh.size() >= sucChuaToiDa) {
            System.out.println(tenNguoiLam + " chờ vì tiệm đầy...");
            wait();
        }
        String banhMi = "Bánh mì " + (khoBanh.size() + 1);
        khoBanh.add(banhMi);
        System.out.println(tenNguoiLam + " làm xong: " + banhMi);
        notifyAll();
    }

    public synchronized void tieuThuBanh(String tenNguoiAn) throws InterruptedException {
        while (khoBanh.isEmpty()) {
            System.out.println(tenNguoiAn + " chờ vì hết bánh...");
            wait();
        }
        String banhMi = khoBanh.poll();
        System.out.println(tenNguoiAn + " ăn: " + banhMi);
        notifyAll();
    }
}
