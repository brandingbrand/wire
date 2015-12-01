// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: roots.proto at 39:1
package com.squareup.wire.protos.roots;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public class B extends Message<B, B.Builder> {
  public static final ProtoAdapter<B> ADAPTER = new ProtoAdapter<B>(FieldEncoding.LENGTH_DELIMITED, B.class) {
    @Override
    public int encodedSize(B value) {
      return C.ADAPTER.encodedSizeWithTag(1, value.c)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, B value) throws IOException {
      C.ADAPTER.encodeWithTag(writer, 1, value.c);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public B decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.c(C.ADAPTER.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public B redact(B value) {
      Builder builder = value.newBuilder();
      if (builder.c != null) builder.c = C.ADAPTER.redact(builder.c);
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public final C c;

  public B(C c) {
    this(c, ByteString.EMPTY);
  }

  public B(C c, ByteString unknownFields) {
    super(unknownFields);
    this.c = c;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.c = c;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof B)) return false;
    B o = (B) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(c, o.c);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (c != null ? c.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (c != null) builder.append(", c=").append(c);
    return builder.replace(0, 2, "B{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<B, Builder> {
    public C c;

    public Builder() {
    }

    public Builder c(C c) {
      this.c = c;
      return this;
    }

    @Override
    public B build() {
      if (c == null) {
        throw missingRequiredFields(c, "c");
      }
      return new B(c, buildUnknownFields());
    }
  }
}
