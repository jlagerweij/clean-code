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

`car.engineStarted = true`      <!-- .element: class="fragment" -->
`car.setEngineStarted(true)`    <!-- .element: class="fragment" -->
`car.startEngine()`             <!-- .element: class="fragment" -->

Information hiding, Even when asked     <!-- .element: class="fragment" -->
`car.getGasolineInLiters()`             <!-- .element: class="fragment" -->
`car.getPercentageFuelLeft()`           <!-- .element: class="fragment" -->
`car.getEstimatedRemainingInKm()`       <!-- .element: class="fragment" -->

Implementation can evolve without breaking your clients <!-- .element: class="fragment" -->

----
Minimize the API

Protect client code from future changes of implementation of a Library or Framework.

<div class="fragment">

Decompose complex logic into separate objects

```
CsvWriter
```
</div>
