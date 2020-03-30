package com.ogame.ogamestats.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private long id;
	private String idPlayer;
	private String name;
	public Player() {
		super();
		this.idPlayer = "";
		this.name = "";
	}
	public Player(int id, String idplayer, String name) {
		super();
		this.id = id;
		this.idPlayer = idplayer;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdplayer() {
		return idPlayer;
	}
	public void setIdplayer(String idplayer) {
		this.idPlayer = idplayer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
