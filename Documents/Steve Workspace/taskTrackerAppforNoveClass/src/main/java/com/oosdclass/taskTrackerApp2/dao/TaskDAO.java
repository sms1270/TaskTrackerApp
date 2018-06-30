package com.oosdclass.taskTrackerApp2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.oosdclass.taskTrackerApp2.model.Task;

public interface TaskDAO {
	
	public List<Task> retrieveAllTasks();

	public Task retrieveByTaskID(int taskID);

	public Task insert(Task addTaskFormObject);
	
	public Task update(Task assignTaskFormObject);
	
}
