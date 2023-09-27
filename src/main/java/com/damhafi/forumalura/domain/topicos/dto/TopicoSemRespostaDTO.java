package com.damhafi.forumalura.domain.topicos.dto;

import com.damhafi.forumalura.domain.topicos.model.StatusTopico;

import java.time.LocalDateTime;

public record TopicoSemRespostaDTO(
        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        StatusTopico status,
        String autor,
        String curso
) {

}
