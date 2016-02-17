package org.usfirst.frc3566.chasis2016.commands;

import edu.wpi.first.wpilibj.command.Command;


import org.usfirst.frc3566.chasis2016.Robot;
import org.usfirst.frc3566.chasis2016.RobotMap;

public class GimballConstantHorizontalRotation extends Command{
    public GimballConstantHorizontalRotation() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
	boolean stopornot = false; 

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    /**
     * DANGER DANGER!!! Runs Robot Constantly Right causing chord to break
     * Reason: keeps executing, the timeout does not actually work inside of a while statement 
     * Need to make 2 seperate commands
     * GimabalLeftHorizontal sweep and a GimbalRightHorizontalsweep
     * It should perform a .5 sweep then another .5 sweep switching back and forth 
     * 	
     */
   /*  boolean keepmoving= true; 
	while ( keepmoving=true) {
		if(stopornot = false ){
		this.setTimeout(0.5);
		Robot.horizontalGimbalTurning.moveHorizontalRight();
		stopornot= true; 
	} else {
		this.setTimeout(0.5);
		Robot.horizontalGimbalTurning.moveHorizontalLeft();
		stopornot=false;
	}    	
		} */
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.horizontalGimbalTurning.stopHorizontalGimbal();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.horizontalGimbalTurning.stopHorizontalGimbal();
    }
}
