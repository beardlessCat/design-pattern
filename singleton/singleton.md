# 单例模式(singleton)
## 一、概述
单例模式，顾名思义就是只有一个实例，并且她自己负责创建自己的对象，这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
## 二、三要素
- 私有的构造方法
- 指向自己实例的静态引用
- 以自己实例为返回值的静态共有方法
## 三、实现方式
### 1.懒汉模式
```java
public class Singleton {
    // 将自身实例化对象设置为一个属性，并用static修饰
    private static Singleton instance;

    // 构造方法私有化
    private Singleton() {}

    // 静态方法返回该实例
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
- 是否 Lazy 初始化：是
- 是否多线程安全：否
- 实现难度：易

描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
### 2.双重检查锁模式
```java
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
```
- 是否 Lazy 初始化：是
- 是否多线程安全：是
- 实现难度：较复杂
- 
描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
getInstance() 的性能对应用程序很关键。
### 3.饿汉模式
```java
public class Singleton {
    // 将自身实例化对象设置为一个属性，并用static、final修饰
    private static final Singleton instance = new Singleton();
    // 构造方法私有化
    private Singleton() {}

    // 静态方法返回该实例
    public static Singleton getInstance() {
        return instance;
    }
}
```
- 是否 Lazy 初始化：否
- 是否多线程安全：是
- 实现难度：易

描述：这种方式比较常用，但容易产生垃圾对象。

优点：没有加锁，执行效率会提高。

缺点：类加载时就初始化，浪费内存。

它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
### 4.静态内部类
```java
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
```
- 是否 Lazy 初始化：是
- 是否多线程安全：是
- 实现难度：一般

描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
### 5.枚举类
```java
public enum Singleton {
    INSTANCE;
    public void whateverMethod() {
    }
}
```
- 是否 Lazy 初始化：否
- 是否多线程安全：是
- 实现难度：易
## 四、总结
推荐使用静态内部类方式创建单例对象
