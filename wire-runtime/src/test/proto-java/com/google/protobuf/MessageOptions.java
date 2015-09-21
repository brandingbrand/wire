// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 299:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.TagMap;
import com.squareup.wire.WireField;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.util.List;

public final class MessageOptions extends Message<MessageOptions> {
  public static final ProtoAdapter<MessageOptions> ADAPTER = ProtoAdapter.newMessageAdapter(MessageOptions.class);

  private static final long serialVersionUID = 0L;

  public static final Boolean DEFAULT_MESSAGE_SET_WIRE_FORMAT = false;

  public static final Boolean DEFAULT_NO_STANDARD_DESCRIPTOR_ACCESSOR = false;

  /**
   * Set true to use the old proto1 MessageSet wire format for extensions.
   * This is provided for backwards-compatibility with the MessageSet wire
   * format.  You should not use this for any other reason:  It's less
   * efficient, has fewer features, and is more complicated.
   *
   * The message must be defined exactly as follows:
   *   message Foo {
   *     option message_set_wire_format = true;
   *     extensions 4 to max;
   *   }
   * Note that the message cannot have any defined fields; MessageSets only
   * have extensions.
   *
   * All extensions of your type must be singular messages; e.g. they cannot
   * be int32s, enums, or repeated messages.
   *
   * Because this is an option, the above two restrictions are not enforced by
   * the protocol compiler.
   */
  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean message_set_wire_format;

  /**
   * Disables the generation of the standard "descriptor()" accessor, which can
   * conflict with a field of the same name.  This is meant to make migration
   * from proto1 easier; new code should avoid fields named "descriptor".
   */
  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  public final Boolean no_standard_descriptor_accessor;

  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @WireField(
      tag = 999,
      adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<UninterpretedOption> uninterpreted_option;

  public MessageOptions(Boolean message_set_wire_format, Boolean no_standard_descriptor_accessor, List<UninterpretedOption> uninterpreted_option) {
    this(message_set_wire_format, no_standard_descriptor_accessor, uninterpreted_option, TagMap.EMPTY);
  }

  public MessageOptions(Boolean message_set_wire_format, Boolean no_standard_descriptor_accessor, List<UninterpretedOption> uninterpreted_option, TagMap tagMap) {
    super(tagMap);
    this.message_set_wire_format = message_set_wire_format;
    this.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
    this.uninterpreted_option = immutableCopyOf(uninterpreted_option);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MessageOptions)) return false;
    MessageOptions o = (MessageOptions) other;
    return equals(tagMap(), o.tagMap())
        && equals(message_set_wire_format, o.message_set_wire_format)
        && equals(no_standard_descriptor_accessor, o.no_standard_descriptor_accessor)
        && equals(uninterpreted_option, o.uninterpreted_option);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = tagMap().hashCode();
      result = result * 37 + (message_set_wire_format != null ? message_set_wire_format.hashCode() : 0);
      result = result * 37 + (no_standard_descriptor_accessor != null ? no_standard_descriptor_accessor.hashCode() : 0);
      result = result * 37 + (uninterpreted_option != null ? uninterpreted_option.hashCode() : 1);
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<MessageOptions, Builder> {
    public Boolean message_set_wire_format;

    public Boolean no_standard_descriptor_accessor;

    public List<UninterpretedOption> uninterpreted_option;

    public Builder() {
      uninterpreted_option = newMutableList();
    }

    public Builder(MessageOptions message) {
      super(message);
      if (message == null) return;
      this.message_set_wire_format = message.message_set_wire_format;
      this.no_standard_descriptor_accessor = message.no_standard_descriptor_accessor;
      this.uninterpreted_option = copyOf(message.uninterpreted_option);
    }

    /**
     * Set true to use the old proto1 MessageSet wire format for extensions.
     * This is provided for backwards-compatibility with the MessageSet wire
     * format.  You should not use this for any other reason:  It's less
     * efficient, has fewer features, and is more complicated.
     *
     * The message must be defined exactly as follows:
     *   message Foo {
     *     option message_set_wire_format = true;
     *     extensions 4 to max;
     *   }
     * Note that the message cannot have any defined fields; MessageSets only
     * have extensions.
     *
     * All extensions of your type must be singular messages; e.g. they cannot
     * be int32s, enums, or repeated messages.
     *
     * Because this is an option, the above two restrictions are not enforced by
     * the protocol compiler.
     */
    public Builder message_set_wire_format(Boolean message_set_wire_format) {
      this.message_set_wire_format = message_set_wire_format;
      return this;
    }

    /**
     * Disables the generation of the standard "descriptor()" accessor, which can
     * conflict with a field of the same name.  This is meant to make migration
     * from proto1 easier; new code should avoid fields named "descriptor".
     */
    public Builder no_standard_descriptor_accessor(Boolean no_standard_descriptor_accessor) {
      this.no_standard_descriptor_accessor = no_standard_descriptor_accessor;
      return this;
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    public Builder uninterpreted_option(List<UninterpretedOption> uninterpreted_option) {
      checkElementsNotNull(uninterpreted_option);
      this.uninterpreted_option = uninterpreted_option;
      return this;
    }

    @Override
    public MessageOptions build() {
      return new MessageOptions(message_set_wire_format, no_standard_descriptor_accessor, uninterpreted_option, buildTagMap());
    }
  }
}