
package org.usfirst.frc.team6584.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team6584.robot.commands.AutoSwitch;
import org.usfirst.frc.team6584.robot.commands.DriveToDistance;
import org.usfirst.frc.team6584.robot.commands.JoystickMove;
import org.usfirst.frc.team6584.robot.commands.ResetEncoder;
import org.usfirst.frc.team6584.robot.commands.ResetGyro;
import org.usfirst.frc.team6584.robot.subsystems.Drivetrain;
import org.usfirst.frc.team6584.robot.subsystems.IntakePacman;
import org.usfirst.frc.team6584.robot.subsystems.Lift;
import org.usfirst.frc.team6584.robot.subsystems.Winch;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
// subsystems, autonomous chooser, oi 
public class Robot extends IterativeRobot {

	Command autonomousCommand1; 
	SendableChooser autoChooser; 
	
	
	public static Drivetrain drivetrain;
	public static IntakePacman intakepacman;
	public static Lift lift;
	public static Winch winch;
	public static OI oi;
	
	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
<<<<<<< HEAD
=======
	
>>>>>>> origin/master
		drivetrain = new Drivetrain();
		winch = new Winch();
		intakepacman = new IntakePacman();
		lift = new Lift ();
		oi = new OI();
		
		autoChooser = new SendableChooser();
		
		autoChooser.addDefault("Do Nothing", new DriveToDistance (0));
		autoChooser.addObject("Drive to Baseline", new DriveToDistance (10));
		autoChooser.addObject("AutoSwitch", new AutoSwitch()); 
		SmartDashboard.putData("Autonomous mode chooser", autoChooser);
		
		chooser.addDefault("Default Auto", new JoystickMove());
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", chooser);
		
		 SmartDashboard.putData("Auto mode", chooser);
	     SmartDashboard.putData("Reset Encoder", new ResetEncoder());
	     SmartDashboard.putData(drivetrain);
	     SmartDashboard.putData("Reset Gyro", new ResetGyro());
	        		
		 CameraServer.getInstance().startAutomaticCapture(0);
	  // CameraServer.getInstance().startAutomaticCapture(1);
		
	}
	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		drivetrain.SendToDashboard();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autonomousCommand1 = chooser.getSelected();
		autonomousCommand = (Command) autoChooser.getSelected();
		autonomousCommand.start(); 
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (autonomousCommand1 != null)
			autonomousCommand1.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		drivetrain.SendToDashboard();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand1 != null)
			autonomousCommand1.cancel();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		drivetrain.SendToDashboard();
	}
	
	
	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
