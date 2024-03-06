class LogManager {
    private Logger consoleLogger;
    private Logger fileLogger;
    private Logger errorLogger;

    public LogManager(Logger consoleLogger, Logger fileLogger, Logger errorLogger) {
        this.consoleLogger = consoleLogger;
        this.fileLogger = fileLogger;
        this.errorLogger = errorLogger;
    }

    public void logInfo(String message) {
        consoleLogger.log(message);
    }

    public void logDebug(String message) {
        consoleLogger.log(message);
        fileLogger.log(message);
    }

    public void logError(String message) {
        errorLogger.log(message);
        consoleLogger.log(message);
        fileLogger.log(message);
    }
}