package org.team751;


import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class CowTest extends IterativeRobot {
    
    private Joystick joystick = new Joystick(1);
    
    private CANJaguar jaguar;
    
    private DigitalInput zeroSwitch = new DigitalInput(13);
    
    private DigitalInput stomach0 = new DigitalInput(9);
    private DigitalInput stomach1 = new DigitalInput(10);
    private DigitalInput stomach2 = new DigitalInput(11);
    private DigitalInput stomach3 = new DigitalInput(12);
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        try {
            jaguar = new CANJaguar(8);
            jaguar.setPositionReference(CANJaguar.PositionReference.kQuadEncoder);
            jaguar.changeControlMode(CANJaguar.ControlMode.kPosition);
            jaguar.configEncoderCodesPerRev(1);
            jaguar.setPID(1, 0, 0);
            jaguar.enableControl();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
        
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
        
        if(joystick.getRawButton(5)) {
            try {
                jaguar.setX(jaguar.getX() + 1);
            } catch (CANTimeoutException ex) {
                ex.printStackTrace();
            }
        }
        else if(joystick.getRawButton(4)) {
            try {
                jaguar.setX(jaguar.getX() - 1);
            } catch (CANTimeoutException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        doDebug();
    }
    
    private void doDebug() {
//        try {
////            System.out.println("Position "+jaguar.getPosition());
////            System.out.println("Limit switches forward "+jaguar.getForwardLimitOK()+" reverse "+jaguar.getReverseLimitOK());
////            System.out.println("Zeroed: "+zeroSwitch.get());
//        } catch (CANTimeoutException ex) {
//            ex.printStackTrace();
//        }
        
        System.out.println("Stomachs: 0 "+stomach0.get()+" 1 "+stomach1.get()+" 2 "+stomach2.get()+" 3 "+stomach3.get());
    }
}
