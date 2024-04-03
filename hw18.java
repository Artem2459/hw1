import java.util.Timer;
import java.util.TimerTask;

public class hw18 {
    private static int seconds = 0;

    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                seconds++;
                System.out.println("Elapsed time: " + seconds + " seconds");
            }
        };

        // Запускаємо таймер, який буде викликати завдання кожну секунду (1000 мілісекунд)
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
}

