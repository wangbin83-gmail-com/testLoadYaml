package com.chinabank.wyrcm;

import java.util.List;

public class RuleVariable {
	private String name;
	private String type;
	private List<String> value;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getValue() {
		return value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("name: " + this.getName() + " \n");
		sb.append("type: " + this.getType() + " \n");
		sb.append("values: \n");
		for (Object v : this.getValue()) {
			sb.append(v + " \t ");
		}
		sb.append(" \n ");
		return sb.toString();
	}
}
