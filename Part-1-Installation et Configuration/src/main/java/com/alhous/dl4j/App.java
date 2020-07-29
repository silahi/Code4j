package com.alhous.dl4j;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        INDArray t = Nd4j.randn(15, 2);
        log.info(t.toString());
    }
}
