package AccessModifier.p2;

import AccessModifier.p1.A;

/**
 * Different package => public == usable
 */
public class C {
    A x = new A();
    void method() {
        x.publicAttribute = 1;
    }
}
