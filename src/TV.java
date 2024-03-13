
public class TV {
    // state of the object
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    // constructor for the object
    public TV() {

    }

    // methods

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
        System.out.println("Goodbye!");
    }

    //setters

    public void setChannel(int newChannel) {

        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }else
            System.out.println("TV IS OFF!");
    }
    public void channelUp (){
        if (on && channel < 120){
            channel++;
        }else
            System.out.println("TV IS OFF!");
    }
    public void channelDown (){
        if (on && channel > 1){
            channel--;
        }
    }

    public void volumeUp (){
        if (on & volumeLevel < 7){
            volumeLevel++;
        }else
            System.out.println("TV IS OFF!");
    }
    public void volumeDown (){
        if (on & volumeLevel > 1){
            volumeLevel--;
        }
        else System.out.println("TV IS OFF!");
    }

    public void displayChannel(){
        System.out.println("Current Channel:" + channel);
    }
    public void displayVolumeLevel(){
        System.out.println("Current VolumeLVL:" + volumeLevel);
    }

}
