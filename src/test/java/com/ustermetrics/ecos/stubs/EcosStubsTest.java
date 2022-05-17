package com.ustermetrics.ecos.stubs;

import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.ustermetrics.ecos.stubs.ecos_h.*;
import static jdk.incubator.foreign.MemoryAddress.NULL;
import static org.junit.jupiter.api.Assertions.*;

class EcosStubsTest {

    @Test
    void versionShouldReturnNonEmptyString() {
        var addr = ecos_h.ECOS_ver();
        var ver = addr.getUtf8String(0);

        System.out.println("Version: " + ver);
        assertFalse(ver.isEmpty());
    }

    @Test
    void solveShouldReturnOptimalSolutionForPortfolioOptimizationProblem() {
        long n = 5;
        long m = 10;
        long p = 1;
        long l = 5;
        long ncones = 1;
        long nex = 0;

        try (var sc = ResourceScope.newConfinedScope()) {
            var alloc = SegmentAllocator.newNativeArena(sc);

            var q = alloc.allocateArray(C_LONG_LONG, new long[]{5});
            var Gpr = alloc.allocateArray(C_DOUBLE, new double[]{-1., -0.15, -1., -0.02, -0.198997487421324, -1.,
                    -0.1, -0.16583123951776996, -0.158113883008419, -1., -0.15, -0.10552897060221729,
                    -0.17392527130926083, -0.16159714218895202, 1., -1.});
            var Gjc = alloc.allocateArray(C_LONG_LONG, new long[]{0, 2, 5, 9, 14, 16});
            var Gir = alloc.allocateArray(C_LONG_LONG, new long[]{0, 6, 1, 6, 7, 2, 6, 7, 8, 3, 6, 7, 8, 9, 4, 5});
            var Apr = alloc.allocateArray(C_DOUBLE, new double[]{1., 1., 1., 1.});
            var Ajc = alloc.allocateArray(C_LONG_LONG, new long[]{0, 1, 2, 3, 4, 4});
            var Air = alloc.allocateArray(C_LONG_LONG, new long[]{0, 0, 0, 0});
            var c = alloc.allocateArray(C_DOUBLE, new double[]{-0.05, -0.06, -0.08, -0.06, 0.});
            var h = alloc.allocateArray(C_DOUBLE, new double[]{0., 0., 0., 0., 0.2, 0., 0., 0., 0.,
                    0.});
            var b = alloc.allocateArray(C_DOUBLE, new double[]{1.});

            var workAddr = ECOS_setup(n, m, p, l, ncones, q, nex, Gpr, Gjc, Gir, Apr, Ajc, Air, c, h, b);
            assertNotEquals(NULL, workAddr);

            long exitCode = ECOS_solve(workAddr);
            System.out.println("Exit code: " + exitCode);
            assertEquals(0, exitCode);

            var workSeg = MemorySegment.ofAddress(workAddr, pwork.sizeof(), sc);
            var xAddr = pwork.x$get(workSeg);
            var xSeg = MemorySegment.ofAddress(xAddr, C_DOUBLE.byteSize() * n, sc);
            var x = xSeg.toArray(C_DOUBLE);
            System.out.println("Solution: " + Arrays.toString(x));
            double tol = Math.ulp(1.0); // Machine epsilon
            assertArrayEquals(new double[]{0.24879020572078372, 0.049684806182020855, 0.7015249845663684,
                    3.5308169265756875e-09, 0.19999999978141014}, x, tol);

            var infoAddr = pwork.info$get(workSeg);
            var infoSeg = MemorySegment.ofAddress(infoAddr, stats.sizeof(), sc);
            double pcost = stats.pcost$get(infoSeg);
            System.out.println("Cost: " + pcost);
            assertEquals(-0.07154259763411892, pcost, tol);

            ECOS_cleanup(workAddr, 0);
        }
    }
}
