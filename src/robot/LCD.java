package robot;

import lejos.hardware.*;
import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.ev3.EV3;
import lejos.hardware.lcd.TextLCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class LCD {

	public static void main(String[] args) {
		try {
//			EV3 ev3 = (EV3) BrickFinder.getLocal();
//			TextLCD lcd = ev3.getTextLCD();
//			Keys keys = ev3.getKeys();
//			lcd.drawString("Hello World", 4, 4);
//			keys.waitForAnyPress();
			RegulatedMotor m = new EV3LargeRegulatedMotor(MotorPort.D);
			m.rotate(360);
		}
		
		catch (Exception t) {
			t.printStackTrace();
			EV3 ev3 = (EV3) BrickFinder.getLocal();
			Keys keys = ev3.getKeys();
			keys.waitForAnyPress();
			System.exit(1);
		}
	}

}
