class ErrorLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}