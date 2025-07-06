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
````$
class Interaface Transport{
    public void commute();
    // no need to add abstract
}
````