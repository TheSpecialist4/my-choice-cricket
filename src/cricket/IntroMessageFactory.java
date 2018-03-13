package cricket;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntroMessageFactory {
	
	private static final List<String> intros = new ArrayList<>();
	
	static {
		intros.add("I only watch the last over of the match. <emphasis>My choice.</emphasis><break time=\"0.3s\" />");
		intros.add("I only watch when Kohli is batting. <emphasis>My choice.</emphasis><break time=\"0.3s\" />");
		intros.add("I only use free passes and never buy the tickets. <emphasis>My choice.</emphasis><break time=\"0.3s\" />");
		intros.add("I never watch the presentation ceremony. <emphasis>My choice.</emphasis><break time=\"0.3s\" />");
		intros.add("I only choose tails in toss. <emphasis>My choice.</emphasis><break time=\"0.3s\" />");
	}
	
	public static String getIntroMessage() {
		Random random = new Random();
		return intros.get(random.nextInt(intros.size()));
	}

}
