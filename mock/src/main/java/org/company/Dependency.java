package org.company;

public class Dependency {

    public String printMethod() throws Exception {
        System.out.println("dependency method");
        throw new Exception();
    }

}
