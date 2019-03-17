package com.oosdclass.taskTrackerApp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.oosdclass.taskTrackerApp2.model.Task;
import com.oosdclass.taskTrackerApp2.model.User;
import com.oosdclass.taskTrackerApp2.service.TaskService;

@Controller
public class TaskController {
	
	
	private static final RequestMethod[] post = null;
	
	@Autowired
	TaskService taskService;
	
	
	@RequestMapping(value="/adminTasks")
	public ModelAndView viewTasks(ModelAndView model) {
		
		//replace the mock method with the service
		List<Task> taskList = taskService.getAllTask();
		model.addObject(taskList);
		System.out.println();
		model.setViewName("viewTask");
		System.out.println("viewTask" + taskList.size());
		return model;
		
	}	
	
	@RequestMapping(value="/addTaskView")
	public ModelAndView addTask(ModelAndView model) {
		
		//replace the mock method with the service
		Task task = new Task();
		model.addObject(task);
		model.setViewName("addTask");
		System.out.println("addTask");
		return model;
		
	}
	
//	//(/addTask) method (POST) is mapped to /addTask URL where user post/submits the
//	// form which is mapped to user object and we pass to service
	@RequestMapping(value = "/addTaskView", method = RequestMethod.POST)
	public ModelAndView addTask(Task addTaskFormObject) {
//		ModelAndView model = null;
		taskService.insertTask(addTaskFormObject);
		System.out.println("added: " + addTaskFormObject);
		
		ModelAndView model = new ModelAndView("redirect:/adminTasks");
		return model;
	}
	
	@RequestMapping(value="/assignTask")
	public ModelAndView assignTask(ModelAndView model) {
		
		//replace the mock method with the service
		Task task = new Task();
		model.addObject(task);
		model.setViewName("assignTaskView");
		return model;
		
	}
	
//	(/assignTaskView) method (POST) is mapped to /assignTask URL where user post/submits the
//	form which is mapped to user object and we pass to service
	@RequestMapping(value = "/assignTask", method = RequestMethod.POST)
	public ModelAndView assignTask(Task assignTaskFormObject) {
//		ModelAndView model = null;
		
//		if (User.getUsername == "admin") {
//			taskService.insertTask(assignTaskFormObject);
//			System.out.println("added: " + assignTaskFormObject);
//		} else 
		
		ModelAndView model = new ModelAndView("redirect:/adminTasks");
		return model;
	}
}
