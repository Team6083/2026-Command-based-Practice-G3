// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
  VictorSPX vic1 = new VictorSPX(Constants.MotorConstants.vic1ID);
  VictorSPX vic2 = new VictorSPX(Constants.MotorConstants.vic2ID);
  TalonSRX tal1 = new TalonSRX(Constants.MotorConstants.tal1ID);
  TalonSRX tal2 = new TalonSRX(Constants.MotorConstants.tal2ID);
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void forward(){
    vic1.set(ControlMode.PercentOutput, Constants.DriveConstants.forwardSpeed);
    tal1.follow(vic1);
    vic2.set(ControlMode.PercentOutput, Constants.DriveConstants.forwardSpeed);
    tal2.follow(vic2);
  }

  public void back(){
    vic1.set(ControlMode.PercentOutput, Constants.DriveConstants.backSpeed);
    tal1.follow(vic1);
    vic2.set(ControlMode.PercentOutput, Constants.DriveConstants.backSpeed);
    tal2.follow(vic2);
  }

  public void left(){
    vic1.set(ControlMode.PercentOutput, Constants.DriveConstants.backSpeed);
    tal1.follow(vic1);
    vic2.set(ControlMode.PercentOutput, Constants.DriveConstants.forwardSpeed);
    tal2.follow(vic2);
  }

  public void right(){
    vic1.set(ControlMode.PercentOutput, Constants.DriveConstants.forwardSpeed);
    tal1.follow(vic1);
    vic2.set(ControlMode.PercentOutput, Constants.DriveConstants.backSpeed);
    tal2.follow(vic2);
  }
}
