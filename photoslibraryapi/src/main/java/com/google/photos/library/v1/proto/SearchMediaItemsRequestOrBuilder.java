// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface SearchMediaItemsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.SearchMediaItemsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier of an album. If populated, lists all media items in
   * specified album. Can't set in conjunction with any filters.
   * </pre>
   *
   * <code>string album_id = 1;</code>
   *
   * @return The albumId.
   */
  java.lang.String getAlbumId();
  /**
   *
   *
   * <pre>
   * Identifier of an album. If populated, lists all media items in
   * specified album. Can't set in conjunction with any filters.
   * </pre>
   *
   * <code>string album_id = 1;</code>
   *
   * @return The bytes for albumId.
   */
  com.google.protobuf.ByteString getAlbumIdBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of media items to return in the response. Fewer media items
   * might be returned than the specified number. The default `pageSize` is 25,
   * the maximum is 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A continuation token to get the next page of the results. Adding this to
   * the request returns the rows after the `pageToken`. The `pageToken` should
   * be the value returned in the `nextPageToken` parameter in the response to
   * the `searchMediaItems` request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A continuation token to get the next page of the results. Adding this to
   * the request returns the rows after the `pageToken`. The `pageToken` should
   * be the value returned in the `nextPageToken` parameter in the response to
   * the `searchMediaItems` request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Filters to apply to the request. Can't be set in conjunction with an
   * `albumId`.
   * </pre>
   *
   * <code>.google.photos.library.v1.Filters filters = 4;</code>
   *
   * @return Whether the filters field is set.
   */
  boolean hasFilters();
  /**
   *
   *
   * <pre>
   * Filters to apply to the request. Can't be set in conjunction with an
   * `albumId`.
   * </pre>
   *
   * <code>.google.photos.library.v1.Filters filters = 4;</code>
   *
   * @return The filters.
   */
  com.google.photos.library.v1.proto.Filters getFilters();
  /**
   *
   *
   * <pre>
   * Filters to apply to the request. Can't be set in conjunction with an
   * `albumId`.
   * </pre>
   *
   * <code>.google.photos.library.v1.Filters filters = 4;</code>
   */
  com.google.photos.library.v1.proto.FiltersOrBuilder getFiltersOrBuilder();
}
