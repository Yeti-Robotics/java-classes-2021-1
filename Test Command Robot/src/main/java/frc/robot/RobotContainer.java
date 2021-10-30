// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.StartEndCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.TimedDriveCommand;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.DrivetrainSubsystem;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  Joystick driverStation;
  DrivetrainSubsystem drivetrainSubsystem;
  ClimberSubsystem climberSubsystem;
  JoystickButton leftButton1, leftButton2, climbUpButton, climbDownButton, climbBrakeButton;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    driverStation = new Joystick(0);
    drivetrainSubsystem = new DrivetrainSubsystem();
    leftButton1 = new JoystickButton(driverStation, 1);
    leftButton2 = new JoystickButton(driverStation, 2);
    climbUpButton = new JoystickButton(driverStation, 10);
    climbDownButton = new JoystickButton(driverStation, 5);
    climbBrakeButton = new JoystickButton(driverStation, 8);
    climberSubsystem = new ClimberSubsystem();

    drivetrainSubsystem.setDefaultCommand(new RunCommand(() -> drivetrainSubsystem.drive(driverStation.getRawAxis(0), driverStation.getRawAxis(2)), drivetrainSubsystem));

    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    leftButton1.whenPressed(new TimedDriveCommand(drivetrainSubsystem));
    leftButton2.whenPressed(new SequentialCommandGroup(new TimedDriveCommand(drivetrainSubsystem), new TimedDriveCommand(drivetrainSubsystem)));
    climbUpButton.whileHeld(new StartEndCommand(
      () -> climberSubsystem.climbUp(),
      () -> climberSubsystem.stopClimb(),
      climberSubsystem));

      climbDownButton.whileHeld(new StartEndCommand(
      () -> climberSubsystem.climbDown(),
      () -> climberSubsystem.stopClimb(),
      climberSubsystem));

      climbBrakeButton.whenPressed(
        new InstantCommand(() -> {
          climberSubsystem.stopClimb();
          climberSubsystem.toggleBrake();
        },
        climberSubsystem));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
}
