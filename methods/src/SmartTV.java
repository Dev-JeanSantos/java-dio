public class SmartTV {
    boolean on = false;
    int channel = 1;
    int volume = 35;

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }

    public void turnUpVolume() {
        volume ++;
    }
    
    public void turnDownVolume() {
        volume --;
    }

    public void turnUpChannel() {
        channel ++;
    }
    
    public void turnDownChannel() {
        channel --;
    }

    
    public void changeChannel(int channel) {
        this.channel = channel;
    }
}
