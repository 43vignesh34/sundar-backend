package com.example.parent.demo.jwt;

import java.util.Date;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Jwts;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Instant;

public class JWTService {
    private final SecretKey signingKey = Jwts.SIG.HS256.key().build();

    public String generateToken(String email) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expiry = now.plusHours(1);
        ZonedDateTime zdt = expiry.atZone(ZoneId.of("Asia/Kolkata"));
        Instant i = zdt.toInstant();
        Date d = Date.from(i);
        ZonedDateTime zdt1 = now.atZone(ZoneId.of("Asia/Kolkata"));
        Instant i1 = zdt1.toInstant();
        Date d1 = Date.from(i1);
        return Jwts.builder().subject(email).issuedAt(d1).expiration(d).signWith(signingKey).compact();
    }
}