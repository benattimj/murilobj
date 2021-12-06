package com.murilobj.domain.enums;

public enum TipoCliente {

	INDIVIDUAL(1,"INDIVIDUAL"),
	LEGALENTITY(2,"LEGAL ENTITY");
	
	private int cod;
	private String description;
	
	private TipoCliente (int cod, String description) {
		this.cod = cod;
		this.description = description;	 	
}
 
	public int getCod() {
		return cod;
 }

	public String getDescription() {
		return description;
	}

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
	}
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id invalid: " + cod);
	}
}
