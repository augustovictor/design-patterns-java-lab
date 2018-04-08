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

### Composite
- Treat components the same way (same interface). No matter whether they are parts or whole structure; It generalizes
a hierarchical structure;
- Composite objects into tree structures;
    - The root of the tree is a `component` which is an abstraction for `leafs` of `composite` objects;
        - Components are either a `leaf` or a `composite` of objects.
            - Both have the same operations;
            - Composite knows about its child components;
- Individual objects are treated as Composited objects;
- A drawback of this pattern is that it is difficult to specify what kind of objects cannot be part of the `composite`;
    - It will have to be done in Runtime instead of compile time safety;

## Behavioral
How objects distribute work