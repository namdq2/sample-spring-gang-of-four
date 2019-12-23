package com.namdq.gof.chainofresponsibility;

import com.namdq.gof.chainofresponsibility.middleware.Middleware;
import com.namdq.gof.chainofresponsibility.middleware.RoleCheckMiddleware;
import com.namdq.gof.chainofresponsibility.middleware.ThrottlingMiddleware;
import com.namdq.gof.chainofresponsibility.middleware.UserExistsMiddleware;
import com.namdq.gof.chainofresponsibility.server.Server;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@Slf4j
class ChainOfResponsibilityTest {
    private static Server server;

    @BeforeAll
    public static void initAll() {
        server = new Server();

        server.register("admin@namdq.com", "admin_pass");
        server.register("user@namdq.com", "user_pass");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    @Test
    public void testLimitFail() {
        log.info(server.toString());

        String email = "admdsfin@namdq.com";
        String password = "admin_pass";

        boolean result = server.logIn(email, password);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testAdminPass() {
        log.info(server.toString());

        String email = "admin@namdq.com";
        String password = "admin_pass";

        boolean result = server.logIn(email, password);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testAdminFail() throws InterruptedException {
        log.info(server.toString());

        String email = "admin@namdq.com";
        String password = "admin1_pass";

        Thread.sleep(12_000);

        boolean result = server.logIn(email, password);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testUserPass() throws InterruptedException {
        log.info(server.toString());

        String email = "user@namdq.com";
        String password = "user_pass";

        Thread.sleep(12_000);

        boolean result = server.logIn(email, password);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void testUserFail() throws InterruptedException {
        log.info(server.toString());

        String email = "user@namdq.com";
        String password = "user22_pass";

        Thread.sleep(13_000);

        boolean result = server.logIn(email, password);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void testFail() throws InterruptedException {
        log.info(server.toString());

        String email = "namdq2@namdq.com";
        String password = "user22_pass";

        Thread.sleep(12_000);

        boolean result = server.logIn(email, password);
        Assertions.assertEquals(false, result);
    }
}
