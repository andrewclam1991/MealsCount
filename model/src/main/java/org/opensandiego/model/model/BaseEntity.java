package org.opensandiego.model.model;

import android.support.annotation.NonNull;

/**
 * Base pojo class for all entity
 */
public abstract class BaseEntity {
  @NonNull
  private final String uid;

  BaseEntity(@NonNull String uid){
    this.uid = uid;
  }

  @NonNull
  public String getUid() {
    return uid;
  }

}
