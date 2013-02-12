package org.team751;


import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class TwoJaguarTest extends IterativeRobot {
	
	private CANJaguar leftJag;
	
	private CANJaguar rightJag;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		try {
			leftJag = new CANJaguar(3);
			System.out.println("Jaguar 3 inited");
			rightJag = new CANJaguar(6);
			System.out.println("Jaguar 6 inited");
		} catch (CANTimeoutException ex) {
			ex.printStackTrace();
		}
		
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
		try {
			leftJag.setX(.1);
			rightJag.setX(.1);
		} catch (CANTimeoutException ex) {
			ex.printStackTrace();
		}
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
