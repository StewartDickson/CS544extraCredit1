package edu.mum.cs544.domain;

import java.util.List;

enum Role { ADMIN, VOL }

public class User {
	
	private Role role;
	
	private List<Resource> skills;

}
