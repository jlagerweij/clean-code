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

<div class="fragment">

Smaller methods run faster!
(get HOT faster)

Google "Just-in-time Compiler Optimizations"

</div>

----
## Scared of small functions?

Instead of one familiar landscape,

<div class="fragment">

You're juggling with dozens of small functions
you can't even recall their names
</div>

<div class="fragment">

but,
The Team will thank you!

```
sendActivationEmailToCustomer()
removeAllPastCancelledOrdersOfConsumer()
```

</div>

----
## How to fully redesign well factored code?

inline everything back  <!-- .element: class="fragment" -->

refactor / optimize / design <!-- .element: class="fragment" -->

extract again <!-- .element: class="fragment" -->

----

```
myBadMethod("John", "Micheal", "Paris", "St. Albergue");
```

Max 3 parameters  <!-- .element: class="fragment" -->

- Does too many things? <!-- .element: class="fragment" -->

<div class="fragment">

- Just passes down the arguments?
    - Try to introduce Parameter Object/DTO/VO
  ```
  address.setStreetName("Paris");
  ...
  myBadMethod(address);
  ```

- Common parameters -> fields (OOP)

</div>  

----
## Common Parameters?

- ManyParamsVO

- ManyParamsOOP

----
## SRP

```
removeOrders(customer, false, true);
```

<div class="fragment">

No boolean params -> extract!

= Laziness / fear / rush = legacy 
</div>

<div class="fragment">

```
if (customer != null) { ...  } else { ... }
```
</div>
<div class="fragment">

No nullable params, extract!

No Optional<> params!

What about invalid data !?
</div>

----
## Null Wars
 
(corrupt data)


<div class="left no-bullets fragment"><sup>

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
/-\_______   ________/-\
\-/       | |        \-/

```

</div>

<div class="fragment">

Defensive programming
</div>

----
## Null Wars
Defensive programming

Throroughly check data only at the boundaries

Avoid returning NULL
-> Throw Exception

<div class="fragment">

Could `null` have Biz meaning?
</div>
<div class="fragment">

wrap it in an Optional<>
</div>

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

<div class="fragment">

  Do side-effects  

  ```
  setActive(true): void
  sendEmail(Email): void
  ```
</div>

- Query - return results

<div class="fragment">

  Pure functions  

  ```
  getPrice(): int
  computePrice(movie): int
  ```

</div>

----
# Pure functions

- No side-effects

  No inserts, JMS, file, fields, WS, ...

- Idempotent

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

<div class="fragment">

Cowboy - Writing, making it work, Copy pasta
</div>

<div class="fragment">

Detective - Cleaning, make it readable
- What can I delete?
</div>


<div class="fragment">

Maffiozi - Unit testing, crack it
- How can I break it?
</div>
