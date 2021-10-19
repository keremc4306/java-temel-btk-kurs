package com.company;

public class Main {

    public static void main(String[] args) {
	    BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(),
                               new ConsoleLogger()};
        // FileLogger BaseLogger'ı tutamaz. Ama BaseLogger istediği her logger'ı tutabilir. Hepsini inherit etmiş.
        for (BaseLogger logger: loggers) {
            logger.log("Log message");
        }
    }
}
