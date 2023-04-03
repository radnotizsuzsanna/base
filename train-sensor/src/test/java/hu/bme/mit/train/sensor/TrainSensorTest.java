package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
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
        //Nem tudtam megírni a teszteket, mert ilyen hibát kaptam:
        //Adding dependency on module 'hu.bme.mit.train.system' will introduce circular dependency between modules 'hu.bme.mit.train.sensor' and 'hu.bme.mit.train.system'.

        /*TrainSystem system = new TrainSystem();
        controller = system.getController();
        sensor = system.getSensor();
        user = system.getUser();*/
    }

    @Test
    public void ThisIsAnExampleTestStub() {
       /* user.overrideJoystickPosition(0);
        LocalDateTime time = LocalDateTime.now();
        sensor.record();
        Integer value = sensor.getTachograf(time, 0);
        Assert.assertEquals((Integer) 0, value);*/
    }
}
