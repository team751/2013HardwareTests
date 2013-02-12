
package org.team751;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class TemperatureSensorTest extends IterativeRobot {
	
	private TemperatureSensor sensor = new DrivetrainTemperatureSensor(2, "Test sensor");
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		LiveWindow.addSensor("Core",
							 "Test temperature sensor", sensor);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }
	
	public void disabledPeriodic() {
		doDebug();
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
		System.out.println("Temperature: "+sensor.getTemperature() +" ¼C");
	}
}
