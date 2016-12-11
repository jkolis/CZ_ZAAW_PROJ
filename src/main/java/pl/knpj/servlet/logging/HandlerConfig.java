package pl.knpj.servlet.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

/**
 * Class to configure loggers' handlers
 */

public class HandlerConfig {

    private static FileHandler fileHandler;
    private static ConsoleHandler consoleHandler;
    private static SimpleFormatter simpleFormatter = new SimpleFormatter();

    /**
     * Method used to receive a FileHandler instance.
     *
     * @param path path for log file
     * @return FileHandler instance
     * @throws IOException
     */

    public static final FileHandler getFileHandler(String path) throws IOException {
        if(fileHandler == null) {
            initializeFileHandler(path);

        }
        return fileHandler;
    }

    private static void initializeFileHandler(String path) throws IOException {
        fileHandler = new FileHandler(path);
        fileHandler.setFormatter(simpleFormatter);
    }

    /**
     * Method used to receive a ConsoleHandler instance.
     *
     * @return ConsoleHandler instance
     */

    public static final ConsoleHandler getConsoleHandler() {
        if (consoleHandler == null) {
            initializeConsoleHandler();
        }
        return consoleHandler;
    }

    private static void initializeConsoleHandler() {
        consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(simpleFormatter);
    }
}
