package com.ogame.ogamestats.input;

public class Position {
	
	private final String type;
	private final String score;
	
	public Position() {
		super();
		this.type = "";
		this.score = "0";
	}
	
	public Position(String type, String score) {
		super();
		this.type = type;
		this.score = score;
	}

	public String getType() {
		return type;
	}

	public String getScore() {
		return score;
	}
}
