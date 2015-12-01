// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto at 60:1
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * Describes a complete .proto file.
 */
public class FileDescriptorProto extends Message<FileDescriptorProto, FileDescriptorProto.Builder> {
  public static final ProtoAdapter<FileDescriptorProto> ADAPTER = new ProtoAdapter<FileDescriptorProto>(FieldEncoding.LENGTH_DELIMITED, FileDescriptorProto.class) {
    @Override
    public int encodedSize(FileDescriptorProto value) {
      return (value.name != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.name) : 0)
          + (value.package_ != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.package_) : 0)
          + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, value.dependency)
          + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(10, value.public_dependency)
          + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(11, value.weak_dependency)
          + DescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(4, value.message_type)
          + EnumDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(5, value.enum_type)
          + ServiceDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(6, value.service)
          + FieldDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(7, value.extension)
          + (value.options != null ? FileOptions.ADAPTER.encodedSizeWithTag(8, value.options) : 0)
          + (value.source_code_info != null ? SourceCodeInfo.ADAPTER.encodedSizeWithTag(9, value.source_code_info) : 0)
          + (value.syntax != null ? ProtoAdapter.STRING.encodedSizeWithTag(12, value.syntax) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, FileDescriptorProto value) throws IOException {
      if (value.name != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      if (value.package_ != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.package_);
      if (value.dependency != null) ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 3, value.dependency);
      if (value.public_dependency != null) ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 10, value.public_dependency);
      if (value.weak_dependency != null) ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 11, value.weak_dependency);
      if (value.message_type != null) DescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.message_type);
      if (value.enum_type != null) EnumDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.enum_type);
      if (value.service != null) ServiceDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.service);
      if (value.extension != null) FieldDescriptorProto.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.extension);
      if (value.options != null) FileOptions.ADAPTER.encodeWithTag(writer, 8, value.options);
      if (value.source_code_info != null) SourceCodeInfo.ADAPTER.encodeWithTag(writer, 9, value.source_code_info);
      if (value.syntax != null) ProtoAdapter.STRING.encodeWithTag(writer, 12, value.syntax);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public FileDescriptorProto decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.package_(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.dependency.add(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.public_dependency.add(ProtoAdapter.INT32.decode(reader)); break;
          case 11: builder.weak_dependency.add(ProtoAdapter.INT32.decode(reader)); break;
          case 4: builder.message_type.add(DescriptorProto.ADAPTER.decode(reader)); break;
          case 5: builder.enum_type.add(EnumDescriptorProto.ADAPTER.decode(reader)); break;
          case 6: builder.service.add(ServiceDescriptorProto.ADAPTER.decode(reader)); break;
          case 7: builder.extension.add(FieldDescriptorProto.ADAPTER.decode(reader)); break;
          case 8: builder.options(FileOptions.ADAPTER.decode(reader)); break;
          case 9: builder.source_code_info(SourceCodeInfo.ADAPTER.decode(reader)); break;
          case 12: builder.syntax(ProtoAdapter.STRING.decode(reader)); break;
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
    public FileDescriptorProto redact(FileDescriptorProto value) {
      Builder builder = value.newBuilder();
      redactElements(builder.message_type, DescriptorProto.ADAPTER);
      redactElements(builder.enum_type, EnumDescriptorProto.ADAPTER);
      redactElements(builder.service, ServiceDescriptorProto.ADAPTER);
      redactElements(builder.extension, FieldDescriptorProto.ADAPTER);
      if (builder.options != null) builder.options = FileOptions.ADAPTER.redact(builder.options);
      if (builder.source_code_info != null) builder.source_code_info = SourceCodeInfo.ADAPTER.redact(builder.source_code_info);
      builder.clearUnknownFields();
      return builder.build();
    }
  };

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_PACKAGE_ = "";

  public static final String DEFAULT_SYNTAX = "";

  /**
   * file name, relative to root of source tree
   */
  public final String name;

  /**
   * e.g. "foo", "foo.bar", etc.
   */
  public final String package_;

  /**
   * Names of files imported by this file.
   */
  public final List<String> dependency;

  /**
   * Indexes of the public imported files in the dependency list above.
   */
  public final List<Integer> public_dependency;

  /**
   * Indexes of the weak imported files in the dependency list.
   * For Google-internal migration only. Do not use.
   */
  public final List<Integer> weak_dependency;

  /**
   * All top-level definitions in this file.
   */
  public final List<DescriptorProto> message_type;

  public final List<EnumDescriptorProto> enum_type;

  public final List<ServiceDescriptorProto> service;

  public final List<FieldDescriptorProto> extension;

  public final FileOptions options;

  /**
   * This field contains optional information about the original source code.
   * You may safely remove this entire field without harming runtime
   * functionality of the descriptors -- the information is needed only by
   * development tools.
   */
  public final SourceCodeInfo source_code_info;

  /**
   * The syntax of the proto file.
   * The supported values are "proto2" and "proto3".
   */
  public final String syntax;

  public FileDescriptorProto(String name, String package_, List<String> dependency, List<Integer> public_dependency, List<Integer> weak_dependency, List<DescriptorProto> message_type, List<EnumDescriptorProto> enum_type, List<ServiceDescriptorProto> service, List<FieldDescriptorProto> extension, FileOptions options, SourceCodeInfo source_code_info, String syntax) {
    this(name, package_, dependency, public_dependency, weak_dependency, message_type, enum_type, service, extension, options, source_code_info, syntax, ByteString.EMPTY);
  }

  public FileDescriptorProto(String name, String package_, List<String> dependency, List<Integer> public_dependency, List<Integer> weak_dependency, List<DescriptorProto> message_type, List<EnumDescriptorProto> enum_type, List<ServiceDescriptorProto> service, List<FieldDescriptorProto> extension, FileOptions options, SourceCodeInfo source_code_info, String syntax, ByteString unknownFields) {
    super(unknownFields);
    this.name = name;
    this.package_ = package_;
    this.dependency = immutableCopyOf("dependency", dependency);
    this.public_dependency = immutableCopyOf("public_dependency", public_dependency);
    this.weak_dependency = immutableCopyOf("weak_dependency", weak_dependency);
    this.message_type = immutableCopyOf("message_type", message_type);
    this.enum_type = immutableCopyOf("enum_type", enum_type);
    this.service = immutableCopyOf("service", service);
    this.extension = immutableCopyOf("extension", extension);
    this.options = options;
    this.source_code_info = source_code_info;
    this.syntax = syntax;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.package_ = package_;
    builder.dependency = copyOf("dependency", dependency);
    builder.public_dependency = copyOf("public_dependency", public_dependency);
    builder.weak_dependency = copyOf("weak_dependency", weak_dependency);
    builder.message_type = copyOf("message_type", message_type);
    builder.enum_type = copyOf("enum_type", enum_type);
    builder.service = copyOf("service", service);
    builder.extension = copyOf("extension", extension);
    builder.options = options;
    builder.source_code_info = source_code_info;
    builder.syntax = syntax;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FileDescriptorProto)) return false;
    FileDescriptorProto o = (FileDescriptorProto) other;
    return equals(unknownFields(), o.unknownFields())
        && equals(name, o.name)
        && equals(package_, o.package_)
        && equals(dependency, o.dependency)
        && equals(public_dependency, o.public_dependency)
        && equals(weak_dependency, o.weak_dependency)
        && equals(message_type, o.message_type)
        && equals(enum_type, o.enum_type)
        && equals(service, o.service)
        && equals(extension, o.extension)
        && equals(options, o.options)
        && equals(source_code_info, o.source_code_info)
        && equals(syntax, o.syntax);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (package_ != null ? package_.hashCode() : 0);
      result = result * 37 + (dependency != null ? dependency.hashCode() : 1);
      result = result * 37 + (public_dependency != null ? public_dependency.hashCode() : 1);
      result = result * 37 + (weak_dependency != null ? weak_dependency.hashCode() : 1);
      result = result * 37 + (message_type != null ? message_type.hashCode() : 1);
      result = result * 37 + (enum_type != null ? enum_type.hashCode() : 1);
      result = result * 37 + (service != null ? service.hashCode() : 1);
      result = result * 37 + (extension != null ? extension.hashCode() : 1);
      result = result * 37 + (options != null ? options.hashCode() : 0);
      result = result * 37 + (source_code_info != null ? source_code_info.hashCode() : 0);
      result = result * 37 + (syntax != null ? syntax.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(name);
    if (package_ != null) builder.append(", package=").append(package_);
    if (dependency != null) builder.append(", dependency=").append(dependency);
    if (public_dependency != null) builder.append(", public_dependency=").append(public_dependency);
    if (weak_dependency != null) builder.append(", weak_dependency=").append(weak_dependency);
    if (message_type != null) builder.append(", message_type=").append(message_type);
    if (enum_type != null) builder.append(", enum_type=").append(enum_type);
    if (service != null) builder.append(", service=").append(service);
    if (extension != null) builder.append(", extension=").append(extension);
    if (options != null) builder.append(", options=").append(options);
    if (source_code_info != null) builder.append(", source_code_info=").append(source_code_info);
    if (syntax != null) builder.append(", syntax=").append(syntax);
    return builder.replace(0, 2, "FileDescriptorProto{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<FileDescriptorProto, Builder> {
    public String name;

    public String package_;

    public List<String> dependency;

    public List<Integer> public_dependency;

    public List<Integer> weak_dependency;

    public List<DescriptorProto> message_type;

    public List<EnumDescriptorProto> enum_type;

    public List<ServiceDescriptorProto> service;

    public List<FieldDescriptorProto> extension;

    public FileOptions options;

    public SourceCodeInfo source_code_info;

    public String syntax;

    public Builder() {
      dependency = newMutableList();
      public_dependency = newMutableList();
      weak_dependency = newMutableList();
      message_type = newMutableList();
      enum_type = newMutableList();
      service = newMutableList();
      extension = newMutableList();
    }

    /**
     * file name, relative to root of source tree
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * e.g. "foo", "foo.bar", etc.
     */
    public Builder package_(String package_) {
      this.package_ = package_;
      return this;
    }

    /**
     * Names of files imported by this file.
     */
    public Builder dependency(List<String> dependency) {
      checkElementsNotNull(dependency);
      this.dependency = dependency;
      return this;
    }

    /**
     * Indexes of the public imported files in the dependency list above.
     */
    public Builder public_dependency(List<Integer> public_dependency) {
      checkElementsNotNull(public_dependency);
      this.public_dependency = public_dependency;
      return this;
    }

    /**
     * Indexes of the weak imported files in the dependency list.
     * For Google-internal migration only. Do not use.
     */
    public Builder weak_dependency(List<Integer> weak_dependency) {
      checkElementsNotNull(weak_dependency);
      this.weak_dependency = weak_dependency;
      return this;
    }

    /**
     * All top-level definitions in this file.
     */
    public Builder message_type(List<DescriptorProto> message_type) {
      checkElementsNotNull(message_type);
      this.message_type = message_type;
      return this;
    }

    public Builder enum_type(List<EnumDescriptorProto> enum_type) {
      checkElementsNotNull(enum_type);
      this.enum_type = enum_type;
      return this;
    }

    public Builder service(List<ServiceDescriptorProto> service) {
      checkElementsNotNull(service);
      this.service = service;
      return this;
    }

    public Builder extension(List<FieldDescriptorProto> extension) {
      checkElementsNotNull(extension);
      this.extension = extension;
      return this;
    }

    public Builder options(FileOptions options) {
      this.options = options;
      return this;
    }

    /**
     * This field contains optional information about the original source code.
     * You may safely remove this entire field without harming runtime
     * functionality of the descriptors -- the information is needed only by
     * development tools.
     */
    public Builder source_code_info(SourceCodeInfo source_code_info) {
      this.source_code_info = source_code_info;
      return this;
    }

    /**
     * The syntax of the proto file.
     * The supported values are "proto2" and "proto3".
     */
    public Builder syntax(String syntax) {
      this.syntax = syntax;
      return this;
    }

    @Override
    public FileDescriptorProto build() {
      return new FileDescriptorProto(name, package_, dependency, public_dependency, weak_dependency, message_type, enum_type, service, extension, options, source_code_info, syntax, buildUnknownFields());
    }
  }
}
