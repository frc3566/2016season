// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3566.VisionGimbalTestCCRJan19;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.kauailabs.navx.frc.*;;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * ALWAYS uSE ROBOTMAPPPPPPPPPPPPPPPPPPPPPPPp
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainCAN3LeftDriveTrain;
    public static CANTalon driveTrainCAN4RightDriveTrain;
    public static RobotDrive driveTrainRobotDrive21;
    public static CANTalon horizontalGimbalTurningCAN1GimbalHorizontal;
    public static CANTalon verticalGimbalTurningCAN2GimbalVertical;
  
    public static Servo triggerServo;
    public static AHRS AHRS; 
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static final double GIMBAL_MOTOR_SPEED = 0.25; // really slow to start...
    public static final double GIMBAL_TIMEOUT = 0.25;
    public static final double VISION_TIMEOUT = 2;
    public static final double POTENTIOMETER_CENTER=75;
    public static final double GIMBAL_INERTIA = 28;
    public static AnalogPotentiometer sensorAnalogPotentiometer1;
    public static Accelerometer accel;
	public static int DEFENSE=0;
	    
	    public static void init() {
    	try {
    		AHRS = new AHRS(SPI.Port.kMXP);
    	}catch(RuntimeException ex){
    		DriverStation.reportError("Error instantiating naX=MXP" + ex.getMessage(), true);
    	}
    	sensorAnalogPotentiometer1 = new AnalogPotentiometer(0,360,0);
    //    accel = new BuiltInAccelerometer(); 
      //  accel = new BuiltInAccelerometer(Accelerometer.Range.k4G); 
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainCAN3LeftDriveTrain = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "CAN1LeftDriveTrain", driveTrainCAN3LeftDriveTrain);
        
        driveTrainCAN4RightDriveTrain = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "CAN2RightDriveTrain", driveTrainCAN4RightDriveTrain);
        
        driveTrainRobotDrive21 = new RobotDrive(driveTrainCAN3LeftDriveTrain, driveTrainCAN4RightDriveTrain);
        
        driveTrainRobotDrive21.setSafetyEnabled(true);
        driveTrainRobotDrive21.setExpiration(0.1);
        driveTrainRobotDrive21.setSensitivity(0.5);
        driveTrainRobotDrive21.setMaxOutput(1.0);

        driveTrainRobotDrive21.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        horizontalGimbalTurningCAN1GimbalHorizontal = new CANTalon(1);
        LiveWindow.addActuator("HorizontalGimbalTurning", "CAN3GimbalHorizontal", horizontalGimbalTurningCAN1GimbalHorizontal);
        
        verticalGimbalTurningCAN2GimbalVertical = new CANTalon(2);
        LiveWindow.addActuator("VerticalGimbalTurning", "CAN4GimbalVertical", verticalGimbalTurningCAN2GimbalVertical);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainRobotDrive21.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        
        triggerServo = new Servo(9);
       
    }
}
