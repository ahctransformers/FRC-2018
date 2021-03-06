package org.usfirst.frc.team6584.robot.subsystems;

import org.usfirst.frc.team6584.robot.RobotMap;
import org.usfirst.frc.team6584.robot.commands.JoystickLift;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Lift extends Subsystem {
	Spark liftmotor = new Spark(RobotMap.liftmotor);
	DigitalInput liftswitch = new DigitalInput(RobotMap.liftswitch); 
	
	public void liftMove(double speed) {
		liftmotor.set (speed);
	}
	
	
	
	public void liftStop () {
		liftmotor.set (0);
	}

	public boolean isSwitchPressed (){
		return liftswitch.get();
	} 
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new JoystickLift());
    }

    public void SendtoDashboard() {
    	SmartDashboard.putBoolean("Switch Press", liftswitch.get());
    	
    }



	public void haloDrive(double moveSpeed, double d, boolean b) {
		// TODO Auto-generated method stub
		
	}



	public void JoystickLift() {
		// TODO Auto-generated method stub
		
	}
		
	}


