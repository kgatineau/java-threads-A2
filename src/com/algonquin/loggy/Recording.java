package com.algonquin.loggy;

import java.util.UUID;

public class Recording {
	private UUID uuid;
	private String name;
	private Long size;
	
	public Recording(UUID uuid, String name, Long size) {
		super();
		this.uuid = uuid;
		this.size = size;
		this.name = name;
	}

	public UUID getUuid() {
		return uuid;
	}
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	
}
