package com.example.command;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OrderCommand {
	
	private List<OrderItem> orderItems;
	private Address address;
}
