/**
 * 
 */
package org.nioto.vrac;

/**
 * 
 * Simple interface, to run an action on a item after it has been 
 * removed from cache.
 * @author nioto
 *
 */
public interface CacheActionOnRemove<T> {

	/**
	 * Method called after item is removed from a cache
	 * 
	 */
	public void remove(T removed);
}
