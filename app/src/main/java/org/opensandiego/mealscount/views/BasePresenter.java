package org.opensandiego.mealscount.views;

import android.support.annotation.NonNull;

/**
 * Base class for all Presenter types
 */
public interface BasePresenter<V extends BaseView> {
  /**
   * Binds the a live view with its presenter
   * @param view view to be bind to this class
   */
  void setView(@NonNull V view);

  /**
   * Allows presenter to drop reference to dead views,
   * when appropriate.
   */
  void dropView();
}
