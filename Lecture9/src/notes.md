# Abstraction

It is the hiding of internal complex implementation details , focusing  only on essential features

- Focus on Functionality : It focuses on what an object does , not how its done, through making clear interfaces
- for example : - (button to start a fan , it start the fan not how its started )

## Reduces complexity 
its reduces complexity, by showing only relevant information in class design 

## in java, Abtract keyword

In java abstract keyword is used to make non-instantiable classes ( only for extending not for making object)
Abstract

## Interfaces
it is next level of abstract

- if we only primarily declare abstract methods for implementation by the clases
- we use implements to use this instead of extends 
````
class Interaface Transport{
    public void commute();
    // no need to add abstract
}
````

```
//use implements to override and declare
class Car extends Vehicle implments Transport{

}
```

# Polymorphism
showing different form when in different situation or whos calling 
- ### Method overiding and Overloading
- Runtime polymorphism = authomatically takes the child class method even though the reference is from the Parent object
- Compile time overriding = using overide method


## Super
Super is used to access immediate parent class to access 

## Access level should always is increased not decreased while doing overrideing 
means if parent set it to public then we can't override to private or lower access in child class

## Final use in method
if didn't want method to be overridden then make it `final`

## Final use in class
if used with class then it can't have subclasses

    - using final is much helpful when compiler making assumption that it will not change accross whole program 

# Pass by Value 
the value is copied not sent to it 