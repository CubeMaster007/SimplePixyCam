package org.usfirst.frc.team9001.robot.util;

import edu.wpi.first.wpilibj.Timer;

/**
 * A class that creates timeout functionality
 * <p>
 * <b>NOTE:</b> {@link Timer} performs the same function
 * 
 * @author Team254
 */
public class TimeoutAction {
	private double m_timeout;
    private double m_time_start;

    public TimeoutAction() {
    }

    public boolean isFinished() {
        return Timer.getFPGATimestamp() >= m_time_start + m_timeout;
    }

    /**
     * @param timeout a double in seconds
     */
    public void config(double timeout) {
    	m_timeout = timeout;
        m_time_start = Timer.getFPGATimestamp();
    }
    
    public double getTimeRemaining() {
    	return (m_time_start + m_timeout) - Timer.getFPGATimestamp();
    }

}
