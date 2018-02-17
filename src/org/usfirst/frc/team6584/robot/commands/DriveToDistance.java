package org.usfirst.frc.team6584.robot.commands;

import org.usfirst.frc.team6584.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveToDistance extends Command {
	
	private double gucciDistance ; 

    public DriveToDistance(double distance) { 
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
        
        gucciDistance = distance; 
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.accelerate(1, 0);
    	Robot.drivetrain.resetcountencoder();
    	Robot.drivetrain.resetGyro();
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.accelerate(1, 0);
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.drivetrain.getDistance() >= gucciDistance ;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.accelerate(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    this.end() ;
    }
}
