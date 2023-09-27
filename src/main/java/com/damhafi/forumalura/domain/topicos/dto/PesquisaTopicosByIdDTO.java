package com.damhafi.forumalura.domain.topicos.dto;

import java.time.LocalDateTime;

public record PesquisaTopicosByIdDTO(
        String id,
        String nome,
        LocalDateTime dataCriacao
) {
}
