#### Supplier FI
- It just supply required objects and other than that it won't take any input
- It contains only get() method.

```
interface Supplier<R>
{
    public R get();
}
```

```
// To generate Random number
Math.random();
0 <= x < 1

min = 0
max = 0.9999..

```
```
package programs.Java8Features_Programs.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {
    public static void main(String[] args) {

        // Supplier For Generate the Date
        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());

        // Supplier for Generate Random OTP
        Supplier<String> otpGenerate = () -> {
          String otp = "";
          for (int i = 1; i < 7; i++){
              otp = otp + (int) (Math.random()*10);
          }
          return otp;
        };
        System.out.println("Current OTP is "+ otpGenerate.get());
    }
}
```