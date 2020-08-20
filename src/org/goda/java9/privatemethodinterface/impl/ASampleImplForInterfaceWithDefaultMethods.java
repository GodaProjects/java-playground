package org.goda.java9.privatemethodinterface.impl;

import org.goda.java9.privatemethodinterface.InterfaceJava9Enhancements;


public class ASampleImplForInterfaceWithDefaultMethods implements InterfaceJava9Enhancements {
    private String member;

    public ASampleImplForInterfaceWithDefaultMethods() {
        super();
        this.member = "A Sample Impl For Interface With Default Methods";
    }

    public String callDefaultMethodWithPrivateMethodCall(){
        return aSampleDefaultMethodWithImplementation(new ASampleImplForInterfaceWithDefaultMethods());
    }

    @Override
    public String toString() {
        return "ToString - "+this.member;
    }
}