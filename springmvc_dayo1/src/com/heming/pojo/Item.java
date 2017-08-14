package com.heming.pojo;

import java.util.Date;

public class Item {
	// 商品id
	private int id; 
	// 商品名称
	private String name;
	// 商品价格
	private Float price;
	// 商品创建时间
	private Date createtime;
	// 商品描述
	private String detail;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name, Float price, Date createtime, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.createtime = createtime;
		this.detail = detail;
	}
	
}
