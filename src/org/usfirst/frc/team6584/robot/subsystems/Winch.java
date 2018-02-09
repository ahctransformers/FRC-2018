package org.usfirst.frc.team6584.robot.subsystems;

import org.usfirst.frc.team6584.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Winch extends Subsystem {
	
	public SpeedController winchmotor;
	
	public Winch() {
		winchmotor= new Spark(RobotMap.winchmotor);
	}
	
	public void climbRope() {
		winchmotor.set(1.0);
	}
	public void descendRope(){
		winchmotor.set(-1.0);
	}
	public void stopRope()  {
		winchmotor.set(0.0);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

