package worker;
import model.Tau;

public class DaiLyVeTau extends Thread {
    private final Tau tau;
    private final String tenDaiLy;
    private final boolean isDatVe;

    public DaiLyVeTau(Tau tau, String ten, boolean isDatVe) {
        this.tau = tau;
        this.tenDaiLy = ten;
        this.isDatVe = isDatVe;
    }

    public void run() {
        try {
            while (true) {
                if (isDatVe) {
                    tau.datVe(tenDaiLy);
                } else {
                    tau.huyVe(tenDaiLy);
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
