package cricket;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntroMessageFactory {
	
	private static final List<String> intros = new ArrayList<>();
	
	static {
		intros.add("I only watch the last over of the match. My choice! ");
		intros.add("I only watch when Kohli is batting. My choice! ");
		intros.add("I only use free passes and never buy the tickets. My choice! ");
		intros.add("I never watch the presentation ceremony. My choice! ");
		intros.add("I only choose tails in toss. My choice! ");
	}
	
	public static String getIntroMessage() {
		Random random = new Random();
		return intros.get(random.nextInt(intros.size()));
	}

}
