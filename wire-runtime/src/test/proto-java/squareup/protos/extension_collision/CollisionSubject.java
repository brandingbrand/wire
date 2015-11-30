// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: extension_collision.proto at 6:1
package squareup.protos.extension_collision;

import com.google.protobuf.FieldOptions;
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

public class CollisionSubject extends Message<CollisionSubject, CollisionSubject.Builder> {
  public static final ProtoAdapter<CollisionSubject> ADAPTER = new ProtoAdapter<CollisionSubject>(FieldEncoding.LENGTH_DELIMITED, CollisionSubject.class) {
    @Override
    public int encodedSize(CollisionSubject value) {
      return (value.f != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.f) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, CollisionSubject value) throws IOException {
      if (value.f != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.f);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public CollisionSubject decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.f(ProtoAdapter.STRING.decode(reader)); break;
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
    public CollisionSubject redact(CollisionSubject value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public static final FieldOptions FIELD_OPTIONS_F = new FieldOptions.Builder()
      .squareup_protos_extension_collision_1_a("1a")
      .b("1b")
      .squareup_protos_extension_collision_2_a("2a")
      .c("2c")
      .build();

  public static final String DEFAULT_F = "";

  public final String f;

  public CollisionSubject(String f) {
    this(f, ByteString.EMPTY);
  }

  public CollisionSubject(String f, ByteString unknownFields) {
    super(unknownFields);
    this.f = f;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.f = f;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CollisionSubject)) return false;
    CollisionSubject o = (CollisionSubject) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(f, o.f);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (f != null ? f.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (f != null) builder.append(", f=").append(f);
    return builder.replace(0, 2, "CollisionSubject{").append('}').toString();
  }

  public static class Builder extends Message.Builder<CollisionSubject, Builder> {
    public String f;

    public Builder() {
    }

    public Builder f(String f) {
      this.f = f;
      return this;
    }

    @Override
    public CollisionSubject build() {
      return new CollisionSubject(f, buildUnknownFields());
    }
  }
}
