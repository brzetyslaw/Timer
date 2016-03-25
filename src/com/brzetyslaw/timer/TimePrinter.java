package com.brzetyslaw.timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by user001 on 2016-03-25.
 */
class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        Date now = new Date();
        System.out.println("Kiedy usłyszysz dźwięk, będzie godzina " + now);
        Toolkit.getDefaultToolkit().beep();
    }
}