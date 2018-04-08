# design-patterns-java-lab

## Creational
How objects are created

### Singleton
- We do not use a `static` classe since we need a thread safe object access and `static` class does not guarantee this for us;
- Private volatile instance
    - `volatile` ensures that the instance will remain a singleton through any of the changes inside the JVM;
- Private constructor
- No params given since it would be a factory pattern and violate the singleton pattern;

### Factory Method
- It does not expose instantiation logic;
- The factory exposes a common interface and that's all the client knows about;


## Structural
How objects connect to each other

### Adapter
- Good to connect new code to legacy code without changing the contract originally created;
- Translates requests from the client to the code we're adapting to;
- Client, Adapter, Adaptee (Legacy);
- The adapter pattern does not adds functionality. It would be a `decorator` if it does;

## Behavioral
How objects distribute work