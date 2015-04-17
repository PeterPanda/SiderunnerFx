package de.siderunnerfx.datamodel;

public class GameBlock extends GameObject {

	private Boolean isDeadly;

	public Boolean getIsDeadly() {
		return isDeadly;
	}

	public void setIsDeadly(Boolean isDeadly) {
		this.isDeadly = isDeadly;
	}

	public GameBlock(String name, Integer x, Integer y, Boolean isDeadly) {
		super(name, x, y);
		this.isDeadly = isDeadly;
	}
	
}
