package com.example.command;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ACommand {
	
	public String name;
	public int age;
	@DateTimeFormat(pattern = "yyyyMMdd")
	public Date birth;
	public List<String> pet;

}
