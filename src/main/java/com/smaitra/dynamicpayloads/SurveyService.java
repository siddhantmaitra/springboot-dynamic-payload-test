package com.smaitra.dynamicpayloads;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import reactor.core.publisher.Mono;

@Service
public class SurveyService {
	SurveyHubRequest globalreq;
	
	private static Logger logger =  LoggerFactory.getLogger(SurveyService.class);

	public Mono<SurveyHubResponse> processRequest(SurveyHubRequest shReq){
		SurveyHubResponse response = new SurveyHubResponse();
		
		logger.info(shReq.toString());
		
		response.setId(shReq.getId());
		response.setMessage("Successfully received");
		
		globalreq = shReq;
		
		return Mono.just(response); 
		
	}

	public Mono<SurveyHubRequest> replyWithReq(){
		return Mono.just(globalreq);
	}
}
