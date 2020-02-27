package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	//no caso de enums o construtor é private
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//metodo para o code fique acessível ao mundo exterior
	public int getCode() {
		return code;
	}
	
	//metodo estático para converter um valor númerico para o tipo enumerado
	public static OrderStatus valueOf(int code) {
		 for (OrderStatus value : OrderStatus.values()) {
			 if (value.getCode() == code) {
				 return value;
			 }
		 }
		 throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
