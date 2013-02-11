
package org.team751;


import edu.wpi.first.wpilibj.ADXL345_I2C;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class AccelerometerGyroTest extends IterativeRobot {
	
	private ADXL345_I2C accel = new ADXL345_I2C(1,
												ADXL345_I2C.DataFormat_Range.k4G);
	
	private Gyro gyro = new Gyro(1);
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		LiveWindow.addSensor("Navigator",
							 "Gyroscope sensor", gyro);
    }
	
	public void disabledPeriodic() {
		doDebug();
	}

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        doDebug();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
		LiveWindow.run();
    }
    
	
	private void doDebug() {
		ADXL345_I2C.AllAxes axes = accel.getAccelerations();
		
		double heading = gyro.getAngle();
		
		System.out.println("Heading "+heading+" X "+axes.XAxis+" Y "+axes.YAxis+" Z "+axes.ZAxis);
		
		SmartDashboard.putNumber("Heading", heading);
		SmartDashboard.putNumber("X", axes.XAxis);
		SmartDashboard.putNumber("Y", axes.YAxis);
		SmartDashboard.putNumber("Z", axes.ZAxis);
	}
}
