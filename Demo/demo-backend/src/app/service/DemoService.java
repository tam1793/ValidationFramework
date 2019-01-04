/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

import classdemo.ClassDemo;
import core.utilities.CommonUtil;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

/**
 *
 * @author tamnnq
 */
public class DemoService {

    private final Logger logger = Logger.getLogger(DemoService.class);

    private static final Lock LOCK = new ReentrantLock();
    private static DemoService _instances = null;

    public static DemoService getInstance() {

        if (_instances == null) {
            LOCK.lock();
            try {
                if (_instances == null) {
                    _instances = new DemoService();
                }
            } finally {
                LOCK.unlock();
            }
        }
        return _instances;

    }

    public void doWhenDataIsValid(ClassDemo.User user) {

        try {
            
            System.out.println("Data is valid - user: " + CommonUtil.objectToString(user));
            
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
    }

}
