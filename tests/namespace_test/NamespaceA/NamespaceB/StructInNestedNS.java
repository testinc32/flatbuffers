// automatically generated, do not modify

package NamespaceA.NamespaceB;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class StructInNestedNS extends Struct {
  public StructInNestedNS __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int a() { return bb.getInt(bb_pos + 0); }
  public void mutateA(int a) { bb.putInt(bb_pos + 0, a); }
  public int b() { return bb.getInt(bb_pos + 4); }
  public void mutateB(int b) { bb.putInt(bb_pos + 4, b); }

  public static int createStructInNestedNS(FlatBufferBuilder builder, int a, int b) {
    builder.prep(4, 8);
    builder.putInt(b);
    builder.putInt(a);
    return builder.offset();
  }
};

