package org.opensandiego.model;

import android.support.annotation.NonNull;

import com.google.common.base.Optional;

import org.opensandiego.model.model.BaseEntity;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

/**
 * Model layer reactive API
 */
public interface DataSource<E extends BaseEntity> {

  /**
   * Create an item in the model layer
   * @param item item to be created and saved
   * @return an observable event that calls {@link Completable#complete()}
   * when function completes successfully or call {@link Completable#error(Throwable)} when
   * it encounters irrecoverable error.
   */
  Completable add(@NonNull E item);

  /**
   * Retrieves an item from the model layer
   * @param id unique id of the item to be retrieved
   * @return an observable event that returns an {@link E} item
   */
  Flowable<Optional<E>> getItem(@NonNull String id);

  /**
   * Retrieves all items from the model layer
   * @return an observable event that returns the list of {@link E} items
   */
  Flowable<List<E>> getItems();

  /**
   * Updates a particular item
   * @param item item to be updated
   * @return an observable event that calls {@link Completable#complete()}
   * when function completes successfully or call {@link Completable#error(Throwable)} when
   * it encounters irrecoverable error.
   */
  Completable update(@NonNull E item);

  /**
   * Removes a particular item
   * @param id unique id of the item to be removed
   * @return an observable event that calls {@link Completable#complete()}
   * when function completes successfully or call {@link Completable#error(Throwable)} when
   * it encounters irrecoverable error.
   */
  Completable remove(@NonNull String id);

  /**
   * Removes all items of type {@link E}
   * @return an observable event that calls {@link Completable#complete()}
   * when function completes successfully or call {@link Completable#error(Throwable)} when
   * it encounters irrecoverable error.
   */
  Completable removeAll();
}
