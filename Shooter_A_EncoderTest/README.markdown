# Team 751 2013 Robot Shooter test, part A (encoders) #

This is part one of the two-part shooter test suite.

## To use this test code: ##

Deploy it to the robot. In disabled and teleop modes, the robot will send
data to the console and to SmartDashboard.

### 1: Manual shooter testing ###

Ensure that the robot is disabled.
Turn each shooter wheel by hand, in the direction that they will be used
to shoot disks. Verify that each wheel is connected to the correct encoder.
Verify that turning the wheels in a positive direction gives encoder count
readings that are increasing.

### 2: Powered shooter testing ###

Enable the robot. Gradually push joystick 1 forward (or maybe pull it backwards)
to run the motor for shooter wheel 1. Verify that this motion makes the wheel
turn in the right direction to shoot a disk. Look at the encoder rate measurements
and verify that they correspond well to the observed speed of the wheel,
with no jerks and no "ceiling speed" at which the encoder-indicated speed
stops increasing while the wheel's speed continues increasing.

Repeat with joystick 2 for the second wheel.

Verify that joystick 1 controls the first wheel, that the disk will contact
first when it enters the shooter, and that joystick 2 controls the second wheel,
that the disk will contact second, just before it leaves the shooter.

