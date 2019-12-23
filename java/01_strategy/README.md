# Strategy

## Intent

*"Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently from clients that use it."*
~ **Design Patterns: Elements of Reusable Object-Oriented Software, 1994**

## Also Known As

Policy.

## Motivation

Pending.

<!-- insert a concrete example here -->

## Applicability

This pattern is used when:

- Many related classes differ only in their behavior.
- A variety of related algorithms is required.
- Algorithms use data that the client shouldn't know about.
- A class has many behaviors, and these appear as multiple conditionals in the code.

## Structure

![strategy](/java/01_strategy/strategy.png "Strategy")

## Participants

### Strategy

Declares a common interface for all the algorithms that will be supported.

### Concrete Strategy

Implementation of the algorithm.

### Context

Has a reference to a Strategy object. Can be configured with a Concrete Strategy.

## Collaborations

Pending.

<!-- insert UML sequence diagram here -->

## Consequences

- Helps to achieve the principle of "composition over inheritance" for code reuse.
- Avoids hard-wired behavior in a context, thus making code more flexible and easier to maintain.
- Helps to avoid the use of conditionals for selecting a behavior.
- The clients must know about the available strategies that can be used.
- The strategy object should not maintain a state, so it can be used in many invocations or by many contexts.

## Implementation

- The definition of the interfaces must allow the strategy to receive the information it requires from the context in an efficient manner, and vice versa.
- It should be possible to define a default strategy for concrete contexts, thus making configuration optional.
- It should be possible to change the strategy at run time.
