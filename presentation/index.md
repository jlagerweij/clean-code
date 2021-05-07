Clean Code
=
----

When something is painful but you can't avoid doing it...

postpone it                   <!-- .element: class="fragment fade-in-then-out" -->  

delegate it                   <!-- .element: class="fragment fade-in-then-out" -->  

Do it more often!             <!-- .element: class="fragment" -->  

"Bring the pain forward"    <!-- .element: class="fragment" -->

----
Continuous Integration  <!-- .element: class="fragment" -->

Pair Programming        <!-- .element: class="fragment" -->

Continuous Refactoring  <!-- .element: class="fragment" -->

Test-First              <!-- .element: class="fragment" -->

## eXterme Programming

"Bring the pain forward"

----
## Software Craftsmanship

Technical Practices

Professionalism

Deliberate Practice

Code of Ethics


----
## Clean Code ...

<div class="no-bullets">

- does one thing well - SRP           <!-- .element: class="fragment" -->

- reads like well written prose        <!-- .element: class="fragment" -->

- was written by someone who cared     <!-- .element: class="fragment" -->

- when each method you read turns out to be pretty much what you expected <!-- .element: class="fragment" -->

</div>

----
Any fool can write code that a computer understands,
but few programmers know how to write code that a human can understand

-- Martin Fowler

----
## Unit of Measure

The code is pretty much what you expected

code quality meter (wtf / min) <!-- .element: class="fragment" -->

----
## Why Clean Code?

True cost of software == its maintenance <!-- .element: class="fragment" -->

80 % of the total <!-- .element: class="fragment" -->

Why so much? <!-- .element: class="fragment" -->

Productivity drops with time <!-- .element: class="fragment" -->

----
## Why Clean Code?

We READ 10x more time than we WRITE

* Make it more readable

Boy scout rule:

Always check in cleaner code than you found


----
## Refactoring?

Simplify existing code

without changing its external behaviour <!-- .element: class="fragment" -->

----
## Refactoring?

<div class="no-bullets">

- Safe moves
  - <span style="font-size:0.5em;">Copy: make old code useless</span>  
  - <span style="font-size:0.5em;"><del>Don't cut and fix later</del></span>  
  - use the IDE!

- tiny steps <!-- .element: class="fragment" -->  
  - Write down commit messages <!-- .element: class="fragment" -->

- tests <!-- .element: class="fragment" -->  
  - Tests and build along the way <!-- .element: class="fragment" -->

</div>

----
## Unit testing

- For the code
- Not for the Sonar coverage

Avoid THE refactoring sprint <!-- .element: class="fragment" -->

----
Use case
<link href="https://fonts.googleapis.com/css2?family=Reenie+Beanie&display=swap" rel="stylesheet">
<div style="margin: 20px auto; font-family: 'Lato';">
<ul style="margin:0; padding:0; list-style:none; display: flex; flex-wrap: wrap; justify-content: center; ">
  <li style="margin-right: 20px">
    <a href="#" style="text-decoration:none; color:#000; background:#cfc; display:block; height:4em; width:4em; padding:1em; transform: rotate(-6deg);">
      <h3 style="font-weight: bold; font-size: 2rem; color:#000; ">US-42</h3>
      <p style="font-family: 'Reenie Beanie';">Refactoring</p>
    </a>
  </li>
  <li style="margin-right: 20px">
    <a href="#" style="text-decoration:none; color:#000; background:#ffc; display:block; height:4em; width:4em; padding:1em; transform: rotate(3deg);">
      <h3 style="font-weight: bold; font-size: 2rem; color:#000; ">US-42</h3>
      <p style="font-family: 'Reenie Beanie';">Develop</p>
    </a>
  </li>
  <li style="margin: 10px">
    <a href="#" style="text-decoration:none; color:#000; background:#ccf; display:block; height:4em; width:4em; padding:1em; transform: rotate(-6deg);">
      <h3 style="font-weight: bold; font-size: 2rem; color:#000; ">US-42</h3>
      <p style="font-family: 'Reenie Beanie';">Unit tests</p>
    </a>
  </li>
</ul>
</div>

----
Use case
<div style="margin: 20px auto; font-family: 'Lato';">
<ul style="margin:0; padding:0; list-style:none; display: flex; flex-wrap: wrap; justify-content: center; ">
  <li style="margin-right: 20px">
    <a href="#" style="text-decoration:none; color:#000; background:#ffc; display:block; height:4em; width:4em; padding:1em; transform: rotate(3deg);">
      <h3 style="font-weight: bold; font-size: 2rem; color:#000; ">US-42</h3>
      <p style="font-family: 'Reenie Beanie';">Develop</p>
    </a>
  </li>
</ul>
</div>

----
## FEAR

- Deadline 

----
What do you do after D-Day?

Mob Refactoring! (1 hr)   <!-- .element: class="fragment" -->

