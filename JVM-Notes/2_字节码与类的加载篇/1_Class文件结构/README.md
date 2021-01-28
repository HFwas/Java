# Class文件结构

## 概述

### 字节码文件的跨平台性

Java语言：跨平台的语言(一次编译，到处运行)

- 当Java源代码成功编译成字节码后，如果想在不同的平台上面运行，则无须再次编译
- 这个优势不再那么吸引人了。 Python、PHP、Perl、Ruby、Lisp等有强大的解释器。
- 跨平台似乎已经快成为一门语言必选的特性

Java虚拟机：跨语言的平台

**Java虚拟机不和包括Java在内的任何语言绑定，它只与“ Class文件”这种特定的二进制文件格式所关联**。无论使用何种语言进行软件开发，只要能将源文件编译为正确的 Class文件，那么这种语言就可以在Java虚拟机上执行。可以说，统一而强大的Class文件结构，就是Java虚拟机的基石、桥梁

![image-20210128172706181](images/image-20210128172706181.png)

![image-20210128173318722](images/image-20210128173318722.png)

[Java语言虚拟机规范](https://docs.oracle.com/javase/specs/)

https://docs.oracle.com/javase/specs/

所有的JVM全部遵守Java虚拟机规范，也就是说所有的JWM环境都是一样的，这样一来字节码文件可以在各种JM上运行

**想要让一个Java程序正确地运行在JⅥM中，Java源码就必须要被编译为符合JWM规范的字节码**

- **前端编译器的主要任务**就是负责将符合Java语法规范的Java代码转换为符合JVM规范的字节码文件。
- Javac是一种能够将Java码编译为字节码的前端编译器。
- Javac编译器在将Java源码编译为一个有效的字节码文件过程中经历了4个步骤，分别是**词法解析、语法解析、语义解析以及生成字节码**

![image-20210128173837185](images/image-20210128173837185.png)

0racle的JDK软件包括两部分内容：

- 一部分是将java源代码编译成Java虚拟机的指令集的编译器
- 另一部分是用于实现Java虚拟机的运行时环境

### java的前端编译器

![image-20210128174204263](images/image-20210128174204263.png)

前端编译器vs后端编译器

Java源代码的编译结果是字节码，那么肯定需要有一种编译器能够将Java源码编译为字节码，承担这个重要责任的就是配置在path环境变量中的**jaνac编译器**。 Javac是一种能够将Java源码编译为字节码的**前端编译器**。

HotSpot VM并没有强制要求前端编译器只能使用 javac，编译字节码，其实只要编译结果符合WM规范都可以被WM所识别即可。
在Java的前端编译器领域，除了 Javac之外，还有一种被大家经常用到的前端编译器，那就是内置在 Eclipse中的**ECJ（ Eclipse Compiler for Java）**编译器。和 Javac的全量式编译不同，ECJ是一种增量式编译器

- 在 Eclipse中，当开发人员编写完代码后，使用“ctr1+s”快捷键时，ECJ编译器所釆取的**编译方案**是把未编译部分的源码逐行进行编译，而非每次都全量编译。因此ECJ的编译效率会比 Javac更加迅速和高效，当然编译质量和 Javac相比大致还是一样的。
- ECJ不仅是 Eclipse的默认内置前端编译器，在 Tomcat中同样也是使用ECJ编译器来编译jsp文件。由于ECJ编译器是釆用GPLv2的开源协议进行源代码公开，所以，大家可以登录Eclipse官网下载ECJ编译器的源码进行二次开发
- 默认情况下，IntelliJ IDEA使用 Javac编译器。（还可以自己设置为 AspectJ编译器ajc）

前端编译器并不会直接涉及编译优化等方面的技术，而是将这些具体优化细节移交给 Hotspot的JIT编译器负责。

复习：AOT（静态提前编译器， Ahead Of Time Compiler）

### 通过字节码执行看代码细节

BAT面试题

- 类文件结构有几个部分？
- 知道字节码吗？字节码都有哪些？ Integer x=5；inty=5；比较x==y都经过哪些步骤？

代码举例代码举例

```java
/**
 * @Author: HFwas
 * @Date: 2021/1/28
 * @Description: com.hfwas.java1.chapter01
 * @version: 1.0
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer x = 5;
        int y = 5;
        //true
        System.out.println(x == y);

        Integer num1 = 10;
        Integer num2 = 10;
        //true
        System.out.println(num1 == num2);

        Integer num3 = 128;
        Integer num4 = 128;
        //false
        System.out.println(num3 == num4);
    }
}
```

字节码文件：

```bash
 0 iconst_5
 1 invokestatic #2 <java/lang/Integer.valueOf>
 4 astore_1
 5 iconst_5
 6 istore_2
 7 getstatic #3 <java/lang/System.out>
10 aload_1
11 invokevirtual #4 <java/lang/Integer.intValue>
14 iload_2
15 if_icmpne 22 (+7)
18 iconst_1
19 goto 23 (+4)
22 iconst_0
23 invokevirtual #5 <java/io/PrintStream.println>
26 bipush 10
28 invokestatic #2 <java/lang/Integer.valueOf>
31 astore_3
32 bipush 10
34 invokestatic #2 <java/lang/Integer.valueOf>
37 astore 4
39 getstatic #3 <java/lang/System.out>
42 aload_3
43 aload 4
45 if_acmpne 52 (+7)
48 iconst_1
49 goto 53 (+4)
52 iconst_0
53 invokevirtual #5 <java/io/PrintStream.println>
56 sipush 128
59 invokestatic #2 <java/lang/Integer.valueOf>
62 astore 5
64 sipush 128
67 invokestatic #2 <java/lang/Integer.valueOf>
70 astore 6
72 getstatic #3 <java/lang/System.out>
75 aload 5
77 aload 6
79 if_acmpne 86 (+7)
82 iconst_1
83 goto 87 (+4)
86 iconst_0
87 invokevirtual #5 <java/io/PrintStream.println>
90 return
```

## 虚拟机的基石：Class文件

**字节码文件里是什么**？
源代码经过编译器编译之后便会生成一个字节码文件，字节码是一种二进制的类文件，它的内容是JVM的指令，而不像C、C+经由编译器直接生成机器码

**什么是字节码指令（ byte code）？**

Java虚拟机的指令由一个字节长度的、代表着某种特定操作含义的**操作码**（ opcode）以及跟随其后的零至多个代表此操作所需参数的**操作数**（ operand）所构成。虚拟机中许多指令并不包含操作数，只有一个操作码比如

![image-20210128191334441](images/image-20210128191334441.png)

**如何解读供虚拟机解释执行的二进制字节码？**

- 一个二进制的看。这里用到的是 Notepad++，需要安装一个HEX- Editor插件，或者使用 Binary Viewer 
- 使用javap指令，jdk自带的反解析工具
- 使用IDEA插件，jclasslib 或者 jclasslib bytecode viewer客户端工具

![image-20210128192022960](images/image-20210128192022960.png)

## Class文件结构

**官方文档位置**

https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-4html

**Class类的本质**

任何一个Class文件都对应着唯一一个类或接口的定义信息，但反过来说，Class文件实际上它并不一定以磁盘文件的形式存在。Class文件是一组以8位字节为基础单位的**二进制流**。

**Class文件格式**

Class的结构不像XML等描述语言，由于它没有任何分隔符号。所以在其中的数据项，无论是字节顺序还是数量，都是被严格限定的，哪个字节代表什么含义，长度是多少，先后顺序如何，都不允许改变

Class文件格式采用一种类似于C语言结构体的方式进行数据存储，这种结构中只有两种数据类型：**无符号数和表**

- 无符号数属于基本的数据类型，以u1、u2、u4、u8来分别代表1个字节、2个字节、4个字节和8个字节的无符号数，无符号数可以用来描述数字、索引引用、数量值或者按照UTF-8编码构成字符串值 
- 表是由多个无符号数或者其他表作为数据项构成的复合数据类型，所有表都习惯性地以“_info”结尾。表用于描述有层次关系的复合结构的数据，整个Class文件本质上就是一张表。由于表没有固定长度，所以通常会在其前面加上个数说明

代码举例：

```java
/**
 * @Author: HFwas
 * @Date: 2021/1/28
 * @Description: com.hfwas.java1.chapter01
 * @version: 1.0
 */
public class Demo {
    private int num = 10;

    public int add(){
        num = num + 2;
        return num;
    }
}
```

换句话说，充分理解了每一个字节码文件的细节，自己也可以反编译出Java源文件来

**Class文件结构概述**

Class文件的结构并不是一成不变的随着Java虐拟机的不断发展，总是不可避免地会对Class文件结构做出一些调整，但是其基本结构和框架是非常稳定的

**Class文件的总体结构如下:**

- 魔数
- Class文件版本
- 常量池
- 访问标志
- 类索引，父类索引，接口索引集合
- 字段表集合
- 方法表集合
- 属性表集合

![image-20210128194847899](images/image-20210128194847899.png)

![](images/image-20210128195243244.png)

这是一张Java字节码总的结构表，我们按照上面的顺序逐一进行解读就可以了



### 魔术：Class文件的标志

每个Class文件开头的4个字节的无符号整数称为魔数（ Magic Number）
它的唯一作用是确定这个件是否为一个能被虚拟机接受的有效合法的C1as文件。即：魔数是C1as文件的标识符

魔数值固定为0xCAFEBABE。不会改变

如果一个C1ass文件不以 XCAFEBABE开头，虚拟机在进行文件校验的时候就会直接抛出以下错误

![image-20210128200134516](images/image-20210128200134516.png)

使用魔数而不是扩展名来进行识别主要是基于安全方面的考虑，因为文件扩展名可以随意地改动

### Class文件版本号

紧接着魔数的4个字节存储的是Class文件的版本号。同样也是4个字节。第5个和第6个字节所代表的含义就是编译的副版本号 mInor_ version，而第7个和第8个字节就是编译的主版本号 major_version

它们共同构成了class文件的格式版本号。譬如某个Class文件的主版本号为M，副版本号为m，那么这个Class文件的格式版本号就确定为M.m

版本号和Java编译器的对应关系如下表

![image-20210128200422890](images/image-20210128200422890.png)

Java的版本号是从45开始的，JDK1.1之后的每个DK大版本发布主版本号向上加1

**不同版本的Java编译器编译的Class文件对应的版本是不一样的。目前，高版本的Java虚拟机可以执行由低版本编译器生成的Class文件，但是低版本的java虚拟机不能执行由高版本编译器生成的Class文件。否则JVM会抛出ava.lang. UnsupportedClassVersionError异常**(向下兼容)

在实际应用中，由于开发环境和生产环境的不同，可能会导致该问题的发生。因此，需要我们在开发时，特别注意开发编译的JDK版本和生产环境中的JDK版本是否一致。

- 虚拟机JDK版本为1.k（k>=2）时，对应的c1ass文件格式版本号的范围为45.0-44+k.0（含两端）

### 常量池：存放所有常量

常量池是Class文件中内容最为丰富的区域之一。常量池对于Class文件中的字段和方法解析也有着至关重要的作用。

随着Java虚拟机的不断发展，常量池的内容也日渐丰富。可以说，常量池是整个Class文件的基石

![image-20210128201620970](images/image-20210128201620970.png)

在版本号之后，紧跟着的是常量池的数量，以及若干个常量池表项

常量池中常量的数量是不固定的，所以在常量池的入口需要放置一项u2类型的无符号数，代表常量池容量计数值（
constant_ pool count）。与java中语言习惯不一样的是，这个容量计数是从1而不是0开始的

![image-20210128203045984](images/image-20210128203045984.png)

由上表可见，Class文件使用了一个前置的容量计数器（ constant_ pool_count）加若干个连续的数据项（ constant_poo1）的形式来描述常量池内容。我们把这一系列连续常量池数据称为常量池集合

- **常量池表项**中，用于存放编译时期生成的各种**字面量**和**符号引用**，这部分内容将在类加载后进入方法区的**运行时常量池**中存放

#### 常量池计算器

由于常量池的数量不固定，时长时短，所以需要放置两个字节来表示常量池容量计数值。
常量池容量计数值（u2类型）：**从1开始**，表示常量池中有多少项常量。即 constant_ pool count=1表示常量池中有0个常量项

Demo的值为:

![image-20210128203340046](images/image-20210128203340046.png)

其值为0x0016，掐指一算，也就是22

需要注意的是，这实际上只有21项常量。索引为范围是1-21.为什么呢？

> 通常我们写代码时都是从0开始的，但是这里的常量池却是从1开始，因为它把第0项常量空岀来了。这是为了满足后面某些指向常量池的索引值的薮据在特定情况下需要表达"不引用任何一个常量项目"的含义，这种情况可用索引值0来表示

#### 常量池表

constant_pool是一种表结构，以1~ constant_pool_count - 1为索引。表明了后面有多少个常量项。

常量池主要存放两类常量：**字面量**（ Litera1）和**符号引用**（ Symbolic References）

它包含了c1ass文件结构及其子结构中引用的所有字符串常量、类或接口名、字段名和其他常量。常量池中的每一项都具备相同的特征。第1个字节作为类型标记，用于确定该项的格式，这个字节称为 tag byte（标记字节、标签字节）



##### 字面量和符号引用

在对这些常量解读前，我们需要搞清楚几个概念。
常量池主要存放两大类常量：字面量（ Litera1）和符号引用（ Symbo1 ic References）。如下表

![image-20210128204224687](images/image-20210128204224687.png)

**全限定名**

com/ atguigu/test/Dem这个就是类的全限定名，仅仅是把包名的”."替换成"/"，为了使连续的多个全限定名之间不产生混淆，在使用时最后一般会加入一个“；”表示全限定名结束

**简单名称**

简单名称是指没有类型和参数修饰的方法或者字段名称，上面例子中的类的add（）方法和num字段的简单名称分别是add和num

**描述符**

**描述符的作用是用来描述字段的數据类型、方法的参数列表（包括数量、类型以及顺序）和返回值**。根据描述符规则，基本数据类型
（byte、char、 double、 float、int、1ong、 short、 boolean）以及代表无返回值的void类型都用一个大写字符来表示，而对象类型则用字符L加对象的全限定名来表示，详见下表

![image-20210128204734833](images/image-20210128204734833.png)

用描述符来描述方法时，按照先参数列表，后返回值的顺序描述，参数列表按照参数的严格顺序放在一组小括号“（）”之内。如方法java.lang. String toString（）的描述符为（） Ljava/lang/ String；，方法 int abc（int[] x,inty）的描述符为（[II）I。

**补充说明：**
虚拟机在加载Class文件时才会进行动态链接，也就是说，C1ass文件中不会保存各个方法和宇段的最终内存布局信息，因此，这些宇段和方法的符号引用不经过转换是无法直接被虚拟机使用的。**当虚拟机运行时，需要从常量池中获得对应的符号引用，再在类加载过程中的解析阶段将其替换为直接引用，并翻译到具体的内存地址中**

这里说明下符号引用和直接引用的区别与关联：

- 符号引用：符号引用以组符号来措述所引用的目标，符号可以是任何形式的字面量，只要使用时能无歧义地定位到目标即可。符号引用与虚拟机实现的内存布局无关，引用的目标并不一定已经加载到了内存中。
- 直接引用：直接引用可以是直接**指向目标的指针、相对偏移量或是一个能间接定位到目标的句柄。直接引用是与虚拟机实现的内存布局相关的，**同一个符号引用在不同虚拟机实例上翻详译出来的直接引用一般不会相同。如果有了直接引用，那说明引用的目标必定已经存在于内存之中了

##### 常量类型和结构



##### 字面量和符号引用



##### 常量类型和结构



### 访问标识

### 类索引，父类索引，接口索引集合

### 字段表集合

### 方法表集合



#### 方法计数器



#### 方法表



### 属性表集合

#### 属性计数器



#### 属性表



### 小结

## 使用javap指令解析Class文件

### javap的用法

### 使用举例

### 总结



![image-20210128171247740](images/image-20210128171247740.png)



