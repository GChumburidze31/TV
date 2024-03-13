


public class TestTv {
    public static void main (String[]args){

        TV a = new TV();
        a.turnOn();
        a.setChannel(5);
        a.volumeUp();
        a.volumeUp();
        // here I am turning the tv
        a.turnOff();
        a.channelUp();
        a.volumeDown();

        a.displayChannel();
        a.displayVolumeLevel();
    }



}
