package com.bank.nc101a.core.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * NC101A - COBOL program `NC101A` orchestrates a 1-step business flow.
 *
 * Risk: 4/100 (LOW)
 * Modernization: auto-port safe
 * Source: NC101A.cbl
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class Nc101aService {

    /**
     * Thread-safe per-request COBOL WORKING-STORAGE / LINKAGE state.
     */
    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProgramState {
        private String a01oneCs00v01 = ".1";
        private String a01oneDsP0801 = ".000000001";
        private BigDecimal a01onesCs18v00 = new BigDecimal("+000000000000000001");
        private BigDecimal a02threesCs18v00 = new BigDecimal("-000000000000000033");
        private BigDecimal a02twosDs03v02 = new BigDecimal("+022.00");
        private BigDecimal a02twosDu02v00 = new BigDecimal("22");
        private String a05onesDs00v05 = ".11111";
        private BigDecimal a06threesDs03v03 = new BigDecimal("333.333");
        private BigDecimal a08twosDs02v06 = new BigDecimal("22.222222");
        private BigDecimal a10onesDs10v00 = new BigDecimal("1111111111");
        private BigDecimal a12onesDs12v00 = new BigDecimal("111111111111");
        private BigDecimal a12threesDs06v06 = new BigDecimal("333333.333333");
        private BigDecimal a14twosCu18v00 = new BigDecimal("000022222222222222");
        private BigDecimal a16ninesCu18v00 = new BigDecimal("009999999999999999");
        private BigDecimal a18onesDs09v09 = new BigDecimal("111111111.111111111");
        private BigDecimal a18onesDs18v00 = new BigDecimal("111111111111111111");
        private BigDecimal a18sixesCu18v00 = new BigDecimal("666666666666666666");
        private BigDecimal a99Cs02v00 = new BigDecimal("99");
        private BigDecimal a99Ds02v00 = new BigDecimal("99");
        private BigDecimal a990Ds0201p = new BigDecimal("+990");
        private BigDecimal affected = BigDecimal.ZERO;
        private String ansiReference = "";
        private BigDecimal azeroDs05v05 = BigDecimal.ZERO;
        private BigDecimal be = BigDecimal.ZERO;
        private String ccvsC1 = "";
        private String ccvsC2 = "";
        private String ccvsE1 = "";
        private String ccvsE2 = "";
        private String ccvsE22 = "";
        private String ccvsE3 = "";
        private String ccvsE4 = "";
        private String ccvsE41 = "";
        private String ccvsE42 = "";
        private String ccvsH1 = "";
        private String ccvsH2a = "";
        private String ccvsH2b = "";
        private String ccvsH3 = "";
        private String ccvsPgmId = "NC101A";
        private String cm18v0 = "";
        private BigDecimal computed0v18 = BigDecimal.ZERO;
        private BigDecimal computed14v4 = BigDecimal.ZERO;
        private BigDecimal computed18v0 = BigDecimal.ZERO;
        private BigDecimal computed4v14 = BigDecimal.ZERO;
        private String computedA = "";
        private BigDecimal computedN = BigDecimal.ZERO;
        private String computedX = "";
        private String corAnsiReference = "";
        private BigDecimal correct0v18 = BigDecimal.ZERO;
        private BigDecimal correct14v4 = BigDecimal.ZERO;
        private BigDecimal correct18v0 = BigDecimal.ZERO;
        private BigDecimal correct4v14 = BigDecimal.ZERO;
        private String correctA = "";
        private BigDecimal correctN = BigDecimal.ZERO;
        private String correctX = "";
        private String cr18v0 = "";
        private BigDecimal deleteCounter = BigDecimal.ZERO;
        private BigDecimal deleted = BigDecimal.ZERO;
        private String div02level1 = "";
        private String divData2 = "";
        private BigDecimal div1 = new BigDecimal("1620.36");
        private BigDecimal div10 = BigDecimal.ZERO;
        private BigDecimal div2 = new BigDecimal("44.1");
        private BigDecimal div3 = new BigDecimal("1661.7");
        private BigDecimal div4 = new BigDecimal("-9.642");
        private BigDecimal div5 = new BigDecimal(".82");
        private BigDecimal div6 = new BigDecimal("0");
        private BigDecimal div7 = new BigDecimal("9.6");
        private BigDecimal div8 = BigDecimal.ZERO;
        private BigDecimal div9 = BigDecimal.ZERO;
        private String divideData = "";
        private BigDecimal dotvalue = BigDecimal.ZERO;
        private String dummyHold = "";
        private String dummyRecord = "";
        private String enderDesc = "ERRORS ENCOUNTERED";
        private BigDecimal errorCounter = BigDecimal.ZERO;
        private BigDecimal errorHold = BigDecimal.ZERO;
        private String errorTotal = "";
        private BigDecimal executed = BigDecimal.ZERO;
        private BigDecimal fail = BigDecimal.ZERO;
        private BigDecimal failed = BigDecimal.ZERO;
        private BigDecimal fctc = BigDecimal.ZERO;
        private String feature = "";
        private BigDecimal further = BigDecimal.ZERO;
        private BigDecimal gr1 = BigDecimal.ZERO;
        private BigDecimal have = BigDecimal.ZERO;
        private String hyphenLine = "";
        private String idAgain = "";
        private BigDecimal ignored = BigDecimal.ZERO;
        private String infAnsiReference = "";
        private String infoText = "";
        private BigDecimal information = BigDecimal.ZERO;
        private BigDecimal inspectCounter = BigDecimal.ZERO;
        private BigDecimal inspection = BigDecimal.ZERO;
        private BigDecimal inspt = BigDecimal.ZERO;
        private BigDecimal iv41 = BigDecimal.ZERO;
        private BigDecimal mpyTestF113 = BigDecimal.ZERO;
        private BigDecimal mpyTestF114 = BigDecimal.ZERO;
        private BigDecimal mpyTestF117 = BigDecimal.ZERO;
        private BigDecimal mpyTestF118 = BigDecimal.ZERO;
        private BigDecimal mpyTestF119 = BigDecimal.ZERO;
        private BigDecimal mpyTestF120 = BigDecimal.ZERO;
        private BigDecimal mpyTestF121 = BigDecimal.ZERO;
        private BigDecimal mpyTestF122 = BigDecimal.ZERO;
        private BigDecimal mpyTestF123 = BigDecimal.ZERO;
        private BigDecimal mpyTestF124 = BigDecimal.ZERO;
        private BigDecimal mpyTestF125 = BigDecimal.ZERO;
        private BigDecimal mpyTestF126 = BigDecimal.ZERO;
        private BigDecimal mpyTestF15 = BigDecimal.ZERO;
        private BigDecimal mpyTestF16 = BigDecimal.ZERO;
        private BigDecimal mult1 = new BigDecimal("80.12");
        private BigDecimal mult2 = BigDecimal.ZERO;
        private BigDecimal mult3 = BigDecimal.ZERO;
        private BigDecimal mult4 = new BigDecimal("-56");
        private BigDecimal mult5 = new BigDecimal("4");
        private BigDecimal mult6 = new BigDecimal("20");
        private String multiplyData = "";
        private BigDecimal no = BigDecimal.ZERO;
        private BigDecimal occurred = BigDecimal.ZERO;
        private String pOrF = "";
        private String parName = "";
        private String pardotX = "";
        private BigDecimal pass = BigDecimal.ZERO;
        private BigDecimal passCounter = BigDecimal.ZERO;
        private String printRec = "";
        private BigDecimal program = BigDecimal.ZERO;
        private String reMark = "";
        private BigDecimal recCt = BigDecimal.ZERO;
        private BigDecimal recSklSub = BigDecimal.ZERO;
        private BigDecimal recordCount = BigDecimal.ZERO;
        private BigDecimal require = BigDecimal.ZERO;
        private BigDecimal scope = BigDecimal.ZERO;
        private BigDecimal see = BigDecimal.ZERO;
        private BigDecimal should = BigDecimal.ZERO;
        private BigDecimal terminator = BigDecimal.ZERO;
        private String testComputed = "";
        private String testCorrect = "";
        private String testId = "";
        private String testResults = "";
        private BigDecimal times = BigDecimal.ZERO;
        private BigDecimal totalError = BigDecimal.ZERO;
        private BigDecimal vi106 = BigDecimal.ZERO;
        private BigDecimal vi67 = BigDecimal.ZERO;
        private String wrkAnX181 = "";
        private BigDecimal wrkCs02v02 = BigDecimal.ZERO;
        private BigDecimal wrkCs18v00 = BigDecimal.ZERO;
        private BigDecimal wrkDs01v00 = BigDecimal.ZERO;
        private BigDecimal wrkDs0201p = BigDecimal.ZERO;
        private BigDecimal wrkDs02v00 = BigDecimal.ZERO;
        private BigDecimal wrkDs03v10 = BigDecimal.ZERO;
        private BigDecimal wrkDs05v00 = BigDecimal.ZERO;
        private BigDecimal wrkDs06v06 = BigDecimal.ZERO;
        private BigDecimal wrkDs09v08 = BigDecimal.ZERO;
        private BigDecimal wrkDs09v09 = BigDecimal.ZERO;
        private BigDecimal wrkDs10v00 = BigDecimal.ZERO;
        private BigDecimal wrkDs12v00 = BigDecimal.ZERO;
        private BigDecimal wrkDs12v00S = BigDecimal.ZERO;
        private BigDecimal wrkDs16v21 = new BigDecimal("-9999999999999999.99");
        private BigDecimal wrkDs17v00S = BigDecimal.ZERO;
        private BigDecimal wrkDs18v00 = BigDecimal.ZERO;
        private BigDecimal wrkDs18v00S = BigDecimal.ZERO;
        private BigDecimal wrkDs1v01 = new BigDecimal("-3");
        private BigDecimal wrkDs1v02 = new BigDecimal("2");
        private BigDecimal wrkDs1v21 = BigDecimal.ZERO;
        private BigDecimal wrkDs2v01 = BigDecimal.ZERO;
        private BigDecimal wrkDs2v11 = BigDecimal.ZERO;
        private BigDecimal wrkDs2v21 = BigDecimal.ZERO;
        private BigDecimal wrkDs2v22 = new BigDecimal("-12.34");
        private BigDecimal wrkDu0v11 = new BigDecimal(".3");
        private BigDecimal wrkDu0v121 = new BigDecimal(".00001");
        private BigDecimal wrkDu0v21 = new BigDecimal(".25");
        private BigDecimal wrkDu16v21 = new BigDecimal("9999999999999999.99");
        private BigDecimal wrkDu18v00 = BigDecimal.ZERO;
        private BigDecimal wrkDu1v01 = BigDecimal.ZERO;
        private BigDecimal wrkDu1v11 = new BigDecimal("1.1");
        private BigDecimal wrkDu1v12 = new BigDecimal("2.4");
        private BigDecimal wrkDu1v171 = new BigDecimal("3.14159265358979323");
        private BigDecimal wrkDu1v31 = new BigDecimal("1.001");
        private BigDecimal wrkDu1v32 = new BigDecimal("1.001");
        private BigDecimal wrkDu1v51 = BigDecimal.ZERO;
        private BigDecimal wrkDu2p41 = new BigDecimal("990000");
        private BigDecimal wrkDu2v01 = BigDecimal.ZERO;
        private BigDecimal wrkDu2v02 = BigDecimal.ZERO;
        private BigDecimal wrkDu2v03 = BigDecimal.ZERO;
        private BigDecimal wrkDu2v11 = BigDecimal.ZERO;
        private BigDecimal wrkDu2v12 = BigDecimal.ZERO;
        private BigDecimal wrkDu2v13 = BigDecimal.ZERO;
        private BigDecimal wrkDu2v21 = new BigDecimal("15.44");
        private BigDecimal wrkDu2v22 = new BigDecimal("60.89");
        private BigDecimal wrkDu2v23 = new BigDecimal("60.99");
        private BigDecimal wrkDu2v24 = new BigDecimal("60.99");
        private BigDecimal wrkDu2v25 = new BigDecimal("10.00");
        private BigDecimal wrkDu2v51 = BigDecimal.ZERO;
        private String wrkDu4p11 = ".00001";
        private BigDecimal wrkDu5v11 = new BigDecimal("12345.6");
        private BigDecimal wrkDu6v01 = new BigDecimal("99999");
        private BigDecimal wrkDu6v02 = new BigDecimal("99999");
        private String wrkDuX18v01 = "";
        private String wrkNe1 = "";
        private BigDecimal wrkNe2 = BigDecimal.ZERO;
        private BigDecimal wrkNe3 = BigDecimal.ZERO;
        private BigDecimal wrkNe4 = BigDecimal.ZERO;
        private BigDecimal wrkNeX1 = BigDecimal.ZERO;
        private BigDecimal wrkNeX2 = BigDecimal.ZERO;
        private String wrkXn00001 = "";
        private String wrkXn181 = "";
        private BigDecimal wrongly = BigDecimal.ZERO;
        private String xray = "";
        private String xxcomputed = "";
        private String xxcorrect = "";
        private String xxinfo = "";
    }

    /**
     * Stateless COBOL PROCEDURE DIVISION entry point (allocates fresh ProgramState).
     */
    public ReturnCodeResponse execute() {
        return this.execute(new ProgramState());
    }

    /**
     * Thread-safe COBOL PROCEDURE DIVISION entry point with isolated per-request state.
     */
    public ReturnCodeResponse execute(ProgramState requestState) {
        ProgramState state = requestState != null ? requestState : new ProgramState();
        this.openFiles(state);
        ReturnCodeResponse rc = new ReturnCodeResponse();
        rc.setCode("00");
        rc.setMessage("Executed NC101A");
        rc.setState(state);
        return rc;
    }

    /**
     * OPEN-FILES (PROCESS) - L318-323
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void openFiles(ProgramState state) {
        // COBOL OPEN: OPEN     OUTPUT PRINT-FILE.
        state.testId = toStr(state.ccvsPgmId);
        state.idAgain = toStr(state.ccvsPgmId);
        state.testResults = "";
        this.headRoutine(state);
        this.columnNamesRoutine(state);
        return; // COBOL GO TO CCVS1-EXIT
    }

    /**
     * CLOSE-FILES (PROCESS) - L324-325
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void closeFiles(ProgramState state) {
        this.endRoutine(state);
        this.endRtnExit(state);
        this.endRoutine1(state);
        this.endRoutine12(state);
        this.endRoutine13(state);
        // COBOL CLOSE: CLOSE PRINT-FILE.
    }

    /**
     * TERMINATE-CALL (LEAF) - L328-334
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void terminateCall(ProgramState state) {
        return;
        // COBOL INSPT: INSPT.
        state.pOrF = "INSPT";
        // COBOL: COMPUTE INSPECT-COUNTER = INSPECT-COUNTER + 1
        state.inspectCounter = toBd(state.inspectCounter).add(toBd(new BigDecimal("1")));
        // COBOL PASS: PASS.
        state.pOrF = "PASS ";
        // COBOL: COMPUTE PASS-COUNTER = PASS-COUNTER + 1
        state.passCounter = toBd(state.passCounter).add(toBd(new BigDecimal("1")));
        // COBOL FAIL: FAIL.
        state.pOrF = "FAIL*";
        // COBOL: COMPUTE ERROR-COUNTER = ERROR-COUNTER + 1
        state.errorCounter = toBd(state.errorCounter).add(toBd(new BigDecimal("1")));
        // COBOL DE-LETE: DE-LETE.
        state.pOrF = "*****";
        // COBOL: COMPUTE DELETE-COUNTER = DELETE-COUNTER + 1
        state.deleteCounter = toBd(state.deleteCounter).add(toBd(new BigDecimal("1")));
        state.reMark = "****TEST DELETED****";
    }

    /**
     * PRINT-DETAIL (PROCESS) - L335-346
     * Branches: 3, GOTO: 0, CALLs: 4
     */
    private void printDetail(ProgramState state) {
        // COBOL IF: REC-CT NOT EQUAL TO ZERO
        if (cmp(state.recCt, BigDecimal.ZERO) != 0) {
            state.pardotX = ".";
            state.dotvalue = toBd(state.recCt);
        }
        state.printRec = toStr(state.testResults);
        this.writeLine(state);
        // COBOL IF: P-OR-F EQUAL TO "FAIL*"
        if (cmp(state.pOrF, "FAIL*") == 0) {
            this.writeLine(state);
            this.failRoutine(state);
        } else {
            this.bailOut(state);
        }
        state.pOrF = "";
        state.computedX = "";
        state.correctX = "";
        // COBOL IF: REC-CT EQUAL TO ZERO
        if (cmp(state.recCt, BigDecimal.ZERO) == 0) {
            state.parName = "";
        }
        state.reMark = "";
    }

    /**
     * HEAD-ROUTINE (PROCESS) - L347-351
     * Branches: 0, GOTO: 0, CALLs: 4
     */
    private void headRoutine(ProgramState state) {
        state.dummyRecord = toStr(state.ccvsH1);
        while (!(true)) {
            this.writeLine(state);
        }
        state.dummyRecord = toStr(state.ccvsH2a);
        while (!(true)) {
            this.writeLine(state);
        }
        state.dummyRecord = toStr(state.ccvsH2b);
        while (!(true)) {
            this.writeLine(state);
        }
        state.dummyRecord = toStr(state.ccvsH3);
        while (!(true)) {
            this.writeLine(state);
        }
    }

    /**
     * COLUMN-NAMES-ROUTINE (PROCESS) - L352-355
     * Branches: 0, GOTO: 0, CALLs: 3
     */
    private void columnNamesRoutine(ProgramState state) {
        state.dummyRecord = toStr(state.ccvsC1);
        this.writeLine(state);
        state.dummyRecord = toStr(state.ccvsC2);
        while (!(true)) {
            this.writeLine(state);
        }
        state.dummyRecord = toStr(state.hyphenLine);
        this.writeLine(state);
    }

    /**
     * END-ROUTINE (PROCESS) - L356-357
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void endRoutine(ProgramState state) {
        state.dummyRecord = toStr(state.hyphenLine);
        while (!(true)) {
            this.writeLine(state);
        }
    }

    /**
     * END-RTN-EXIT (PROCESS) - L358-359
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void endRtnExit(ProgramState state) {
        state.dummyRecord = toStr(state.ccvsE1);
        while (!(true)) {
            this.writeLine(state);
        }
    }

    /**
     * END-ROUTINE-1 (PROCESS) - L360-368
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void endRoutine1(ProgramState state) {
        // COBOL: COMPUTE ERROR-HOLD = ERROR-HOLD + ERROR-COUNTER
        state.errorHold = toBd(state.errorHold).add(toBd(state.errorCounter));
        // COBOL: COMPUTE ERROR-HOLD = ERROR-HOLD + INSPECT-COUNTER
        state.errorHold = toBd(state.errorHold).add(toBd(state.inspectCounter));
        // COBOL: COMPUTE ERROR-HOLD = ERROR-HOLD + DELETE-COUNTER
        state.errorHold = toBd(state.errorHold).add(toBd(state.deleteCounter));
        // COBOL: COMPUTE ERROR-HOLD = ERROR-HOLD + PASS-COUNTER
        state.errorHold = toBd(state.errorHold).add(toBd(state.passCounter));
        state.ccvsE41 = toStr(state.passCounter);
        state.ccvsE42 = toStr(state.errorHold);
        state.ccvsE22 = toStr(state.ccvsE4);
        state.dummyRecord = toStr(state.ccvsE2);
        this.writeLine(state);
    }

    /**
     * END-ROUTINE-12 (PROCESS) - L369-376
     * Branches: 1, GOTO: 0, CALLs: 1
     */
    private void endRoutine12(ProgramState state) {
        state.enderDesc = "TEST(S) FAILED";
        // COBOL IF: ERROR-COUNTER IS EQUAL TO ZERO
        if (cmp(state.errorCounter, BigDecimal.ZERO) == 0) {
            state.errorTotal = "NO ";
        } else {
            state.errorTotal = toStr(state.errorCounter);
        }
        state.dummyRecord = toStr(state.ccvsE2);
        this.writeLine(state);
    }

    /**
     * END-ROUTINE-13 (PROCESS) - L377-388
     * Branches: 2, GOTO: 0, CALLs: 3
     */
    private void endRoutine13(ProgramState state) {
        // COBOL IF: DELETE-COUNTER IS EQUAL TO ZERO
        if (cmp(state.deleteCounter, BigDecimal.ZERO) == 0) {
            state.errorTotal = "NO ";
        } else {
            state.errorTotal = toStr(state.deleteCounter);
        }
        state.enderDesc = "TEST(S) DELETED     ";
        state.dummyRecord = toStr(state.ccvsE2);
        this.writeLine(state);
        // COBOL IF: INSPECT-COUNTER EQUAL TO ZERO
        if (cmp(state.inspectCounter, BigDecimal.ZERO) == 0) {
            state.errorTotal = "NO ";
        } else {
            state.errorTotal = toStr(state.inspectCounter);
        }
        state.enderDesc = "TEST(S) REQUIRE INSPECTION";
        state.dummyRecord = toStr(state.ccvsE2);
        this.writeLine(state);
        state.dummyRecord = toStr(state.ccvsE3);
        this.writeLine(state);
    }

    /**
     * WRITE-LINE (PROCESS) - L389-404
     * Branches: 1, GOTO: 0, CALLs: 8
     */
    private void writeLine(ProgramState state) {
        // COBOL: COMPUTE RECORD-COUNT = RECORD-COUNT + 1
        state.recordCount = toBd(state.recordCount).add(toBd(new BigDecimal("1")));
        // COBOL IF: RECORD-COUNT GREATER 42
        if (isTruthy(state.recordCount)) {
            state.dummyHold = toStr(state.dummyRecord);
            state.dummyRecord = "";
            // COBOL WRITE: WRITE DUMMY-RECORD AFTER ADVANCING PAGE
            state.dummyRecord = toStr(state.ccvsH1);
            while (!(true)) {
                this.wrtLn(state);
            }
            state.dummyRecord = toStr(state.ccvsH2a);
            while (!(true)) {
                this.wrtLn(state);
            }
            state.dummyRecord = toStr(state.ccvsH2b);
            while (!(true)) {
                this.wrtLn(state);
            }
            state.dummyRecord = toStr(state.ccvsH3);
            while (!(true)) {
                this.wrtLn(state);
            }
            state.dummyRecord = toStr(state.ccvsC1);
            this.wrtLn(state);
            state.dummyRecord = toStr(state.ccvsC2);
            this.wrtLn(state);
            state.dummyRecord = toStr(state.hyphenLine);
            this.wrtLn(state);
            state.dummyRecord = toStr(state.dummyHold);
            state.recordCount = BigDecimal.ZERO;
        }
        this.wrtLn(state);
    }

    /**
     * WRT-LN (LEAF) - L405-407
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void wrtLn(ProgramState state) {
        // COBOL WRITE: WRITE    DUMMY-RECORD AFTER ADVANCING 1 LINES.
        state.dummyRecord = "";
    }

    /**
     * BLANK-LINE-PRINT (PROCESS) - L408-409
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void blankLinePrint(ProgramState state) {
        this.wrtLn(state);
    }

    /**
     * FAIL-ROUTINE (PROCESS) - L410-418
     * Branches: 2, GOTO: 3, CALLs: 1
     */
    private void failRoutine(ProgramState state) {
        // COBOL IF: COMPUTED-X NOT EQUAL TO SPACE
        if (cmp(state.computedX, "") != 0) {
            this.failRoutineWrite(state); // COBOL GO TO FAIL-ROUTINE-WRITE
            return;
        }
        // COBOL IF: CORRECT-X NOT EQUAL TO SPACE
        if (cmp(state.correctX, "") != 0) {
            this.failRoutineWrite(state); // COBOL GO TO FAIL-ROUTINE-WRITE
            return;
        }
        state.infAnsiReference = toStr(state.ansiReference);
        state.infoText = "NO FURTHER INFORMATION, SEE PROGRAM.";
        state.dummyRecord = toStr(state.xxinfo);
        while (!(true)) {
            this.writeLine(state);
        }
        state.infAnsiReference = "";
        return; // COBOL GO TO FAIL-ROUTINE-EX
    }

    /**
     * FAIL-ROUTINE-WRITE (PROCESS) - L419-424
     * Branches: 0, GOTO: 0, CALLs: 2
     */
    private void failRoutineWrite(ProgramState state) {
        state.printRec = toStr(state.testComputed);
        this.writeLine(state);
        state.corAnsiReference = toStr(state.ansiReference);
        state.printRec = toStr(state.testCorrect);
        while (!(true)) {
            this.writeLine(state);
        }
        state.corAnsiReference = "";
        // COBOL FAIL-ROUTINE-EX: FAIL-ROUTINE-EX.
    }

    /**
     * BAIL-OUT (LEAF) - L425-427
     * Branches: 2, GOTO: 2, CALLs: 0
     */
    private void bailOut(ProgramState state) {
        // COBOL IF: COMPUTED-A NOT EQUAL TO SPACE
        if (cmp(state.computedA, "") != 0) {
            this.bailOutWrite(state); // COBOL GO TO BAIL-OUT-WRITE
            return;
        }
        // COBOL IF: CORRECT-A EQUAL TO SPACE
        if (cmp(state.correctA, "") == 0) {
            return; // COBOL GO TO BAIL-OUT-EX
        }
    }

    /**
     * BAIL-OUT-WRITE (PROCESS) - L428-433
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void bailOutWrite(ProgramState state) {
        state.xxcorrect = toStr(state.correctA);
        state.xxcomputed = toStr(state.computedA);
        state.infAnsiReference = toStr(state.ansiReference);
        state.dummyRecord = toStr(state.xxinfo);
        while (!(true)) {
            this.writeLine(state);
        }
        state.infAnsiReference = "";
        // COBOL BAIL-OUT-EX: BAIL-OUT-EX.
    }

    /**
     * MPY-INIT-F1-1 (INIT) - L437-441
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF11(ProgramState state) {
        state.feature = "MULTIPLY BY";
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.mult1 = new BigDecimal("80.12");
        state.mult5 = new BigDecimal("4");
    }

    /**
     * MPY-TEST-F1-1 (LEAF) - L442-448
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF11(ProgramState state) {
        // COBOL: COMPUTE MULT1 = MULT1 * MULT5
        state.mult1 = toBd(state.mult1).multiply(toBd(state.mult5));
        // COBOL IF: MULT1 EQUAL TO 320.48
        if (cmp(state.mult1, new BigDecimal("320.48")) == 0) {
            // COBOL PERFORM: PERFORM PASS
        } else {
            this.mpyFailF11(state); // COBOL GO TO MPY-FAIL-F1-1
            return;
        }
        this.mpyWriteF11(state); // COBOL GO TO MPY-WRITE-F1-1
        return;
    }

    /**
     * MPY-DELETE-F1-1 (PROCESS) - L449-451
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF11(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF11(state); // COBOL GO TO MPY-WRITE-F1-1
        return;
    }

    /**
     * MPY-FAIL-F1-1 (LEAF) - L452-455
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF11(ProgramState state) {
        // COBOL PERFORM: PERFORM  FAIL.
        state.computedN = toBd(state.mult1);
        // COBOL MOVE: MOVE     +320.48 TO CORRECT-N.
    }

    /**
     * MPY-WRITE-F1-1 (PROCESS) - L456-459
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF11(ProgramState state) {
        state.parName = "MPY-TEST-F1-1 ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-2 (INIT) - L460-462
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF12(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        // COBOL MOVE: MOVE    -56 TO MULT4.
    }

    /**
     * MPY-TEST-F1-2 (LEAF) - L463-469
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF12(ProgramState state) {
        // COBOL: COMPUTE MULT4 = MULT4 * -1.3
        state.mult4 = toBd(state.mult4).multiply(toBd(new BigDecimal("-1.3")));
        // COBOL IF: MULT4 EQUAL TO 73
        if (cmp(state.mult4, new BigDecimal("73")) == 0) {
            // COBOL PERFORM: PERFORM PASS
        } else {
            this.mpyFailF12(state); // COBOL GO TO MPY-FAIL-F1-2
            return;
        }
        this.mpyWriteF12(state); // COBOL GO TO MPY-WRITE-F1-2
        return;
    }

    /**
     * MPY-DELETE-F1-2 (PROCESS) - L470-472
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF12(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF12(state); // COBOL GO TO MPY-WRITE-F1-2
        return;
    }

    /**
     * MPY-FAIL-F1-2 (LEAF) - L473-476
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF12(ProgramState state) {
        // COBOL PERFORM: PERFORM  FAIL.
        state.computedN = toBd(state.mult4);
        // COBOL MOVE: MOVE     +73   TO CORRECT-N.
    }

    /**
     * MPY-WRITE-F1-2 (PROCESS) - L477-480
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF12(ProgramState state) {
        state.parName = "MPY-TEST-F1-2 ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-3-1 (INIT) - L481-484
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF131(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.mult5 = new BigDecimal("4");
        state.xray = "A";
    }

    /**
     * MPY-TEST-F1-3-0 (LEAF) - L485-487
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF130(ProgramState state) {
        // COBOL: COMPUTE MULT5 = MULT5 * MULT5
        state.mult5 = toBd(state.mult5).multiply(toBd(state.mult5));
        state.xray = "K";
    }

    /**
     * MPY-TEST-F1-3-1 (LEAF) - L488-493
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF131(ProgramState state) {
        // COBOL IF: XRAY EQUAL TO "K"
        if (cmp(state.xray, "K") == 0) {
            // COBOL PERFORM: PERFORM PASS
        } else {
            this.mpyFailF131(state); // COBOL GO TO MPY-FAIL-F1-3-1
            return;
        }
        this.mpyWriteF131(state); // COBOL GO TO MPY-WRITE-F1-3-1
        return;
    }

    /**
     * MPY-DELETE-F1-3-1 (PROCESS) - L494-496
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF131(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF131(state); // COBOL GO TO MPY-WRITE-F1-3-1
        return;
    }

    /**
     * MPY-FAIL-F1-3-1 (LEAF) - L497-501
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF131(ProgramState state) {
        state.computedX = toStr(state.xray);
        state.correctX = "A";
        state.reMark = "ON SIZE ERROR NOT EXECUTED";
        // COBOL PERFORM: PERFORM  FAIL.
    }

    /**
     * MPY-WRITE-F1-3-1 (PROCESS) - L502-504
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF131(ProgramState state) {
        state.parName = "MPY-TEST-F1-3-1 ";
        this.printDetail(state);
    }

    /**
     * MPY-TEST-F1-3-2 (LEAF) - L505-510
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF132(ProgramState state) {
        // COBOL IF: MULT5 EQUAL TO 4
        if (cmp(state.mult5, new BigDecimal("4")) == 0) {
            // COBOL PERFORM: PERFORM PASS
        } else {
            this.mpyFailF132(state); // COBOL GO TO MPY-FAIL-F1-3-2
            return;
        }
        this.mpyWriteF132(state); // COBOL GO TO MPY-WRITE-F1-3-2
        return;
    }

    /**
     * MPY-DELETE-F1-3-2 (PROCESS) - L511-513
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF132(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF132(state); // COBOL GO TO MPY-WRITE-F1-3-2
        return;
    }

    /**
     * MPY-FAIL-F1-3-2 (LEAF) - L514-518
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF132(ProgramState state) {
        // COBOL PERFORM: PERFORM  FAIL.
        state.computedN = toBd(state.mult5);
        // COBOL MOVE: MOVE    +4 TO CORRECT-N.
        state.reMark = "WRONGLY AFFECTED BY SIZE ERROR";
    }

    /**
     * MPY-WRITE-F1-3-2 (PROCESS) - L519-522
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF132(ProgramState state) {
        state.parName = "MPY-TEST-F1-3-2";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-4-1 (INIT) - L523-526
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF141(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.mult6 = new BigDecimal("20");
        state.xray = "B";
    }

    /**
     * MPY-TEST-F1-4-O (LEAF) - L527-529
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF14O(ProgramState state) {
        // COBOL: COMPUTE MULT6 = MULT6 * 4.99
        state.mult6 = toBd(state.mult6).multiply(toBd(new BigDecimal("4.99")));
        state.xray = "L";
    }

    /**
     * MPY-TEST-F1-4-1 (LEAF) - L530-535
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF141(ProgramState state) {
        // COBOL IF: XRAY EQUAL TO "L"
        if (cmp(state.xray, "L") == 0) {
            // COBOL PERFORM: PERFORM PASS
        } else {
            this.mpyFailF141(state); // COBOL GO TO MPY-FAIL-F1-4-1
            return;
        }
        this.mpyWriteF141(state); // COBOL GO TO MPY-WRITE-F1-4-1
        return;
    }

    /**
     * MPY-DELETE-F1-4-1 (PROCESS) - L536-538
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF141(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF141(state); // COBOL GO TO MPY-WRITE-F1-4-1
        return;
    }

    /**
     * MPY-FAIL-F1-4-1 (LEAF) - L539-543
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF141(ProgramState state) {
        state.correctX = "L";
        state.computedX = toStr(state.xray);
        state.reMark = "ON SIZE ERROR NOT EXECUTED";
        // COBOL PERFORM: PERFORM  FAIL.
    }

    /**
     * MPY-WRITE-F1-4-1 (PROCESS) - L544-546
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF141(ProgramState state) {
        state.parName = "MPY-TEST-F1-4-1";
        this.printDetail(state);
    }

    /**
     * MPY-TEST-F1-4-2 (LEAF) - L547-552
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF142(ProgramState state) {
        // COBOL IF: MULT6 EQUAL TO 20
        if (cmp(state.mult6, new BigDecimal("20")) == 0) {
            // COBOL PERFORM: PERFORM PASS
        } else {
            this.mpyFailF142(state); // COBOL GO TO MPY-FAIL-F1-4-2
            return;
        }
        this.mpyWriteF142(state); // COBOL GO TO MPY-WRITE-F1-4-2
        return;
    }

    /**
     * MPY-DELETE-F1-4-2 (PROCESS) - L553-555
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF142(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF142(state); // COBOL GO TO MPY-WRITE-F1-4-2
        return;
    }

    /**
     * MPY-FAIL-F1-4-2 (LEAF) - L556-560
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF142(ProgramState state) {
        // COBOL PERFORM: PERFORM  FAIL.
        state.computedN = toBd(state.mult6);
        // COBOL MOVE: MOVE     +20 TO CORRECT-N.
        state.reMark = "WRONGLY AFFECTED BY SIZE ERROR";
    }

    /**
     * MPY-WRITE-F1-4-2 (PROCESS) - L561-564
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF142(ProgramState state) {
        state.parName = "MPY-TEST-F1-4-2";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-5 (INIT) - L565-567
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF15(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.wrkDs18v00 = new BigDecimal("222222222222");
    }

    /**
     * MPY-TEST-F1-5-0 (LEAF) - L568-569
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF150(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-18V00 = WRK-DS-18V00 * A06THREES-DS-03V03
        state.wrkDs18v00 = toBd(state.wrkDs18v00).multiply(toBd(state.a06threesDs03v03));
    }

    /**
     * MPY-TEST-F1-5-1 (LEAF) - L570-574
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF151(ProgramState state) {
        // COBOL IF: WRK-DS-18V00 EQUAL TO 000074073999999925
        if (cmp(state.wrkDs18v00, new BigDecimal("000074073999999925")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF15(state); // COBOL GO TO MPY-WRITE-F1-5
            return;
        }
        this.mpyFailF15(state); // COBOL GO TO MPY-FAIL-F1-5
        return;
    }

    /**
     * MPY-DELETE-F1-5 (PROCESS) - L575-577
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF15(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF15(state); // COBOL GO TO MPY-WRITE-F1-5
        return;
    }

    /**
     * MPY-FAIL-F1-5 (LEAF) - L578-581
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF15(ProgramState state) {
        state.correct18v0 = new BigDecimal("000074073999999925");
        state.computed18v0 = toBd(state.wrkDs18v00);
        // COBOL PERFORM: PERFORM FAIL.
    }

    /**
     * MPY-WRITE-F1-5 (PROCESS) - L582-585
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF15(ProgramState state) {
        state.parName = "MPY-TEST-F1-5 ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-6 (INIT) - L586-588
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF16(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.wrkDs06v06 = toBd(state.a08twosDs02v06);
    }

    /**
     * MPY-TEST-F1-6-0 (LEAF) - L589-590
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF160(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-06V06 = WRK-DS-06V06 * 0.4
        state.wrkDs06v06 = toBd(state.wrkDs06v06).multiply(toBd(new BigDecimal("0.4")));
    }

    /**
     * MPY-TEST-F1-6-1 (LEAF) - L591-595
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF161(ProgramState state) {
        // COBOL IF: WRK-DS-12V00-S EQUAL TO 000008888889
        if (cmp(state.wrkDs12v00S, new BigDecimal("000008888889")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF16(state); // COBOL GO TO MPY-WRITE-F1-6
            return;
        }
        this.mpyFailF16(state); // COBOL GO TO MPY-FAIL-F1-6
        return;
    }

    /**
     * MPY-DELETE-F1-6 (PROCESS) - L596-598
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF16(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF16(state); // COBOL GO TO MPY-WRITE-F1-6
        return;
    }

    /**
     * MPY-FAIL-F1-6 (LEAF) - L599-602
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF16(ProgramState state) {
        state.computed18v0 = toBd(state.wrkDs12v00S);
        state.correct18v0 = new BigDecimal("000008888889");
        // COBOL PERFORM: PERFORM FAIL.
    }

    /**
     * MPY-WRITE-F1-6 (PROCESS) - L603-606
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF16(ProgramState state) {
        state.parName = "MPY-TEST-F1-6         ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-7 (INIT) - L607-610
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF17(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.wrkXn00001 = "0";
        state.wrkDs10v00 = toBd(state.a10onesDs10v00);
    }

    /**
     * MPY-TEST-F1-7-0 (LEAF) - L611-613
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF170(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-10V00 = WRK-DS-10V00 * A12THREES-DS-06V06
        state.wrkDs10v00 = toBd(state.wrkDs10v00).multiply(toBd(state.a12threesDs06v06));
        state.wrkXn00001 = "1";
    }

    /**
     * MPY-TEST-F1-7-1 (LEAF) - L614-618
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF171(ProgramState state) {
        // COBOL IF: WRK-DS-10V00 EQUAL TO 1111111111
        if (cmp(state.wrkDs10v00, new BigDecimal("1111111111")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF171(state); // COBOL GO TO MPY-WRITE-F1-7-1
            return;
        }
        this.mpyFailF171(state); // COBOL GO TO MPY-FAIL-F1-7-1
        return;
    }

    /**
     * MPY-DELETE-F1-7-1 (PROCESS) - L619-621
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF171(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF171(state); // COBOL GO TO MPY-WRITE-F1-7-1
        return;
    }

    /**
     * MPY-FAIL-F1-7-1 (LEAF) - L622-626
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF171(ProgramState state) {
        state.computed18v0 = toBd(state.wrkDs10v00);
        state.correct18v0 = new BigDecimal("1111111111");
        state.reMark = "WRONGLY AFFECTED BY SIZE ERROR";
        // COBOL PERFORM: PERFORM FAIL.
    }

    /**
     * MPY-WRITE-F1-7-1 (PROCESS) - L627-629
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF171(ProgramState state) {
        state.parName = "MPY-TEST-F1-7-1         ";
        this.printDetail(state);
    }

    /**
     * MPY-TEST-F1-7-2 (LEAF) - L630-638
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF172(ProgramState state) {
        // COBOL IF: WRK-XN-00001 EQUAL TO "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF172(state); // COBOL GO TO MPY-WRITE-F1-7-2
            return;
        }
        state.reMark = "ON SIZE ERROR NOT EXECUTED";
        state.correctA = "1";
        state.computedA = toStr(state.wrkXn00001);
        // COBOL PERFORM: PERFORM FAIL.
        this.mpyWriteF172(state); // COBOL GO TO MPY-WRITE-F1-7-2
        return;
    }

    /**
     * MPY-DELETE-F1-7-2 (PROCESS) - L639-640
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyDeleteF172(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
    }

    /**
     * MPY-WRITE-F1-7-2 (PROCESS) - L641-644
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF172(ProgramState state) {
        state.parName = "MPY-TEST-F1-7-2         ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-8 (INIT) - L645-648
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF18(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.wrkXn00001 = "1";
        // COBOL MOVE: MOVE   -99 TO WRK-DS-02V00.
    }

    /**
     * MPY-TEST-F1-8-0 (LEAF) - L649-651
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF180(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-02V00 = WRK-DS-02V00 * AZERO-DS-05V05
        state.wrkDs02v00 = toBd(state.wrkDs02v00).multiply(toBd(state.azeroDs05v05));
        state.wrkXn00001 = "0";
    }

    /**
     * MPY-TEST-F1-8-1 (LEAF) - L652-656
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF181(ProgramState state) {
        // COBOL IF: WRK-DS-02V00 EQUAL TO 00
        if (cmp(state.wrkDs02v00, new BigDecimal("00")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF181(state); // COBOL GO TO MPY-WRITE-F1-8-1
            return;
        }
        this.mpyFailF181(state); // COBOL GO TO MPY-FAIL-F1-8-1
        return;
    }

    /**
     * MPY-DELETE-F1-8-1 (PROCESS) - L657-659
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF181(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF181(state); // COBOL GO TO MPY-WRITE-F1-8-1
        return;
    }

    /**
     * MPY-FAIL-F1-8-1 (LEAF) - L660-663
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF181(ProgramState state) {
        state.computedN = toBd(state.wrkDs02v00);
        state.correctN = new BigDecimal("00");
        // COBOL PERFORM: PERFORM FAIL.
    }

    /**
     * MPY-WRITE-F1-8-1 (PROCESS) - L664-666
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF181(ProgramState state) {
        state.parName = "MPY-TEST-F1-8-1         ";
        this.printDetail(state);
    }

    /**
     * MPY-TEST-F1-8-2 (LEAF) - L667-675
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF182(ProgramState state) {
        // COBOL IF: WRK-XN-00001 EQUAL TO "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF182(state); // COBOL GO TO MPY-WRITE-F1-8-2
            return;
        }
        state.correctA = "1";
        state.computedA = toStr(state.wrkXn00001);
        state.reMark = "ON SIZE ERROR SHOULD NOT BE EXECUTED";
        // COBOL PERFORM: PERFORM FAIL.
        this.mpyWriteF182(state); // COBOL GO TO MPY-WRITE-F1-8-2
        return;
    }

    /**
     * MPY-DELETE-F1-8-2 (PROCESS) - L676-677
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyDeleteF182(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
    }

    /**
     * MPY-WRITE-F1-8-2 (PROCESS) - L678-681
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF182(ProgramState state) {
        state.parName = "MPY-TEST-F1-8-2         ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-9 (INIT) - L682-685
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF19(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.wrkXn00001 = "0";
        // COBOL MOVE: MOVE   -01 TO WRK-DS-02V00.
    }

    /**
     * MPY-TEST-F1-9-0 (LEAF) - L686-688
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF190(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-02V00 = WRK-DS-02V00 * 99.5
        state.wrkDs02v00 = toBd(state.wrkDs02v00).multiply(toBd(new BigDecimal("99.5")));
        state.wrkXn00001 = "1";
    }

    /**
     * MPY-TEST-F1-9-1 (LEAF) - L689-693
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF191(ProgramState state) {
        // COBOL IF: WRK-DS-02V00 EQUAL TO -01
        if (cmp(state.wrkDs02v00, new BigDecimal("-01")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF191(state); // COBOL GO TO MPY-WRITE-F1-9-1
            return;
        }
        this.mpyFailF191(state); // COBOL GO TO MPY-FAIL-F1-9-1
        return;
    }

    /**
     * MPY-DELETE-F1-9-1 (PROCESS) - L694-696
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF191(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF191(state); // COBOL GO TO MPY-WRITE-F1-9-1
        return;
    }

    /**
     * MPY-FAIL-F1-9-1 (LEAF) - L697-701
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF191(ProgramState state) {
        state.computedN = toBd(state.wrkDs02v00);
        // COBOL MOVE: MOVE  -01                TO CORRECT-N.
        state.reMark = "WRONGLY AFFECTED BY SIZE ERROR";
        // COBOL PERFORM: PERFORM FAIL.
    }

    /**
     * MPY-WRITE-F1-9-1 (PROCESS) - L702-704
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF191(ProgramState state) {
        state.parName = "MPY-TEST-F1-9-1         ";
        this.printDetail(state);
    }

    /**
     * MPY-TEST-F1-9-2 (LEAF) - L705-713
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF192(ProgramState state) {
        // COBOL IF: WRK-XN-00001 EQUAL TO "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF192(state); // COBOL GO TO MPY-WRITE-F1-9-2
            return;
        }
        state.correctA = "1";
        state.computedA = toStr(state.wrkXn00001);
        state.reMark = "ON SIZE ERROR NOT EXECUTED";
        // COBOL PERFORM: PERFORM FAIL.
        this.mpyWriteF192(state); // COBOL GO TO MPY-WRITE-F1-9-2
        return;
    }

    /**
     * MPY-DELETE-F1-9-2 (PROCESS) - L714-715
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyDeleteF192(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
    }

    /**
     * MPY-WRITE-F1-9-2 (PROCESS) - L716-719
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF192(ProgramState state) {
        state.parName = "MPY-TEST-F1-9-2         ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-10 (INIT) - L720-723
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF110(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.wrkXn00001 = "1";
        // COBOL MOVE: MOVE   -01 TO WRK-DS-02V00.
    }

    /**
     * MPY-TEST-F1-10-0 (LEAF) - L724-726
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF1100(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-02V00 = WRK-DS-02V00 * 99.4
        state.wrkDs02v00 = toBd(state.wrkDs02v00).multiply(toBd(new BigDecimal("99.4")));
        state.wrkXn00001 = "0";
    }

    /**
     * MPY-TEST-F1-10-1 (LEAF) - L727-731
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF1101(ProgramState state) {
        // COBOL IF: WRK-DS-02V00 EQUAL TO -99
        if (cmp(state.wrkDs02v00, new BigDecimal("-99")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF1101(state); // COBOL GO TO MPY-WRITE-F1-10-1
            return;
        }
        this.mpyFailF1101(state); // COBOL GO TO MPY-FAIL-F1-10-1
        return;
    }

    /**
     * MPY-DELETE-F1-10-1 (PROCESS) - L732-734
     * Branches: 0, GOTO: 1, CALLs: 1
     */
    private void mpyDeleteF1101(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.mpyWriteF1101(state); // COBOL GO TO MPY-WRITE-F1-10-1
        return;
    }

    /**
     * MPY-FAIL-F1-10-1 (LEAF) - L735-738
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyFailF1101(ProgramState state) {
        state.computedN = toBd(state.wrkDs02v00);
        // COBOL MOVE: MOVE  -99                TO CORRECT-N.
        // COBOL PERFORM: PERFORM FAIL.
    }

    /**
     * MPY-WRITE-F1-10-1 (PROCESS) - L739-741
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF1101(ProgramState state) {
        state.parName = "MPY-TEST-F1-10-1         ";
        this.printDetail(state);
    }

    /**
     * MPY-TEST-F1-10-2 (LEAF) - L742-750
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF1102(ProgramState state) {
        // COBOL IF: WRK-XN-00001 EQUAL TO "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF1102(state); // COBOL GO TO MPY-WRITE-F1-10-2
            return;
        }
        state.correctA = "1";
        state.computedA = toStr(state.wrkXn00001);
        state.reMark = "ON SIZE ERROR SHOULD NOT BE EXECUTED";
        // COBOL PERFORM: PERFORM FAIL.
        this.mpyWriteF1102(state); // COBOL GO TO MPY-WRITE-F1-10-2
        return;
    }

    /**
     * MPY-DELETE-F1-10-2 (PROCESS) - L751-752
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyDeleteF1102(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
    }

    /**
     * MPY-WRITE-F1-10-2 (PROCESS) - L753-756
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF1102(ProgramState state) {
        state.parName = "MPY-TEST-F1-10-2         ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-11 (INIT) - L757-759
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF111(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        // COBOL MOVE: MOVE   -990 TO WRK-DS-0201P.
    }

    /**
     * MPY-TEST-F1-11-0 (LEAF) - L760-761
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF1110(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-0201P = WRK-DS-0201P * A01ONE-CS-00V01
        state.wrkDs0201p = toBd(state.wrkDs0201p).multiply(toBd(state.a01oneCs00v01));
    }

    /**
     * MPY-TEST-F1-11 (LEAF) - L762-770
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF111(ProgramState state) {
        state.wrkDs05v00 = toBd(state.wrkDs0201p);
        // COBOL IF: WRK-DS-05V00 EQUAL TO -00090
        if (cmp(state.wrkDs05v00, new BigDecimal("-00090")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF111(state); // COBOL GO TO MPY-WRITE-F1-11
            return;
        }
        // COBOL MOVE: MOVE -00090 TO CORRECT-N.
        state.computedN = toBd(state.wrkDs05v00);
        // COBOL PERFORM: PERFORM FAIL.
        this.mpyWriteF111(state); // COBOL GO TO MPY-WRITE-F1-11
        return;
    }

    /**
     * MPY-DELETE-F1-11 (PROCESS) - L771-772
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyDeleteF111(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
    }

    /**
     * MPY-WRITE-F1-11 (PROCESS) - L773-776
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF111(ProgramState state) {
        state.parName = "MPY-TEST-F1-11         ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-12 (INIT) - L777-779
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF112(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.wrkCs18v00 = toBd(state.a18onesDs18v00);
    }

    /**
     * MPY-TEST-F1-12-0 (LEAF) - L780-781
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyTestF1120(ProgramState state) {
        // COBOL: COMPUTE WRK-CS-18V00 = WRK-CS-18V00 * A01ONE-DS-P0801
        state.wrkCs18v00 = toBd(state.wrkCs18v00).multiply(toBd(state.a01oneDsP0801));
    }

    /**
     * MPY-TEST-F1-12 (LEAF) - L782-790
     * Branches: 1, GOTO: 2, CALLs: 0
     */
    private void mpyTestF112(ProgramState state) {
        state.wrkDu18v00 = toBd(state.wrkCs18v00);
        // COBOL IF: WRK-DU-18V00 EQUAL TO 000000000111111111
        if (cmp(state.wrkDu18v00, new BigDecimal("000000000111111111")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.mpyWriteF112(state); // COBOL GO TO MPY-WRITE-F1-12
            return;
        }
        state.correct18v0 = new BigDecimal("000000000111111111");
        state.computed18v0 = toBd(state.wrkDu18v00);
        // COBOL PERFORM: PERFORM FAIL.
        this.mpyWriteF112(state); // COBOL GO TO MPY-WRITE-F1-12
        return;
    }

    /**
     * MPY-DELETE-F1-12 (PROCESS) - L791-792
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyDeleteF112(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
    }

    /**
     * MPY-WRITE-F1-12 (PROCESS) - L793-797
     * Branches: 0, GOTO: 0, CALLs: 1
     */
    private void mpyWriteF112(ProgramState state) {
        state.parName = "MPY-TEST-F1-12         ";
        this.printDetail(state);
    }

    /**
     * MPY-INIT-F1-13 (INIT) - L798-804
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF113(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2 ";
        state.parName = "MPY-TEST-F1-13       ";
        state.wrkXn00001 = "0";
        state.wrkDs10v00 = new BigDecimal("1111111111");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-13-0 (LEAF) - L805-809
     * Branches: 0, GOTO: 2, CALLs: 0
     */
    private void mpyTestF1130(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-10V00 = WRK-DS-10V00 * A12THREES-DS-06V06
        state.wrkDs10v00 = toBd(state.wrkDs10v00).multiply(toBd(state.a12threesDs06v06));
        this.mpyTestF1131(state); // COBOL GO TO MPY-TEST-F1-13-1
        return;
        state.wrkXn00001 = "1";
        this.mpyTestF1131(state); // COBOL GO TO MPY-TEST-F1-13-1
        return;
    }

    /**
     * MPY-DELETE-F1-13 (PROCESS) - L810-813
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF113(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF114(state); // COBOL GO TO MPY-INIT-F1-14
        return;
    }

    /**
     * MPY-TEST-F1-13-1 (PROCESS) - L814-825
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1131(ProgramState state) {
        state.parName = "MPY-TEST-F1-13-1";
        // COBOL IF: WRK-XN-00001 = "0"
        if (cmp(state.wrkXn00001, "0") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "0";
            state.reMark = "SIZE ERROR SHOULD HAVE OCCURRED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-13-2 (PROCESS) - L826-838
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1132(ProgramState state) {
        state.parName = "MPY-TEST-F1-13-2";
        // COBOL IF: WRK-DS-10V00 = 1111111111
        if (cmp(state.wrkDs10v00, new BigDecimal("1111111111")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computed18v0 = toBd(state.wrkDs10v00);
            state.correct18v0 = new BigDecimal("1111111111");
            state.reMark = "SIZE ERROR SHOULD HAVE OCCURRED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-14 (INIT) - L839-845
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF114(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2 ";
        state.parName = "MPY-TEST-F1-14        ";
        state.wrkXn00001 = "1";
        state.recCt = new BigDecimal("1");
        // COBOL MOVE: MOVE   -99 TO WRK-DS-02V00.
    }

    /**
     * MPY-TEST-F1-14-0 (LEAF) - L846-850
     * Branches: 0, GOTO: 2, CALLs: 0
     */
    private void mpyTestF1140(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-02V00 = WRK-DS-02V00 * AZERO-DS-05V05
        state.wrkDs02v00 = toBd(state.wrkDs02v00).multiply(toBd(state.azeroDs05v05));
        this.mpyTestF1141(state); // COBOL GO TO MPY-TEST-F1-14-1
        return;
        state.wrkXn00001 = "0";
        this.mpyTestF1141(state); // COBOL GO TO MPY-TEST-F1-14-1
        return;
    }

    /**
     * MPY-DELETE-F1-14 (PROCESS) - L851-854
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF114(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF115(state); // COBOL GO TO MPY-INIT-F1-15
        return;
    }

    /**
     * MPY-TEST-F1-14-1 (PROCESS) - L855-867
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1141(ProgramState state) {
        state.parName = "MPY-TEST-F1-14-1";
        // COBOL IF: WRK-XN-00001 = "0"
        if (cmp(state.wrkXn00001, "0") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "0";
            state.reMark = "NOT ON SIZE ERROR SHOULD BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-14-2 (PROCESS) - L868-879
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1142(ProgramState state) {
        state.parName = "MPY-TEST-F1-14-2";
        // COBOL IF: WRK-DS-02V00 = 00
        if (cmp(state.wrkDs02v00, new BigDecimal("00")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs02v00);
            state.correctN = new BigDecimal("00");
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-15 (INIT) - L880-885
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF115(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2 ";
        state.wrkXn00001 = "0";
        state.wrkDs10v00 = new BigDecimal("1111111111");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-15-0 (LEAF) - L886-890
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1150(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-10V00 = WRK-DS-10V00 * A12THREES-DS-06V06
        state.wrkDs10v00 = toBd(state.wrkDs10v00).multiply(toBd(state.a12threesDs06v06));
        state.wrkXn00001 = "1";
        state.wrkXn00001 = "2";
        this.mpyTestF1151(state); // COBOL GO TO MPY-TEST-F1-15-1
        return;
    }

    /**
     * MPY-DELETE-F1-15 (PROCESS) - L891-894
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF115(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF116(state); // COBOL GO TO MPY-INIT-F1-16
        return;
    }

    /**
     * MPY-TEST-F1-15-1 (PROCESS) - L895-906
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1151(ProgramState state) {
        state.parName = "MPY-TEST-F1-15-1";
        // COBOL IF: WRK-XN-00001 = "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "1";
            state.reMark = "SIZE ERROR SHOULD HAVE OCCURRED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-15-2 (PROCESS) - L907-919
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1152(ProgramState state) {
        state.parName = "MPY-TEST-F1-15-2";
        // COBOL IF: WRK-DS-10V00 = 1111111111
        if (cmp(state.wrkDs10v00, new BigDecimal("1111111111")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computed18v0 = toBd(state.wrkDs10v00);
            state.correct18v0 = new BigDecimal("1111111111");
            state.reMark = "WRONGLY AFFECTED BY SIZE ERROR";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-16 (INIT) - L920-925
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF116(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2 ";
        state.wrkXn00001 = "0";
        // COBOL MOVE: MOVE   -99 TO WRK-DS-02V00.
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-16-0 (LEAF) - L926-930
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1160(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-02V00 = WRK-DS-02V00 * AZERO-DS-05V05
        state.wrkDs02v00 = toBd(state.wrkDs02v00).multiply(toBd(state.azeroDs05v05));
        state.wrkXn00001 = "1";
        state.wrkXn00001 = "2";
        this.mpyTestF1161(state); // COBOL GO TO MPY-TEST-F1-16-1
        return;
    }

    /**
     * MPY-DELETE-F1-16 (PROCESS) - L931-934
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF116(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF117(state); // COBOL GO TO MPY-INIT-F1-17
        return;
    }

    /**
     * MPY-TEST-F1-16-1 (PROCESS) - L935-947
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1161(ProgramState state) {
        state.parName = "MPY-TEST-F1-16-1";
        // COBOL IF: WRK-XN-00001 = "2"
        if (cmp(state.wrkXn00001, "2") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "2";
            state.reMark = "NOT ON SIZE ERROR SHOULD BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-16-2 (PROCESS) - L948-960
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1162(ProgramState state) {
        state.parName = "MPY-TEST-F1-16-2";
        // COBOL IF: WRK-DS-02V00 = 00
        if (cmp(state.wrkDs02v00, new BigDecimal("00")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs02v00);
            state.correctN = new BigDecimal("00");
            state.reMark = "WRONGLY AFFECTED BY SIZE ERROR";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-17 (INIT) - L961-967
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF117(ProgramState state) {
        state.ansiReference = "VI-106 6.19.4 GR1";
        state.parName = "MPY-TEST-F1-17";
        // COBOL MOVE: MOVE    .00001  TO WRK-DU-4P1-1.
        state.wrkDu5v11 = new BigDecimal("12345.6");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-17-0 (LEAF) - L968-971
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1170(ProgramState state) {
        // COBOL: COMPUTE WRK-DU-5V1-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 = WRK-DU-5V1-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 * WRK-DU-4P1-1
        state.wrkDu5v11 = toBd(state.wrkDu5v11);
        this.mpyTestF1171(state); // COBOL GO TO MPY-TEST-F1-17-1
        return;
    }

    /**
     * MPY-DELETE-F1-17 (PROCESS) - L972-976
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF117(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        state.feature = "*DELETED BY FCTC*";
        this.printDetail(state);
        this.mpyInitF118(state); // COBOL GO TO MPY-INIT-F1-18
        return;
    }

    /**
     * MPY-TEST-F1-17-1 (PROCESS) - L977-982
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1171(ProgramState state) {
        // COBOL IF: WRK-DU-5V1-1 = .1
        if (cmp(state.wrkDu5v11, new BigDecimal("1")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu5v11);
            // COBOL MOVE: MOVE .1 TO CORRECT-N
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-17-2 (PROCESS) - L983-988
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1172(ProgramState state) {
        // COBOL IF: WRK-DU-2P4-1 = 0
        if (cmp(state.wrkDu2p41, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2p41);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-17-3 (PROCESS) - L989-994
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1173(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-1 = 1
        if (cmp(state.wrkDu6v01, new BigDecimal("1")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v01);
            state.correctN = new BigDecimal("1");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-17-4 (PROCESS) - L995-1000
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1174(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-2 = 0
        if (cmp(state.wrkDu6v02, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v02);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-17-5 (PROCESS) - L1001-1006
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1175(ProgramState state) {
        // COBOL IF: WRK-DU-0V12-1 = .0000000001
        if (cmp(state.wrkDu0v121, new BigDecimal("0000000001")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computed0v18 = toBd(state.wrkDu0v121);
            // COBOL MOVE: MOVE .0000000001 TO CORRECT-0V18
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-18 (INIT) - L1007-1020
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF118(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2";
        state.parName = "MPY-TEST-F1-18";
        state.wrkXn00001 = "0";
        state.wrkDu2p41 = new BigDecimal("0");
        state.wrkDu6v01 = new BigDecimal("0");
        state.wrkDu6v02 = new BigDecimal("0");
        state.wrkDu0v121 = new BigDecimal("0");
        state.wrkDu2v01 = new BigDecimal("99");
        state.wrkDu5v11 = new BigDecimal("12345.6");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-18-0 (LEAF) - L1021-1025
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1180(ProgramState state) {
        // COBOL: COMPUTE WRK-DU-2V0-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 = WRK-DU-2V0-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 * WRK-DU-5V1-1
        state.wrkDu2v01 = toBd(state.wrkDu2v01);
        state.wrkXn00001 = "1";
        this.mpyTestF1181(state); // COBOL GO TO MPY-TEST-F1-18-1
        return;
    }

    /**
     * MPY-DELETE-F1-18 (PROCESS) - L1026-1030
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF118(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        state.feature = "*DELETED BY FCTC*";
        this.printDetail(state);
        this.mpyInitF119(state); // COBOL GO TO MPY-INIT-F1-19
        return;
    }

    /**
     * MPY-TEST-F1-18-1 (PROCESS) - L1031-1036
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1181(ProgramState state) {
        // COBOL IF: WRK-DU-2V0-1 = 99
        if (cmp(state.wrkDu2v01, new BigDecimal("99")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2v01);
            state.correctN = new BigDecimal("99");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-18-2 (PROCESS) - L1037-1042
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1182(ProgramState state) {
        // COBOL IF: WRK-DU-2P4-1 = 0
        if (cmp(state.wrkDu2p41, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2p41);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-18-3 (PROCESS) - L1043-1048
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1183(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-1 = 0
        if (cmp(state.wrkDu6v01, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v01);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-18-4 (PROCESS) - L1049-1054
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1184(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-2 = 0
        if (cmp(state.wrkDu6v02, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v02);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-18-5 (PROCESS) - L1055-1060
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1185(ProgramState state) {
        // COBOL IF: WRK-DU-0V12-1 = 0
        if (cmp(state.wrkDu0v121, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computed0v18 = toBd(state.wrkDu0v121);
            state.correct0v18 = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-18-6 (PROCESS) - L1061-1071
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1186(ProgramState state) {
        // COBOL IF: WRK-XN-00001 = "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.reMark = "ON SIZE ERROR SHOULD HAVE EXECUTED";
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "1";
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-19 (INIT) - L1072-1086
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF119(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2";
        state.parName = "MPY-TEST-F1-19";
        state.wrkXn00001 = "0";
        state.wrkDu2p41 = new BigDecimal("0");
        state.wrkDu6v01 = new BigDecimal("0");
        state.wrkDu6v02 = new BigDecimal("0");
        // COBOL MOVE: MOVE   .00001  TO WRK-DU-0V12-1.
        state.wrkDu2v01 = new BigDecimal("99");
        state.wrkDu5v11 = new BigDecimal("12345.6");
        // COBOL MOVE: MOVE .00001 TO WRK-DU-4P1-1.
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-19-0 (LEAF) - L1087-1092
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1190(ProgramState state) {
        // COBOL: COMPUTE WRK-DU-5V1-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 = WRK-DU-5V1-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 * WRK-DU-4P1-1
        state.wrkDu5v11 = toBd(state.wrkDu5v11);
        state.wrkXn00001 = "1";
        this.mpyTestF1191(state); // COBOL GO TO MPY-TEST-F1-19-1
        return;
    }

    /**
     * MPY-DELETE-F1-19 (PROCESS) - L1093-1097
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF119(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        state.feature = "*DELETED BY FCTC*";
        this.printDetail(state);
        this.mpyInitF120(state); // COBOL GO TO MPY-INIT-F1-20
        return;
    }

    /**
     * MPY-TEST-F1-19-1 (PROCESS) - L1098-1103
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1191(ProgramState state) {
        // COBOL IF: WRK-DU-5V1-1 = .1
        if (cmp(state.wrkDu5v11, new BigDecimal("1")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu5v11);
            // COBOL MOVE: MOVE .1 TO CORRECT-N
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-19-2 (PROCESS) - L1104-1109
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1192(ProgramState state) {
        // COBOL IF: WRK-DU-2P4-1 = 0
        if (cmp(state.wrkDu2p41, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2p41);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-19-3 (PROCESS) - L1110-1115
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1193(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-1 = 0
        if (cmp(state.wrkDu6v01, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v01);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-19-4 (PROCESS) - L1116-1121
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1194(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-2 = 0
        if (cmp(state.wrkDu6v02, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v02);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-19-5 (PROCESS) - L1122-1127
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1195(ProgramState state) {
        // COBOL IF: WRK-DU-0V12-1 = .0000000001
        if (cmp(state.wrkDu0v121, new BigDecimal("0000000001")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computed0v18 = toBd(state.wrkDu0v121);
            // COBOL MOVE: MOVE .0000000001 TO CORRECT-0V18
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-19-6 (PROCESS) - L1128-1138
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1196(ProgramState state) {
        // COBOL IF: WRK-XN-00001 = "0"
        if (cmp(state.wrkXn00001, "0") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.reMark = "ON SIZE ERROR SHOULD NOT HAVE EXECUTED";
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "0";
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-20 (INIT) - L1139-1152
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF120(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2";
        state.parName = "MPY-TEST-F1-20";
        state.wrkXn00001 = "0";
        state.wrkDu2p41 = new BigDecimal("0");
        state.wrkDu6v01 = new BigDecimal("0");
        state.wrkDu6v02 = new BigDecimal("0");
        state.wrkDu0v121 = new BigDecimal("0");
        state.wrkDu2v01 = new BigDecimal("99");
        state.wrkDu5v11 = new BigDecimal("12345.6");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-20-0 (LEAF) - L1153-1158
     * Branches: 0, GOTO: 2, CALLs: 0
     */
    private void mpyTestF1200(ProgramState state) {
        // COBOL: COMPUTE WRK-DU-2V0-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 = WRK-DU-2V0-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 * WRK-DU-5V1-1
        state.wrkDu2v01 = toBd(state.wrkDu2v01);
        this.mpyTestF1201(state); // COBOL GO TO MPY-TEST-F1-20-1
        return;
        state.wrkXn00001 = "1";
        this.mpyTestF1201(state); // COBOL GO TO MPY-TEST-F1-20-1
        return;
    }

    /**
     * MPY-DELETE-F1-20 (PROCESS) - L1159-1163
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF120(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        state.feature = "*DELETED BY FCTC*";
        this.printDetail(state);
        this.mpyInitF121(state); // COBOL GO TO MPY-INIT-F1-21
        return;
    }

    /**
     * MPY-TEST-F1-20-1 (PROCESS) - L1164-1169
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1201(ProgramState state) {
        // COBOL IF: WRK-DU-2V0-1 = 99
        if (cmp(state.wrkDu2v01, new BigDecimal("99")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2v01);
            state.correctN = new BigDecimal("99");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-20-2 (PROCESS) - L1170-1175
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1202(ProgramState state) {
        // COBOL IF: WRK-DU-2P4-1 = 0
        if (cmp(state.wrkDu2p41, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2p41);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-20-3 (PROCESS) - L1176-1181
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1203(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-1 = 0
        if (cmp(state.wrkDu6v01, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v01);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-20-4 (PROCESS) - L1182-1187
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1204(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-2 = 0
        if (cmp(state.wrkDu6v02, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v02);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-20-5 (PROCESS) - L1188-1193
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1205(ProgramState state) {
        // COBOL IF: WRK-DU-0V12-1 = 0
        if (cmp(state.wrkDu0v121, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computed0v18 = toBd(state.wrkDu0v121);
            state.correct0v18 = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-20-6 (PROCESS) - L1194-1204
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1206(ProgramState state) {
        // COBOL IF: WRK-XN-00001 = "0"
        if (cmp(state.wrkXn00001, "0") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.reMark = "NOT ON SIZE ERROR SHOULD NOT HAVE EXECUTED";
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "0";
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-21 (INIT) - L1205-1219
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF121(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2";
        state.parName = "MPY-TEST-F1-21";
        state.wrkXn00001 = "0";
        state.wrkDu2p41 = new BigDecimal("0");
        state.wrkDu6v01 = new BigDecimal("0");
        state.wrkDu6v02 = new BigDecimal("0");
        // COBOL MOVE: MOVE   .00001  TO WRK-DU-0V12-1.
        state.wrkDu2v01 = new BigDecimal("99");
        state.wrkDu5v11 = new BigDecimal("12345.6");
        // COBOL MOVE: MOVE .00001 TO WRK-DU-4P1-1.
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-21-0 (LEAF) - L1220-1226
     * Branches: 0, GOTO: 2, CALLs: 0
     */
    private void mpyTestF1210(ProgramState state) {
        // COBOL: COMPUTE WRK-DU-5V1-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 = WRK-DU-5V1-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 * WRK-DU-4P1-1
        state.wrkDu5v11 = toBd(state.wrkDu5v11);
        this.mpyTestF1211(state); // COBOL GO TO MPY-TEST-F1-21-1
        return;
        state.wrkXn00001 = "1";
        this.mpyTestF1211(state); // COBOL GO TO MPY-TEST-F1-21-1
        return;
    }

    /**
     * MPY-DELETE-F1-21 (PROCESS) - L1227-1231
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF121(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        state.feature = "*DELETED BY FCTC*";
        this.printDetail(state);
        this.mpyInitF122(state); // COBOL GO TO MPY-INIT-F1-22
        return;
    }

    /**
     * MPY-TEST-F1-21-1 (PROCESS) - L1232-1237
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1211(ProgramState state) {
        // COBOL IF: WRK-DU-5V1-1 = .1
        if (cmp(state.wrkDu5v11, new BigDecimal("1")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu5v11);
            // COBOL MOVE: MOVE .1 TO CORRECT-N
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-21-2 (PROCESS) - L1238-1243
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1212(ProgramState state) {
        // COBOL IF: WRK-DU-2P4-1 = 0
        if (cmp(state.wrkDu2p41, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2p41);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-21-3 (PROCESS) - L1244-1249
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1213(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-1 = 0
        if (cmp(state.wrkDu6v01, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v01);
            state.correctN = new BigDecimal("1");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-21-4 (PROCESS) - L1250-1255
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1214(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-2 = 0
        if (cmp(state.wrkDu6v02, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v02);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-21-5 (PROCESS) - L1256-1261
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1215(ProgramState state) {
        // COBOL IF: WRK-DU-0V12-1 = .0000000001
        if (cmp(state.wrkDu0v121, new BigDecimal("0000000001")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computed0v18 = toBd(state.wrkDu0v121);
            // COBOL MOVE: MOVE .0000000001 TO CORRECT-0V18
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-21-6 (PROCESS) - L1262-1272
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1216(ProgramState state) {
        // COBOL IF: WRK-XN-00001 = "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.reMark = "NOT ON SIZE ERROR SHOULD HAVE EXECUTED";
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "1";
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-22 (INIT) - L1273-1286
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF122(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2";
        state.parName = "MPY-TEST-F1-22";
        state.wrkXn00001 = "0";
        state.wrkDu2p41 = new BigDecimal("0");
        state.wrkDu6v01 = new BigDecimal("0");
        state.wrkDu6v02 = new BigDecimal("0");
        state.wrkDu0v121 = new BigDecimal("0");
        state.wrkDu2v01 = new BigDecimal("99");
        state.wrkDu5v11 = new BigDecimal("12345.6");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-22-0 (LEAF) - L1287-1292
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1220(ProgramState state) {
        // COBOL: COMPUTE WRK-DU-2V0-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 = WRK-DU-2V0-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 * WRK-DU-5V1-1
        state.wrkDu2v01 = toBd(state.wrkDu2v01);
        state.wrkXn00001 = "1";
        state.wrkXn00001 = "2";
        this.mpyTestF1221(state); // COBOL GO TO MPY-TEST-F1-22-1
        return;
    }

    /**
     * MPY-DELETE-F1-22 (PROCESS) - L1293-1297
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF122(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        state.feature = "*DELETED BY FCTC*";
        this.printDetail(state);
        this.mpyInitF123(state); // COBOL GO TO MPY-INIT-F1-23
        return;
    }

    /**
     * MPY-TEST-F1-22-1 (PROCESS) - L1298-1303
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1221(ProgramState state) {
        // COBOL IF: WRK-DU-5V1-1 = 12345.6
        if (cmp(state.wrkDu5v11, new BigDecimal("12345.6")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu5v11);
            state.correctN = new BigDecimal("12345.6");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-22-2 (PROCESS) - L1304-1309
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1222(ProgramState state) {
        // COBOL IF: WRK-DU-2P4-1 = 0
        if (cmp(state.wrkDu2p41, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2p41);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-22-3 (PROCESS) - L1310-1315
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1223(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-1 = 0
        if (cmp(state.wrkDu6v01, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v01);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-22-4 (PROCESS) - L1316-1321
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1224(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-2 = 0
        if (cmp(state.wrkDu6v02, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v02);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-22-5 (PROCESS) - L1322-1327
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1225(ProgramState state) {
        // COBOL IF: WRK-DU-0V12-1 = 0
        if (cmp(state.wrkDu0v121, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computed0v18 = toBd(state.wrkDu0v121);
            state.correct0v18 = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-22-6 (PROCESS) - L1328-1339
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1226(ProgramState state) {
        // COBOL IF: WRK-XN-00001 = "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.reMark = "ON SIZE ERROR SHOULD HAVE EXECUTED";
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "1";
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-23 (INIT) - L1340-1354
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF123(ProgramState state) {
        state.ansiReference = "VI-67 6.4.2";
        state.parName = "MPY-TEST-F1-23";
        state.wrkXn00001 = "0";
        state.wrkDu2p41 = new BigDecimal("0");
        state.wrkDu6v01 = new BigDecimal("0");
        state.wrkDu6v02 = new BigDecimal("0");
        // COBOL MOVE: MOVE   .00001  TO WRK-DU-0V12-1.
        state.wrkDu2v01 = new BigDecimal("99");
        state.wrkDu5v11 = new BigDecimal("12345.6");
        // COBOL MOVE: MOVE .00001 TO WRK-DU-4P1-1.
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-23-0 (LEAF) - L1355-1361
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1230(ProgramState state) {
        // COBOL: COMPUTE WRK-DU-5V1-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 = WRK-DU-5V1-1 WRK-DU-2P4-1 WRK-DU-6V0-1 WRK-DU-6V0-2 WRK-DU-0V12-1 * WRK-DU-4P1-1
        state.wrkDu5v11 = toBd(state.wrkDu5v11);
        state.wrkXn00001 = "1";
        state.wrkXn00001 = "2";
        this.mpyTestF1231(state); // COBOL GO TO MPY-TEST-F1-23-1
        return;
    }

    /**
     * MPY-DELETE-F1-23 (PROCESS) - L1362-1366
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF123(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        state.feature = "*DELETED BY FCTC*";
        this.printDetail(state);
        this.mpyInitF124(state); // COBOL GO TO MPY-INIT-F1-24
        return;
    }

    /**
     * MPY-TEST-F1-23-1 (PROCESS) - L1367-1372
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1231(ProgramState state) {
        // COBOL IF: WRK-DU-5V1-1 = .1
        if (cmp(state.wrkDu5v11, new BigDecimal("1")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu5v11);
            // COBOL MOVE: MOVE .1 TO CORRECT-N
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-23-2 (PROCESS) - L1373-1378
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1232(ProgramState state) {
        // COBOL IF: WRK-DU-2P4-1 = 0
        if (cmp(state.wrkDu2p41, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu2p41);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-23-3 (PROCESS) - L1379-1384
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1233(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-1 = 0
        if (cmp(state.wrkDu6v01, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v01);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-23-4 (PROCESS) - L1385-1390
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1234(ProgramState state) {
        // COBOL IF: WRK-DU-6V0-2 = 0
        if (cmp(state.wrkDu6v02, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computedN = toBd(state.wrkDu6v02);
            state.correctN = new BigDecimal("0");
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-23-5 (PROCESS) - L1391-1396
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1235(ProgramState state) {
        // COBOL IF: WRK-DU-0V12-1 = .0000000001
        if (cmp(state.wrkDu0v121, new BigDecimal("0000000001")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            // COBOL PERFORM: PERFORM FAIL
            state.computed0v18 = toBd(state.wrkDu0v121);
            // COBOL MOVE: MOVE .0000000001 TO CORRECT-0V18
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-23-6 (PROCESS) - L1397-1408
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1236(ProgramState state) {
        // COBOL IF: WRK-XN-00001 = "2"
        if (cmp(state.wrkXn00001, "2") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.reMark = "NOT ON SIZE ERROR SHOULD HAVE EXECUTED";
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "1";
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-24 (INIT) - L1409-1419
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF124(ProgramState state) {
        state.ansiReference = "IV-41 6.4.3";
        state.parName = "MPY-TEST-F1-24";
        state.wrkXn00001 = "0";
        state.wrkDs10v00 = toBd(state.a10onesDs10v00);
        state.wrkDs05v00 = new BigDecimal("0");
        state.wrkDs02v00 = new BigDecimal("0");
        state.wrkCs18v00 = new BigDecimal("0");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-24-0 (LEAF) - L1420-1427
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1240(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-10V00 = WRK-DS-10V00 * A12THREES-DS-06V06
        state.wrkDs10v00 = toBd(state.wrkDs10v00).multiply(toBd(state.a12threesDs06v06));
        state.wrkXn00001 = "1";
        state.wrkDs05v00 = new BigDecimal("23");
        // COBOL MOVE: MOVE -4  TO WRK-DS-02V00
        // COBOL END-MULTIPLY: END-MULTIPLY
        state.wrkCs18v00 = new BigDecimal("99");
        this.mpyTestF1241(state); // COBOL GO TO MPY-TEST-F1-24-1
        return;
    }

    /**
     * MPY-DELETE-F1-24-1 (PROCESS) - L1428-1431
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF1241(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF125(state); // COBOL GO TO MPY-INIT-F1-25
        return;
    }

    /**
     * MPY-TEST-F1-24-1 (PROCESS) - L1432-1443
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1241(ProgramState state) {
        state.parName = "MPY-TEST-F1-24-1";
        // COBOL IF: WRK-XN-00001 = "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "1";
            state.reMark = "ON SIZE ERROR NOT EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-24-2 (PROCESS) - L1444-1455
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1242(ProgramState state) {
        state.parName = "MPY-TEST-F1-24-2";
        // COBOL IF: WRK-DS-05V00 = 23
        if (cmp(state.wrkDs05v00, new BigDecimal("23")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs05v00);
            state.correctN = new BigDecimal("23");
            state.reMark = "ON SIZE ERROR NOT EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-24-3 (PROCESS) - L1456-1467
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1243(ProgramState state) {
        state.parName = "MPY-TEST-F1-24-3";
        // COBOL IF: WRK-DS-02V00 = -4
        if (cmp(state.wrkDs02v00, new BigDecimal("-4")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs02v00);
            // COBOL MOVE: MOVE   -4           TO CORRECT-N
            state.reMark = "ON SIZE ERROR NOT EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-24-4 (PROCESS) - L1468-1479
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1244(ProgramState state) {
        state.parName = "MPY-TEST-F1-24-4";
        // COBOL IF: WRK-DS-10V00 = 1111111111
        if (cmp(state.wrkDs10v00, new BigDecimal("1111111111")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computed18v0 = toBd(state.wrkDs10v00);
            state.correct18v0 = new BigDecimal("1111111111");
            state.reMark = "ON SIZE ERROR NOT EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-24-5 (PROCESS) - L1480-1492
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1245(ProgramState state) {
        state.parName = "MPY-TEST-F1-24-5";
        // COBOL IF: WRK-CS-18V00 = 000000000000000099
        if (cmp(state.wrkCs18v00, new BigDecimal("000000000000000099")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkCs18v00);
            state.correctN = new BigDecimal("000000000000000099");
            state.reMark = "SCOPE TERMINATOR IGNORED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-25 (INIT) - L1493-1502
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF125(ProgramState state) {
        state.ansiReference = "IV-41 6.4.3";
        state.parName = "MPY-TEST-F1-25";
        state.wrkXn00001 = "1";
        // COBOL MOVE: MOVE   -99 TO WRK-DS-02V00.
        state.wrkDs10v00 = new BigDecimal("0");
        state.wrkDs01v00 = new BigDecimal("0");
        state.wrkCs18v00 = new BigDecimal("0");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-25-0 (LEAF) - L1503-1510
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1250(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-02V00 = WRK-DS-02V00 * AZERO-DS-05V05
        state.wrkDs02v00 = toBd(state.wrkDs02v00).multiply(toBd(state.azeroDs05v05));
        state.wrkXn00001 = "0";
        state.wrkDs10v00 = new BigDecimal("23");
        // COBOL MOVE: MOVE -4  TO WRK-DS-01V00
        // COBOL END-MULTIPLY: END-MULTIPLY
        state.wrkCs18v00 = new BigDecimal("99");
        this.mpyTestF1251(state); // COBOL GO TO MPY-TEST-F1-25-1
        return;
    }

    /**
     * MPY-DELETE-F1-25-1 (PROCESS) - L1511-1514
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF1251(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF126(state); // COBOL GO TO MPY-INIT-F1-26
        return;
    }

    /**
     * MPY-TEST-F1-25-1 (PROCESS) - L1515-1526
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1251(ProgramState state) {
        state.parName = "MPY-TEST-F1-25-1";
        // COBOL IF: WRK-XN-00001 = "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "1";
            state.reMark = "SIZE ERROR SHOULD NOT BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-25-2 (PROCESS) - L1527-1538
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1252(ProgramState state) {
        state.parName = "MPY-TEST-F1-25-2";
        // COBOL IF: WRK-DS-10V00 = 0000000000
        if (cmp(state.wrkDs10v00, new BigDecimal("0000000000")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs10v00);
            state.correctN = new BigDecimal("0000000000");
            state.reMark = "SIZE ERROR SHOULD NOT BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-25-3 (PROCESS) - L1539-1550
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1253(ProgramState state) {
        state.parName = "MPY-TEST-F1-25-3";
        // COBOL IF: WRK-DS-01V00 = 0
        if (cmp(state.wrkDs01v00, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs01v00);
            state.correctN = new BigDecimal("0");
            state.reMark = "SIZE ERROR SHOULD NOT BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-25-4 (PROCESS) - L1551-1562
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1254(ProgramState state) {
        state.parName = "MPY-TEST-F1-25-4";
        // COBOL IF: WRK-DS-02V00 = 00
        if (cmp(state.wrkDs02v00, new BigDecimal("00")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs02v00);
            state.correctN = new BigDecimal("00");
            state.reMark = "SIZE ERROR SHOULD NOT BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-25-5 (PROCESS) - L1563-1575
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1255(ProgramState state) {
        state.parName = "MPY-TEST-F1-25-5";
        // COBOL IF: WRK-CS-18V00 = 000000000000000099
        if (cmp(state.wrkCs18v00, new BigDecimal("000000000000000099")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkCs18v00);
            state.correctN = new BigDecimal("000000000000000099");
            state.reMark = "SCOPE TERMINATOR IGNORED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-26 (INIT) - L1576-1585
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF126(ProgramState state) {
        state.ansiReference = "IV-41 6.4.3";
        state.parName = "MPY-TEST-F1-26";
        state.wrkXn00001 = "0";
        state.wrkDs10v00 = toBd(state.a10onesDs10v00);
        state.wrkDs05v00 = new BigDecimal("0");
        state.wrkDs02v00 = new BigDecimal("0");
        state.wrkCs18v00 = new BigDecimal("0");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-26-0 (LEAF) - L1586-1592
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1260(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-10V00 = WRK-DS-10V00 * A12THREES-DS-06V06
        state.wrkDs10v00 = toBd(state.wrkDs10v00).multiply(toBd(state.a12threesDs06v06));
        this.mpyTestF12601(state); // COBOL GO TO MPY-TEST-F1-26-01
        return;
        state.wrkXn00001 = "1";
        state.wrkDs05v00 = new BigDecimal("23");
        // COBOL MOVE: MOVE -4  TO WRK-DS-02V00
        // COBOL END-MULTIPLY: END-MULTIPLY.
    }

    /**
     * MPY-TEST-F1-26-01 (LEAF) - L1593-1595
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF12601(ProgramState state) {
        state.wrkCs18v00 = new BigDecimal("99");
        this.mpyTestF1261(state); // COBOL GO TO MPY-TEST-F1-26-1
        return;
    }

    /**
     * MPY-DELETE-F1-26-1 (PROCESS) - L1596-1599
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF1261(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF127(state); // COBOL GO TO MPY-INIT-F1-27
        return;
    }

    /**
     * MPY-TEST-F1-26-1 (PROCESS) - L1600-1612
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1261(ProgramState state) {
        state.parName = "MPY-TEST-F1-26-1";
        // COBOL IF: WRK-XN-00001 = "0"
        if (cmp(state.wrkXn00001, "0") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "0";
            state.reMark = "NOT ON SIZE ERROR SHOULD NOT BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-26-2 (PROCESS) - L1613-1625
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1262(ProgramState state) {
        state.parName = "MPY-TEST-F1-26-2";
        // COBOL IF: WRK-DS-05V00 = 00000
        if (cmp(state.wrkDs05v00, new BigDecimal("00000")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs05v00);
            state.correctN = new BigDecimal("0");
            state.reMark = "NOT ON SIZE ERROR SHOULD NOT BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-26-3 (PROCESS) - L1626-1638
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1263(ProgramState state) {
        state.parName = "MPY-TEST-F1-26-3";
        // COBOL IF: WRK-DS-02V00 = 0
        if (cmp(state.wrkDs02v00, BigDecimal.ZERO) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs02v00);
            state.correctN = new BigDecimal("0");
            state.reMark = "NOT ON SIZE ERROR SHOULD NOT BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-26-4 (PROCESS) - L1639-1650
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1264(ProgramState state) {
        state.parName = "MPY-TEST-F1-26-4";
        // COBOL IF: WRK-CS-18V00 = 000000000000000099
        if (cmp(state.wrkCs18v00, new BigDecimal("000000000000000099")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkCs18v00);
            state.correctN = new BigDecimal("000000000000000099");
            state.reMark = "SCOPE TERMINATOR IGNORED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-26-5 (PROCESS) - L1651-1664
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1265(ProgramState state) {
        state.parName = "MPY-TEST-F1-26-5";
        // COBOL IF: WRK-DS-10V00 = 1111111111
        if (cmp(state.wrkDs10v00, new BigDecimal("1111111111")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computed18v0 = toBd(state.wrkDs10v00);
            state.correct18v0 = new BigDecimal("1111111111");
            state.reMark = "NOT ON SIZE ERROR SHOULD NOT BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-27 (INIT) - L1665-1673
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF127(ProgramState state) {
        state.ansiReference = "IV-41 6.4.3";
        state.wrkXn00001 = "1";
        // COBOL MOVE: MOVE   -99 TO WRK-DS-02V00.
        state.wrkDs10v00 = new BigDecimal("0");
        state.wrkDs01v00 = new BigDecimal("0");
        state.wrkDs18v00 = new BigDecimal("0");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-27-0 (LEAF) - L1674-1680
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1270(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-02V00 = WRK-DS-02V00 * AZERO-DS-05V05
        state.wrkDs02v00 = toBd(state.wrkDs02v00).multiply(toBd(state.azeroDs05v05));
        this.mpyTestF12701(state); // COBOL GO TO MPY-TEST-F1-27-01
        return;
        state.wrkXn00001 = "0";
        state.wrkDs10v00 = new BigDecimal("23");
        // COBOL MOVE: MOVE -4  TO WRK-DS-01V00
        // COBOL END-MULTIPLY: END-MULTIPLY.
    }

    /**
     * MPY-TEST-F1-27-01 (LEAF) - L1681-1683
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF12701(ProgramState state) {
        state.wrkCs18v00 = new BigDecimal("99");
        this.mpyTestF1271(state); // COBOL GO TO MPY-TEST-F1-27-1
        return;
    }

    /**
     * MPY-DELETE-F1-27-1 (PROCESS) - L1684-1687
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF1271(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF128(state); // COBOL GO TO MPY-INIT-F1-28
        return;
    }

    /**
     * MPY-TEST-F1-27-1 (PROCESS) - L1688-1700
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1271(ProgramState state) {
        state.parName = "MPY-TEST-F1-27-1";
        // COBOL IF: WRK-XN-00001 = "0"
        if (cmp(state.wrkXn00001, "0") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "0";
            state.reMark = "NOT ON SIZE ERROR SHOULD BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-27-2 (PROCESS) - L1701-1713
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1272(ProgramState state) {
        state.parName = "MPY-TEST-F1-27-2";
        // COBOL IF: WRK-DS-10V00 = 23
        if (cmp(state.wrkDs10v00, new BigDecimal("23")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs10v00);
            state.correctN = new BigDecimal("23");
            state.reMark = "NOT ON SIZE ERROR SHOULD BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-27-3 (PROCESS) - L1714-1726
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1273(ProgramState state) {
        state.parName = "MPY-TEST-F1-27-3";
        // COBOL IF: WRK-DS-02V00 = 00
        if (cmp(state.wrkDs02v00, new BigDecimal("00")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs02v00);
            state.correctN = new BigDecimal("00");
            state.reMark = "NOT ON SIZE ERROR SHOULD BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-27-4 (PROCESS) - L1727-1739
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1274(ProgramState state) {
        state.parName = "MPY-TEST-F1-27-4";
        // COBOL IF: WRK-DS-01V00 = -4
        if (cmp(state.wrkDs01v00, new BigDecimal("-4")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs01v00);
            // COBOL MOVE: MOVE   -4           TO CORRECT-N
            state.reMark = "NOT ON SIZE ERROR SHOULD BE EXECUTED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-27-5 (PROCESS) - L1740-1752
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1275(ProgramState state) {
        state.parName = "MPY-TEST-F1-27-5";
        // COBOL IF: WRK-CS-18V00 = 000000000000000099
        if (cmp(state.wrkCs18v00, new BigDecimal("000000000000000099")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkCs18v00);
            state.correctN = new BigDecimal("000000000000000099");
            state.reMark = "SCOPE TERMINATOR IGNORED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-28 (INIT) - L1753-1758
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF128(ProgramState state) {
        state.wrkDs10v00 = toBd(state.a10onesDs10v00);
        state.wrkXn00001 = "0";
        state.wrkCs18v00 = new BigDecimal("0");
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-28-0 (LEAF) - L1759-1765
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1280(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-10V00 = WRK-DS-10V00 * A12THREES-DS-06V06
        state.wrkDs10v00 = toBd(state.wrkDs10v00).multiply(toBd(state.a12threesDs06v06));
        state.wrkXn00001 = "1";
        state.wrkXn00001 = "2";
        // COBOL END-MULTIPLY: END-MULTIPLY
        state.wrkCs18v00 = new BigDecimal("99");
        this.mpyTestF1281(state); // COBOL GO TO MPY-TEST-F1-28-1
        return;
    }

    /**
     * MPY-DELETE-F1-28-1 (PROCESS) - L1766-1769
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF1281(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        this.mpyInitF129(state); // COBOL GO TO MPY-INIT-F1-29
        return;
    }

    /**
     * MPY-TEST-F1-28-1 (PROCESS) - L1770-1782
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1281(ProgramState state) {
        state.parName = "MPY-TEST-F1-28-1";
        // COBOL IF: WRK-XN-00001 = "1"
        if (cmp(state.wrkXn00001, "1") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "1";
            state.reMark = "SIZE ERROR SHOULD HAVE OCCURRED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-28-2 (PROCESS) - L1783-1795
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1282(ProgramState state) {
        state.parName = "MPY-TEST-F1-28-2";
        // COBOL IF: WRK-DS-10V00 = 1111111111
        if (cmp(state.wrkDs10v00, new BigDecimal("1111111111")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computed18v0 = toBd(state.wrkDs10v00);
            state.correct18v0 = new BigDecimal("1111111111");
            state.reMark = "SIZE ERROR SHOULD HAVE OCCURRED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-28-3 (PROCESS) - L1796-1808
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1283(ProgramState state) {
        state.parName = "MPY-TEST-F1-28-3";
        // COBOL IF: WRK-CS-18V00 = 000000000000000099
        if (cmp(state.wrkCs18v00, new BigDecimal("000000000000000099")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkCs18v00);
            state.correctN = new BigDecimal("000000000000000099");
            state.reMark = "SCOPE TERMINATOR IGNORED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * MPY-INIT-F1-29 (INIT) - L1809-1814
     * Branches: 0, GOTO: 0, CALLs: 0
     */
    private void mpyInitF129(ProgramState state) {
        state.wrkXn00001 = "0";
        // COBOL MOVE: MOVE   -99 TO WRK-DS-02V00.
        state.wrkCs18v00 = BigDecimal.ZERO;
        state.recCt = new BigDecimal("1");
    }

    /**
     * MPY-TEST-F1-29-0 (LEAF) - L1815-1821
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void mpyTestF1290(ProgramState state) {
        // COBOL: COMPUTE WRK-DS-02V00 = WRK-DS-02V00 * AZERO-DS-05V05
        state.wrkDs02v00 = toBd(state.wrkDs02v00).multiply(toBd(state.azeroDs05v05));
        state.wrkXn00001 = "1";
        state.wrkXn00001 = "2";
        // COBOL END-MULTIPLY: END-MULTIPLY
        state.wrkCs18v00 = new BigDecimal("99");
        this.mpyTestF1291(state); // COBOL GO TO MPY-TEST-F1-29-1
        return;
    }

    /**
     * MPY-DELETE-F1-29-1 (PROCESS) - L1822-1825
     * Branches: 0, GOTO: 1, CALLs: 2
     */
    private void mpyDeleteF1291(ProgramState state) {
        log.debug("External COPY paragraph PERFORM DE-LETE");
        this.printDetail(state);
        return; // COBOL GO TO CCVS-EXIT
    }

    /**
     * MPY-TEST-F1-29-1 (PROCESS) - L1826-1838
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1291(ProgramState state) {
        state.parName = "MPY-TEST-F1-29-1";
        // COBOL IF: WRK-XN-00001 = "2"
        if (cmp(state.wrkXn00001, "2") == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedX = toStr(state.wrkXn00001);
            state.correctX = "2";
            state.reMark = "WRONGLY AFFECTED BY SIZE ERROR";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-29-2 (PROCESS) - L1839-1851
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1292(ProgramState state) {
        state.parName = "MPY-TEST-F1-29-2";
        // COBOL IF: WRK-DS-02V00 = 00
        if (cmp(state.wrkDs02v00, new BigDecimal("00")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkDs02v00);
            state.correctN = new BigDecimal("00");
            state.reMark = "WRONGLY AFFECTED BY SIZE ERROR";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
        // COBOL: COMPUTE REC-CT = REC-CT + 1
        state.recCt = toBd(state.recCt).add(toBd(new BigDecimal("1")));
    }

    /**
     * MPY-TEST-F1-29-3 (PROCESS) - L1852-1864
     * Branches: 1, GOTO: 0, CALLs: 2
     */
    private void mpyTestF1293(ProgramState state) {
        state.parName = "MPY-TEST-F1-29-3";
        // COBOL IF: WRK-CS-18V00 = 000000000000000099
        if (cmp(state.wrkCs18v00, new BigDecimal("000000000000000099")) == 0) {
            // COBOL PERFORM: PERFORM PASS
            this.printDetail(state);
        } else {
            state.computedN = toBd(state.wrkCs18v00);
            state.correctN = new BigDecimal("000000000000000099");
            state.reMark = "SCOPE TERMINATOR IGNORED";
            // COBOL PERFORM: PERFORM FAIL
            this.printDetail(state);
        }
    }

    /**
     * CCVS-999999 (LEAF) - L1866-1868
     * Branches: 0, GOTO: 1, CALLs: 0
     */
    private void ccvs999999(ProgramState state) {
        this.closeFiles(state); // COBOL GO TO CLOSE-FILES
        return;
        // COBOL ,NC101A: ,NC101A
    }

    // --- Deterministic COBOL BigDecimal / Data Runtime Helpers ---
    private static BigDecimal toBd(Object v) {
        if (v == null) return BigDecimal.ZERO;
        if (v instanceof BigDecimal bd) return bd;
        if (v instanceof Number n) return new BigDecimal(n.toString());
        String s = v.toString().trim();
        if (s.isEmpty()) return BigDecimal.ZERO;
        try {
            return new BigDecimal(s);
        } catch (NumberFormatException ex) {
            return BigDecimal.ZERO;
        }
    }

    private static String toStr(Object v) {
        if (v == null) return "";
        if (v instanceof BigDecimal bd) return bd.stripTrailingZeros().toPlainString();
        return v.toString();
    }

    private static BigDecimal parseNumOrNull(Object v) {
        if (v == null) return null;
        if (v instanceof BigDecimal bd) return bd;
        if (v instanceof Number n) return new BigDecimal(n.toString());
        String s = v.toString().trim();
        if (s.isEmpty()) return null;
        try {
            return new BigDecimal(s);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private static int cmp(Object a, Object b) {
        BigDecimal na = parseNumOrNull(a);
        BigDecimal nb = parseNumOrNull(b);
        if (na != null && nb != null) {
            return na.compareTo(nb);
        }
        return toStr(a).compareTo(toStr(b));
    }

    private static boolean isNumericVal(Object v) {
        return parseNumOrNull(v) != null;
    }

    private static boolean isAlphaVal(Object v) {
        String s = toStr(v);
        if (s.isEmpty()) return true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetter(c) && c != ' ') return false;
        }
        return true;
    }

    private static boolean isTruthy(Object v) {
        if (v == null) return false;
        if (v instanceof Boolean b) return b;
        if (v instanceof BigDecimal bd) return bd.compareTo(BigDecimal.ZERO) != 0;
        String s = v.toString().trim();
        return !s.isEmpty() && !"N".equalsIgnoreCase(s) && !"0".equals(s) && !"false".equalsIgnoreCase(s);
    }

    private static BigDecimal at(BigDecimal field, BigDecimal... idx) {
        return field != null ? field : BigDecimal.ZERO;
    }

    private static String at(String field, BigDecimal... idx) {
        return field != null ? field : "";
    }

    private static String refMod(Object val, Object start1Based, Object len) {
        String s = toStr(val);
        int start = Math.max(0, toBd(start1Based).intValue() - 1);
        int length = Math.max(0, toBd(len).intValue());
        if (start >= s.length() || length == 0) return "";
        int end = Math.min(s.length(), start + length);
        return s.substring(start, end);
    }

    private static BigDecimal cobolIntegerOfDate(Object yyyymmdd) {
        String digits = toStr(yyyymmdd).trim();
        if (digits.length() != 8) return BigDecimal.ZERO;
        try {
            int y = Integer.parseInt(digits.substring(0, 4));
            int m = Integer.parseInt(digits.substring(4, 6));
            int d = Integer.parseInt(digits.substring(6, 8));
            LocalDate epoch = LocalDate.of(1600, 12, 31);
            return BigDecimal.valueOf(ChronoUnit.DAYS.between(epoch, LocalDate.of(y, m, d)));
        } catch (Exception ex) {
            return BigDecimal.ZERO;
        }
    }

    private static BigDecimal cobolDateOfInteger(Object days) {
        try {
            LocalDate epoch = LocalDate.of(1600, 12, 31);
            LocalDate dt = epoch.plusDays(toBd(days).longValue());
            String s = String.format("%04d%02d%02d", dt.getYear(), dt.getMonthValue(), dt.getDayOfMonth());
            return new BigDecimal(s);
        } catch (Exception ex) {
            return BigDecimal.ZERO;
        }
    }

    private static BigDecimal cobolCurrentDate() {
        LocalDate now = LocalDate.now();
        String s = String.format("%04d%02d%02d", now.getYear(), now.getMonthValue(), now.getDayOfMonth());
        return new BigDecimal(s);
    }

    private static BigDecimal bdPow(BigDecimal base, BigDecimal exp) {
        if (base == null) base = BigDecimal.ZERO;
        if (exp == null) exp = BigDecimal.ZERO;
        BigDecimal cleanExp = exp.stripTrailingZeros();
        if (cleanExp.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.valueOf(1);
        }
        if (base.compareTo(BigDecimal.ZERO) == 0) {
            return BigDecimal.ZERO;
        }
        if (cleanExp.scale() <= 0) {
            int n = cleanExp.intValue();
            if (n > 0 && n <= 99) {
                return base.pow(n);
            }
            if (n < 0 && n >= -99) {
                return BigDecimal.valueOf(1).divide(base.pow(-n), 16, RoundingMode.HALF_UP);
            }
        }
        if (base.compareTo(BigDecimal.ZERO) < 0) {
            return BigDecimal.ZERO;
        }
        final int workScale = 24;
        final BigDecimal ln2 = new BigDecimal("0.693147180559945309417232");
        final BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal m = base;
        int k = 0;
        while (m.compareTo(two) >= 0) {
            m = m.divide(two, workScale, RoundingMode.HALF_UP);
            k++;
        }
        while (m.compareTo(BigDecimal.valueOf(1)) < 0) {
            m = m.multiply(two);
            k--;
        }
        BigDecimal y = m.subtract(BigDecimal.valueOf(1))
            .divide(m.add(BigDecimal.valueOf(1)), workScale, RoundingMode.HALF_UP);
        BigDecimal y2 = y.multiply(y).setScale(workScale, RoundingMode.HALF_UP);
        BigDecimal term = y;
        BigDecimal lnM = BigDecimal.ZERO;
        for (int j = 1; j <= 39; j += 2) {
            lnM = lnM.add(term.divide(BigDecimal.valueOf(j), workScale, RoundingMode.HALF_UP));
            term = term.multiply(y2).setScale(workScale, RoundingMode.HALF_UP);
        }
        BigDecimal lnBase = lnM.multiply(two).add(ln2.multiply(BigDecimal.valueOf(k)));
        BigDecimal z = cleanExp.multiply(lnBase).setScale(workScale, RoundingMode.HALF_UP);
        int k2 = z.divideToIntegralValue(ln2).intValue();
        if (k2 > 120 || k2 < -120) {
            return BigDecimal.ZERO;
        }
        BigDecimal r = z.subtract(ln2.multiply(BigDecimal.valueOf(k2)));
        BigDecimal expR = BigDecimal.valueOf(1);
        BigDecimal powR = BigDecimal.valueOf(1);
        for (int n = 1; n <= 32; n++) {
            powR = powR.multiply(r).divide(BigDecimal.valueOf(n), workScale, RoundingMode.HALF_UP);
            expR = expR.add(powR);
        }
        if (k2 >= 0) {
            expR = expR.multiply(two.pow(k2));
        } else {
            expR = expR.divide(two.pow(-k2), workScale, RoundingMode.HALF_UP);
        }
        return expR.setScale(12, RoundingMode.HALF_UP);
    }

    @Data
    public static class ReturnCodeResponse {
        private String code;
        private String message;
        private ProgramState state;
    }
}
