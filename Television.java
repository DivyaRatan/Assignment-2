public class Television {
	private String state;
	private int volume;
	private int channel;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	// Function for increasing and decreasing the volume
	public int increaseVolume(int increasedVolume) {
		volume += increasedVolume;
		return volume;
	}

	public int decreaseVolume(int decreasedVolume) {
		volume += decreasedVolume;
		return volume;
	}

	// Function for Changing the Channel
	public int changeChannel(int changedChannel) {
		channel = changedChannel;
		return channel;
	}

	public void turnTV(String state) {// Function for Checking the status of TV
		state = state;
		if (state.equals("ON")) {
			System.out.println("The Tv is switched ON");
		} else if (state.equals("OF")) {
			System.out.println("The TV is switched OFF");
			System.exit(0);
		} else {
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}

}
