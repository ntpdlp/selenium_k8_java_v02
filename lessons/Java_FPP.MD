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

==========================================================================================
L3: OBJECTS & CLASS
The Object-Oriented Paradigm:
    Thinking of every object as providing a set of services which are specified in its interface.
    A Class defines the "properties" and "behaviors" for objects.
    A Class is a model, template or blue print from which obj are created.

OO Concept:
Encapsulation: obj interact with other obj via their interfaces (providing list of services). 
               The data that obj owns and
               the way that it manages that data are hidden from view (information hiding)
Inheritance:
Modifiers: are used to indicate the visibility of attribute/methods of an object

Template for User-Defined Class
    Creating new object
    Access data and operation in an obj
    Access modifier
    Destroy obj: There is no destructors in Java, JVM provides a garbage collector
Example some classes in Java library: Date, GregorianCalendar, LocalDate
The 'this' keyword
Mutators(setters) and Accessors(getters): important example of 'public method'
How to make a Class Immutable *****STOP HERE****
Boxed Primitives and Autoboxing
Enum Constants
Static field and method
How obj and variable are stored in Memory
Call by Reference vs Call by Value
Import class
Principles of Good Class Design