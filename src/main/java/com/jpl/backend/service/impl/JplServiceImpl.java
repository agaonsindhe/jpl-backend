package com.jpl.backend.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.jpl.backend.bo.JplStanding;
import com.jpl.backend.service.JplService;
import com.jpl.backend.util.ResponseToModelMapper;

@Service
public class JplServiceImpl implements JplService {

	@Value("${fpl.base.url}")
	private String baseurl;

	private String RESOURCE_URL =  "/leagues-classic/16691/standings/";
	private RestTemplate restTemplate;
	private static Gson gson = new Gson();

	@Autowired
	public JplServiceImpl(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	@Override
	public List<JplStanding> getJplStanding() {
		String url;
		boolean hasNext = true;
		List<JplStanding> resultsStanding = new ArrayList<>();;
		int pageNewEntries=1,pageStandings=0, phase=1;
		do {
			++pageStandings;
			url = baseurl + RESOURCE_URL+ "?page_new_entries="+pageNewEntries+"&page_standings="+pageStandings+"&phase="+phase;
			String forEntity = restTemplate.getForObject(url.toString(),String.class);
			TypeToken<Map<String, Object>> mapType = new TypeToken<Map<String, Object>>(){};
			Map<String, Object> json = gson.fromJson(forEntity, mapType.getType());
			Map<String,Object> standings = (Map<String, Object>) json.get("standings");
			List<Map<String,Object>> results = (List<Map<String, Object>>) standings.get("results");
			ResponseToModelMapper.mapResponseToModel(results,resultsStanding);
			hasNext = (Boolean)standings.get("has_next");
		}while(hasNext);
		
		return resultsStanding;
	}


}
