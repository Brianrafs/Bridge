public class ClientBridge {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new DigitalRadio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        RemoteControl basicRemote = new RemoteControl(device);
        basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.togglePower();
        advancedRemote.mute();
        device.printStatus();
    }
}
