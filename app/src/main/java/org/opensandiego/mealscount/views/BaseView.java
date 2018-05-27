package org.opensandiego.mealscount.views;

/**
 * Base class for all View types
 */
public interface BaseView {

  /**
   * @return whether the view is ready to receive data
   */
  boolean isActive();
}
