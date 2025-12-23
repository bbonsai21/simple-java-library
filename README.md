# Simple Java library

---

This library's purpose is simply showing off to myself that I can make an extremely basic library.<br>
<br>

## How does it work?

In this program, a library is a class with the variable `static private HashMap<Integer, Resource> resources`.<br>
`Resource` is an abstract class implementing `Serializable` (used, then, to save to disk the library), that is concretised 
via `Book` and `Magazine`.<br>
Each of these classes have their methods and variables, and a few common ones.<br>
<br>

## How to run?

In a folder:<br>
```bash
git clone https://github.com/bbonsai21/simple-java-library
cd simple-java-library
javac *.java
```
<br>
To run the program:<br>
```bash
java Main
```
<br>

## Final notes

This program does NOT take any input from the final user running it in the console. This is because I was too lazy to implement a system, even though it's pretty easy, but I considered it to be pointless for such an easy project.
