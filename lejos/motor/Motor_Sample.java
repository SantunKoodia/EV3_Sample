import lejos.hardware.BrickFinder;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.hardware.port.SensorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

// this is how i got the motors to run. 
// machine goes straight forward and stops the motors at the same time.
// this is still work in progress, i plan to implement the touch sensors next and then start doing the line tracer.

public class Main {
	public static void main(String[] args) {

		RegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		RegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.B);

		//leftMotor.rotate(360);
		
		leftMotor.forward();
		rightMotor.forward();
		
		Delay.msDelay(5000);

		rightMotor.stop(true);

		leftMotor.stop(true);


	}
}
