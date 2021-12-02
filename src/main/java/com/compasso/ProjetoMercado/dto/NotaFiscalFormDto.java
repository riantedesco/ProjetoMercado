package com.compasso.ProjetoMercado.dto;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotaFiscalFormDto {
	
	private Long numero;
	
	private LocalDate dataHoraEntrada;

}
