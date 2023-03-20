package com.test02;

public class Song {
	
	String title;
	String artist;
	int year;
	String country;

	Song() {
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	void show() {
		System.out.printf("%s, %d년 %s [%s]", country, year, artist, title);
	}

}
