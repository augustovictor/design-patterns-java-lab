# design-patterns-java-lab

## Creational
How objects are created

### Singleton
- We do not use a `static` class since we need a thread safe object access and `static` class does not guarantee this for us;
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
    
### Proxy
- Used to solve Security, Simplify an interface to something, Remote service call, Cost (expensive object to create, so we can use a proxy to display a loading message), etc;
    - We access a real object through this interface;
- Interface by wrapping;
- Can add functionality (at compile time) but it is not its main purpose;
- It is an intermediary object that intercept calls (interface based) to another one (that does not have to be the same type of the proxy);
- Elements involved:
    - Client;
    - Interface;
    - Invocation handler;
    - Proxy;
    - Implementation;
- Drawbacks:
    - We can only have one proxy. So if we want to add a security and an auditing layer we have to implement these in the
    same proxy;
    
### Decorator
- Used to wrap an object to add functionality to it without affecting other parts of the hierarchy;
- Follows SRP (Single responsibility principle)
- Inheritance based;
    - Utilizes composition(has-a) and inheritance (is-a)
    - Alternative to subclassing;
- Elements involved:
    - Component (normally an interface but can also be an abstract class);
        - ConcreteComponent (what we decorate) (extend the component);
        - Decorator (the wrapper we extend and create other decorators from)(extend the component);
            - ConcreteDecorator;
- Drawbacks:
    - New class for every feature we want to decorate;
            
## Behavioral
How objects distribute work

### Template Method
- Build around a base abstract class which is responsible for calling a child class;
- Focused on a single algorithm but with different implementations;
- The algorithm is chosen in compile time;
- Improves code reuse
- Elements involved:
    - Abstract Base class
        - Has the entrypoint that is called by the concrete class;
    - Concrete Child class
    - Hooks (Can be overwritten)
    - Operations (Must be overwritten)
- Drawbacks:
    - Make sure to restrict access correctly;
    