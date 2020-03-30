package com.ogame.ogamestats.input;

public class Planet {

	private final String id;
	private final String name;
	private final String coords;
	
	public Planet() {
		super();
		this.id = "";
		this.name = "";
		this.coords = "";
	}
	
	public Planet(String id, String name, String coords) {
		super();
		this.id = id;
		this.name = name;
		this.coords = coords;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCoords() {
		return coords;
	}
}
