// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class CoralSooterCmd extends Command {
  CoralShooterSubsystem coralShooterSubsystem;
  Joystick joy;
  /** Creates a new CoralSooterCmd. */
  public CoralSooterCmd(CoralShooterSubsystem coralShooterSubsystem, Joystick joystick) {
    coralShooterSubsystem = this.coralShooterSubsystem;
    joystick = this.joy;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(coralShooterSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(joy.getRawButton(1)){
      coralShooterSubsystem.run(0.5);
    }else if(joy.getRawButton(2)){
      coralShooterSubsystem.run(-0.5);
    }else{
      coralShooterSubsystem.stop();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
