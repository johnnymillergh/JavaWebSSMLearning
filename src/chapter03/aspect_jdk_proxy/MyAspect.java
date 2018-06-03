package chapter03.aspect_jdk_proxy;

public class MyAspect {
    public void check_Permission() {
        System.out.println("MyAspect:check_Permission()");
    }

    public void log() {
        System.out.println("MyAspect:log()");
    }
}
