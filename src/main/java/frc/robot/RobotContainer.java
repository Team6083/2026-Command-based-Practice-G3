// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Constants.ControllerConstants;
import frc.robot.Constants.MotorConstants;

public class RobotContainer {
  XboxController joy = new XboxController(ControllerConstants.port);
  VictorSPX vic1 = new VictorSPX(MotorConstants.vic1ID);
  VictorSPX vic2 = new VictorSPX(MotorConstants.vic2ID);
  TalonSRX tal1 = new TalonSRX(MotorConstants.tal1ID);
  TalonSRX tal2 = new TalonSRX(MotorConstants.tal2ID);
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
