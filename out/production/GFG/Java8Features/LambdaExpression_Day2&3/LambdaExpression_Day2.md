#### 1. Lambda Expression :
- 1930
- LISP language
- python,LISP,C,C++,Ruby,Scala, finally in java also
- The main objective of Lambda Expression is to bring benefits of functional programming into java.

**What is the Lambda Expression ?**
- It is an anonymous function.
     - Nameless / No Name
     - without return type / No return type
     - without modifiers / No modifiers
- It is very useful in collection library. It helps to iterate, filter and extract data from collection.

**Example1 :**
``
public void m1(){
    System.out.println("Hello");
}
``
``
() -> {System.out.println("Hello");}
``
- If multiples lines is there then we can use {} otherwise it's optional.

``
() -> System.out.println("Hello");
``
**Example2 :**
``
public void m1(int a, int b){
    System.out.println(a+b);
}
``
``
(int a, int b) -> System.out.println(a+b);
``
``
(a,b) -> System.out.println(a+b);
``

**Example3 :**
``
public int squareIt(int n){
    return n * n;
}
``
``
(n) ->{return n * n};
``
- If in {} we are returning some value the it is mandatory to use return keyword to return the value.
- If there are no {} then it will automatically return the value.
- Without curly braces we can not use return keyword.
- Within curly braces if we want to return some value compulsory we should return statement.
- If only one value is there inside the () then () is optional.

``
n -> n * n;
``
**Note :**
* n -> return n*n; ===> Invalid
* n -> {return n*n;}; ===> Valid
* n -> {return n*n}; ===> Invalid
* n -> {n*n;}; ===> Invalid
* n -> n*n; ===> Valid 


**Example4 :**
``
public int stringLength(String s){
    return s.length();
}
``
``
s -> s.length();
``
