
import model.Tau;
import worker.DaiLyVeTau;

public class QuanLyVeTau {
    public static void main(String[] args) {
        Tau tau = new Tau();

        new DaiLyVeTau(tau, "Đại lý A", true).start();
        new DaiLyVeTau(tau, "Đại lý B", true).start();
        new DaiLyVeTau(tau, "Đại lý C", false).start(); // Đại lý hủy vé
    }
}
