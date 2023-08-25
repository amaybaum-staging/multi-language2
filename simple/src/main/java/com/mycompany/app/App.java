package com.mycompany.app;

import org.dom4j.DocumentHelper;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        DocumentHelper documentHelper = new DocumentHelper(MESSAGE);
        System.out.println(documentHelper);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
