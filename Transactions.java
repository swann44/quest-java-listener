import java.util.Timer;
import java.util.TimerTask;

public class Transactions {

    public static void withdraw(Bank account, int value) {
        int time = (int) (Math.random() * ((4000 - 1000) + 1)) + 1000;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                account.setTotal(account.getTotal() - value);
            }
        }, time);
    }
}
