package org.usfirst.frc.team3506.robot.commands;

import org.usfirst.frc.team3506.robot.Direction;
import org.usfirst.frc.team3506.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TimedTurningCommand extends Command {


	double timeout;
	double speed;
	Direction direction;

	public TimedTurningCommand(double timeout, Direction direction, double speed) {
		requires(Robot.driveTrainSubsystem);
		this.timeout = timeout;
		this.speed = speed;
		this.direction = direction;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		setTimeout(timeout);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (direction == Direction.RIGHT) {
			Robot.driveTrainSubsystem.drive(-speed, speed);
		} else {
			Robot.driveTrainSubsystem.drive(speed, -speed);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
