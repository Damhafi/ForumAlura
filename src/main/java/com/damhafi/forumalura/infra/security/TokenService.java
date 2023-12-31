package com.damhafi.forumalura.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.damhafi.forumalura.domain.usuarios.model.Usuario;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

  @Value("${api.security.token.secret}")
  private String secret;

  public String generateToken(Usuario usuario) {
    try {
      Algorithm algorithm = Algorithm.HMAC256(secret);
      String token = JWT
        .create()
        .withIssuer("ForumAlura")
        .withSubject(usuario.getEmail())
        .withExpiresAt(timeExpiracao())
        .sign(algorithm);
      return token;
    } catch (JWTCreationException exception) {
      throw new RuntimeException("Erro na hora de gera o  token", exception);
    }
  }

  public String validarToken(String token) {
    try {
      Algorithm algorithm = Algorithm.HMAC256(secret);
      return JWT
        .require(algorithm)
        .withIssuer("ForumAlura")
        .build()
        .verify(token)
        .getSubject();
    } catch (JWTCreationException exception) {
      return "";
    }
  }

  private Instant timeExpiracao() {
    return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
  }
}
