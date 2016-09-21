package com.hanbit.jongchan.lee.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hanbit.jongchan.lee.core.service.SchedulerService;
import com.hanbit.jongchan.lee.core.vo.ScheduleVO;
import com.hanbit.jongchan.lee.web.controller.ScheduleController;


@Controller
public class ScheduleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleController.class);

	@Autowired
	private SchedulerService schedulerService;

	@RequestMapping("/schedule/list")
	public String list() {

		return "schedule/list";
	}

	@RequestMapping("/api/schedule/list")
	@ResponseBody
	public List<ScheduleVO> listSchedules(@RequestParam("startDt") String startDt,
			@RequestParam("endDt") String endDt) {
//위에걸로 대신함..
//		String startDt = request.getParameter("startDt");
//		String endDt = request.getParameter("endDt");

		List<ScheduleVO> result = schedulerService.listSchedules(startDt, endDt);

		return result;
	}
}