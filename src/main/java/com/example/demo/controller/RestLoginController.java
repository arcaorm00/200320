package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLoginController {

	@RequestMapping(value="/actionWithData", produces = "text/plaine;charset=UTF-8")
	public String actionWithData(String name, int age) {
		String str = "";
		System.out.println("Ajax 통신");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		str = "<h2>로그인 성공</h2>";
		return str;
	}
}
