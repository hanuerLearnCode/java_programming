package AccessModifier.p1;
/**
 * Same package, extends => public, default, protected == usable
 */
public class S extends A {
    A x = new A();

    void method() {
        publicAttribute = 1;
        protectedAttr = 1;
        defaultAttr = 1;
    }
}
