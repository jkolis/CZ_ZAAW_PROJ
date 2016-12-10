package pl.knpj.servlet.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;


public class HandlerConfig {

    private static FileHandler fileHandler;
    private static ConsoleHandler consoleHandler;

    public static final FileHandler getFileHandler() throws IOException {
        if(fileHandler == null) {
            fileHandler = new FileHandler();
        }
        return fileHandler;
    }

    public static final ConsoleHandler getConsoleHandler() {
        if (consoleHandler == null) {
            consoleHandler = new ConsoleHandler();
        }
        return consoleHandler;
    }

}
