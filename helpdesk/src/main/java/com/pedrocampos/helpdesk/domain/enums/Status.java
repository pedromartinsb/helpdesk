package com.pedrocampos.helpdesk.domain.enums;

public enum Status {

	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");
	
	private Integer codigo;
	private String descricao;
	
	private Status(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static Status toEnum(final Integer cod) {
		if (cod == null) {
			return null;
		}
		
		for (Status status : Status.values()) {
			if (cod.equals(status.getCodigo())) {
				return status;
			}
		}
		
		throw new IllegalArgumentException("Status inválido");
	}
}
