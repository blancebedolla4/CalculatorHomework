chapter 5 writing a program
                    java program should start with a high level design

    tipically youll have 3 when you create a new class; prepcode, test code, real (java) code.

    Prepcode should describe what to do, not how to do it. Implementation comes later.

    Use the prepcode to help design the test code

    Write test code before you implement the methods

    choose for loops over while loops when you know how many times you wany yo repeat the loop code

    use the pre/post increment operator to add 1 to a variable (x++;)

    use the pre/post decrement to subtract 1 from a variable (x --:)

    use Integer.parseInt() to get the int value of String

    Integer.paseInt() eorks only if Strings represents a digit ("0","1","2", etc)

    Use break to leave a loop early (even if the boolean test condition is still true)
    


Chapter 6 get to know the Java API pg 125

ArrayList is a class in the Java API

To out something into an ArrayList, use add()

To remove something from and ArrayList use remove()

To find out where something us (and if it is) in an ArrayList, use indexOf().

To find out ig an ArrayLiat is empty use isEmpty()

to get the size (number of elements) in a regular old array, remember, you use the length variable.

An ArrayList resizes dynamically to whatever size is needed. It grows when objects are added, and it shrinks when objects are removed.

you declare the tyoe of the array using a type parameter, which is a type name in angle brackets. Example: ArrayList<Button> means the ArrayList will be able to hokd only objects of type Button (or subclasses of Button)

Although an Array holds objects and not primitves, the compiler will automatically "wrap" and "unwrap" a primitive into an object and place that object in the ArrayList instead of the primitive

classes are grouped into packages

a class has a full name, which is a combination of the package name and the class name. Class ArrayList is really java.util.ArrayList

to use a class in a package other than java.lang you must tell java the full name of the class

you use either and import statement at the top of your source code or you can type the full name every place you use the class in your code.



Chapter 7 inheritance and polymorphism

A subclass extebds a superclass

A subclass inherits all public instance variables and methods of a super class but does nit inherit the private instance variables and methods of the superclass.

inherited methods can be overrriden; instance variables cannot be overriden(although they can be redefined in the subclass, but thats not the same thien, and theres almost never a need to do it.

Use tge IS-A test to verify that your inheritance hierachy is valid. If X extends Y, then X IS-A Y must make sense

The ISA-A rekationship works in only one direction. A hippo is an Animals, but not all Animals are Hippos.

When a method is overriden in a subclass and that methos is invoked on an instance of the subclass, the overriden version of the methos is called( the lowest one wins)

If class B extends A, and C extends B, class A IS-A class A, and class C IS-A class B, and class C also IS-A class A.




Chapter 8 interfaces and abstract classes

When you dont want a class to be instantiated (wghen you dont want anyone to make a new object of that class typr) mark the class with the abstract keyword.

An abstract class can have nboth abstract and non-abstract methods.

If a class has even one abstract method, th eclass must be marked abstract.

An abstract method has no body, and the declaration ends with a semicolon( no curly braces)

all abstract methods must be implemented in the first concrete subclass in the inheritance tree.

every class in Java is either a direct or inderect subclass of class Object (java.lang.Object)

Methids can be declared with Object arguments and/or return types

You can call methods in an object only if the methods are in the class (or interface) used as the reference variable type, regardless of the actual object type. So, a reference variable of type Object can be used only to call methods defines in class Object, regardless of the tyepe of the obvject to which the reference refers.

A reference variable type Object cant be assigned to any other reference type without a cast. A cast can be used to assign a reference variable of one type to a reference variable of a subtype, but at runtime the cast will fail if the object on th eheap is NOT a type compatible with the cast
Example Dog d = (Dog) x.getObject(aDog);

All objects come out of an ArrayList<Object> as type Object (meaning, they can be referenced only by an Object reference variable, unless you use a cast)

Multiple inheritance is not allowed in Java because of the problems  associated with the "Deadly Diamond of Death". That means you can extend only one class (i.e you can have only one immediate superclass)

An interface is like 100% pure abstract class. It defines only abstract methods.

Create an interface using the interface keyword instead of the word class

Implkement an interface using the keyword implements 
ex Dog implements Pet

your class can implement multiple interfaces

a class that implements an interface must implement all the methods of the interface, since all interface methods are implicitly public and abstract.

to invoke the superclass version of a method from a subclass thats overriden, use the super keyword.
ex: super.runReport();





Chapter 9 life and death of an object

Instance variables live within the object they belong to, on the Heap

if the instance variables is a reference ti an objecy, both the reference and the object it refers to are on the Heap.

A constructor is the code that runs when you say new on a class tyoe

a constructor must have the same name as the ckass, and must not have a return type

you can yse a constructor to initialize the state (ie. the instance variables) if the object being constructed

if you dont put a constructor in your class, the compiler withh put in a defautl constructor

the default constructor is always a no-arg constructor

if you put a contructor-any constructor- in your class, the compiler will not build the default constructor.

if you want a no-arg constructor, and youve already put in a constructor with arguments, youll have to build the no-arg contructor yourself

always provide a no-arg contructor if you can, to make it easy for programmers to make a working object. Supply default values

Overloaded constructors means you have more than one constructor in your class

Overloaded constructors must have different arguments lists

You cannot have teo constructors with the same argument lists. An argument list includes the order and/or type of arguments

Instance variables are assigned a default value, even when you dont explicitly assign one. The default values are 0/0.0/.false for primitives and null for references.





