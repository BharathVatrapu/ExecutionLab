package com.ExecutionLab.frames;

import com.ExecutionLab.utils.Generic;
import com.ExecutionLab.utils.GlobalConstants;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bharat.vatrapu@gmail.com
 *
 */

public class Starter extends JFrame  {
    private JLabel imglabel;
    private ImageIcon img;
    private static JProgressBar pbar;
    Thread t = null;

    public Starter() {
        super("Splash");
        setSize(580, 310);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        img = new ImageIcon(getClass().getResource("/images/SplashScreen_Pro.png"));
        imglabel = new JLabel(img);
        add(imglabel);
        setLayout(null);
        pbar = new JProgressBar();
        pbar.setMinimum(0);
        pbar.setMaximum(100);
        pbar.setStringPainted(true);
        pbar.setForeground(Color.LIGHT_GRAY);
        imglabel.setBounds(0, 0, 580, 310);
        add(pbar);
        pbar.setPreferredSize(new Dimension(310, 30));
        pbar.setBounds(0, 290, 580, 20);

        Thread t = new Thread() {

            public void run() {
                int i = 0;
                while (i <= 100) {
                    pbar.setValue(i);
                    try {
                        sleep(90);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                }
            }
        };
        t.start();
    }

    public static void main(String args[])throws Exception{
        Starter ss=new Starter();
        ss.setVisible(true);
        Thread t=Thread.currentThread();
        t.sleep(10000);
        ss.dispose();

        if(Generic.verifyFileExist(GlobalConstants.ROOT_FOLDER_PATH+"/Bharath.txt")){
            new Main().setVisible(true);
        } else {
            Generic.initSetup();
        }
    }

}
