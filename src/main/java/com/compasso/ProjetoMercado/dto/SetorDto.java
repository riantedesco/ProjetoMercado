package com.compasso.ProjetoMercado.dto;

import com.compasso.ProjetoMercado.constants.NomeSetorOption;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SetorDto {

    private Long id;

    private NomeSetorOption nome;
}
