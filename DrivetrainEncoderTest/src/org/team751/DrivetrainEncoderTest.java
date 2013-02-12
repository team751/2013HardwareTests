package org.team751;


import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class DrivetrainEncoderTest extends IterativeRobot {
	
	private Encoder rightEncoder = new Encoder(1, 2);
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		
		/*
		 * 1 pulse = 1/250 rotation
		 * 1 rotation = 6¹ inches = 0.4788 meters
		 * 
		 * so 1 pulse = 0.0019152 meters
		 */
		rightEncoder.setDistancePerPulse(0.001952);
		rightEncoder.setReverseDirection(true);
		rightEncoder.start();
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
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
	private void doDebug() {
		System.out.println("Encoder: "+rightEncoder.get()+" counts");
	}
}
