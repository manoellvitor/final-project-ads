package br.com.mnr.enums;

public enum EnumNotaProfessor {
	RUIM(1), REGULAR(2), BOM(3), EXCELENTE(4);
	
	private int valor;
	
	private EnumNotaProfessor(int valor) {
		this.valor = valor;
	}
}
