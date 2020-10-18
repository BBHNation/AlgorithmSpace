package com.design.pattern.singleton;

import org.junit.jupiter.api.Test;

class SingletonTest {
  @Test
  void testGetSingletonTest() {
    Singleton instance = Singleton.getInstance();
    instance.sayHello();
  }
}