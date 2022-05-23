import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyPress {

    public static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // There are 82 pages.
        int n = 41;
        System.out.println("Begin.");
        robot.delay(20000);
        for (int i = 0; i < n; i -= -1) {
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
            System.out.println(i);
            robot.delay(2000);
        }
        System.out.println("End.");
    }

}
