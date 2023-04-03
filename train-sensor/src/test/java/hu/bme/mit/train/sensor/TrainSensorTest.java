package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

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

        Assert.assertEquals(0, sensor.getTachografValue(time, 0));
    }
}
