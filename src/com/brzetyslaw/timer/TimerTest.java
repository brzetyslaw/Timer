package com.brzetyslaw.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by user001 on 2016-03-25.
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Zamknąć program?");
        System.exit(0);
    }
}
