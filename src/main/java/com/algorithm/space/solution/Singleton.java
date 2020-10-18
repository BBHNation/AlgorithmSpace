package com.algorithm.space.solution;
//懒汉模式
//public class Singleton {
//    private Singleton(){}
//    private static Singleton instance = null;
//
//    public static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}

//饿汉模式
//public class Singleton {
//    private Singleton(){}
//    private static Singleton instance = new Singleton();
//
//    public static Singleton getInstance(){
//        return instance;
//    }
//}

//线程安全的单例模式
//public class Singleton {
//    private Singleton(){}
//    private static Singleton instance = null;
//
//    public static Singleton getInstance(){
//        if(instance == null){//双重检测机制
//            //同步锁，防止new Singleton被执行多次，因此在new操作之前加上Synchronized 同步锁，锁住整个类
//            synchronized (Singleton.class){
//                //因为当两个线程同时访问的时候，线程A构建完对象，线程B也已经通过了最初的判空验证，不做第二次判空的话，线程B还是会再次构建instance对象。
//                if(instance == null){ //双重检测机制
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//}

//真正意义线程安全的单例模式
//防止指令重排
//instance对象的引用要么指向null，要么指向一个初始化完毕的Instance，而不会出现某个中间态，保证了安全
//public class Singleton {
//    private Singleton(){}
//    private volatile static Singleton instance = null;
//
//    public static Singleton getInstance(){
//        if(instance == null){//双重检测机制
//            //同步锁，防止new Singleton被执行多次，因此在new操作之前加上Synchronized 同步锁，锁住整个类
//            synchronized (Singleton.class){
//                //因为当两个线程同时访问的时候，线程A构建完对象，线程B也已经通过了最初的判空验证，不做第二次判空的话，线程B还是会再次构建instance对象。
//                if(instance == null){ //双重检测机制
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//}

//用静态内部类实现单例模式，相比于前面的方式更巧妙
//利用classloader的加载机制来实现懒加载，并保证构建单例的线程安全
//但是无法防止利用反射来重复构建对象
//public class Singleton {
//    private Singleton(){}
//    private static class LazyHolder{
//        private static final Singleton INSTANCE = new Singleton();
//    }
//    private static Singleton instance = new Singleton();
//
//    public static Singleton getInstance(){
//        return LazyHolder.INSTANCE;
//    }
//}

//用枚举实现单例模式可以防止利用反射重复构建对象，但是并非懒加载，是在枚举类被加载的时候初始化的
//enum语法糖的存在使JVM反射的方式获取枚举类的私有构造方法
//public enum SingletonEnum {
//    INSTANCE;
//}