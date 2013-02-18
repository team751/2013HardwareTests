package org.team751;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class StomachSensorTest extends IterativeRobot {
	
	private DigitalInput stomach0 = new DigitalInput(DigitalChannels.COW_STOMACH_0);
	
	private DigitalInput stomach1 = new DigitalInput(DigitalChannels.COW_STOMACH_1);
	
	private DigitalInput stomach2 = new DigitalInput(DigitalChannels.COW_STOMACH_2);
	
	private DigitalInput stomach3 = new DigitalInput(DigitalChannels.COW_STOMACH_3);
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {

    }
	
	public void disabledPeriodic() {
		System.out.println("0 "+stomach0.get()+" 1 "+stomach1.get()+" 2 "+stomach2.get()+" 3 "+stomach3.get());
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
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
