package br.com.vivo.jobs.jobscheduler.model;

import java.time.LocalDateTime;

public class JanelaExecucao {
	
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	
	public JanelaExecucao() {}
	
	public JanelaExecucao(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) {
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
	}
	
	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}

}
