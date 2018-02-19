package org.usfirst.frc.team6584.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6584.robot.Robot;
import org.usfirst.frc.team708.robot.util.Gamepad;

/**
 *
 */
public class JoystickMove extends Command {
	public JoystickMove() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.drivetrain.resetcountencoder();
    	Robot.drivetrain.resetGyro();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.drivetrain.accelerate(-Robot.oi.driverstick.getAxis(1), Robot.oi.driverstick.getAxis(0));
		//Robot.drivetrain.accelerate(Robot.oi.driverstick.getAxis(Gamepad.leftStick_Y), -Robot.oi.driverstick.getAxis(Gamepad.rightStick_X));
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
