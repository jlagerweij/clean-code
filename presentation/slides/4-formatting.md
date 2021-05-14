## Formatting & comments

----
# Team work

It's all about team work

Don't code

Communicate!

----
## Don't code, Communicate

- Respect your readers
    - Details matter: 10x more reading, remember?

- Write literature
    - The simplest code that works
    - Never obfusicate

- Simplicity is the ultimate sophistication

----
TODO: insert car image here

----
# Master your IDE

Learn those shortcuts!
- Key Promotor X (IntelliJ IDEA)

Sharpen your reflexes for real races

----
When it's red, yellow, blue or gray,

Alt-Enter will save your day. <!-- .element: class="fragment" -->

----
# Comments

Often used to cover code smells

----

<div class="left f5">

- Readable Constants

    - Instead of magic numbers

- Explanatory variables

    - Name intermediary result
    - if (multiline &&
      (conditions || formulas))

- Explanatory methods

    - Encapsulate conditionals

- Rename and Extract

    - Descriptive names
</div>

<div class="right f4">

```
public List<int[]> getCells() {  
  List<intp[> list1 = new ArrayList<>();
  for (int[] x : theList)
    if (x[0] == 4) list.add(x);
  return list1;
}
```
```
public List<int[]> getFlaggedCells() {  
  List<intp[> flaggedCells = new ArrayList<>();
  for (int[] cell : gameBoard) {
    boolean isFlagged = cell[STATUS]==FLAGGED;
    if (isFlagged) 
      flaggedCells.add(x);
  }
  return flaggedCells;
}
```
</div>


----
# Opinions?

```
// Register user
```
Extract!


```
// Loop over all entries and remove nulls
```
DUH!


```
// Avoid memory leak
```

----
# Clean Code + Java8

Use `::nameFunctions`

Only tolerate one-liner lambdas

```
-> {
```

Learn the entire `Stream` API

Use it progressively

Adopt the Optional<>

`.map(f)`

Find the simplest form
Continuous peer review

Cherish your predicates
boolean functions

----
# Peer review !

## Pair programming

----
# Key points

- Stop refactoring = Start Legacy

- Refine Expressive names

- Short methods

- Structs, Objects or Logical Containers?

- Comments are Failures. Expressive code.

- Pair Programming is the way

----
# What can I do to make refactor happen each day in my team?

----
How to apply all this in my legacy code?

Let's practice !!!

Where can I read more?

Pragmatic & Professional

----
# Books

Clean Code - Robert C. Martin

Refactoring - Martin Fowler & Kent Beck

Java by Comparison: Become a Java Craftsman in 70 Examples
- Jorg Lenhard, Linus Diets, Simon Harrer

----
Clean code

Requires Discipline

----
# Coding Kata

----
No rush

Safe environment

Perfection

Reflect on HOW you work

----
Pair Programming

Refactoring

TDD

----
Coding Dojo

People: 4-10
Topics: Refactoring, TDD, Legacy code
Time: 1 - 1.5 hours timeboxed

Synthetic exercises, not production code

----
# KEEP
# CALM
## and
# CODE

