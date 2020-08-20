package org.goda.java9.privatemethodinterface;

public interface InterfaceJava9Enhancements {
    default String aSampleDefaultMethodWithImplementation(InterfaceJava9Enhancements param) {
        return privateInterfaceMethod(param);
    }

    private String privateInterfaceMethod(InterfaceJava9Enhancements param) {
        return param.toString() + " - A string from private interface method";
    }
}
