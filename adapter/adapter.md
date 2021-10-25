# 适配者模式(adapter)
##一、概述
### 1.描述
用适配器（Adepter）去将目标（Target）和被适配者（Adeptee）两者联系起来，从而使得Target可以使用Adeptee中的属性方法。

对象适配器与类适配器实现的一个重点就是在适配器中重写目标（Target）的方法，使得调用Target的方法可以调用Adeptee。
### 2.分类
主要分为类适配器及对象适配器
## 二、示例
### 1.类适配器
### 2.对象化适配器
## 三、典型案例
### 1.背景描述
当前系统缓存功能只有Memcached,由于各种原因，需要增加redis作为缓存。
### 2.各个角色
- MemcachedCach：系统中的老接口，也是该设计模式中的被适配者。
- MemcachedCachAdapter：适配器，用于进行新老接口的适配。
- PlateCach：适配者接口。
- AbstractPlateCach：适配者抽象类，用于处理接口中的部分公告逻辑。
- RedisCach：新的redis缓存实现类
- AdapterTest：模拟调用端
## 四.应用场景
