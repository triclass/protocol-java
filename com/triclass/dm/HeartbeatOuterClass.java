// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dm/heartbeat.proto

package com.triclass.dm;

public final class HeartbeatOuterClass {
  private HeartbeatOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_triclass_dm_Heartbeat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_triclass_dm_Heartbeat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022dm/heartbeat.proto\022\013triclass.dm\032\022manuf" +
      "acturer.proto\032\023system_status.proto\"\210\001\n\tH" +
      "eartbeat\0229\n\014manufacturer\030\001 \001(\0162#.triclas" +
      "s.manufacturer.Manufacturer\022\n\n\002sn\030\002 \001(\t\022" +
      "4\n\006status\030\003 \001(\0162$.triclass.system.status" +
      ".SystemStatusB\034\n\017com.triclass.dmP\001Z\007./dm" +
      ";dmb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.triclass.ManufacturerOuterClass.getDescriptor(),
          com.triclass.SystemStatusOuterClass.getDescriptor(),
        });
    internal_static_triclass_dm_Heartbeat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_triclass_dm_Heartbeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_triclass_dm_Heartbeat_descriptor,
        new java.lang.String[] { "Manufacturer", "Sn", "Status", });
    com.triclass.ManufacturerOuterClass.getDescriptor();
    com.triclass.SystemStatusOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
