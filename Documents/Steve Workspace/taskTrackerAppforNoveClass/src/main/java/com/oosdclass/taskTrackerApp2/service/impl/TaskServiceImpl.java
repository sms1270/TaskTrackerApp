package com.oosdclass.taskTrackerApp2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oosdclass.taskTrackerApp2.dao.TaskDAO;
import com.oosdclass.taskTrackerApp2.model.Task;
import com.oosdclass.taskTrackerApp2.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskDAO taskdao;
	
	@Override
	public List<Task> getAllTask() {
		return taskdao.retrieveAllTasks();	
	}
	
	@Override
	public void insertTask(Task addTaskFormObject) {
			System.out.println("adding the job");
			taskdao.insert(addTaskFormObject);
	}
		
	public void updateTask(Task assignTaskFormObject) {
			System.out.println("validating");
			taskdao.update(assignTaskFormObject);
	}
}
