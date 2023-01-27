// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ColourSensor extends SubsystemBase {//TODO this one is for the PURPLE cone 
  /** Creates a new ColourSensor. */
  DigitalOutput ColourSensor;
  public ColourSensor() {
    ColourSensor = new DigitalOutput(1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public boolean returnColour(){
    SmartDashboard.putBoolean("Colour sensor status: ", ColourSensor.get());
    return ColourSensor.get();
  }

}
