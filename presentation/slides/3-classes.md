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

