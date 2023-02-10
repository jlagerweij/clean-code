## Formatting & comments

----
# Team work

It's all about team work

Don't code

Communicate!

----
## Don't code, Communicate

<div class="fragment">

- Respect your readers
  
  Details matter: 10x more reading, remember?
</div>

<div class="fragment">

- Write literature
  
    - The simplest code that works
    - Never obfuscate
</div>

<div class="fragment">

- Simplicity is the ultimate sophistication
</div>

----
Remember your first driving lesson?

After a few years you now have reflexes! <!-- .element: class="fragment" -->

----
# Master your IDE

Learn those shortcuts!
- Key Promotor X (IntelliJ IDEA)

Sharpen your reflexes for real races

----
When it's <span class="red">red</span>, <span class="yellow">yellow</span>, <span class="blue">blue</span> or <span class="gray">gray</span>,

Alt-Enter will save your day. <!-- .element: class="fragment" -->

----
# Comments

Often used to cover code smells <!-- .element: class="fragment" -->

----

<div class="right f4 ma0">

```java
public List<int[]> getCells() {  
  List<int[]> list1 = new ArrayList<>();
  for (int[] x : theList)
    if (x[0] == 4) list.add(x);
  return list1;
}
```
</div>

<div class="left r-stack f5">
<div class="fragment fade-in-then-out f4" style="margin: 0 !important;">

```java
public List<int[]> getFlaggedCells() {  
  List<int[]> flaggedCells = new ArrayList<>();
  for (int[] cell : gameBoard) {
    boolean isFlagged = cell[STATUS]==FLAGGED;
    if (isFlagged) 
      flaggedCells.add(cell);
  }
  return flaggedCells;
}
```

<div class="f4">

- Readable Constants

  - Instead of magic numbers

- Explanatory variables

  - Name intermediary result
  - if (multiline &&
    (conditions || formulas))

</div>

</div>

<div class="fragment fade-in f4">

```java
public List<Cell> getFlaggedCells() {  
  List<Cell> flaggedCells = new ArrayList<>();
  for (Cell cell : gameBoard) {
    if (cell.isFlagged()) 
      flaggedCells.add(cell);
  }
  return flaggedCells;
}
```

<div class="f4">

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

</div>

</div>


<div class="fragment">

Live Documentation !
</div>


----
# Opinions?

```
// Register user
```
Extract!  <!-- .element: class="fragment" -->

<div class="fragment">

```
// Loop over all entries and remove nulls
```
</div>

DUH!  <!-- .element: class="fragment" -->


<div class="fragment">

```
// Avoids memory leak
```
</div>

----
# Clean Code + Java8

<div class="fragment right">
Learn the entire `Stream` API

Use it progressively

<div class="fragment">

Find the simplest form
Continuous peer review
</div>

<div class="fragment">

Cherish your predicates
boolean functions
</div>

</div>

<div class="fragment left">

Use `::nameFunctions`

Only tolerate one-liner lambdas

```
-> {
```

<div class="fragment">

Adopt the Optional<>

`.map(f)`

</div>

</div>



----
# Peer review !

## Pair programming

----
# Key points

- Stop refactoring = Start Legacy           <!-- .element: class="fragment" -->

- Refine Expressive names                   <!-- .element: class="fragment" -->

- Short methods                             <!-- .element: class="fragment" -->

- Structs, Objects or Logical Containers?   <!-- .element: class="fragment" -->

- Comments are Failures. Expressive code.   <!-- .element: class="fragment" -->

- Pair Programming is the way               <!-- .element: class="fragment" -->

----
# What can I do to make refactor happen each day in my team?

----
How to apply all this in my legacy code?  <!-- .element: class="fragment" -->

<i class="fas fa-arrow-down"></i>

Let's practice !!!                        <!-- .element: class="fragment" -->

<i class="fas fa-arrow-down"></i>

Where can I read more?                    <!-- .element: class="fragment" -->

<i class="fas fa-arrow-down"></i>

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

<div class="fragment">

No rush

Safe environment

Perfection

Reflect on HOW you work

</div>

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

