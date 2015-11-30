// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: request_response.proto at 3:1
package com.squareup.services.anotherpackage;

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

public class SendDataRequest extends Message<SendDataRequest, SendDataRequest.Builder> {
  public static final ProtoAdapter<SendDataRequest> ADAPTER = new ProtoAdapter<SendDataRequest>(FieldEncoding.LENGTH_DELIMITED, SendDataRequest.class) {
    @Override
    public int encodedSize(SendDataRequest value) {
      return (value.data != null ? ProtoAdapter.BYTES.encodedSizeWithTag(1, value.data) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SendDataRequest value) throws IOException {
      if (value.data != null) ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.data);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SendDataRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.data(ProtoAdapter.BYTES.decode(reader)); break;
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
    public SendDataRequest redact(SendDataRequest value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public static final ByteString DEFAULT_DATA = ByteString.EMPTY;

  public final ByteString data;

  public SendDataRequest(ByteString data) {
    this(data, ByteString.EMPTY);
  }

  public SendDataRequest(ByteString data, ByteString unknownFields) {
    super(unknownFields);
    this.data = data;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.data = data;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SendDataRequest)) return false;
    SendDataRequest o = (SendDataRequest) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(data, o.data);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (data != null ? data.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (data != null) builder.append(", data=").append(data);
    return builder.replace(0, 2, "SendDataRequest{").append('}').toString();
  }

  public static class Builder extends Message.Builder<SendDataRequest, Builder> {
    public ByteString data;

    public Builder() {
    }

    public Builder data(ByteString data) {
      this.data = data;
      return this;
    }

    @Override
    public SendDataRequest build() {
      return new SendDataRequest(data, buildUnknownFields());
    }
  }
}
