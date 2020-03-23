package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.CartVO;
import com.example.demo.vo.GoodsVO;
import com.example.demo.vo.MemberVO;

@Repository
public class GoodsDAO {

	public List<GoodsVO> listAll(){
		return DBManager.listAll();
	}
	
	public List<CartVO> listCart(){
		return DBManager.listCart();
	}
	
	public int insertCart(CartVO c) {
		return DBManager.insertCart(c);
	}
	
	public MemberVO isExist(MemberVO m) {
		return DBManager.isExist(m);
	}
}
