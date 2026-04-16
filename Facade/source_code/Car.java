package pattern;

//Facade
public class Car {

    private Accelerator accelerator = new Accelerator();
    private Clutch clutch = new Clutch();
    private GearStick gearStick = new GearStick();
    private Handbrake handbrake = new Handbrake();
    private Ignition ignition = new Ignition();

    public void drive() {
        ignition.start();
        clutch.press();
        gearStick.changeGear(1);
        clutch.release();
        handbrake.release();
        accelerator.press();
    }
}