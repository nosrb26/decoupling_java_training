package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name){
        Logger logass;
        logass = new ConsoleLogger();
        return logass;
    }
}
