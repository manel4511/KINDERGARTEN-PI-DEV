package tn.esprit.spring.Services;

import java.util.Date;

import tn.esprit.spring.entity.Planning;

public interface IPlanningSerivce {
	public int AddPlanning(Planning p);
	public Planning updatePlannig(Planning p);
	public void DeletePlanning(int id);
	
	

}