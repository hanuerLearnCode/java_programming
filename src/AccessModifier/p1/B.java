package AccessModifier.p1;

/**
 * Same package => public, default, protected == usable
 */
public class B {
    A instanceA = new A();

    void method() {
        instanceA.publicAttribute = 1;
        instanceA.defaultAttr = 1;
        instanceA.protectedAttr = 1;
    }
}
