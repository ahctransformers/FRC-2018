package org.usfirst.frc.team6584.robot.subsystems;

import org.usfirst.frc.team6584.robot.RobotMap;
import org.usfirst.frc.team6584.robot.commands.JoystickMove;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {
	Spark rightmotor = new Spark(RobotMap.leftDrivetrainMotor); //object
	Spark leftmotor = new Spark(RobotMap.rightDrivetrainMotor);
	Encoder countencoder = new Encoder(RobotMap.countencoderA, RobotMap.countencoderB);

	DifferentialDrive swagMove = new DifferentialDrive (rightmotor, leftmotor);
	
	private final double distancePerPulse = 0.0526389;
	
	public Drivetrain () {
		countencoder.setDistancePerPulse(distancePerPulse);
	}
	
	public void accelerate (double move, double turn) { // methods 
		
		swagMove.arcadeDrive(move, turn); // parameters inside the parenthesis 
		
	}
	
	public double getDistance (){
		return countencoder.getDistance();
	}
	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new JoystickMove());
	}
}
