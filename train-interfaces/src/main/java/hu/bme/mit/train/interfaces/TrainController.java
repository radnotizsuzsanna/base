package hu.bme.mit.train.interfaces;
import java.time.LocalDateTime;    

public interface TrainController {

	void followSpeed();

	int getReferenceSpeed();

	void setSpeedLimit(int speedLimit);

	void setJoystickPosition(int joystickPosition);
	void emergencyBrake();

}
