#### Primitive version of functional interfaces :
- In normal functional interface we use the non-primitive type of values like Integer, Float, Double.
- So each time boxing and un-boxing done at complier level.
- If we are sure to use the specific data type then we can go for non-primitive functional interfaces.

#### 1] Primitive Type Predicate Functional Interfaces
- It will accept only integer data type of values.
- i) IntPredicate
- ii) DoublePredicate
- iii) LongPredicate
  
```
package programs.Java8Features_Programs.Primitive_FI;

import java.util.function.IntPredicate;

public class Demo1_Primitive_Predicate_FI {
    public static void main(String[] args) {
        int [] values = {5,10,15,20,25,30,35,40,45,50};
        // IntPredicate
        IntPredicate check = i -> i%2 == 0;
        for (int i : values){
            if (check.test(i))
                System.out.println("Even value : "+i);
            else
                System.out.println("Odd value : "+i);
        }

    }
}

```
#### 2] Primitive Type Function Functional Interfaces
i) DoubleFunction :
    - input type --> double
    - return type --> any

ii) IntFunction :
    - input type --> int
    - return type --> any

iii) LongFunction :
    - input type --> long
    - return type --> any

iv) DoubleToIntFunction :
    - input type --> double
    - return type --> int
    - applyAsInt(double value) method

v) DoubleToLongFunction :
    - input type --> double
    - return type --> long
    - applyAsLong(double value) method

vi) IntToDoubleFunction :
    - input type --> int
    - return type --> double
    - applyAsDouble(int value) method

vii) IntToLongFunction :
    - input type --> int
    - return type --> long
    - applyAsLong(int value) method

viii) LongToIntFunction :
    - input type --> long
    - return type --> int
    - applyAsInt(long value) method

ix) LongToDoubleFunction :
    - input type --> long
    - return type --> double
    - applyAsDouble(long value) method

**Primitive Type BiFunction Functional Interfaces**
i) toIntBiFunction :
    - input type --> two input types, any
    - return type --> integer
    - applyAsInt(T t, U u) method

ii) toLongBiFunction :
    - input type --> two input types, any
    - return type --> long
    - applyAsLong(T t, U u) method

iii) toDoubleBiFunction :
    - input type --> two input types, any
    - return type --> double
    - applyAsDouble(T t, U u) method

**Other Type Function Functional Interfaces**
1) UnaryOperator<T>
- If we want to use same input & output type 
- It is child of Function

1) BinaryOperator<T>
- It contains two input type which are same as output type 
- If we want to use same input & output type 
- It is child of BiFunction<T,T,T>
- apply(value,value) method is present.

**Unary Primitive Type Function Functional Interfaces**
i) IntUnaryOperator
- If input & output both are integer type 
- applyAsInt(int value)

ii) LongUnaryOperator
- If input & output both are long type 
- applyAsLong(long value)

iii) DoubleUnaryOperator
- If input & output both are double type 
- applyAsDouble(double value)

**Binary Primitive Type Function Functional Interfaces**
i) IntBinaryOperator
- If two input & output both are integer type 
- applyAsInt(int value, int value)

ii) LongBinaryOperator
- If two input & output both are long type 
- applyAsLong(long value, long value)

iii) DoubleBinaryOperator
- If two input & output both are double type 
- applyAsDouble(double value, double value)


#### 3] Primitive Type Consumer Functional Interfaces
- for Consumer return type is void.
  
i) IntConsumer 
   - input type --> integer
   - accept(int value)

ii) LongConsumer 
   - input type --> long
   - accept(long value)

iii) DoubleConsumer 
   - input type --> double
   - accept(double value)

**Primitive Type BiConsumer Functional Interfaces**
i) ObjDoubleConsumer
   - input type --> object, double
   - accept(T t, double value)

ii) ObjIntConsumer
   - input type --> object, int
   - accept(T t, int value)

iii) ObjLongConsumer
   - input type --> object, long
   - accept(T t, long value)

#### 4] Primitive Type Supplier Functional Interfaces
- Supplier does not take any type of input, it having return type 

i) IntSupplier
   - return type --> int
   - getAsInt()

ii) LongSupplier
   - return type --> long
   - getAsLong()

iii) DoubleSupplier
   - return type --> double
   - getAsDouble()

iv) BooleanSupplier
   - return type --> boolean
   - getAsBoolean()
  