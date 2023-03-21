package com.jpl.backend.bo;

import java.util.List;

public class JplStandings extends BaseBusinessObject{

	private static final long serialVersionUID = -3036508953129727184L;
	
	private List<JplStanding> jplStandings;

	public List<JplStanding> getJplStandings() {
		return jplStandings;
	}

	public void setJplStandings(List<JplStanding> jplStandings) {
		this.jplStandings = jplStandings;
	}

	@Override
	public String toString() {
		return "JplStandings [jplStandings=" + jplStandings + "]";
	}
	
}
