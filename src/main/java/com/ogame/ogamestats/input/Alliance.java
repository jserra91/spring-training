package com.ogame.ogamestats.input;

public class Alliance {
	
	private final String id;
	private final String name;
	private final String tag;

	public Alliance() {
		super();
		this.id = "";
		this.name = "";
		this.tag = "";
	}

	public Alliance(String id, String name, String tag) {
		super();
		this.id = id;
		this.name = name;
		this.tag = tag;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTag() {
		return tag;
	}
}
