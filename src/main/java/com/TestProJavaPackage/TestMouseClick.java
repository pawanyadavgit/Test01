package com.TestProJavaPackage;
import java.awt.AWTException;
import java.awt.Button;
import java.awt.Robot;
import java.util.Random;

public class TestMouseClick {

	public static final int FIVE_SECONDS = 100000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		try {
		Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));            
			Thread.sleep(FIVE_SECONDS);			 
        }
        }
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
