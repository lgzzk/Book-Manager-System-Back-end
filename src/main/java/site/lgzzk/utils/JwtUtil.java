package site.lgzzk.utils;

import io.jsonwebtoken.*;

import java.util.Date;
import java.util.UUID;

public class JwtUtil {
    private static final String signature = "lgzzk.site";

    public static String createToken(String name) {
        JwtBuilder builder = Jwts.builder();
        long time = 1000 * 60 * 60 * 24;
        String jwtToken = builder
                //header
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                //payload
                .claim("username", name)
                .claim("role", "admin")
                .setSubject("jwt-lgzzk")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                .setId(UUID.randomUUID().toString())
                //signature
                .signWith(SignatureAlgorithm.HS256, signature)
                .compact();

        return jwtToken;
    }

    public static boolean checkToken(String token){
        try {
            JwtUtil.parseToken(token);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static String parseToken(String token) {
        JwtParser parser = Jwts.parser();
        Jws<Claims> claimsJws = parser.setSigningKey(signature)
                .parseClaimsJws(token);
        Claims body = claimsJws.getBody();
        return body.toString();
    }
}
