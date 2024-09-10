package com.smaitra.dynamicpayloads;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Controller {

	@Autowired
	SurveyService service;
	
	
	@PostMapping("/delivery")
	public Mono<SurveyHubResponse> sampleController(@RequestBody SurveyRecordCreate req ){
		Map<String,Object> surveyres = new HashMap<>();

		SurveyHubRequest request = new SurveyHubRequest();
		
		// for (Item item : req.getItems()){
		// 	request.getQuestions().put(item.getQuestionId(), item.getValue());
		// }

		request.setAttribute(req.getAttribute());
		request.setField1(req.getField1());
		request.setId(req.getId());
		request.setObjPropID(req.getObjProp().getQuestionId());
		
		for(Item item : req.getItems()){
				surveyres.put(item.getQuestionId(), item.getValue());
		}

		request.setQuestions(surveyres);

		return service.processRequest(request);
	}


	@GetMapping("/getRequest")
	public Mono<SurveyHubRequest> sampleController02(){
		return service.replyWithReq();
	}
}
