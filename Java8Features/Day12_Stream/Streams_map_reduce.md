#### What is map-reduce ?
- Map-Reduce is the functional programming model it serves our two purpose.
- Map : Transforming the Data
- Reduce : Aggregating the Data
- (Combine the elements of stream and produce a single value)
- e.g. Stream : [2,4,6,9,1,3,7] sum of numbers present in the stream
   - map() : Transfer the stream of object into stream of int
   - reduce() : combine stream of int and produce the result.

**Reduce Method**
- T reduce (T identity, BinaryOperator<T> accumulator)
   - i) identity is initial value of type T
   - ii) accumulator is a function for combining two values.
- e.g. Integer sumResult = Stream.of(2,4,6,9,1,3,7).reduce(0,(a,b) -> a+b);
   - i) identity : 0 which is initial value
   - ii) accumulator : (a,b) -> a + b function  