----
## Clean code is about

<div class="no-bullets">

- Emotions <!-- .element: class="fragment" -->  

- Team <!-- .element: class="fragment" -->

- Attitude <!-- .element: class="fragment" -->

</div>

----
What will you choose?

---
## Naming

----
## Naming

> With great power comes great responsibility

<div class="right">
  -- Spiderman 
</div>

----
## Naming

Classes are nouns
  
```
Customer, OrderDetails, OrderFacade
``` 

<div class="fragment">
Avoid meaningless names

```
OrderInfo, OrderData -> Order
OrderDetails, OrderSummary     
```
</div>

----
## Naming

`ICustomerService`

`CustomerServiceImpl` <!-- .element: class="fragment" -->

Delete the interface! <!-- .element: class="fragment" -->

----
Delete the interface, except:

- Remoting / API (your-app-api.jar)

- Strategy pattern or Decorator  
Pick implementation at runtime

- Dependency inversion   
Implemented in lower-level modules

----
Have you ever blamed some code?

... then find out YOU where the author?  <!-- .element: class="fragment" -->

You forget! <!-- .element: class="fragment" -->

----
You try to understand some code

90 % of your work life

----
You try to understand some code

Then, you get it  <!-- .element: class="fragment" -->

You change only one line <!-- .element: class="fragment" -->

----
You try to understand some code (2 hours)

Then, you get it  

You change only one line  (1 minute)

How do you feel? <!-- .element: class="fragment" -->

----
Make the name speak for itself

You found a better name

Impossible to change? I can't be smarter than The Elders ?!? <!-- .element: class="fragment" -->

NO! Rename it! <!-- .element: class="fragment" -->  

Comprehension Refactoring -- Martin Fowler <!-- .element: class="fragment" -->

----
## The Gap

<div class='left'> Business </div>
<div class='right'> Developers </div>

Shared language <!-- .element: class="fragment" -->

Domain Driven Design <!-- .element: class="fragment" -->

----
## Method overloading

More functions, less names! <!-- .element: class="fragment" -->

----
## Util classes

----
## Util classes

- StringUtils
- DateUtils
- DBUtils
- WasteUtils

At least collect selectively

----
## Discover value objects

```
someMethod(param1, param2);
```

  <sup>General purpose? Never mocked?</sup>

<div class="fragment">

```
Util1.someMethod(param1, param2);
```
</div>

<div class="fragment">

```
VO vo = new VO(param1, param2);
vo.method();
```

</div>

----
## Deepen 
your Domain Language

---
## Functions

----
> A function should do one thing,
> 
> it should do it well,
> 
> and it should do it only  
> <div class="right">
> -- Uncle Bob
> </div>


<div class="left fragment">

They should be <span style="font-size: 5em">SMALL</span>
</div>

----
## Functions should be SMALL!

How small?

5 lines <!-- .element: class="fragment" -->


To be sure they do just 1 thing <!-- .element: class="fragment" -->  
What CAN you do in 5 lines?

So you CAN find a good name for it <!-- .element: class="fragment" -->  

Maximum size could be a height of a monitor <!-- .element: class="fragment" -->


----
## Extract method

or even Classes?  <!-- .element: class="fragment" -->

or perhaps even micro service?  <!-- .element: class="fragment" -->

----
## Performance vs Clean Code

Smaller methods run faster!
(get HOT faster)

Google "Just-in-time Compiler Optimizations"

----
## Scared of small functions?

Instead of one familiar landscape,

You're juggling with dozens of small functions
you can't even recall their names

but,
The Team will thank you!

----
## How to fully redesign well factored code?

inline everything back

refactor / optimize / design

extract again

----

```
myBadMethod("John", "Micheal", "Paris", "St. Albergue");
```
Max 3 parameters

- Does too many things?

- Just passes down the arguments?
  - Try to introduce Parameter Object/DTO/VO
  ```
  address.setStreetName("Paris");
  ...
  myBadMethod(address);
  ```
- Common parameters -> fields (OOP)

----
## Demo

----
## SRP

No boolean params => 4, extract!
```
removeOrders(customer, false, true);
```
Laziness / fear / rush = legacy

No nullable params => 2, extract!
```
if (customer != null) { ...  } else { ... }
```
No Optional<> params!

----
## Null Wars

corrupt data


<div class="left no-bullets"><sup>

- File

- WebService
  
- User
  
- Queue
  
- Database
  </sup></div>

<div class="right">

```bash
/-\__________________/-\
\-/                  \-/
 |      Trust         | 
 |      Inside        | 
 |                    | 
 |                    | 
 |                    | 
/-\__________________/-\
\-/                  \-/

```

</div>

Defensive programming

----
## Null Wars
Defensive programming
Throroughly check data only at the boundaries

Avoid returning NULL
-> Throw Exception

Could null have Biz meaning?

