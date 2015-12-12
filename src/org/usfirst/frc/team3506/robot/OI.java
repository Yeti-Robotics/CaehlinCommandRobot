package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.commands.TestCommandGroup;
import org.usfirst.frc.team3506.robot.commands.TimedDriveCommand;
import org.usfirst.frc.team3506.robot.commands.TimedTurningCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick leftJoystick;
	public static Joystick rightJoystick;
	public static double JOYMOD = 0.7;

	public OI() {
		leftJoystick = new Joystick(1);
		rightJoystick = new Joystick(4);
		
		JoystickButton leftButton8 = new JoystickButton(leftJoystick, 8);
		leftButton8.whenPressed(new TestCommandGroup());
		
	}
}
