
public class work5_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int channel = 1;// Default channel is 1
    int volumelevel = 1;// Default volumn level is 1
    boolean on = false;// TV is off

    public work5_9_3() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if(on && newChannel >= 1 && newChannel <= 120)
        {
            channel = newChannel;
        }
    }

    public void setVolumelevel(int newVolumeLevel) {
        if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumelevel = newVolumeLevel;
    }

    public void channelUP() {
        if(on && channel < 120)
            channel++;
    }

    public void volumeUp() {
        if(on && volumelevel < 7)
            volumelevel++;
    }

    public void volumeDown() {
        if(on && volumelevel > 1)
            volumelevel--;

}
}
