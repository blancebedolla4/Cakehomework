Chapter 3 primitives and references
Variables come in two flavors: primitive and reference.
Declaring a variable- java cares about type.
Compiler can spot most problems.
Example: Giraffe reference into Rabbit variable - what happens when 
someone tries to ask the so-called Rabbit to hop ()? it wont let you put a floating number into
an integer variable, unless it is ACKNOWLEDGED.

Primitives hold fundamental values- long, int,short,byte
Object references hold references to objects.
Variables must have a type and a name.

What can you use as names;
- it must start with a letter,underscore or dollar sign
- after the firdst characted you can use numbers, just do not start with a num
- it can be anything subject to those 2 rules just as long as it isn tone of Jva;s reserved words

What abour objects?
- theres no such thing as an object variable
- theres only an object reference variable
-  we cannot store objects in a variable, we use variables to point to where an object is in memory.
-  full of bits representing a way to get to the object
-  ex: myDog.bark() means use the objecy referenced by the variable myDog to invoke the bark() method.
-  objects live in the garbage collection heap when they do not have a reference.

  Arrays are objects regardkess whether they are declared to hold primitives values or object references.

Chaper 4 Methods Use Instance Variables

State (ivars )affects behavior (methods) and behaviors affect the state.
A class is the blueprint of an object, how the JVM should make an object of that type.
A method uses parameter. A caller passes arguments.
Methods can return values.
Whatever you say you'll give back, you better give back!
Constructors are special methods that create rules for creating objects from classes.
Keyword super() to call parent class constructor in the subclass constructor.
Super class constructor is ran before the subclass constructor.
Setters and getters lets you get and set thing  & are both contained in classes and usually manipulate the ivars of an object

Encapsulation is one of the four fundamental concepts of OOP
Hide data with protected and private access modifies
Starter rule of thmb;
mark your instance variables private and provide public getters and setters to access control.
Instance variables always get a default value
Local variables do NOT get a default value

Comparing variables (primitve or references
use == to compare two primitives, or to see if two references refer to the same object
use the equals() methods to see if two different objects are equal- checks the memory location of an object.



                                                                                                                                                                                                            


                                                                                                                                          
                                                                                                                                                      
