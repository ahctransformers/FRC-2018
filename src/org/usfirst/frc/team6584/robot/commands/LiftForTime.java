package org.usfirst.frc.team6584.robot.commands;

import org.usfirst.frc.team6584.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftForTime extends Command {
	
	private double moveSpeed;
	private double runTime;
	// These are the variables for moveSpeed and runTime.

    public LiftForTime(double moveSpeed, double runTime) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.lift);
    	
    	this.moveSpeed = moveSpeed;
    	this.runTime = runTime;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.lift.haloDrive(moveSpeed, 0.0, true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (this.timeSinceInitialized() >= runTime);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lift.liftStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
