package org.usfirst.frc.team6584.robot.subsystems;

import org.usfirst.frc.team6584.robot.RobotMap;

import edu.wpi.first.wpilibj.PWMSpeedController;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakePacman extends Subsystem {
	Spark motorLeft = new Spark(RobotMap.leftIntakePacman);
	Spark motorRight = new Spark(RobotMap.rightIntakePacman);
  
	double intakeScaleFactor = 1.0; 

	public void wheelsMove (double speed) {
    	
		motorLeft.set(-speed * intakeScaleFactor);
		
		motorRight.set(speed * intakeScaleFactor);
    }
    public void wheelsStop () {
    	
    	motorLeft.set(0);
    	motorRight.set(0);
    }
    public void hasCube() {

    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}
