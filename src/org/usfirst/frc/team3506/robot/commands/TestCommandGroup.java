package org.usfirst.frc.team3506.robot.commands;

import org.usfirst.frc.team3506.robot.Direction;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TestCommandGroup extends CommandGroup {
    
    public  TestCommandGroup() {
       addSequential(new TimedDriveCommand(1, 0.8, Direction.FORWARD));
       addParallel(new TimedFiringCommand(1, 0.3));
       addSequential(new TimedTurningCommand(2.5, Direction.FORWARD, 0.8));
       addSequential(new TimedDriveCommand(1, 0.8, Direction.FORWARD));
    }
}
