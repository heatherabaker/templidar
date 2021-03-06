package org.usfirst.frc.team115.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int FRONT_LEFT = 0;
    public static final int FRONT_RIGHT = 2;
    public static final int BACK_LEFT = 1;
    public static final int BACK_RIGHT = 3;
    
    public static final int ENABLE = 0;
    public static final int MOVE = 1;
    public static final int TURN = 2;
    public static final int DIRECTION = 3;
    public static final int FIRE = 4;
    
    public static final int JOYSTICK = 0;
}