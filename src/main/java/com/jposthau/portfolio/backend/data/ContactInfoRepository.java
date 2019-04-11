/**
 * 
 */
package com.jposthau.portfolio.backend.data;

import org.springframework.data.repository.CrudRepository;

import com.jposthau.portfolio.backend.bo.ContactInfoBO;

/**
 * @author Jordan Posthauer
 *
 */
public interface ContactInfoRepository extends CrudRepository<ContactInfoBO, Long> {
	
}
