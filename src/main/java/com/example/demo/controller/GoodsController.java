package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GoodsDAO;
import com.example.demo.vo.CartVO;
import com.example.demo.vo.GoodsVO;
import com.example.demo.vo.MemberVO;
import com.google.gson.Gson;

@RestController
public class GoodsController {

	@Autowired
	private GoodsDAO dao;
	
	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(value="/listGoods", produces = "application/json;charset=UTF-8")
	public String listAll() {
		return (new Gson()).toJson(dao.listAll()); 
	}
	@RequestMapping("/insertCart")
	public String insertCart(CartVO c) {
		String str = "장바구니 담기에 실패했습니다.";
		int re = dao.insertCart(c);
		if(re > 0) {
			str="장바구니에 담았습니다.";
		}
		return str;
	}
	@RequestMapping("/isExist")
	public boolean isExist(MemberVO v) {
		boolean re = false;
		MemberVO m = dao.isExist(v);
		if( m != null ) {
			re = true;
		}
		return re;
	}
}
