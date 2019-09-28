package frc.robot.software;

public class Statics {

//TODO: Update this once the robot gets built

//Environment variables
    static final public boolean DEBUG_MODE = false;
    static final public double LOW_SPD = 0.6;

//Controller
    static final public double OFFSET_MIN = 0.1,
                               OFFSET_MAX = 0.6;

//Chassis
    static final public int CHASSIS_L1 = 0,
                            CHASSIS_L2 = 1,
                            CHASSIS_L3 = 2,
                            CHASSIS_R1 = 3,
                            CHASSIS_R2 = 4,
                            CHASSIS_R3 = 5;
    //Shifting Gearbox's Pneumatics
    static final public int SHIFTER_PCM = 0,
                            SHIFTER_F = 0,
                            SHIFTER_R = 1;
}