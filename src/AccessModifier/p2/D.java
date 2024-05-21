package AccessModifier.p2;

import AccessModifier.p1.A;

/**
 * Different package, but extends => public, protected == usable
 */
public class D extends A {
    void method() {
        publicAttribute = 1;
        protectedAttr = 1;
    }
}
