package com.example.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsVO {
	private int no;
	private String item;
	private int qty;
	private int price;
	private String fname;
	private String detail;
}
