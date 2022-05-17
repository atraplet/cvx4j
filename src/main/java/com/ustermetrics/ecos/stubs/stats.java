// Generated by jextract

package com.ustermetrics.ecos.stubs;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public class stats {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("pcost"),
        Constants$root.C_DOUBLE$LAYOUT.withName("dcost"),
        Constants$root.C_DOUBLE$LAYOUT.withName("pres"),
        Constants$root.C_DOUBLE$LAYOUT.withName("dres"),
        Constants$root.C_DOUBLE$LAYOUT.withName("pinf"),
        Constants$root.C_DOUBLE$LAYOUT.withName("dinf"),
        Constants$root.C_DOUBLE$LAYOUT.withName("pinfres"),
        Constants$root.C_DOUBLE$LAYOUT.withName("dinfres"),
        Constants$root.C_DOUBLE$LAYOUT.withName("gap"),
        Constants$root.C_DOUBLE$LAYOUT.withName("relgap"),
        Constants$root.C_DOUBLE$LAYOUT.withName("sigma"),
        Constants$root.C_DOUBLE$LAYOUT.withName("mu"),
        Constants$root.C_DOUBLE$LAYOUT.withName("step"),
        Constants$root.C_DOUBLE$LAYOUT.withName("step_aff"),
        Constants$root.C_DOUBLE$LAYOUT.withName("kapovert"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("iter"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("nitref1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("nitref2"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("nitref3"),
        Constants$root.C_DOUBLE$LAYOUT.withName("tsetup"),
        Constants$root.C_DOUBLE$LAYOUT.withName("tsolve"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("pob"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cb"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cob"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("pb"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("db"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("affBack"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cmbBack"),
        Constants$root.C_DOUBLE$LAYOUT.withName("centrality")
    ).withName("stats");
    public static MemoryLayout $LAYOUT() {
        return stats.$struct$LAYOUT;
    }
    static final VarHandle pcost$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pcost"));
    public static VarHandle pcost$VH() {
        return stats.pcost$VH;
    }
    public static double pcost$get(MemorySegment seg) {
        return (double)stats.pcost$VH.get(seg);
    }
    public static void pcost$set( MemorySegment seg, double x) {
        stats.pcost$VH.set(seg, x);
    }
    public static double pcost$get(MemorySegment seg, long index) {
        return (double)stats.pcost$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pcost$set(MemorySegment seg, long index, double x) {
        stats.pcost$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dcost$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dcost"));
    public static VarHandle dcost$VH() {
        return stats.dcost$VH;
    }
    public static double dcost$get(MemorySegment seg) {
        return (double)stats.dcost$VH.get(seg);
    }
    public static void dcost$set( MemorySegment seg, double x) {
        stats.dcost$VH.set(seg, x);
    }
    public static double dcost$get(MemorySegment seg, long index) {
        return (double)stats.dcost$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dcost$set(MemorySegment seg, long index, double x) {
        stats.dcost$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pres$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pres"));
    public static VarHandle pres$VH() {
        return stats.pres$VH;
    }
    public static double pres$get(MemorySegment seg) {
        return (double)stats.pres$VH.get(seg);
    }
    public static void pres$set( MemorySegment seg, double x) {
        stats.pres$VH.set(seg, x);
    }
    public static double pres$get(MemorySegment seg, long index) {
        return (double)stats.pres$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pres$set(MemorySegment seg, long index, double x) {
        stats.pres$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dres$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dres"));
    public static VarHandle dres$VH() {
        return stats.dres$VH;
    }
    public static double dres$get(MemorySegment seg) {
        return (double)stats.dres$VH.get(seg);
    }
    public static void dres$set( MemorySegment seg, double x) {
        stats.dres$VH.set(seg, x);
    }
    public static double dres$get(MemorySegment seg, long index) {
        return (double)stats.dres$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dres$set(MemorySegment seg, long index, double x) {
        stats.dres$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pinf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pinf"));
    public static VarHandle pinf$VH() {
        return stats.pinf$VH;
    }
    public static double pinf$get(MemorySegment seg) {
        return (double)stats.pinf$VH.get(seg);
    }
    public static void pinf$set( MemorySegment seg, double x) {
        stats.pinf$VH.set(seg, x);
    }
    public static double pinf$get(MemorySegment seg, long index) {
        return (double)stats.pinf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pinf$set(MemorySegment seg, long index, double x) {
        stats.pinf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dinf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dinf"));
    public static VarHandle dinf$VH() {
        return stats.dinf$VH;
    }
    public static double dinf$get(MemorySegment seg) {
        return (double)stats.dinf$VH.get(seg);
    }
    public static void dinf$set( MemorySegment seg, double x) {
        stats.dinf$VH.set(seg, x);
    }
    public static double dinf$get(MemorySegment seg, long index) {
        return (double)stats.dinf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dinf$set(MemorySegment seg, long index, double x) {
        stats.dinf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pinfres$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pinfres"));
    public static VarHandle pinfres$VH() {
        return stats.pinfres$VH;
    }
    public static double pinfres$get(MemorySegment seg) {
        return (double)stats.pinfres$VH.get(seg);
    }
    public static void pinfres$set( MemorySegment seg, double x) {
        stats.pinfres$VH.set(seg, x);
    }
    public static double pinfres$get(MemorySegment seg, long index) {
        return (double)stats.pinfres$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pinfres$set(MemorySegment seg, long index, double x) {
        stats.pinfres$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dinfres$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dinfres"));
    public static VarHandle dinfres$VH() {
        return stats.dinfres$VH;
    }
    public static double dinfres$get(MemorySegment seg) {
        return (double)stats.dinfres$VH.get(seg);
    }
    public static void dinfres$set( MemorySegment seg, double x) {
        stats.dinfres$VH.set(seg, x);
    }
    public static double dinfres$get(MemorySegment seg, long index) {
        return (double)stats.dinfres$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dinfres$set(MemorySegment seg, long index, double x) {
        stats.dinfres$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gap"));
    public static VarHandle gap$VH() {
        return stats.gap$VH;
    }
    public static double gap$get(MemorySegment seg) {
        return (double)stats.gap$VH.get(seg);
    }
    public static void gap$set( MemorySegment seg, double x) {
        stats.gap$VH.set(seg, x);
    }
    public static double gap$get(MemorySegment seg, long index) {
        return (double)stats.gap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gap$set(MemorySegment seg, long index, double x) {
        stats.gap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle relgap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("relgap"));
    public static VarHandle relgap$VH() {
        return stats.relgap$VH;
    }
    public static double relgap$get(MemorySegment seg) {
        return (double)stats.relgap$VH.get(seg);
    }
    public static void relgap$set( MemorySegment seg, double x) {
        stats.relgap$VH.set(seg, x);
    }
    public static double relgap$get(MemorySegment seg, long index) {
        return (double)stats.relgap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void relgap$set(MemorySegment seg, long index, double x) {
        stats.relgap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sigma$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sigma"));
    public static VarHandle sigma$VH() {
        return stats.sigma$VH;
    }
    public static double sigma$get(MemorySegment seg) {
        return (double)stats.sigma$VH.get(seg);
    }
    public static void sigma$set( MemorySegment seg, double x) {
        stats.sigma$VH.set(seg, x);
    }
    public static double sigma$get(MemorySegment seg, long index) {
        return (double)stats.sigma$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sigma$set(MemorySegment seg, long index, double x) {
        stats.sigma$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mu"));
    public static VarHandle mu$VH() {
        return stats.mu$VH;
    }
    public static double mu$get(MemorySegment seg) {
        return (double)stats.mu$VH.get(seg);
    }
    public static void mu$set( MemorySegment seg, double x) {
        stats.mu$VH.set(seg, x);
    }
    public static double mu$get(MemorySegment seg, long index) {
        return (double)stats.mu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mu$set(MemorySegment seg, long index, double x) {
        stats.mu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle step$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("step"));
    public static VarHandle step$VH() {
        return stats.step$VH;
    }
    public static double step$get(MemorySegment seg) {
        return (double)stats.step$VH.get(seg);
    }
    public static void step$set( MemorySegment seg, double x) {
        stats.step$VH.set(seg, x);
    }
    public static double step$get(MemorySegment seg, long index) {
        return (double)stats.step$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void step$set(MemorySegment seg, long index, double x) {
        stats.step$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle step_aff$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("step_aff"));
    public static VarHandle step_aff$VH() {
        return stats.step_aff$VH;
    }
    public static double step_aff$get(MemorySegment seg) {
        return (double)stats.step_aff$VH.get(seg);
    }
    public static void step_aff$set( MemorySegment seg, double x) {
        stats.step_aff$VH.set(seg, x);
    }
    public static double step_aff$get(MemorySegment seg, long index) {
        return (double)stats.step_aff$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void step_aff$set(MemorySegment seg, long index, double x) {
        stats.step_aff$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle kapovert$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("kapovert"));
    public static VarHandle kapovert$VH() {
        return stats.kapovert$VH;
    }
    public static double kapovert$get(MemorySegment seg) {
        return (double)stats.kapovert$VH.get(seg);
    }
    public static void kapovert$set( MemorySegment seg, double x) {
        stats.kapovert$VH.set(seg, x);
    }
    public static double kapovert$get(MemorySegment seg, long index) {
        return (double)stats.kapovert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void kapovert$set(MemorySegment seg, long index, double x) {
        stats.kapovert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iter"));
    public static VarHandle iter$VH() {
        return stats.iter$VH;
    }
    public static long iter$get(MemorySegment seg) {
        return (long)stats.iter$VH.get(seg);
    }
    public static void iter$set( MemorySegment seg, long x) {
        stats.iter$VH.set(seg, x);
    }
    public static long iter$get(MemorySegment seg, long index) {
        return (long)stats.iter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iter$set(MemorySegment seg, long index, long x) {
        stats.iter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nitref1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nitref1"));
    public static VarHandle nitref1$VH() {
        return stats.nitref1$VH;
    }
    public static long nitref1$get(MemorySegment seg) {
        return (long)stats.nitref1$VH.get(seg);
    }
    public static void nitref1$set( MemorySegment seg, long x) {
        stats.nitref1$VH.set(seg, x);
    }
    public static long nitref1$get(MemorySegment seg, long index) {
        return (long)stats.nitref1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nitref1$set(MemorySegment seg, long index, long x) {
        stats.nitref1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nitref2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nitref2"));
    public static VarHandle nitref2$VH() {
        return stats.nitref2$VH;
    }
    public static long nitref2$get(MemorySegment seg) {
        return (long)stats.nitref2$VH.get(seg);
    }
    public static void nitref2$set( MemorySegment seg, long x) {
        stats.nitref2$VH.set(seg, x);
    }
    public static long nitref2$get(MemorySegment seg, long index) {
        return (long)stats.nitref2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nitref2$set(MemorySegment seg, long index, long x) {
        stats.nitref2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nitref3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nitref3"));
    public static VarHandle nitref3$VH() {
        return stats.nitref3$VH;
    }
    public static long nitref3$get(MemorySegment seg) {
        return (long)stats.nitref3$VH.get(seg);
    }
    public static void nitref3$set( MemorySegment seg, long x) {
        stats.nitref3$VH.set(seg, x);
    }
    public static long nitref3$get(MemorySegment seg, long index) {
        return (long)stats.nitref3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nitref3$set(MemorySegment seg, long index, long x) {
        stats.nitref3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tsetup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tsetup"));
    public static VarHandle tsetup$VH() {
        return stats.tsetup$VH;
    }
    public static double tsetup$get(MemorySegment seg) {
        return (double)stats.tsetup$VH.get(seg);
    }
    public static void tsetup$set( MemorySegment seg, double x) {
        stats.tsetup$VH.set(seg, x);
    }
    public static double tsetup$get(MemorySegment seg, long index) {
        return (double)stats.tsetup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tsetup$set(MemorySegment seg, long index, double x) {
        stats.tsetup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tsolve$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tsolve"));
    public static VarHandle tsolve$VH() {
        return stats.tsolve$VH;
    }
    public static double tsolve$get(MemorySegment seg) {
        return (double)stats.tsolve$VH.get(seg);
    }
    public static void tsolve$set( MemorySegment seg, double x) {
        stats.tsolve$VH.set(seg, x);
    }
    public static double tsolve$get(MemorySegment seg, long index) {
        return (double)stats.tsolve$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tsolve$set(MemorySegment seg, long index, double x) {
        stats.tsolve$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pob"));
    public static VarHandle pob$VH() {
        return stats.pob$VH;
    }
    public static long pob$get(MemorySegment seg) {
        return (long)stats.pob$VH.get(seg);
    }
    public static void pob$set( MemorySegment seg, long x) {
        stats.pob$VH.set(seg, x);
    }
    public static long pob$get(MemorySegment seg, long index) {
        return (long)stats.pob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pob$set(MemorySegment seg, long index, long x) {
        stats.pob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return stats.cb$VH;
    }
    public static long cb$get(MemorySegment seg) {
        return (long)stats.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, long x) {
        stats.cb$VH.set(seg, x);
    }
    public static long cb$get(MemorySegment seg, long index) {
        return (long)stats.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, long x) {
        stats.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cob"));
    public static VarHandle cob$VH() {
        return stats.cob$VH;
    }
    public static long cob$get(MemorySegment seg) {
        return (long)stats.cob$VH.get(seg);
    }
    public static void cob$set( MemorySegment seg, long x) {
        stats.cob$VH.set(seg, x);
    }
    public static long cob$get(MemorySegment seg, long index) {
        return (long)stats.cob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cob$set(MemorySegment seg, long index, long x) {
        stats.cob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pb"));
    public static VarHandle pb$VH() {
        return stats.pb$VH;
    }
    public static long pb$get(MemorySegment seg) {
        return (long)stats.pb$VH.get(seg);
    }
    public static void pb$set( MemorySegment seg, long x) {
        stats.pb$VH.set(seg, x);
    }
    public static long pb$get(MemorySegment seg, long index) {
        return (long)stats.pb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pb$set(MemorySegment seg, long index, long x) {
        stats.pb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle db$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("db"));
    public static VarHandle db$VH() {
        return stats.db$VH;
    }
    public static long db$get(MemorySegment seg) {
        return (long)stats.db$VH.get(seg);
    }
    public static void db$set( MemorySegment seg, long x) {
        stats.db$VH.set(seg, x);
    }
    public static long db$get(MemorySegment seg, long index) {
        return (long)stats.db$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void db$set(MemorySegment seg, long index, long x) {
        stats.db$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle affBack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("affBack"));
    public static VarHandle affBack$VH() {
        return stats.affBack$VH;
    }
    public static long affBack$get(MemorySegment seg) {
        return (long)stats.affBack$VH.get(seg);
    }
    public static void affBack$set( MemorySegment seg, long x) {
        stats.affBack$VH.set(seg, x);
    }
    public static long affBack$get(MemorySegment seg, long index) {
        return (long)stats.affBack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void affBack$set(MemorySegment seg, long index, long x) {
        stats.affBack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cmbBack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cmbBack"));
    public static VarHandle cmbBack$VH() {
        return stats.cmbBack$VH;
    }
    public static long cmbBack$get(MemorySegment seg) {
        return (long)stats.cmbBack$VH.get(seg);
    }
    public static void cmbBack$set( MemorySegment seg, long x) {
        stats.cmbBack$VH.set(seg, x);
    }
    public static long cmbBack$get(MemorySegment seg, long index) {
        return (long)stats.cmbBack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cmbBack$set(MemorySegment seg, long index, long x) {
        stats.cmbBack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle centrality$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("centrality"));
    public static VarHandle centrality$VH() {
        return stats.centrality$VH;
    }
    public static double centrality$get(MemorySegment seg) {
        return (double)stats.centrality$VH.get(seg);
    }
    public static void centrality$set( MemorySegment seg, double x) {
        stats.centrality$VH.set(seg, x);
    }
    public static double centrality$get(MemorySegment seg, long index) {
        return (double)stats.centrality$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void centrality$set(MemorySegment seg, long index, double x) {
        stats.centrality$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.nativeAllocator(scope)); }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.nativeAllocator(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


