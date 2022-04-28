import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Logger {
    private int num = 1;
    private static Logger logger = null;
    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendPattern("DD.MM.yyyy HH:mm:ss").toFormatter();

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now().format(DATE_TIME_FORMATTER) + " " + num++ + "] " + msg);
    }
}
