package com.bai.springBoot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BaiProperties {

	@Value("com.bai.title")
	private String title;
	@Value("com.bai.description")
	private String description;
}
