package org.usfirst.frc.team3506.robot.subsystems;

import org.usfirst.frc.team3506.robot.OI;
import org.usfirst.frc.team3506.robot.commands.UserDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	RobotDrive driveTrain;

	public DriveTrainSubsystem() {
		driveTrain = new RobotDrive(0, 3, 1, 2);

	}

	public void initDefaultCommand() {
		setDefaultCommand(new UserDriveCommand());
	}

	public void driveForward(double speed) {
		speed *= OI.JOYMOD;
		driveTrain.tankDrive(-speed, -speed);
	}

	public void drive(double left, double right) {
		left *= OI.JOYMOD;
		right *= OI.JOYMOD;

		driveTrain.tankDrive(-left, -right);
	}

	public void driveBackwards(double speed) {
		speed *= OI.JOYMOD;
		driveTrain.tankDrive(speed, speed);
	}
}
