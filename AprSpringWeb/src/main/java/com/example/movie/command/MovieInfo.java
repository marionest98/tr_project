package com.example.movie.command;

import java.util.List;

import lombok.Data;

@Data
public class MovieInfo {
	String movieNm;
	List<Actors> actors;
}
