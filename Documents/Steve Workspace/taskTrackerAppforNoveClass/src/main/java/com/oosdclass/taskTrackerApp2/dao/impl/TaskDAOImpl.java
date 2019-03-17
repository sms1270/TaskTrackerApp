package com.oosdclass.taskTrackerApp2.dao.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.oosdclass.taskTrackerApp2.dao.TaskDAO;
import com.oosdclass.taskTrackerApp2.model.Task;

@Repository
public class TaskDAOImpl implements TaskDAO {
	
	
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Task> retrieveAllTasks() {
		try {
			String sql = "select * from task";
			List<Task> tasklist = jdbcTemplate.query(sql, new ResultSetExtractor<List<Task>>() {
				
				@Override
				public List<Task> extractData(ResultSet rs) throws SQLException, DataAccessException {
					
					List<Task> list = new ArrayList<Task>();
					while (rs.next()) {
						Task task = new Task();
						task.setTaskID(rs.getInt(1));
						task.setDescription(rs.getString(2));
						task.setAssignedTo(rs.getString(3));
						task.setStatus(rs.getString(4));
						list.add(task);
					}
					return list;
				}
			});
		return tasklist;
		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
	}
	
	@Override
	public Task retrieveByTaskID(int taskID) {
		try {
			String sql = "select * from task where taskId=?";
			Task task = (Task) jdbcTemplate.queryForObject(sql, new Object[] { taskID }, new RowMapper<Task>() {
				
				@Override
				public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
					Task task = new Task();
					task.setTaskID(rs.getInt(1));
					task.setDescription(rs.getString(2));
					task.setAssignedTo(rs.getString(3));
					task.setStatus(rs.getString(4));
					return task;
				}
			});
			return task;
		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
	}
	


	@Override
	public Task insert(Task addTaskFormObject) {
		try {
			addTaskFormObject.setTaskID(Math.abs(new Random().nextInt()));
			addTaskFormObject.setStatus("RUNNING");
			String sql = "INSERT INTO tasktrackerdb.task (taskID, description, assignedTo, status) VALUES (?, ?, ?, ?)";
			System.out.println("got to pre-jdbc");
			jdbcTemplate.update(sql, new Object[] { 
					addTaskFormObject.getTaskID(), 
					addTaskFormObject.getDescription(),
					addTaskFormObject.getAssignedTo(),
					addTaskFormObject.getStatus() 
			});	

		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
		return addTaskFormObject;
	
	}
	
	@Override
	public Task update(Task assignTaskFormObject) {
		try {
			String sql = "UPDATE tasktrackerdb.task SET assignedTo=? WHERE description=?";
			System.out.println("got to pre-jdbc");
			jdbcTemplate.update(sql, new Object [] { 
					assignTaskFormObject.getTaskID(), 
					assignTaskFormObject.getDescription(),
					assignTaskFormObject.getAssignedTo(),
					assignTaskFormObject.getStatus() 
			});	

		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
		return assignTaskFormObject;
	
	} 
	
}