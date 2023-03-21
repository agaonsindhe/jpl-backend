package com.jpl.backend.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.jpl.backend.bo.JplStanding;

public class ResponseToModelMapper {

	public static List<JplStanding> mapResponseToModel(List<Map<String, Object>> results,List<JplStanding> standings) {
		
		for(Map<String,Object> result: results) {
			JplStanding jplStanding = new JplStanding();
			jplStanding.setRank(((Double) result.get("rank")).intValue());
			jplStanding.setManagerName((String)result.get("player_name"));
			jplStanding.setCurrentGameWeekPts((Double) result.get("event_total"));
			jplStanding.setTeamName((String)result.get("entry_name"));
			jplStanding.setTotalPoints((Double) result.get("total"));
			
			standings.add(jplStanding);
		}
		return standings;
	}

	
	
}
