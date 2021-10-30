package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {
  public WPI_TalonFX leftMotor1, leftMotor2, rightMotor1, rightMotor2;

  public DrivetrainSubsystem() {
    leftMotor1 = new WPI_TalonFX(15);
    leftMotor2 = new WPI_TalonFX(14);
    rightMotor1 = new WPI_TalonFX(0);
    rightMotor2 = new WPI_TalonFX(1);
    rightMotor1.setInverted(true);
    rightMotor2.setInverted(true);
  }

  public void drive(double leftSpeed, double rightSpeed) {
     leftMotor1.set(leftSpeed);
     leftMotor2.set(leftSpeed);
     rightMotor1.set(rightSpeed);
     rightMotor2.set(rightSpeed);
  }
}
