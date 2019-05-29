// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface ListSharedAlbumsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.ListSharedAlbumsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. List of shared albums.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album shared_albums = 1;</code>
   */
  java.util.List<com.google.photos.types.proto.Album> getSharedAlbumsList();
  /**
   *
   *
   * <pre>
   * Output only. List of shared albums.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album shared_albums = 1;</code>
   */
  com.google.photos.types.proto.Album getSharedAlbums(int index);
  /**
   *
   *
   * <pre>
   * Output only. List of shared albums.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album shared_albums = 1;</code>
   */
  int getSharedAlbumsCount();
  /**
   *
   *
   * <pre>
   * Output only. List of shared albums.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album shared_albums = 1;</code>
   */
  java.util.List<? extends com.google.photos.types.proto.AlbumOrBuilder>
      getSharedAlbumsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. List of shared albums.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album shared_albums = 1;</code>
   */
  com.google.photos.types.proto.AlbumOrBuilder getSharedAlbumsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Token to use to get the next set of shared albums. Populated
   * if there are more shared albums to retrieve for this request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Output only. Token to use to get the next set of shared albums. Populated
   * if there are more shared albums to retrieve for this request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
