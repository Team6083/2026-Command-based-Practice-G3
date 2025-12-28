// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

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
}
