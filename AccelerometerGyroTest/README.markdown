# Team 751 2013 Robot accelerometer/gyroscope sensor test #

## To use this test code: ##

Deploy it to the robot. In disabled and teleop modes, the robot will
send heading and acceleration data to the console and to SmartDashboard.
If you move the robot and any of these values is zero, there is a problem.
If the values make sense, that means that the accelerometer and gyroscope
sensors are working.

## Things to check: ##

* Verify that turning the robot to the right results in an increase in heading
* Verify that accelerating the robot forward gives positive Y-axis acceleration.
If this is not the case, note it so that the Navigator code can be changed.
* Verify that accelerating the robot to the right gives positive X-axis acceleration.
If this is not the case, not it so that the Navigator code can be changed.
