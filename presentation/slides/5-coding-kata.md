# CODING KATA

----

# Retro

Some learning key points

----

Rename

& 

Extract Method

----
## Feature envy

```
method(arg, ...)
```

<div class="fragment">

 Move refactor:

```
arg.method(...)
```

"Keep behaviour next to state" (OOP)
</div>

----
## Most powerful forces in the universe
3 -- Undo   

2 -- Revert <!-- .element: class="fragment" -->

1 -- Love for your reader <!-- .element: class="fragment" -->

----
## Do you love switches?

----
## Switch Hygiene Rules

- is the only instruction in a method

<div class="fragment">

- default: throw new Exception
</div>
<div class="fragment">

One line per case:

    : return func();
    : func(); break;

In Java 13: `return switch()`
</div>
