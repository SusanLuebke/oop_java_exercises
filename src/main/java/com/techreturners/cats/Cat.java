// By definition the blueprint for ALL cats is that they can do the following things:
//     * Eat
//     * Sleep
//     * Run

// They ALL have the following attributes
//     * A piece of data that says whether they are asleep or not 
//     * An average height represented in centimetres
//     * A piece of data that indicates their setting such as "domestic" or "wild"
//     * ALL cats go to sleep exactly the same way

// After a cat has eaten its food their reaction tends to differ between species
//     * A Lion will let out a victorious roar
//     * A cheetah will let out a snoring sound as it becomes tired following a chase
//     * A domestic cat tends to let our a purring sound

// As a bonus exercise some domestic cats will randomly let out a dismissive "It will do I suppose" comment following eating.
// We've created the Cat interface to get you started 
// ## Your solution should have...
// * The usage of a Java interface
// * The usage of a Java abstract class
// * The usage of encapsulation, abstraction, polymorphism and inheritance


package com.techreturners.cats;
interface Cat {
    public void eat();
    public void sleep();
    public void run();
}

interface Cat {
    let asleep = true;
    int height_cm = 24;
    String domOrWild = 'domestic or wild';
    String wayOfSleeping = "curled up";

}
