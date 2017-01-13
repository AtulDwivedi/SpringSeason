package com.atuldwivedi.springseason.core.beans.collections.factorybean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
	private List list;
	private Set set;
	private Map map;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "Customer [list=" + list + ", set=" + set + ", map=" + map + "]";
	}
	
	
}
