package org.usfirst.frc.team6584.robot.subsystems;

import org.usfirst.frc.team6584.robot.RobotMap;
import org.usfirst.frc.team6584.robot.commands.JoystickMove;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drivetrain extends Subsystem {
	Spark leftmotor, rightmotor; //object
	Encoder countencoder;
	ADXRS450_Gyro gyro;
	DifferentialDrive swagMove;
	
	private final double distancePerPulse = 0.095;
	
	public Drivetrain () {
		rightmotor   = new Spark(RobotMap.leftDrivetrainMotor);
		leftmotor    = new Spark(RobotMap.rightDrivetrainMotor);
		countencoder = new Encoder(RobotMap.countencoderA, RobotMap.countencoderB);
		swagMove     = new DifferentialDrive (rightmotor, leftmotor);
		gyro         = new ADXRS450_Gyro();
		
		countencoder.setDistancePerPulse(distancePerPulse);
	}
	
	public void SendToDashboard() {
		SmartDashboard.putNumber("Gyro Rate", gyro.getRate());
		SmartDashboard.putNumber("Gyro angle",getGucciAngle());
		SmartDashboard.putNumber("Encoder distance", getDistance());
		
	}
	
	
	
	public void accelerate (double move, double turn) { // methods 
		
		swagMove.arcadeDrive(move, turn); // parameters inside the parenthesis 
		
	}
	
	public double getDistance (){
		return countencoder.getDistance();
	}
	
	public double getGucciAngle (){
		return gyro.getAngle();
	}
	
	public void resetGyro (){
		gyro.reset();
	}
	
	public void resetcountencoder(){
		countencoder.reset();
	}
	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new JoystickMove());
	}
}
