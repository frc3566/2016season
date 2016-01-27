// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.VisionGimbalTestCCRJan19.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.Robot;
import org.usfirst.frc3566.VisionGimbalTestCCRJan19.RobotMap;

/**
 *
 */
public class GimbalLeftHorizontal extends Command {
	private double timeout=RobotMap.GIMBAL_TIMEOUT;
	private boolean stopornot = false; 
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public GimbalLeftHorizontal() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    public GimbalLeftHorizontal(double timeOut){ // Times out robot if area is a certain value 
    	 /* if (Robot.table.getNumber("area", 1)<0) {
    		timeout = timeOut; 
    		System.out.print("area "+ Robot.table.getNumber("area", 1 ));
        	stopornot=false;
    	} else {
stopornot=true;

    	} */ 
    	timeout=timeOut; 
    	Robot.horizontalGimbalTurning.stopHorizontalGimbal();
    	
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	this.setTimeout(RobotMap.GIMBAL_TIMEOUT); // Time out for the Gimbal 
    	Robot.horizontalGimbalTurning.moveHorizontalLeft(); // Tells the gimbal to move left 
    	/*if(!stopornot){
    	this.setTimeout(timeout);
    	Robot.horizontalGimbalTurning.moveHorizontalLeft();
    	} */

    	//System.out.println("Hi from Gimbal Left command");

    }
   
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
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
