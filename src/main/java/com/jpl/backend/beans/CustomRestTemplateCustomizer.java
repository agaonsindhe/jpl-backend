package com.jpl.backend.beans;

import com.jpl.backend.config.CustomClientHttpRequestInterceptor;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.web.client.RestTemplate;

public class CustomRestTemplateCustomizer implements RestTemplateCustomizer {

	@Override
	public void customize(RestTemplate restTemplate) {
		restTemplate.getInterceptors().add(new CustomClientHttpRequestInterceptor());
	}

}
