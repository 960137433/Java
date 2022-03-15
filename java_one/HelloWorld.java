public class Welcome{
	public static void main(String[] args){
		System.out.println("hello world!");
	}
}

class Car{}

/*
==== 操作====
1、cmd运行命令：javac HelloWorld.java
运行之后会生成字节码文件：HelloWorld.class

2、生成字节码文件后，cmd运行命令：java HelloWorld
机器会打印出结果：hello world!

3、修改原文件后，需要重新编译生成class文件，否则运行结果还是不变

==== 说明====
1、一个源文件中，只能声明一个public的类，但是可以包含多个class

2、多个class时，编译时会生成多个class文件

3、文件名必须和public class 的类名保持一致

4、main方法是程序执行的入口，它的固定写法是
public class void main(String[] args){......}

5、每个语句以分号结束，所以一个语句可以跨多行，看到分号才结束

*/
