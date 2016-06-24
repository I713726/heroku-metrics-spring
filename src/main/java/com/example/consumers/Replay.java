package com.example.consumers;

import com.example.Route;

import java.util.Map;

public class Replay extends AbstractLogConsumer {

  public static void main(String[] args) {
    new Replay().start();
  }

  @Override
  public void receive(Route route) {
    String path = route.get("path");

    if (null == System.getenv("REPLAY_HOST")) {
      System.out.println("Simulating request: " + path);
    } else {
      // TODO
    }
  }

}
