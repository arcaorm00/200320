package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.ScheduleVO;
import com.google.gson.Gson;

@RestController
public class ScheduleController {

	@RequestMapping(value="/listSchedule", produces = "application/json;charset=UTF-8")
	public String listSchedule() {
		String str = "";
		str = (new Gson()).toJson(DBManager.listSchedule());
		return str;
	}
	
	@RequestMapping("/insertSchedule")
	public String insertSchedule(ScheduleVO s) {
		String str = "일정 등록에 실패했습니다.";
		int re = DBManager.insertSchedule(s);
		if(re > 0) {
			str="일정을 등록했습니다.";
		}
		return str;
	}
}
