// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hardware/course_microphone.proto

package com.triclass.hardware;

public final class CourseMicrophone {
  private CourseMicrophone() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_triclass_hardware_Microphone_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_triclass_hardware_Microphone_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n hardware/course_microphone.proto\022\021tric" +
      "lass.hardware\032\014switch.proto\"5\n\nMicrophon" +
      "e\022\'\n\006status\030\001 \001(\0162\027.triclass.switch.Swit" +
      "chB.\n\025com.triclass.hardwareP\001Z\023./hardwar" +
      "e;hardwareb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.triclass.SwitchOuterClass.getDescriptor(),
        });
    internal_static_triclass_hardware_Microphone_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_triclass_hardware_Microphone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_triclass_hardware_Microphone_descriptor,
        new java.lang.String[] { "Status", });
    com.triclass.SwitchOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
