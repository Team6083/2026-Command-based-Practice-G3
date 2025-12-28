// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

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
    public void forward(){
     vic3.set(ControlMode.PercentOutput,Constants.CoralShooterConstants.kForwardSpeed);
    }
    public void back(){
      vic3.set(ControlMode.PercentOutput,Constants.CoralShooterConstants.kBackSpeed);
    }
    public void stop(){
      vic3.set(ControlMode.PercentOutput,Constants.CoralShooterConstants.kstop);
    }
}
