package com.ogame.ogamestats.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerBean {
	
	@NotNull(message = "Id cannot be null")
	private String id;
	@NotNull(message = "Name cannot be null")
	private String name;
	private List<Position> positions;
	private List<Planet> planets;
	private Alliance alliance;
	public PlayerBean() {
		super();
		this.id = "";
		this.name = "";
		this.positions = new ArrayList<Position>();
		this.planets = new ArrayList<Planet>();
		this.alliance = new Alliance();
	}
	public PlayerBean(@JsonProperty("id") String id,
				  @JsonProperty("name") String name,
				  @JsonProperty("positions") List<Position> positions,
				  @JsonProperty("planets") List<Planet> planets,
				  @JsonProperty("alliance") Alliance alliance) {
		super();
		this.id = id;
		this.name = name;
		this.positions = positions;
		this.planets = planets;
		this.alliance = alliance;
	}
	public String getId() {
		return id;
	}
	public List<Position> getPositions() {
		return positions;
	}
	public List<Planet> getPlanets() {
		return planets;
	}
	public Alliance getAlliance() {
		return alliance;
	}
	public String getName() {
		return name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	public void setPlanets(List<Planet> planets) {
		this.planets = planets;
	}
	public void setAlliance(Alliance alliance) {
		this.alliance = alliance;
	}
}
