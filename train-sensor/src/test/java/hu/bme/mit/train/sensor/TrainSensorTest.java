package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

public class TrainSensorTest {

	TrainController controller;
	TrainSensor sensor;
	TrainUser user;

    @Before
    public void before() {
        TrainSystem system = new TrainSystem();
		controller = system.getController();
		sensor = system.getSensor();
		user = system.getUser();

		sensor.overrideSpeedLimit(50);
	}

    @Test
    public void testRecording() {
        user.overrideJoystickPosition(0);
        LocalDateTime time = LocalDateTime.now();
        sensor.record();
        Integer value = sensor.getTachografValue(time, 0);
        Assert.assertEquals((Integer) 0, value);
    }
}
