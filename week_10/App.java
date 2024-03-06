public class App {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger errorLogger = new ErrorLogger();

        LogManager logManager = new LogManager(consoleLogger, fileLogger, errorLogger);

        logManager.logInfo("This is an information.");

        logManager.logDebug("This is a debug information.");

        logManager.logError("This is an error information.");
    }
}
