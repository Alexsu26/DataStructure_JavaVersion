# DataStructure
 记录学习代码

## pass by value
1. 若要交换两个对象的值，不能用下列的方法：
```java
public static void switchX(class A, class B) {
    class temp = A;
    A = B;
    B = temp;
}
```
原因在于只在方法内部交换了形参的指向，而非实参的指向
2. 对于for-each遍历，只能访问每个值而不能修改每个值

## static
1. `static`类型的变量，是针对类的，类的每个实例都共享这个静态变量；  
而`non-static`类型或者叫`instance`类型的变量，是针对实例的，每个实例
有其独一无二的实例变量值
2. 实例可以访问静态变量和方法，同时也可访问实例变量和方法；   
而类只能访问静态变量和方法
3. 构造函数能够访问静态变量和实例变量

## git相关
> git status : 查看仓库状态
> git add file.type : 打上时间戳
> git commit -m “” ：提交
> git log ：查看所有提交
> cat file.type : 查看文件
> cp file.type ./file.type : 复制文件到指定路径
> git checkout logName ：回到指定时间
> git checkout master ：回到当下
> echo “String” >> file : 在文件末添加String 
> echo "String" > file : 用String覆盖文件
> git checkout logName -- fileName : 让文件恢复到指定时间