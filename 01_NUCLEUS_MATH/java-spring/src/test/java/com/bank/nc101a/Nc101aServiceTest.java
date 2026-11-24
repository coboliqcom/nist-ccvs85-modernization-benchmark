package com.bank.nc101a;

import com.bank.nc101a.core.service.Nc101aService;
import com.bank.nc101a.core.service.Nc101aService.ExecutionMode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

class Nc101aServiceTest {

    private final Nc101aService service = new Nc101aService();

    @Test
    @DisplayName("NC101A Naive Mode: demonstrates the 37 silent mathematical failures of naive Java transpilation")
    void executeNaiveModeShowsBaselineFailures() {
        Nc101aService.ReturnCodeResponse response = service.execute(ExecutionMode.NAIVE_TRANSPILER);

        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo("00");
        assertThat(response.getState()).isNotNull();

        Nc101aService.ProgramState state = response.getState();
        System.out.println("=== NC101A [MODE 1: NAIVE TRANSPILER] Execution Results ===");
        System.out.println("Pass Counter:    " + state.getPassCounter());
        System.out.println("Error Counter:   " + state.getErrorCounter());
        System.out.println("Delete Counter:  " + state.getDeleteCounter());
        System.out.println("Inspect Counter: " + state.getInspectCounter());
        System.out.println("Status:          37 silent arithmetic failures (impedance mismatches with z/OS)");
        System.out.println("==========================================================");

        assertThat(state.getPassCounter()).isEqualTo(new BigDecimal("55"));
        assertThat(state.getErrorCounter()).isEqualTo(new BigDecimal("37"));
    }

    @Test
    @DisplayName("NC101A CobolExact Mode: certified 100% NIST CCVS85 mathematical parity (90 PASS, 0 FAIL)")
    void executeCobolExactModeAchievesFullParity() {
        Nc101aService.ReturnCodeResponse response = service.execute(ExecutionMode.COBOL_EXACT_CODETRUTH);

        assertThat(response).isNotNull();
        assertThat(response.getCode()).isEqualTo("00");
        assertThat(response.getState()).isNotNull();

        Nc101aService.ProgramState state = response.getState();
        System.out.println("=== NC101A [MODE 2: COBOL-EXACT CODETRUTH] Execution Results ===");
        System.out.println("Pass Counter:    " + state.getPassCounter());
        System.out.println("Error Counter:   " + state.getErrorCounter());
        System.out.println("Delete Counter:  " + state.getDeleteCounter());
        System.out.println("Inspect Counter: " + state.getInspectCounter());
        System.out.println("Status:          100.0% CERTIFIED NIST CONFORMANCE (0 ERRORS)");
        System.out.println("===============================================================");

        assertThat(state.getPassCounter()).isEqualTo(new BigDecimal("90"));
        assertThat(state.getErrorCounter()).isEqualTo(BigDecimal.ZERO);
    }
}
