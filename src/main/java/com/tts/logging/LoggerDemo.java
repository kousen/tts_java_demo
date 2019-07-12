package com.tts.logging;

import java.util.logging.Logger;

public class LoggerDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerDemo.class.getName());

        logger.fine("This" + "is" + "a" + "list");
        logger.fine(() -> "This" + "is" + "a" + "lazy" + "list");

    }
}
