package org.usfirst.frc.team6584.robot.commands;

import org.usfirst.frc.team6584.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WheelsIn extends Command {

    public WheelsIn() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.intakepacman);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.intakepacman.wheelsMove(1);
    	Robot.drivetrain.resetcountencoder();
    	Robot.drivetrain.resetGyro();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intakepacman.wheelsMove(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intakepacman.wheelsStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
