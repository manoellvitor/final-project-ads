package br.com.mnr.enums;

public enum EnumStatusAgendamento {
	ABERTO(1), FECHADO(2);
	
	private int valor;
	
	private EnumStatusAgendamento(int valor) {
		this.valor = valor;
	}
}
