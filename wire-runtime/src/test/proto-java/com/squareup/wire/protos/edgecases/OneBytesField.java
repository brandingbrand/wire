// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: edge_cases.proto at 27:1
package com.squareup.wire.protos.edgecases;

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

public class OneBytesField extends Message<OneBytesField, OneBytesField.Builder> {
  public static final ProtoAdapter<OneBytesField> ADAPTER = new ProtoAdapter<OneBytesField>(FieldEncoding.LENGTH_DELIMITED, OneBytesField.class) {
    @Override
    public int encodedSize(OneBytesField value) {
      return (value.opt_bytes != null ? ProtoAdapter.BYTES.encodedSizeWithTag(1, value.opt_bytes) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, OneBytesField value) throws IOException {
      if (value.opt_bytes != null) ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.opt_bytes);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public OneBytesField decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.opt_bytes(ProtoAdapter.BYTES.decode(reader)); break;
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
    public OneBytesField redact(OneBytesField value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_OPT_BYTES = ByteString.EMPTY;

  public final ByteString opt_bytes;

  public OneBytesField(ByteString opt_bytes) {
    this(opt_bytes, ByteString.EMPTY);
  }

  public OneBytesField(ByteString opt_bytes, ByteString unknownFields) {
    super(unknownFields);
    this.opt_bytes = opt_bytes;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.opt_bytes = opt_bytes;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof OneBytesField)) return false;
    OneBytesField o = (OneBytesField) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(opt_bytes, o.opt_bytes);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (opt_bytes != null ? opt_bytes.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (opt_bytes != null) builder.append(", opt_bytes=").append(opt_bytes);
    return builder.replace(0, 2, "OneBytesField{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<OneBytesField, Builder> {
    public ByteString opt_bytes;

    public Builder() {
    }

    public Builder opt_bytes(ByteString opt_bytes) {
      this.opt_bytes = opt_bytes;
      return this;
    }

    @Override
    public OneBytesField build() {
      return new OneBytesField(opt_bytes, buildUnknownFields());
    }
  }
}
