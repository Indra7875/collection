#### Functional Interface :
- Runnable ==> run()
- Comparable ==> compareTo()
- Comparator ==> compare()
- ActionListener ==> actionPerformed()
- Callable ==> call()
- Functional interface contains only single abstract method.
- If you want to invoke/call the lambda expression then it's compulsory functional interface is required.
- Functional Interface contains exact one abstract method but any number of default and static methods.
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
package programs.Java8Features_Programs.LambdaExpression_Programs;

public interface Bank {
    public void sendMoney();
}

package programs.Java8Features_Programs.LambdaExpression_Programs;

public class HDFC implements Bank {

    @Override
    public void sendMoney() {
        System.out.println("sending money amount 50000");
    }
}
package programs.Java8Features_Programs.LambdaExpression_Programs;

public class TestWithLambda {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        hdfc.sendMoney();
    }
}
```
**Lambda Expression with Functional Interfaces :**
```
package programs.Java8Features_Programs.LambdaExpression_Programs;

public interface Bank {
    public void sendMoney();
}
package programs.Java8Features_Programs.LambdaExpression_Programs;

public class TestWithoutLambda {
    public static void main(String[] args) {
        Bank bank = () -> System.out.println("send money amount 10000");
        bank.sendMoney();
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
- Lambda expression is always associate with functional interface. If in the program functional interface is present then that time only we can use lambda expression.
- Without functional functional interface we can not use lambda expression.
