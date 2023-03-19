package com.abstractArt;

public class Painting extends Art{
	private String paintType;
	
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
	@Override
	void viewArt() {
		System.out.printf("I see a painting called %s, by %s. It is %s. It was created with %s technique\n", super.title, super.author, super.description, this.paintType);
		
	}

	public Painting(String title, String author, String description, String paintType) {
		super.title = title;
		super.author = author;
		super.description = description;
		this.paintType = paintType;
	}
	
	
	
}
