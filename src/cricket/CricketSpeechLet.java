package cricket;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.json.SpeechletRequestEnvelope;
import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.speechlet.SpeechletV2;
import com.amazon.speech.ui.OutputSpeech;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SsmlOutputSpeech;

public class CricketSpeechLet implements SpeechletV2 {

	private static org.slf4j.Logger log = LoggerFactory.getLogger(CricketSpeechLet.class);
	
	@Override
	public void onSessionStarted(SpeechletRequestEnvelope<SessionStartedRequest> requestEnvelope) {
		log.info("onSessionStarted requestId = {} sessionId = {}", requestEnvelope.getRequest().getRequestId(),
				requestEnvelope.getSession().getSessionId());
		
	}

	@Override
	public SpeechletResponse onLaunch(SpeechletRequestEnvelope<LaunchRequest> requestEnvelope) {
		log.info("onSessionStarted requestId = {} sessionId = {}", requestEnvelope.getRequest().getRequestId(),
				requestEnvelope.getSession().getSessionId());
		return getWelcomeMessage();
	}

	@Override
	public SpeechletResponse onIntent(SpeechletRequestEnvelope<IntentRequest> requestEnvelope) {
		IntentRequest request = requestEnvelope.getRequest();
		log.info("onSessionStarted requestId = {} sessionId = {}", request.getRequestId(),
				requestEnvelope.getSession().getSessionId());
		
		Intent intent = request.getIntent();
		String intentName = (intent != null) ? intent.getName() : null;
		
		return null;
	}

	@Override
	public void onSessionEnded(SpeechletRequestEnvelope<SessionEndedRequest> requestEnvelope) {
		// TODO Auto-generated method stub
		
	}
	
	private SpeechletResponse getWelcomeMessage() {
		String speechText = IntroMessageFactory.getIntroMessage();
		speechText += "Welcome! Please say Start to start the game.";
		return newTellResponse(speechText, true);
	}
	
	private SpeechletResponse newTellResponse(String speechText, boolean isSSML) {
		OutputSpeech outputSpeech, repromptSpeech;
		if (isSSML) {
			outputSpeech = new SsmlOutputSpeech();
			((SsmlOutputSpeech) outputSpeech).setSsml(speechText);
		} else {
			outputSpeech = new PlainTextOutputSpeech();
			((PlainTextOutputSpeech) outputSpeech).setText(speechText);
		}
		return SpeechletResponse.newTellResponse(outputSpeech);
	}

}
