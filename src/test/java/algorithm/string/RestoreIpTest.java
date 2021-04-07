package algorithm.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

class RestoreIpTest {
    @ParameterizedTest
    @ValueSource(strings = {"9245587303", "25525511135", "0000", "010010", "101023"})
    void name(String input) {
        RestoreIp restoreIp = new RestoreIp();
        List<String> strings = restoreIp.restoreIpAddresses(input);
        System.out.println(strings);
    }
}
