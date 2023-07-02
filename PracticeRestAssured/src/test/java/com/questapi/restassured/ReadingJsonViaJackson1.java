package com.questapi.restassured;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingJsonViaJackson1 {
	
	public static void main(String...a) throws IOException{
		
		byte[] jsondata=Files.readAllBytes(Paths.get
				("G:\\RestAssured\\restassuredproject\\target\\UserProfile.Json"));
		ObjectMapper mapper=new ObjectMapper();
		UserProfile value=mapper.readValue(jsondata, UserProfile.class);
		System.out.println("First Name : "+value.getUsername());
		System.out.println("First Password : "+value.getPassword());
		
		
	}

}
