package br.com.speed.move.util;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class Screenshot {

    public static BufferedImage takeScreenshot() {
        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            return screenFullImage;
        } catch (AWTException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
