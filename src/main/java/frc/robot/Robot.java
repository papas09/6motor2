// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Robot extends TimedRobot {
  private final CANSparkMax leftMotor1 = new CANSparkMax(0, MotorType.kBrushless);
  private final CANSparkMax leftMotor2 = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax leftMotor3 = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax rightMotor1 = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax rightMotor2 = new CANSparkMax(4, MotorType.kBrushless);
  private final CANSparkMax rightMotor3 = new CANSparkMax(5, MotorType.kBrushless);
  MotorControllerGroup rightMotors;
  MotorControllerGroup leftMotors;
 
  public void robotInit() {
  leftMotors = new MotorControllerGroup(leftMotor1, leftMotor2, leftMotor3);
  rightMotors = new MotorControllerGroup(rightMotor1, rightMotor2, rightMotor3);    
  rightMotors.setInverted(true);
  }

public void autonomousInit(){
  leftMotors.set(0.5);
  rightMotors.set(0.5);

  Timer.delay(10);
 
  leftMotors.stopMotor();
  rightMotors.stopMotor();

  Timer.delay(1);
    leftMotors.set(-0.5);
    rightMotors.set(-0.5);

    Timer.delay(5);
    leftMotors.stopMotor();
    rightMotors.stopMotor();
  }
}   
