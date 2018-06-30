package com.oosdclass.taskTrackerApp2.model;

public class Task {
	
	public int taskID;
	private String description;
	private String assignedTo;
	private String status;
	
	public int getTaskID() {
		return taskID;
	}
	
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	
	public String getDescription() {
		System.out.println("Description" + description);
		return description;
	}
	
	public void setDescription(String description) {
		System.out.println("setDescription");
		this.description = description;
	}
	
	public String getAssignedTo() {
		System.out.println("getAssignedTo" + assignedTo);
		return assignedTo;
	}
	
	public void setAssignedTo(String assignedTo) {
		System.out.println("setAssignedTo");
		this.assignedTo = assignedTo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
