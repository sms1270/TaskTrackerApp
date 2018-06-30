package com.oosdclass.taskTrackerApp2.service;

import java.util.List;

import com.oosdclass.taskTrackerApp2.model.Task;

public interface TaskService {
	
	
	public List<Task> getAllTask();
	
	public void insertTask(Task addTaskFormObject);
		// TODO Auto-generated method stub
	
	public void updateTask(Task assignTaskFormObject);
		
}
