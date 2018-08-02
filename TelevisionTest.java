import java.util.*;

public class TelevisionTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		Television tel = new Television();

		System.out.println("Enter the current state (ON/OFF)");
		String currentState = scanner.nextLine();

		if (currentState.equals("OF")) {// Checking the status
			System.out.println("Do you want to turn on the TV");
			String turn = scanner.nextLine();
			if (turn.equals("Yes")) {
				tel.turnTV("ON");
			} else
				System.exit(0);
		}
		// Taking the input
		System.out.println("Enter the Volume");
		int currentVolume = scanner.nextInt();
		tel.setVolume(currentVolume);

		System.out.println("Enter the Channel");
		int currentChannel = scanner.nextInt();
		tel.setChannel(currentChannel);

		System.out.println("Do You want to increase the volume");
		String reply = scanner.next();
		// Entering the input to increase or decrease the volume
		if (reply.equals("Yes")) {
			System.out.println("Enter the value by which you want to increase the volume");
			int increasedVolume = scanner.nextInt();
			tel.increaseVolume(increasedVolume);
			System.out.println("The current volume is " + tel.getVolume());
		}

		System.out.println("Do You want to decrease the volume");
		String replyOfDecrease = scanner.next();

		if (replyOfDecrease.equals("Yes")) {
			System.out.println("Enter the value by which you want to decrease the volume");
			int decreasedVolume = scanner.nextInt();
			tel.decreaseVolume(decreasedVolume);
			System.out.println("The current volume is " + tel.getVolume());
		}
		// Entering the value to change the Channel

		System.out.println("Do you want to Change the channel");
		String replyOfChangeChannel = scanner.next();

		if (replyOfChangeChannel.equals("Yes")) {
			System.out.println("Enter the Channel number");
			int changedChannel = scanner.nextInt();
			tel.changeChannel(changedChannel);
			System.out.println("The current channel is " + tel.getChannel());
		}
		// Turning off the TV
		System.out.println("Do You want to turn off the Tv");
		String turn = scanner.next();

		if (turn.equals("Yes")) {
			tel.turnTV("OF");
		}
	}
}
