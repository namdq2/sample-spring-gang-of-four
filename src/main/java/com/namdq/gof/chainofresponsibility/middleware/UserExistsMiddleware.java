package com.namdq.gof.chainofresponsibility.middleware;

import com.namdq.gof.chainofresponsibility.server.Server;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        log.info(email + ' ' + password);

        if (!server.hasEmail(email)) {
            log.info("This email is not registered!");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            log.info("Wrong password!");
            return false;
        }

        return checkNext(email, password);
    }
}
