package pl.p.lodz.zzpj.prototype;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;

public class PrototypeTest {

    @Test
    public void shouldCloneObjectProperly() {
        B2BAgreement b2b = new B2BAgreement();
        b2b.setPattern("pattern1");
        b2b.setSignatures(Collections.singletonList("Jan Nowak"));

        B2BAgreement contract = (B2BAgreement) b2b.clone();
        assertEquals(contract,b2b);
    }

}
