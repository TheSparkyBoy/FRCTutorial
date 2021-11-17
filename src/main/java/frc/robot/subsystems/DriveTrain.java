// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Talon;
import frc.robot.Robot;
import frc.robot.Constants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

public class DriveTrain extends SubsystemBase {
  
  public static TalonFX topLeftMotor = new TalonFX(Constants.topLeftMotorID);
  public static TalonFX bottomLeftMotor = new TalonFX(Constants.bottomLeftMotorID);
  public static TalonFX topRightMotor = new TalonFX(Constants.topRightMotorID);
  public static TalonFX bottomRightMotor = new TalonFX(Constants.bottomRightMotorID);

  /** Creates a new DriveTrain. */
  public DriveTrain(){}

  public void setSpeed(double lSpeed, double rSpeed) {
    topLeftMotor.set(ControlMode.PercentOutput, lSpeed);
    bottomLeftMotor.set(ControlMode.PercentOutput, lSpeed);

    topRightMotor.set(ControlMode.PercentOutput, rSpeed);
    bottomRightMotor.set(ControlMode.PercentOutput, rSpeed);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
