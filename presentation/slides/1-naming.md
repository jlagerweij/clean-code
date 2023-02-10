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

<div class="fragment">
You try to understand some code

90 % of your work life
</div>

----
You try to understand some code  (2 hours)

Then, you get it  <!-- .element: class="fragment" -->

You change only one line (1 minute) <!-- .element: class="fragment" -->

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

<div class="fragment">

- StringUtils
- DateUtils
- DBUtils
- WasteUtils <i class="fas fa-trash"></i>

At least collect selectively
</div>

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

