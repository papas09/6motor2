// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import java.lang.Thread;


/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private final CANSparkMax leftMotor1 = new CANSparkMax(0, MotorType.kBrushless);
  private final CANSparkMax leftMotor2 = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax leftMotor3 = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax rightMotor1 = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax rightMotor2 = new CANSparkMax(4, MotorType.kBrushless);
  private final CANSparkMax rightMotor3 = new CANSparkMax(5, MotorType.kBrushless);
 
  public void robotInit() {
  

  }
  

/* (non-Javadoc)
 * @see edu.wpi.first.wpilibj.IterativeRobotBase#autonomousInit()
 */
public void autonomousInit(){
  leftMotor1.set(0.5);
  leftMotor2.set(0.5);
  leftMotor3.set(0.5);
  rightMotor1.set(0.5);
  rightMotor2.set(0.5);
  rightMotor3.set(0.5);

  try {
  Thread.sleep(10000);
  } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
  }
  
  leftMotor1.stopMotor();
  leftMotor2.stopMotor();
  leftMotor3.stopMotor();
  rightMotor1.stopMotor();
  rightMotor2.stopMotor();
  rightMotor3.stopMotor();

  try {
    Thread.sleep(1000); 
  } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
  }
    leftMotor1.set(-0.5);
    leftMotor2.set(-0.5);
    leftMotor3.set(-0.5);
    rightMotor1.set(-0.5);
    rightMotor2.set(-0.5);
    rightMotor3.set(-0.5);

    try {
      Thread.sleep(50000);
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt();
    }
    leftMotor1.stopMotor();
    leftMotor2.stopMotor();
    leftMotor3.stopMotor();
    rightMotor1.stopMotor();
    rightMotor2.stopMotor();
    rightMotor3.stopMotor();
  }
}   