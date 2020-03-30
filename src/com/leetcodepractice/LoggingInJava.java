package com.leetcodepractice;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggingInJava {
    public Logger logger;
    FileHandler fileHandler;

    public LoggingInJava(String file_name) throws SecurityException, IOException {
        File f = new File(file_name);
        if (!f.exists()) {
            f.createNewFile();
        }

        fileHandler = new FileHandler(file_name, true);
        logger = Logger.getLogger("Name of Log is: Test");
        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

    }
}
