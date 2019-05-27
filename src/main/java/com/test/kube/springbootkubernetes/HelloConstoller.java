package com.test.kube.springbootkubernetes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloConstoller {

    @RequestMapping("/hello")
    public String hello() {
        StringBuilder message = new StringBuilder("Workshop Kubernetes e Spring Boot UPDATE!");
        try {
            InetAddress ip = InetAddress.getLocalHost();
            message.append(" From host aqui: " + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return message.toString();
    }
}
