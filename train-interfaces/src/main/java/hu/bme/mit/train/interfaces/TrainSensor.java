package hu.bme.mit.train.interfaces;

import java.time.LocalDateTime;

public interface TrainSensor {

	int getSpeedLimit();

	void overrideSpeedLimit(int speedLimit);

	void record();

	Integer getTachograf(String time, Integer joystickPosition );
}
