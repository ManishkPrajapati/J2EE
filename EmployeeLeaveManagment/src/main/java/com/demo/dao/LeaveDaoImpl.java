package com.demo.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Leave;


@Repository
public class LeaveDaoImpl implements LeaveDao{
	@Autowired
	private JdbcTemplate jd;

	@Override
	public List<Leave> getAllLeave() {
		return jd.query("select * from  leavedetails", (rs,num)->{
			Leave l=new Leave();
			l.setLeaveid(rs.getString(1));
			l.setLeaveApplied(rs.getString(2));
			l.setStart(rs.getString(3));
			l.setEnd(rs.getString(4));
			l.setLeaveType(rs.getString(5));
			l.setLeaveReason(rs.getNString(6));			
			return l;
			});
		}

	@Override
	public void addLeave(Leave l) {
		jd.update("insert into  leavedetails(leave_id,leave_applied_on,start_date,end_date,leave_type,leave_reason) values(?,?,?,?,?,?)",new Object[] {l.getLeaveid(),LocalDate.now(),l.getStart(),l.getEnd(),l.getLeaveType(),l.getLeaveReason()});
		
	}

}
