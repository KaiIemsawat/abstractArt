package com.abstractArt;

public class Sculpture extends Art {
	private String material;



	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	void viewArt() {
		System.out.printf("I see a sculpture called %s, by %s. It is %s. It was created with %s\n", super.title, super.author, super.description, this.material);
	}
	
	public Sculpture(String title, String author, String description, String material) {
		super.title = title;
		super.author = author;
		super.description = description;
		this.material = material;
	}

	
}
