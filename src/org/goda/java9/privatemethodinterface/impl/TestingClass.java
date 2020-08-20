package org.goda.java9.privatemethodinterface.impl;

public class TestingClass {
    public static void main(String[] args) {
        ASampleImplForInterfaceWithDefaultMethods aSampleImplForInterfaceWithDefaultMethods = new ASampleImplForInterfaceWithDefaultMethods();
        System.out.println("A method call with default interface method and private method: "+aSampleImplForInterfaceWithDefaultMethods.callDefaultMethodWithPrivateMethodCall());
    }
}
