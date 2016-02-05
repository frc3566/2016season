// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.VisionGimbalTestCCRJan19.subsystems;

import org.usfirst.frc3566.VisionGimbalTestCCRJan19.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class HorizontalGimbalTurning extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon cAN1GimbalHorizontal = RobotMap.horizontalGimbalTurningCAN1GimbalHorizontal;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    Servo myTriggerServo = RobotMap.triggerServo;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    
    public void moveHorizontalLeft(){
    	
    	cAN1GimbalHorizontal.set(RobotMap.GIMBAL_MOTOR_SPEED );
    }
    
public void moveHorizontalRight(){
    	
    	cAN1GimbalHorizontal.set(RobotMap.GIMBAL_MOTOR_SPEED * -1 );
    }

public void stopHorizontalGimbal(){

    	
    	cAN1GimbalHorizontal.set(0.0);
    }


public void setTheServo(){
	 myTriggerServo.setAngle(0);
}

public void fireLaser(){
	
	 myTriggerServo.setAngle(45);
	
}


public void resetLaser(){
	
	 myTriggerServo.setAngle(0);
	
}

}

