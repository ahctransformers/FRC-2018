package org.usfirst.frc.team6584.robot.commands;

import org.usfirst.frc.team6584.robot.Robot;
import org.usfirst.frc.team708.robot.util.Math708;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Turn2AngleA extends Command {

		double aTurnSpeed;
		double anAngle; 
		
		
    public Turn2AngleA() {
    	requires(Robot.drivetrain);
    	
    		this.aTurnSpeed = aTurnSpeed;
    		this.anAngle = anAngle; 
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drivetrain.resetGyro();
    	Robot.drivetrain.resetcountencoder(); 
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	this.aTurnSpeed = Math708.getClippedPercentError(Robot.drivetrain.getGucciAngle(), anAngle, 0.90, 1.0); // change theses values 
    	
    	Robot.drivetrain.accelerate(0.0, aTurnSpeed); 	
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Math.abs(Robot.drivetrain.getGucciAngle()) >= Math.abs(anAngle);
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
