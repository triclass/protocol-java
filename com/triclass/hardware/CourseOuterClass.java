// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hardware/course.proto

package com.triclass.hardware;

public final class CourseOuterClass {
  private CourseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_triclass_hardware_Course_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_triclass_hardware_Course_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025hardware/course.proto\022\021triclass.hardwa" +
      "re\032\033hardware/course_start.proto\032\037hardwar" +
      "e/course_terminate.proto\032\033hardware/cours" +
      "e_video.proto\032 hardware/course_microphon" +
      "e.proto\032\033hardware/course_audio.proto\"\373\001\n" +
      "\006Course\022)\n\005start\030\001 \001(\0132\030.triclass.hardwa" +
      "re.StartH\000\0221\n\tterminate\030\002 \001(\0132\034.triclass" +
      ".hardware.TerminateH\000\022)\n\005video\030\003 \001(\0132\030.t" +
      "riclass.hardware.VideoH\000\0223\n\nmicrophone\030\004" +
      " \001(\0132\035.triclass.hardware.MicrophoneH\000\022)\n" +
      "\005audio\030\005 \001(\0132\030.triclass.hardware.AudioH\000" +
      "B\010\n\006actionB.\n\025com.triclass.hardwareP\001Z\023." +
      "/hardware;hardwareb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.triclass.hardware.CourseStart.getDescriptor(),
          com.triclass.hardware.CourseTerminate.getDescriptor(),
          com.triclass.hardware.CourseVideo.getDescriptor(),
          com.triclass.hardware.CourseMicrophone.getDescriptor(),
          com.triclass.hardware.CourseAudio.getDescriptor(),
        });
    internal_static_triclass_hardware_Course_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_triclass_hardware_Course_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_triclass_hardware_Course_descriptor,
        new java.lang.String[] { "Start", "Terminate", "Video", "Microphone", "Audio", "Action", });
    com.triclass.hardware.CourseStart.getDescriptor();
    com.triclass.hardware.CourseTerminate.getDescriptor();
    com.triclass.hardware.CourseVideo.getDescriptor();
    com.triclass.hardware.CourseMicrophone.getDescriptor();
    com.triclass.hardware.CourseAudio.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
