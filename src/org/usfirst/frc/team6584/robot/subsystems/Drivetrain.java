package org.usfirst.frc.team6584.robot.subsystems;

import org.usfirst.frc.team6584.robot.RobotMap;
import org.usfirst.frc.team6584.robot.commands.JoystickMove;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {
	Spark rightmotor = new Spark(RobotMap.leftDrivetrainMotor); //object
	Spark leftmotor = new Spark(RobotMap.rightDrivetrainMotor);

	DifferentialDrive swagMove = new DifferentialDrive (rightmotor, leftmotor);
	
	public Drivetrain () {
	
	}
	
	public void accelerate (double move, double turn) { // methods 
		
		swagMove.arcadeDrive(move, turn); // parameters inside the parenthesis 
		
	}
	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new JoystickMove());
	}
}
