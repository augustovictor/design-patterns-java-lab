# design-patterns-java-lab

## Creational
How objects are created

### Singleton
- We do not use a `static` classe since we need a thread safe object access and `static` class does not guarantee this for us;
- Private volatile instance
    - `volatile` ensures that the instance will remain a singleton through any of the changes inside the JVM;
- Private constructor
- No params given since it would be a factory pattern and violate the singleton pattern;

## Structural
How objects connect to each other

## Behavioral
How objects distribute work