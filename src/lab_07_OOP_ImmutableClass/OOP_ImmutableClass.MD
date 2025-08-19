A class whose objects are immutable : is called 'immutable class'.
An object whose states can't be changed after it is created: is called 'immutable object'

Benefit of Immutable Class: to create immutable object to be shared by different areas without worrying about data changing.

To create a class immutable, follow these steps:
1) declare class as 'final'
2) make all fields as 'private'
3) make all 'mutable fields' final
4) NO 'setter'
5) initialize all fields data at the time creating constructor


=========================================================================
final instance field == CONSTANT

