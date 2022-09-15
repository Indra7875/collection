#### Functional Interface :
- Runnable ==> run()
- Comparable ==> compareTo()
- Comparator ==> compare()
- ActionListener ==> actionPerformed()
- Callable ==> call()
- Functional interface contains only single abstract method.
- If you want to invoke/call the lambda expression then it's compalsury functional interface is required.
- Functional Interface contains execat one abstract method but any number of default and static methods.
- @FunctionalInterface Annotation is there to specify Functional Interface.

**Example 1 for valid Functional Interface**
```
@FunctionalInterface
interface A
{
    public void m1();
}
@FunctionalInterface 
interface B extends A
{

}
```
**Example 2 for valid Functional Interface**
```
@FunctionalInterface
interface A
{
    public void m1();
}
@FunctionalInterface 
interface B extends A
{
     public void m1();
}
```
**Example 3 for Invalid Functional Interface**
```
@FunctionalInterface
interface A
{
    public void m1();
}
@FunctionalInterface 
interface B extends A
{
     public void m2();
}
```
**Example 4 for valid Functional Interface**
```
@FunctionalInterface
interface A
{
    public void m1();
}
interface B extends A
{
     public void m1();
}
```

#### Example 1 : 
**Lambda Expression without Functional Interfaces :**
```
interface Interf1
{
    public void m1();
}
class Demo implements Interf1
{
    public void m1(){
        System.out.println("Hello...");
    }
}
class Test
{
    public static void main(String[]args){
        Demo d = new Demo();
        d.m1();
    }
}
```
**Lambda Expression with Functional Interfaces :**
```
interface Interf1
{
    public void m1();
}
class Test
{
    public static void main(String [] args){
        Interf i = () -> System.out.println("Hello...By Lambda Expression");
        i.m1();
    }
}
```
#### Example 2 : 
**Lambda Expression without Functional Interfaces :**
```
inteface Interf2
{
    public void add (int a,int b);
}

class Demo implements Interf2
{
    public void add (int a, int b){
        System.out.println("The Sum :"+(a+b));
    }
}

class Test
{
    public static void main(String[]args){
        Interf i = new Demo();
        i.add(10,20);
    }
}
```
**Lambda Expression with Functional Interfaces :**
```
interface Interf2
{
    public void add(a,b);
}
class Test
{
    public static void main(String[]args){
        Interf i = (a,b) -> System.out.println("The Sum :"+(a+b));
        i.add(10,20);
    }
}
```
**Note :**
- Lambda expression is always assosiate with functional interface. If in the program functional interface is present then that time only we can use lambda expression.
- Witeout functional functional interface we can not use lambda expression.
