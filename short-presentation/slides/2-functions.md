## Functions

<div class="fragment">

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
## SRP

The Single Responsibility Principle

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

</div>

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
# So many Guidelines!

----
<div class="f3">

Uncle Bob in 'Clean Code':

When I write functions, they come out long and complicated.<br/>
They have lots of indenting and nested loops.

<div class="fragment">

They have long argument lists.<br/>
The names are arbitrary and there is duplicated code.
</div>

<div class="fragment">

I then massage and refine that code, splitting out functions, changing names, eliminating duplication.
</div>


<div class="fragment">

I don't write them clean from the start.
I don't think anyone could.
</div>
</div>
