package com.Abstraction;

import com.Interface.Transport;
// can either be declared in this or else in the parent class but parent needs to implements Transport
public class Car extends Vehicle{

    public Car(){
        super(4);
    }

//    @Override // should or should not be here if not implemented in parent class
//    public void getSetGo() {
//        super.getSetGo();
//    }

    @Override
    public void makeStartSound() { // its a contract that always needed to be fullfilled by child or else we can also make child class to be abstract to other
        System.out.println("BBhrooooo......!");
    }
}
