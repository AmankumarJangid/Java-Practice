package com.Inheritence;

//✅ java doesn't support multiple inheritance , means having multiple parent of a single child
// this feature is only supported in c++

// multiple inheritence allowed in interfaces

// super is used to use property of parent instead of this keyworkd
public class InheritenceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new  Vehicle();
        TwoWheeler vehicle2 = new TwoWheeler();
        Vehicle v3  = new TwoWheeler();
//        TwoWheeler v6  = new Vehicle(); won't work


        vehicle2.commute();
        v3.commute();
        v3.start();
        v3.start();
        v3.stop();
        v3.stop();
    }
}
