package org.cegedim.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.lang.Nullable;

@Entity
public class User implements Serializable{
	@Id 
	@GeneratedValue
	private Long id;
	@Nullable
	private String username;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(String username) {
		super();
		this.username = username;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
