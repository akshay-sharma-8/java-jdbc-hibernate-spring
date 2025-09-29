package com.akshay.JobApp.model;


import java.util.List;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {


	private int postId;
	private String postProfile; 
	private String postDesc;
	private Integer reqExperience;
	private List<String> postTechStack;

}

//@Component is used to create and manage objects (beans) in Spring’s IoC(Inversion of Control) container.
//Spring automatically scans, creates, and injects these beans
//so developers don’t have to manually manage object creation.