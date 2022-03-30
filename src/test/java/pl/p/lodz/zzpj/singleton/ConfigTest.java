package pl.p.lodz.zzpj.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigTest {
    @Test
    public void shouldBeInitializedOnce() {
        Config config1 = Config.getInstance();
        Config config2 = Config.getInstance();
        assertEquals(config1,config2);
    }
}