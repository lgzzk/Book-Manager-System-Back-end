package site.lgzzk.utils;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.UUID;

public class JwtUtil {
    private static long time = 1000 * 6 * 60 * 24;
    private static String signature = "lgzzk";

    public static String createToken() {
        JwtBuilder builder = Jwts.builder();
        String jwtToken = builder
                //header
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                //payload
                .claim("username", "lgzzk")
                .claim("role", "admin")
                .setSubject("jwt-test")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                .setId(UUID.randomUUID().toString())
                //signature
                .signWith(SignatureAlgorithm.HS256, signature)
                .compact();

        return jwtToken;
    }
}
