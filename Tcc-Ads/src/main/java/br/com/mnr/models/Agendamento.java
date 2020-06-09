package br.com.mnr.models;

import java.util.Date;

import br.com.mnr.enums.EnumStatusAgendamento;

public class Agendamento {
	private Long id;
	
	private Date data;
	private EnumStatusAgendamento status;
	private Date horaInicial;
	private Date horaFinal;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public EnumStatusAgendamento getStatus() {
		return status;
	}
	public void setStatus(EnumStatusAgendamento status) {
		this.status = status;
	}
	public Date getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(Date horaInicial) {
		this.horaInicial = horaInicial;
	}
	public Date getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(Date horaFinal) {
		this.horaFinal = horaFinal;
	}
	
	
	
}
