package org.usfirst.frc.team115.robot.commands;

import org.usfirst.frc.team115.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class DriveWithJoystick extends Command {
    
    public DriveWithJoystick() {
        requires(Robot.driveTrain);
    }

    protected void initialize() {}

    protected void execute() {
        Robot.driveTrain.drive(Robot.oi.getJoystick());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.driveTrain.stop();
    }
    
    protected void interrupted() {
        end();
    }
}

