package com.example.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OrderItem {
	
	private Integer itemId;
	private Integer number;
	private String remark;
}
