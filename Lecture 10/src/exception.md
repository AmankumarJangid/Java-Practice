#Types of Exception

User-Defined and Build in-Exception

Built in Exception - 
==================

Checked Exception
-----------------
---
- ClassNotFoundException
- InterruptedException
- IOException
- InstantiationException
- SQLException
- FileNotFountException

Unchecked Exception
------------------
---
- ArithmeticException
- ClassCastException
- NullPointerException
- ArrayIndexOutOfBoundException
- ArrayStoreException
- IllegalThreadStateException

### For user defined we use `throw new Exception("Exception message")`

````
public void printName(String name)
//custom exception
throws IllegalArgumentException{
    if( name.contains("-")){
        throw new IllegalArgumentException("Name Contains -");
    }
    System.out.println(name);
}
````

---
- Checked exception must be handled (such as FileNotFound must be handled )

- but unchecked exception are not necessary or mandatory to handle so we can either skip the try catch block

---
# Throw and Throws

We use 
````
// We use throws to define any exceptions such that 
Syntax- 
throws MyException{
    if( name.contains("-")){
        throw new MyException

```