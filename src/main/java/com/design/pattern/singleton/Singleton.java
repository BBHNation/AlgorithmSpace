package com.design.pattern.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Singleton {
  /**
   * 私有的构造函数，为的是在外部调用的时候，看不到构造函数
   * 只能使用暴露的静态函数来获取单例变量
   */
  private Singleton() {
    log.info("Singleton class loaded");
  }

  public static Singleton getInstance() {
    return SingletonEnum.INSTANCE.getInstance();
  }

  public void sayHello() {
    log.info("hello");
  }

  /**
   * 私有的一个枚举
   */
  private enum SingletonEnum {
    INSTANCE;

    private final Singleton instance;

    SingletonEnum() {
      log.info("SingletonEnum class loaded");
      instance = new Singleton();
    }

    public Singleton getInstance() {
      return instance;
    }
  }
}
