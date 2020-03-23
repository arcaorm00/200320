package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.ChatVO;
import com.google.gson.Gson;

@RestController
public class ChatController {

	@RequestMapping(value="/listChat", produces = "application/json;charset=UTF-8")
	public String chatList() {
		String str = "";
		str = (new Gson()).toJson(DBManager.listChat());
		return str;
	}
	
	@RequestMapping("/insertChat")
	public String insertChat(ChatVO c) {
		String str = "";
		DBManager.insertChat(c);
		return str; 
	}
}
