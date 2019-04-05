/**
 * 
 */
package com.jposthau.portfolio.backend.data;

import org.springframework.data.repository.CrudRepository;

import com.jposthau.portfolio.backend.bo.LocationBO;

/**
 * @author Jordan Posthauer
 *
 */
public interface LocationRepository extends CrudRepository<LocationBO, Long> {

}