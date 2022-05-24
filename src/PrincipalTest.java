import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    @Test
    void verResp() {
        assertAll(() -> assertEquals(0, Principal.verResp(0)),
                () -> assertEquals(0, Principal.verResp(3)),
                () -> assertEquals(1, Principal.verResp(1)),
                () -> assertEquals(2, Principal.verResp(2)));
    }

}