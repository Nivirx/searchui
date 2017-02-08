import searchui.MainWindow;
import sun.awt.OSInfo;

/**
 * Created by bclaus on 2/7/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello you are running %s", OSInfo.getOSType());
        javax.swing.SwingUtilities.invokeLater(new MainWindow());
    }
}
