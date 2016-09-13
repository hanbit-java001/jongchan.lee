package com.hanbit.jongchan.lee.core.service;

import java.util.List;

import com.hanbit.jongchan.lee.core.dao.ScheduleDAO;
import com.hanbit.jongchan.lee.core.vo.ScheduleVO;

public class SchedulerService {

	private ScheduleDAO scheduleDAO = new ScheduleDAO();

	public int addSchedule(ScheduleVO schedule) {
		return scheduleDAO.insertSchedule(schedule);
	}

	public int modifySchedule(ScheduleVO schedule) {
		return scheduleDAO.updateSchedule(schedule);
	}

	public int removeSchedule(String scheduleId) {
		return scheduleDAO.deleteSchedule(scheduleId);
	}

	public List<ScheduleVO> listSchedules(String startDt, String endDt) {
		return scheduleDAO.selectSchedules(startDt, endDt);
	}

	public ScheduleVO getSchedule(String scheduleId) {
		return scheduleDAO.selectSchedule(scheduleId);
	}

}
