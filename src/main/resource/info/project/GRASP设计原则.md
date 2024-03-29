# GRASP（General Responsibility Assignment Software Pattern）是通用职责软件分配模式。

 GRASP的核心是自己干自己能干的事，自己只干自己的 事，也就是职责的分配和实现高内聚。用来解决面向对象设计的一些问题。
 GRASP提出了九大原则，下面笔者将对这九大设计原则做一一阐述。 

## 高内聚、低耦合（High Cohesion、Low Coupling） 

       在面向对象的程序设计时，小到一个类，大到一个功能模块，如果他们之间的相依性很高就会对整个软件的开发造成诸般障碍。
       例如：当你修改一个类或者某一个模 块的时候，相应的你要改动其他的与之相依赖的类和模块，使得程序很难维护；
       代码会变得很难理解，一个很单一的操作，就会涉及到很多程序之间相互调用；
       程序 更是难以复用，当你想复用一个类的时候，对应的与之想依赖的类或方法也会被陆陆续续的添加进来。 

        这就是我们为什么要遵循这一原则的原因，而高内聚和低耦合往往是伴随在一起出现的。
        低耦合其实就是两个类或模块之间联系的紧密程度，高内聚就是类中方法和 方法之间的职责相关性。
        要想避免低内聚、高耦合，解决办法就是既要降低因为一个类的变化而对另一个类产生的影响，
        又要保持类或模块是有重点的、可理解的、 可管理的并且支持低耦合的，也就是更加精确的给一个类或者模块分配职责。 

        高内聚和低耦合是软件开发中最重要的原则，grasp的其他模式也是以高内聚、低耦合原则为中心的。 

## 信息专家(Information Expert) 

        如何实现高内聚，也就是如何给类分配职责？我们要遵循的原则就是把职责分配给具有完成该职责信息的那个类。 

## 创建者（Creator） 

          如何分配创建对象的职责呢？原则就是当下列条件满足时（越多越好），由B创建A： 
   1.B频繁的使用A 
   2.B包含或聚合了A 

         举个简单的例子，如果类A实现了B接口，类C、D是类A的一个属性，那么C、D应该由A来创建，A应该由B来创建。
         如果C、D由B来创建，那么当C或者D改变的时候，B 和A也要跟着改变，大大增强了B和C、D的之间的耦合度，违背了低内聚的原则。
         通俗点说就是如果B使用的了A，那么就应该由B来创建A，而不是由其他的类来创建。 

## 控制器（Controller） 

        在UI层外，应该由哪个类来处理系统操作呢？原则就是把系统事件的处理职责分配给控制器类，
        这个控制器类就相当于MVC中的C。这个控制器类通常是系统事件放生 的用例的控制类。 

## 多态（Polymorphism） 

        根据类型的不同而发生变化行为的定义职责，应该分配给谁？ 

       举个简单的例子，坐车去广州，坐车算是一个行为，但是这个行为是可以变化的，比如坐飞机、坐汽车或者坐火车，那么坐车这个行为的定义应该分配给谁呢？ 

       原则是通过多态操作把基于类型的可变行为的定义职责分配给发生该行为的类。
       放到JAVA当中来实现就是定义一个坐车的接口，然后具体的坐飞机、坐汽车或者坐火 车的行为分别定义一个类来实现该功能，然后让这三个具体的类去实现坐车接口。 

## 纯虚构模式（Pure Fabrication） 

        非问题领域的职责应该分配给谁？ 

        我们在设计类的时候，通常都尽量的保持和现实世界当中的对象一致，那么我们从现实世界的对象抽象出来的类就叫做问题领域里的类，
        那么当我们保存这个对象的 时候要操作数据库，操作数据库就是一个非现实世界存在的业务对象，他就是非问题领域的职责。 

        这种职责分配的原则就是将非问题领域的职责分配给人工生成的类。比如问题领域的类通常是放到PO里面的，他不应该包括CRUD等操作。
        那么CRUD这些操作应该放 到一个人工生成的也就是我们在业务逻辑以外加的一个类。 

## 间接性（Indirection） 

        为了避免两个或多个事物之间直接耦合，应该如何分配职责？ 

        设计原则是将职责分配给中介对象。
        例如类A和类B是多对多的关联关系，当A改变的时候，B需要做相应的改变，当B改变的时候，A需要做相应的改变，
        这是违反低耦 合原则的，解决方法就是在A和B之间加入一个C类，类C的属性只有A和B，用C来记录A和B之间的关系，
        当A想使用B或者B使用A的时候，他们都通过C来调用对方。 

## 防止变异（Protected Variation） 

        如何设计对象、系统和子系统，使其内部的变化或者不稳定因素不会对其他元素产生不良影响？ 

        预计识别不稳定的因素，在其外部创建稳定的接口。
        例如：坐汽车去广州当中的坐汽车就是一个不稳定的因素，以后也许会坐飞机或者火车，
        那么我们就要把坐汽车 抽象出一个坐车的接口，当有一天想坐火车的时候直接加一个实现的类就可以了。 