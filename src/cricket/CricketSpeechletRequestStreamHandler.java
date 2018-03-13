package cricket;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class CricketSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
	
	public static final Set<String> appIds;
	
	static {
		appIds = new HashSet<>();
	}
	
	public CricketSpeechletRequestStreamHandler() {
		super(new CricketSpeechlet(), appIds);
	}
}
