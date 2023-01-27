// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ProximitySensor extends SubsystemBase {
  /** Creates a new ProximitySensor. */
  DigitalInput ProximitySensor;
  public ProximitySensor() {
    ProximitySensor = new DigitalInput(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void printStatus(){
    SmartDashboard.putBoolean("Proximity status: ", ProximitySensor.get());
  }

}