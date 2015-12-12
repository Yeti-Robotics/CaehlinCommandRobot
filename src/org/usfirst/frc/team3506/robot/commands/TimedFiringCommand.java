package org.usfirst.frc.team3506.robot.commands;

import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimedFiringCommand extends Command {

	double timeout;
	double speed;

	public TimedFiringCommand(double timeout, double speed) {
		requires(Robot.firingMotorSubsystem);
		this.timeout = timeout;
		this.speed = speed;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		setTimeout(timeout);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.firingMotorSubsystem.setSpeed(speed);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.firingMotorSubsystem.stopMotor();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
