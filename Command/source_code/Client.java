package pattern;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        // ===== Receivers =====
        Light light = new Light();

        Curtain curtain = new Curtain();

        Projector projector =
                new Projector();

        // ===== Commands =====
        Command lightCommand =
                new LightOnCommand(light);

        Command curtainCommand =
                new CurtainDownCommand(curtain);

        Command projectorCommand =
                new ProjectorWorkCommand(projector);

        // ===== Macro Command =====
        Command meetingMode =
                new MacroCommand(
                        Arrays.asList(
                                curtainCommand,
                                lightCommand,
                                projectorCommand
                        )
                );

        // ===== Invoker =====
        SmartOfficeController controller =
                new SmartOfficeController();

        // ===== Execute =====
        controller.setCommand(meetingMode);

        controller.pressButton();

        System.out.println("\nUNDO:");

        controller.undo();
    }
}