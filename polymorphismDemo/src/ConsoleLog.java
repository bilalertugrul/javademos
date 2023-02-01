public class ConsoleLog extends BaseLogger {
    public void Log(String message){
        System.out.println("Logged to Console : " + message);
    }
}
