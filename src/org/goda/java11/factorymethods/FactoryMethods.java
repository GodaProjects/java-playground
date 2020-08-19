package org.goda.java11.factorymethods;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {
    public static void main(String[] args) {
        List<String> factoryBuildList = List.of();
        System.out.println(factoryBuildList);

        factoryBuildList = List.of("one", "two", "three");
        System.out.println(factoryBuildList);

        Map<String, Object> factoryBuiltMap1 = Map.of("one", 1, "two", 2, "three", 3);
        System.out.println(factoryBuiltMap1);

        Map<String, Object> factoryBuiltMap2 = Map.ofEntries(factoryBuiltMap1.entrySet().toArray(new Map.Entry[factoryBuiltMap1.keySet().size()]));
        System.out.println(factoryBuiltMap2);

        Set<String> factoryBuiltSet = Set.of("one", "two", "three");
        System.out.println(factoryBuiltSet);
    }
}
