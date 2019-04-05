/**
 * 
 */
package com.jposthau.portfolio.backend.data;

import org.springframework.data.repository.CrudRepository;

import com.jposthau.portfolio.backend.bo.EducationBO;

/**
 * @author Jordan Posthauer
 *
 */
public interface ContactInfoRepository extends CrudRepository<EducationBO, Long> {

}
