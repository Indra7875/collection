#### Java 17 New Features :
#### 1. Record Classes 
- The class is created only for data transfer purpose.
- Client --> request --> Server --> Database --> fetch the data --> stored in class (Created the object) --> send response to the client.
- This data transfer/storing object should immutable.
- This object only used for data storing purpose.
**Before Record class**
- For creating data transfer/ storing class we need to have 
- i) class
- ii) The private final variables 
- iii) For initializing final variables required argument constructor 
- iv) For print the object values required to override toString() method.
- v) To compare the object values required to override compare() & hasCode() method.

```

```

- For creating two variable it will take at least 40 lines of code

**Before Record class**
- For creating data transfer/ storing class we need to have only record class_name (arguments)
- 40 lines of code is replaced by only 1 line. 