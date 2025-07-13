package com.cognizant.spring_learn;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/authenticate")
    public String authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.debug("Start");
        String user = getUser(authHeader);
        LOGGER.debug("User: {}", user);
        return "{\"token\":\"\"}";
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
}
