# Bank Card Demo

A small Java project that demonstrates a simple banking card model using interfaces and classes.

## Overview

This project contains a basic `Bank` package with examples of:

- A readable card abstraction
- A mutable card that supports deposits and withdrawals
- A read-only card implementation
- A simple `Main` class that demonstrates usage

The project is intended as a simple Java practice example for object-oriented programming concepts such as interfaces, encapsulation, constructors, validation, and method overriding.

## Project Structure
```
 src/ 
    └── Bank/ 
    ├── Bank.java 
    ├── Card.java 
    ├── Main.java 
    ├── ReadableCard.java 
    └── ReadOnlyCard.java```
```
## Classes

### `ReadableCard`

An interface that defines read-only access to card information.

It provides:

- `getName()`
- `getAmount()`

### `Card`

A mutable card implementation.

It supports:

- Reading the card name
- Reading the current amount
- Depositing money
- Withdrawing money

Validation is included to prevent:

- Negative starting balances
- Non-positive deposits
- Non-positive withdrawals
- Withdrawals greater than the current balance

### `ReadOnlyCard`

A read-only implementation of `ReadableCard`.

It allows the card name and amount to be viewed, but does not provide deposit or withdrawal methods.

### `Bank`

A simple class that can display the amount stored on any `ReadableCard`.

### `Main`

Demonstrates creating and using cards.

Example behavior:
```

text Main card: 1300 Read-only card: 1000``` 

## Requirements

- Java SDK 26 or later
- IntelliJ IDEA or another Java-compatible IDE

## How to Run

From the project root, compile the source files:
```

bash javac -d out src/Bank/*.java```

Then run the program:
```

bash java -cp out Bank.Main``` 

## Example Usage
```

java Card card = new Card("Main card", 1000);
card.deposit(500); card.withdraw(200);
System.out.println(card.getName() + ": " + card.getAmount());```

Output:
```

text Main card: 1300``` 

## Notes

This project is intentionally simple and focuses on core Java concepts. It does not include persistence, user authentication, transaction history, or real banking functionality.
```
