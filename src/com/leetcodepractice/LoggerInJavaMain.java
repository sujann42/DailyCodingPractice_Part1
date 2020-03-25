package com.leetcodepractice;

import java.io.IOException;
import java.util.logging.Level;

public class LoggerInJavaMain {

    public static void main(String[] args) {
        LoggingInJava myLog;
        try {
            myLog = new LoggingInJava("/Users/suzan/Desktop/LogFiles/log.text");
            myLog.logger.setLevel(Level.WARNING);
            myLog.logger.info("Info Mssg.");
            myLog.logger.warning("Warning mssg");
            myLog.logger.severe("Severe mssg");
            myLog.logger.severe("++++++++++++++");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

