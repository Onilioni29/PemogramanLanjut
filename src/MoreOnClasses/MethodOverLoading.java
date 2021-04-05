package MoreOnClasses;

public class MethodOverLoading {
    public void doSomething() {
        System.out.println("A");
    }
    public void doSomething(String str) {
        System.out.println(str);
    }
}
class B {
    public static void main(String[] args) {
        MethodOverLoading object = new MethodOverLoading();
        object.doSomething("B");
    }
}
