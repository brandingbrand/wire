// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: roots.proto at 75:1
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

public class J extends Message<J, J.Builder> {
  public static final ProtoAdapter<J> ADAPTER = new ProtoAdapter<J>(FieldEncoding.LENGTH_DELIMITED, J.class) {
    @Override
    public int encodedSize(J value) {
      return (value.k != null ? K.ADAPTER.encodedSizeWithTag(1, value.k) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, J value) throws IOException {
      if (value.k != null) K.ADAPTER.encodeWithTag(writer, 1, value.k);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public J decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.k(K.ADAPTER.decode(reader)); break;
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
    public J redact(J value) {
      Builder builder = value.newBuilder();
      if (builder.k != null) builder.k = K.ADAPTER.redact(builder.k);
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public final K k;

  public J(K k) {
    this(k, ByteString.EMPTY);
  }

  public J(K k, ByteString unknownFields) {
    super(unknownFields);
    this.k = k;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.k = k;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof J)) return false;
    J o = (J) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(k, o.k);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (k != null ? k.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (k != null) builder.append(", k=").append(k);
    return builder.replace(0, 2, "J{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<J, Builder> {
    public K k;

    public Builder() {
    }

    public Builder k(K k) {
      this.k = k;
      return this;
    }

    @Override
    public J build() {
      return new J(k, buildUnknownFields());
    }
  }
}
