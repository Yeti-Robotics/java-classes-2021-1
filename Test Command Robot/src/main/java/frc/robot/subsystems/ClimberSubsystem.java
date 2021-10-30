// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimberSubsystem extends SubsystemBase {
  WPI_TalonFX leftTalon, rightTalon;
  DoubleSolenoid climberBrake;
  /** Creates a new ClimberSubsystem. */
  public ClimberSubsystem() {
    leftTalon = new WPI_TalonFX(3);
    rightTalon = new WPI_TalonFX(2);
    climberBrake = new DoubleSolenoid(4, 5);
  }


  public void climbUp (){
    leftTalon.set(-.4);
    rightTalon.set(-.4);
  } 

  public void climbDown (){
    leftTalon.set(.4);
    rightTalon.set(.4);
  }

  public void stopClimb (){
    leftTalon.set(0);
    rightTalon.set(0);
  }

  public void toggleBrake (){
    climberBrake.toggle();
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
