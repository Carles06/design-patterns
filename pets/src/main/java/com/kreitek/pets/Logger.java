package com.kreitek.pets;

public class Logger {
    private  static  volatile Logger instance = null;
    private  final String PREFIX_MESSAGE = "[debug]";
    private int debugNumber;

    public  static Logger getInstance(){

        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;

    }
    private  Logger(){
        if (instance != null){
            throw  new RuntimeException("Usage getInstance() method to create ");
        }
    }

    public void debug(String st) {

        debugNumber++;
        System.out.println(PREFIX_MESSAGE + "[" + debugNumber + "]" + st);


    }
}
