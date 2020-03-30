package com.ogame.ogamestats.output;

public class OPlayer {

	private long id;
	private String idPrivate;
	private String name;
	public OPlayer() {
		super();
		this.id = 0;
		this.idPrivate = "";
		this.name = "";
	}
	public OPlayer(long id, String idPrivate, String name) {
		super();
		this.id = id;
		this.idPrivate = idPrivate;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdPrivate() {
		return idPrivate;
	}
	public void setIdPrivate(String idPrivate) {
		this.idPrivate = idPrivate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
