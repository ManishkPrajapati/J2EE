package com.demo.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Leave {
	
	private String leaveid;
	private String leaveApplied;
	private String start;
	private String end;
	private String leaveType;
	private String leaveReason;
	public Leave() {
		super();
	}
	public Leave(String leaveid, String leaveApplied, String start, String end, String leaveType, String leaveReason) {
		super();
		this.leaveid = leaveid;
		this.leaveApplied = leaveApplied;
		this.start = start;
		this.end = end;
		this.leaveType = leaveType;
		this.leaveReason = leaveReason;
	}
	
	public Leave( String start, String end, String leaveType, String leaveReason) {
		super();
		this.start = start;
		this.end = end;
		this.leaveType = leaveType;
		this.leaveReason = leaveReason;
	}
	public Leave(String leaveid, String start, String end, String leaveType, String leaveReason) {
		super();
		this.leaveid = leaveid;
		this.start = start;
		this.end = end;
		this.leaveType = leaveType;
		this.leaveReason = leaveReason;
	}
	public String getLeaveid() {
		return leaveid;
	}
	public void setLeaveid(String leaveid) {
		this.leaveid = leaveid;
	}
	public String getLeaveApplied() {
		return leaveApplied;
	}
	public void setLeaveApplied(String leaveApplied) {
		this.leaveApplied = leaveApplied;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	@Override
	public String toString() {
		return "Leave [leaveid=" + leaveid + ", leaveApplied=" + leaveApplied + ", start=" + start + ", end=" + end
				+ ", leaveType=" + leaveType + ", LeaveReason=" + leaveReason + "]";
	}
	
	
	
	
}
