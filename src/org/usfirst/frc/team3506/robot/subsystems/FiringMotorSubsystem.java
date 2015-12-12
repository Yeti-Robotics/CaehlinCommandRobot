package org.usfirst.frc.team3506.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class FiringMotorSubsystem extends Subsystem {
    
	Talon motor;
	public FiringMotorSubsystem() {
		motor = new Talon(4);
	}
	
    public void initDefaultCommand() {

    }
    public void setSpeed(double speed){
    	motor.set(speed);
    }
    public void stopMotor(){
    	motor.set(0);
    }
}

