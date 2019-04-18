package org.cegedim.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Post implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String body;
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body; 
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Long getUser() {
		return user.getId();
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Post(String title, String body, User user) {
		super();
		this.title = title;
		this.body = body;
		this.user = user;
	}
	public Post(String title, String body) {
		super();
		this.title = title;
		this.body = body;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
}
