package com.cognizant.spring_learn;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

//    @GetMapping("/authenticate")
//    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
//        LOGGER.info("Start");
//        LOGGER.debug("Authorization Header: {}", authHeader);
//
//        Map<String, String> map = new HashMap<>();
//        map.put("token", "");
//
//        LOGGER.info("End");
//        return map;
//    }

//    @GetMapping("/authenticate")
//    public String authenticate(@RequestHeader("Authorization") String authHeader) {
//        LOGGER.debug("Start");
//        String user = getUser(authHeader);
//        LOGGER.debug("User: {}", user);
//        return "{\"token\":\"\"}";
//    }

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.debug("Start authenticate");

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.debug("End authenticate");
        return map;
    }


    private String getUser(String authHeader) {
        LOGGER.debug("Start getUser");
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedString = new String(decodedBytes);
        String username = decodedString.split(":")[0];
        LOGGER.debug("Extracted Username: {}", username);
        return username;
    }

    private String generateJwt(String user) {
        LOGGER.debug("Start generateJwt");

        JwtBuilder builder = Jwts.builder();
        builder.setSubject(user);

        builder.setIssuedAt(new Date());

        builder.setExpiration(new Date((new Date()).getTime() + 1200000));
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");

        String token = builder.compact();

        LOGGER.debug("Generated Token: {}", token);
        return token;
    }
}
