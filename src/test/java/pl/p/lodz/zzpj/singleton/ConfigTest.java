package pl.p.lodz.zzpj.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigTest {

    @Test
    public void shouldBeOneInstance() {
        Config config = Config.getInstance();
        Config config1 = Config.getInstance();
        assertEquals(config, config1);
    }

}