package com.smaitra.dynamicpayloads;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SurveyRecordCreate {

	private String id;
	private String field1;
	private String attribute;

	@JsonProperty("objectField")
	private Item objProp;

    private List<Item> items;

    // public static class Item {
    //     private String questionId;
    //     private Object value;  // Using Object to allow flexibility for different types of answers

    //     // Getters and setters
    //     public String getQuestionId() {
    //         return questionId;
    //     }

    //     public void setQuestionId(String questionId) {
    //         this.questionId = questionId;
    //     }

    //     public Object getValue() {
    //         return value;
    //     }

    //     public void setValue(Object value) {
    //         this.value = value;
    //     }
    // }

    // // Getters and setters for items
    // public List<Item> getItems() {
    //     return items;
    // }

    // public void setItems(List<Item> items) {
    //     this.items = items;
    // }
}

