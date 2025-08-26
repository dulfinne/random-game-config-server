package com.dulfinne.randomgame.randomgameconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RandomGameConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(RandomGameConfigServerApplication.class, args);
  }

}
