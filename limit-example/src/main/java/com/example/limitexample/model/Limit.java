package com.example.limitexample.model;

public class Limit {
	
	
	
	public Limit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Limit(Integer limit, Integer limit2) {
		super();
		this.minimum = limit;
		this.maximum = limit2;
	}
	
	private Integer minimum;
	private Integer maximum;
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	
	

}
