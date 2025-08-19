[DataType]
1. what are 8 primitive types in Java? byte, short, int , long, float, double, character, boolean
2. What is String? 
    A String variable is a collection of character, a string is immutable.  
    String concatenation: you can use + operator, or APIs like StringJoiner, StringBuilder, StringBuffer


[OOP]
1. Overloading, overriding in Java?
   Overloading occurs at 'compile time' => relates to "method signature"
        Method Signature:
        Modifier_Access Return_Type Method_Name(Type para1, Type para2, ...)
                                       same      different
        public int sum(int a, int b);
        public int sum(int a, int b, int c);
        =>yes, they are overloading functions
   Overriding occurs at 'running time' => relates to "inheritance" principle in OOP
   As we know, Java support OOP , started from 'functional programming concept' >> method signature...

