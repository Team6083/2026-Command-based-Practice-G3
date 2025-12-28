// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CoralShooterSubsystem extends SubsystemBase {
  VictorSPX vic3 = new VictorSPX(Constants.MotorConstants.vic3ID);
  
  /** Creates a new CoralShooterSubsystem. */
  public CoralShooterSubsystem() {
     vic3.setNeutralMode(NeutralMode.Coast);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void run(double speed){
    vic3.set(ControlMode.PercentOutput,speed);
  }
  public void stop(){
    vic3.set(ControlMode.PercentOutput,0);
  }
}
