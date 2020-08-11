package com.jinwoo.chatting.dto;

public class MemberVO {
	int no;
	String user_id;
	String password;
	String name;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MemberVO [no=" + no + ", user_id=" + user_id + ", password=" + password + ", name=" + name + "]";
	}
	
}
