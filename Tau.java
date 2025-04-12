package model;
import java.util.LinkedList;
import java.util.Queue;

public class Tau {
    private final Queue<String> gheDaDat = new LinkedList<>();
    private final int soGhe = 5;

    public synchronized void datVe(String tenDaiLy) throws InterruptedException {
        while (gheDaDat.size() >= soGhe) {
            System.out.println(tenDaiLy + " chờ - Hết chỗ!");
            wait();
        }
        String gheMoi = "Ghế " + (gheDaDat.size() + 1);
        gheDaDat.add(gheMoi);
        System.out.println(tenDaiLy + " đặt " + gheMoi);
        notifyAll();
    }

    public synchronized void huyVe(String tenDaiLy) throws InterruptedException {
        while (gheDaDat.isEmpty()) {
            System.out.println(tenDaiLy + " chờ - Không có vé để hủy!");
            wait();
        }
        String gheBiHuy = gheDaDat.poll();
        System.out.println(tenDaiLy + " hủy " + gheBiHuy);
        notifyAll();
    }
}
