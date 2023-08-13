package app;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;



public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String [] args){

        Problems p = new ProblemsImpl();

        String m1 = "checkPalindrom( ['h','h','i','k','i','h','h']) : " + p.checkPalindrom( "hhikihh".toCharArray());
        LogRecord logRecord = new LogRecord(Level.INFO, m1);
        logger.log(logRecord);

        int [] arrInt = new int[5];
        arrInt[0] = 1;
        arrInt[1] = 1;
        arrInt[2] = 2;
        arrInt[3] = 6;
        arrInt[4] = 5;
        String m2 = "getIndiceNumbersNotInOrder([1,1,2,6,5]) : " + p.getIndiceNumbersNotInOrder(arrInt);
        logRecord.setMessage(m2);
        logger.log(logRecord);

        String [] strings = {"he","llo"," ","world"};
        String m3 = "concatString(['he','llo',' ','world']) : " + p.concatString(strings);
        logRecord.setMessage(m3);
        logger.log(logRecord);

        final boolean  KEY_VALUE = false;
        final boolean  UNIQUE = true;
        final boolean  FIFO_LIFO = false;
        final boolean  INDEXING = false;
        final boolean  ORDER = false;
        final boolean  SORT = true;
        final boolean  ADD_SPEED = true;
        final boolean  DELETE_SPEED = true;
        final boolean  GET_SPEED = true;
        final boolean  MEMORY = false;
        String m4 = "getCorrectCollectionTClass(...) : " + p.getCorrectCollectionTClass(KEY_VALUE, ORDER, UNIQUE,FIFO_LIFO,INDEXING,ADD_SPEED, DELETE_SPEED,GET_SPEED,MEMORY,SORT);
        logRecord.setMessage(m4);
        logger.log(logRecord);
    }
}

