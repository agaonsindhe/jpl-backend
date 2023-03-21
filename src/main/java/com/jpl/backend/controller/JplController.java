package com.jpl.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpl.backend.bo.JplStanding;
import com.jpl.backend.bo.JplStandings;
import com.jpl.backend.bo.enums.StatusCode;
import com.jpl.backend.service.JplService;

@RestController
@RequestMapping("/api/v1/")
public class JplController {

	@Autowired
	private JplService jplService;
	
	@GetMapping(path = "/jpl-standings",produces = {MediaType.APPLICATION_JSON_VALUE})
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<JplStandings> getJplStandings(){
		JplStandings standings = new JplStandings();
		ResponseEntity<JplStandings> response = new ResponseEntity<JplStandings>(standings , HttpStatus.NOT_FOUND);
		
		List<JplStanding> jplStandings = jplService.getJplStanding();
		if(!jplStandings.isEmpty()) {
			standings.setJplStandings(jplStandings);
			standings.setMessage("Found the league details!");
			standings.setStatusCode(StatusCode.OK);
			
			response = new ResponseEntity<JplStandings>(standings, HttpStatus.OK);
		}
		
		return response;
	}
	
	
}
