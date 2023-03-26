#### Difference between Anonymous Inner Class and Lambda Expression
- Anonymous Inner class is not same/equal to Lambda Expression.
- Anonymous Inner class is more powerful than Lambda Expression.

**Anonymous Inner Class :**
- Anonymous Inner class can extend a normal class.
- Anonymous Inner class can extend an abstract class.
- Anonymous Inner class can implement an interface which contains any number of abstract methods.

**Lambda Expression :**
- Lambda Expression can implement an Functional Interface (which contains single abstract method)

#### Default method() and Static method() 
- until JDK 1.7 :
    - Every method present inside the interface is always public static method OR abstract non-static method.
- In JDK 1.8 :
    - Default non-static method and  public static method is allow.
- In JDK 1.9 :
    - private method allows.
- Variables :
    - In all version variables are  public static final.

#### Default Method / Virtual Extension Method / Defender Method :
- Without effecting implementation classes if we want to add new method in interface then we should go for Default method.

#### Static Method 
- Interface is lighter than class.
- If you want to use only static types of method then we should go for interface.

**How to call static method if we are using interface ?**
```
interface Interf
{
    public static void m1(){
        System.out.println("Interface Static Method");
    }
}
class Test implements Interf
{
    public static void main(String[] args){
        Interf.m1();  // InterfaceName.methodName
        m1();         // CTE
        Test.m1();    // CTE

        Test t = new Test();
        t.m1()                // CTE 
    }
}

```
- for calling static method in interface we should use only __InterfaceName.staticMethodName()__
- We can using main(String[]args) method in interface from JDK 1.8
- If there is no instance/non-static method is using then we should go for interface from JDK 1.8
