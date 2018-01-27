package org.usfirst.frc.team6584.robot.subsystems;

import org.usfirst.frc.team6584.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {
	Spark liftmotor = new Spark(RobotMap.liftmotor);
	Encoder liftencoder = new Encoder(RobotMap.liftencoderA, RobotMap.liftencoderB); 
	
	public void liftMove(double speed) {
		liftmotor.set (speed);
	}
	
	
	
	public void liftStop () {
		liftmotor.set (0);
	}

	public double getDistance (){
		return liftencoder.getDistance();
		
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

