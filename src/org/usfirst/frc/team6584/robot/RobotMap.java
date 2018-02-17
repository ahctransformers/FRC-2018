package org.usfirst.frc.team6584.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	
	public static int leftDrivetrainMotor = 0;
	public static int rightDrivetrainMotor = 1;
	
	public static int leftIntakePacman = 3;
	public static int rightIntakePacman = 4;

	public static int liftmotor = 2;
	
	public static int winchmotor = 5; 
	// Digital IO
	
	public static int liftswitch = 4;
	public static int countencoderA = 0; //A channel  
	public static int countencoderB = 1; // B channel 
	/* Pin 1 - +5VDC power Orange
	 * Pin 2 - A channel Blue
	 * Pin 3- Ground Black 
	 * Pin 4- B Channel Yellow
	 * channels are signals and so are white wires. 
	 */
	
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
