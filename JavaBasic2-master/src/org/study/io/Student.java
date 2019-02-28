package org.study.io;

import java.util.Arrays;

public class Student {

	private String name;
	private int id;
	private int[] scores;
	
	public Student() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", scores=" + Arrays.toString(scores) + "]";
	}
}
