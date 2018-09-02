package com.lbanozic.todo;

public class TodoItem {

	private Integer id;
	private String name;
	private String time;
	private Boolean completed;

	public TodoItem() {
	}

	public TodoItem(Integer id, String name, String time, Boolean completed) {
		this.id = id;
		this.name = name;
		this.time = time;
		this.completed = completed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
}
