## Formatting & comments

----
# Team work

It's all about team work

Don't code

Communicate!

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

<div class="right f4">

```
public List<int[]> getCells() {  
  List<int[]> list1 = new ArrayList<>();
  for (int[] x : theList)
    if (x[0] == 4) list.add(x);
  return list1;
}
```
<div class="fragment">

```
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
</div>
</div>

<div class="left f5 fragment">

- Readable Constants

  - Instead of magic numbers

- Explanatory variables

  - Name intermediary result
  - if (multiline &&
    (conditions || formulas))

</div>

----

<div class="right f4">

```
public List<int[]> getCells() {  
  List<int[]> list1 = new ArrayList<>();
  for (int[] x : theList)
    if (x[0] == 4) list.add(x);
  return list1;
}
```

```
public List<Cell> getFlaggedCells() {  
  List<Cell> flaggedCells = new ArrayList<>();
  for (Cell cell : gameBoard) {
    if (cell.isFlagged()) 
      flaggedCells.add(cell);
  }
  return flaggedCells;
}
```
</div>

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

<div class="fragment">

Live Documentation !
</div>


----
# Key points

- Stop refactoring = Start Legacy           <!-- .element: class="fragment" -->

- Refine Expressive names                   <!-- .element: class="fragment" -->

- Short methods                             <!-- .element: class="fragment" -->

- Structs, Objects or Logical Containers?   <!-- .element: class="fragment" -->

- Comments are Failures. Expressive code.   <!-- .element: class="fragment" -->

- Pair Programming is the way               <!-- .element: class="fragment" -->

