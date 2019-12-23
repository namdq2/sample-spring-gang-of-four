package com.namdq.gof.chainofresponsibility.middleware;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@namdq.com")) {
            log.info("Hello, admin!");
            return true;
        }
        log.info("Hello, user!");
        return checkNext(email, password);
    }
}
