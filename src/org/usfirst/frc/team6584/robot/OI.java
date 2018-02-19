package org.usfirst.frc.team6584.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6584.robot.commands.JoystickMove;
import org.usfirst.frc.team6584.robot.commands.WheelsIn;
import org.usfirst.frc.team6584.robot.commands.WheelsOut;
import org.usfirst.frc.team708.robot.util.Gamepad;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	public static Gamepad driverstick = new Gamepad (0);
	public static Gamepad operatorstick = new Gamepad (1);
	// The Gamepad has different values, they operate the driver stick and the operator stick.
	public static int INTAKE_IN = Gamepad.button_L_Shoulder;
	public static int INTAKE_OUT = Gamepad.button_R_Shoulder;
	// These assign buttons for the intake on the gamepad/operator joystick
	
	
	public static Button intakeInButton = new JoystickButton(operatorstick, INTAKE_IN);
	public static Button intakeOutButton = new JoystickButton(operatorstick, INTAKE_OUT);
	// The joysticks are the functions for the intake in and intake out.
	public OI() { 
		intakeInButton.whileHeld(new WheelsIn());
		intakeOutButton.whileHeld(new WheelsOut());
		// This is for when the wheels go in and out
	}
	
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
