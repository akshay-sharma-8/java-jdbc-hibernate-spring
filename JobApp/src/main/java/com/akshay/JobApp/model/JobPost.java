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


//    public <E> JobPost(int i, String javaDeveloper, String s, int i1, java.util.List<E> es) {
//    }
}
