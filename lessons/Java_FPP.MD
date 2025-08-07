L2: FUNDAMENTAL PROGRAMMING
Data Types: 
    8 primitive types (char, byte, short, int, long, float, double, boolean)
    Conversion between Numeric:
        1)conversion 'short' to 'int' == 'implicit conversion'
        2)conversion 'int' to 'short' == 'explicit conversion' => warning 'possible lossy conversion...'

Java Strings:
    String is immutable but to append text sequence easier => Java provides: StringJoiner, StringBuilder, StringBuffer
    Methods:
        charAt(),length(),substring, indexOf,startWith,+,equals
        split with expression multiple use pipe |: split(",| |\\.|;")
    String object (String name = new String("Hello"))&& String Literal (String name="Hello";).
    Regular Expression is used for 'text-search' or 'text-replace' operations. Java provides package util.regex
        containing these classes to perform all RegEx operations: Pattern, Matcher, PatternSyntaxException
        https://www.w3schools.com/java/java_regex.asp

Operator in Java:
    Arithmetic: + - * / %
    Increment & Decrement: ++, --
    Relational: == (equals), !=, <, <=, >, >=
    Logical: &&, ||, ! , .
    Bitwise operator: &(and),|(or),!(not),^(xor),<<(left shift),>>(right shift)
    Mathematical Constants: Math.PI, Math.pow(a,x), Math.sqrt(x)

Control Flow:
    Conditional logic
    Loop: for, while. for(; ;) == while(true){}
    switch statement
Arrays:
    Array copying: System.arraycopy()
    Array sorting: Arrays.sort(arr);