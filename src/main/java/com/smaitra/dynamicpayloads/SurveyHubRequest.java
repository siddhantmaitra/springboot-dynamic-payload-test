package com.smaitra.dynamicpayloads;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyHubRequest {
	
	private String id;
	private String field1;
	private String attribute;
	
	@JsonProperty("objectField")
	private String objPropID;

	Map<String,Object> questions;

	List<Item> testItems;


}
