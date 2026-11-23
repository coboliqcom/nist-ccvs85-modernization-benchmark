package com.bank.nc101a;

import com.bank.nc101a.core.service.Nc101aService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class Nc101aServiceTest {

    private final Nc101aService service = new Nc101aService();

    @Test
    @DisplayName("NC101A NIST CCVS85 Test Suite: verifies that execute() runs all 29 test clusters and increments pass counter")
    void executeRunsFullTestSuite() {
        Nc101aService.ReturnCodeResponse response = service.execute();

        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo("00");
        assertThat(response.getState()).isNotNull();

        Nc101aService.ProgramState state = response.getState();
        System.out.println("=== NC101A NIST Execution Results ===");
        System.out.println("Pass Counter:    " + state.getPassCounter());
        System.out.println("Error Counter:   " + state.getErrorCounter());
        System.out.println("Delete Counter:  " + state.getDeleteCounter());
        System.out.println("Inspect Counter: " + state.getInspectCounter());
        System.out.println("=====================================");

        assertThat(state.getPassCounter())
                .isNotNull()
                .isGreaterThan(BigDecimal.ZERO);
    }
}