wrap it in an Optional<>


----

```
Customer.getMemberShipCard(): Optional<MemberShipCard>
```

Entity getters returning Optional<>

Game won! <!-- .element: class="fragment" -->

----
```
checkCustomer(customer, order) {
  customer.setActivate(true);
}
```

<div class="fragment">  

Side effects are evil, but necessary
- Changes some state of the system
- Because they can surprise the reader
- Make them obvious
</div>

<div class="fragment">

```
checkAndActivateCustomer(customer, order) {
  customer.setActivate(true);
}
```
</div>

----
# Command-Query Separation

----
# CQS

- Command - return void 
  
  Do side-effects  
  `setActive(true): void`
  `sendEmail(Email): void`

- Query - return results

  Pure functions  
  `getPrice(): int`
  `computePrice(movie): int`


----
# Pure functions

No side-effects
No inserts, JMS, file, fields, WS, ...

Idempotent
Same results for same inputs
No random, time, WS, DB, ...

----
# So many Guidelines!

----
Uncle Bob in 'Clean Code':

When I write functions, they come out long and complicated.
They have lots of indenting and nested loops.

<div class="fragment">

They have long argument lists.
The names are arbitrary and there is duplicated code.
</div>

<div class="fragment">

I then massage and refine that code, splitting out functions, changing names, eliminating duplication.
</div>


<div class="fragment">

I don't write them clean from the start.
I don't think anyone could.
</div>
----
# The Hat metaphor
 -- Kent Beck

Cowboy - Writing, making it work, Copy pasta

Detective - Cleaning, make it readable
- What can I delete?

Maffiozi - Unit testing, crack it
- How can I break it?


---
## Classes

----
# Data structures

= classes that expose all their state

```
public class ImmutableStruct {
  private final String firstName;
  private final String lastName;
  
  public ImmutableStruct(String first, String last) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
}
```

----
# Data structures

= classes that expose all their state

```
public class ImmutableStruct {    ~ Value Object
  private final String firstName;
  private final String lastName;
  ...  
}
```


We love immutable objects
- If created valid, remain so
- Easier to debug
- Thread safe
- Safe as keys in Tree/Hash


----
# Data structures

<div class="left">

```
public class ImmutableStruct {
  private final String firstName;
  private final String lastName;
  
  public ImmutableStruct(String first, String last) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
}
```
</div>

<div class="right fragment">

```
public class PhonebookDTO {
  private String firstName;
  private String lastName;
  
  public String getFirstName() {
    return this.firstName;
  }
  public void setFirstName(String first) {
    this.firstName = first;
  }
  public String getLastName() {
    return this.lastName;
  }
  public void setLastName(String last) {
    this.lastName = last;
  }
}
```
</div>

<div class="fragment">

This is not encapsulation!
</div>

----
Expose behaviour, not data
Data is an implementation detail
`car.engineStarted = true`
`car.setEngineStarted(true)`
`car.startEngine()`

Information hiding, Even when asked 
`car.getGasolineInLiters()`
`car.getPercentageFuelLeft()`
`car.getEstimatedRemainingInKm()`

Implementation can evolve without breaking your clients

----
# Procedural code
Keep It Short And Simple (KISS)

We distribute logic in many classes
Classes as containers of logic

```
OrderService
```

----
<div class="left"  style="height: 300px">

Encapsulate  
Decomposite side-effects

OOP <i class="fas fa-island-tropical fa-3x"></i>  
</div>

<div class="right" style="height: 300px">

Consise  
Scalable  
Debuggable  
FP  <i class="fas fa-mountains fa-3x"></i>
</div>

<i class="fas fa-water"></i> <i class="fas fa-water"></i> <i class="fas fa-water"></i> <i class="fas fa-water"></i> <i class="fas fa-water"></i> <i class="fas fa-water"></i> <i class="fas fa-water"></i> <i class="fas fa-water"></i>

Procedural


---
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













<style>

.no-bullets li {


  list-style: none
}
#bright {
  color: deeppink;
}

.left {
	margin: 10px 0 15px 20px;
	text-align: center;
	float: left;
	z-index:-10;
	width:48%;
	font-size: 0.85em;
	line-height: 1.5;
}

.right {
	margin: 10px 0 15px 0;
	float: right;
	text-align: center;
	z-index:-10;
	width:48%;
	font-size: 0.85em;
	line-height: 1.5;
}

#dark_back {
  background-color: rgba(0, 0, 0, 0.9);
  color: #fff;
  padding: 20px;
}

.reveal i.fabs {
    font-family: "Font Awesome 5 Brands";
    font-style: normal;
} 

.reveal i.far {
    font-family: "Font Awesome 5 Free";
    font-style: normal;
} 

</style>

<link rel="stylesheet" href="fa/css/all.min.css" />
<link rel="stylesheet" href="css/tachyons.min.css" />



