package org.goda.java9.privatemethodinterface.impl;

import org.goda.java9.privatemethodinterface.InterfaceJava9Enhancements;

/**
 * https://www.javatpoint.com/java-9-interface-private-methods#:~:text=Java%209%20Private%20Interface%20Methods&text=Interface%20allows%20us%20to%20declare,throws%20a%20compile%20time%20error.
 * Interface allows us to declare private methods that help to share common code between non-abstract methods.
 * Before Java 9, creating private methods inside an interface cause a compile time error. The following example is
 * compiled using Java 8 compiler and throws a compile time error.
 */
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