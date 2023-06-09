package com.cskaoyan.javase.swing.manager.stage8.model;

/**
 * 管理员用户实体类
 *
 * @since 10:01
 * @author wuguidong@cskaoyan.onaliyun.com
 */
public class User {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}
