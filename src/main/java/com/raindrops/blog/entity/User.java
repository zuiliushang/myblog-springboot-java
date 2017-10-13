package com.raindrops.blog.entity;

/**
 * @author xusihan on 2017.10.13
 */
public class User {
	
	private Integer id;
	
	private String name;
	
	private String addr;
	
	private String info;

	public User() {
		super();
	}

	public User(Integer id, String name, String addr, String info) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.info = info;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
	
}
