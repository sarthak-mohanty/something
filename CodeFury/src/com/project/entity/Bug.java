package com.project.entity;

import java.sql.Date;

public class Bug implements Comparable<Bug>{
	
	private int budId;
	private String bugTitle;
	private String bugDescription;
	private int projectId;
	private int createdBy;					//User Id of Tester
	private Date openDate;
	private int assignedTo;					//User Id of Developer
	private String markedForClosing;		//Data type Boolean
	private int closedBy;					//User Id of Manager
	private Date closedOn;					//LocalDate to be used
	private String bugStatus;
	private String severityLevel;
	
	
	public Bug() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Bug(int budId, String bugTitle, String bugDescription, int projectId, int createdBy, Date openDate,
			int assignedTo, String markedForClosing, int closedBy, Date closedOn, String bugStatus,
			String severityLevel) {
		super();
		this.budId = budId;
		this.bugTitle = bugTitle;
		this.bugDescription = bugDescription;
		this.projectId = projectId;
		this.createdBy = createdBy;
		this.openDate = openDate;
		this.assignedTo = assignedTo;
		this.markedForClosing = markedForClosing;
		this.closedBy = closedBy;
		this.closedOn = closedOn;
		this.bugStatus = bugStatus;
		this.severityLevel = severityLevel;
	}


	public int getBudId() {
		return budId;
	}


	public void setBudId(int budId) {
		this.budId = budId;
	}


	public String getBugTitle() {
		return bugTitle;
	}


	public void setBugTitle(String bugTitle) {
		this.bugTitle = bugTitle;
	}


	public String getBugDescription() {
		return bugDescription;
	}


	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	public int getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}


	public Date getOpenDate() {
		return openDate;
	}


	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}


	public int getAssignedTo() {
		return assignedTo;
	}


	public void setAssignedTo(int assignedTo) {
		this.assignedTo = assignedTo;
	}


	public String getMarkedForClosing() {
		return markedForClosing;
	}


	public void setMarkedForClosing(String markedForClosing) {
		this.markedForClosing = markedForClosing;
	}


	public int getClosedBy() {
		return closedBy;
	}


	public void setClosedBy(int closedBy) {
		this.closedBy = closedBy;
	}


	public Date getClosedOn() {
		return closedOn;
	}


	public void setClosedOn(Date closedOn) {
		this.closedOn = closedOn;
	}


	public String getBugStatus() {
		return bugStatus;
	}


	public void setBugStatus(String bugStatus) {
		this.bugStatus = bugStatus;
	}


	public String getSeverityLevel() {
		return severityLevel;
	}


	public void setSeverityLevel(String severityLevel) {
		this.severityLevel = severityLevel;
	}


	@Override
	public String toString() {
		return "Bugs [budId=" + budId + ", bugTitle=" + bugTitle + ", bugDescription=" + bugDescription + ", projectId="
				+ projectId + ", createdBy=" + createdBy + ", openDate=" + openDate + ", assignedTo=" + assignedTo
				+ ", markedForClosing=" + markedForClosing + ", closedBy=" + closedBy + ", closedOn=" + closedOn
				+ ", bugStatus=" + bugStatus + ", severityLevel=" + severityLevel + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + assignedTo;
		result = prime * result + budId;
		result = prime * result + ((bugDescription == null) ? 0 : bugDescription.hashCode());
		result = prime * result + ((bugStatus == null) ? 0 : bugStatus.hashCode());
		result = prime * result + ((bugTitle == null) ? 0 : bugTitle.hashCode());
		result = prime * result + closedBy;
		result = prime * result + ((closedOn == null) ? 0 : closedOn.hashCode());
		result = prime * result + createdBy;
		result = prime * result + ((markedForClosing == null) ? 0 : markedForClosing.hashCode());
		result = prime * result + ((openDate == null) ? 0 : openDate.hashCode());
		result = prime * result + projectId;
		result = prime * result + ((severityLevel == null) ? 0 : severityLevel.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bug other = (Bug) obj;
		if (assignedTo != other.assignedTo)
			return false;
		if (budId != other.budId)
			return false;
		if (bugDescription == null) {
			if (other.bugDescription != null)
				return false;
		} else if (!bugDescription.equals(other.bugDescription))
			return false;
		if (bugStatus == null) {
			if (other.bugStatus != null)
				return false;
		} else if (!bugStatus.equals(other.bugStatus))
			return false;
		if (bugTitle == null) {
			if (other.bugTitle != null)
				return false;
		} else if (!bugTitle.equals(other.bugTitle))
			return false;
		if (closedBy != other.closedBy)
			return false;
		if (closedOn == null) {
			if (other.closedOn != null)
				return false;
		} else if (!closedOn.equals(other.closedOn))
			return false;
		if (createdBy != other.createdBy)
			return false;
		if (markedForClosing == null) {
			if (other.markedForClosing != null)
				return false;
		} else if (!markedForClosing.equals(other.markedForClosing))
			return false;
		if (openDate == null) {
			if (other.openDate != null)
				return false;
		} else if (!openDate.equals(other.openDate))
			return false;
		if (projectId != other.projectId)
			return false;
		if (severityLevel == null) {
			if (other.severityLevel != null)
				return false;
		} else if (!severityLevel.equals(other.severityLevel))
			return false;
		return true;
	}



	@Override
	public int compareTo(Bug o) {			//Default Sorting for Severity Level
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	
	

}
