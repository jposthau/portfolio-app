/**
 * 
 */
package com.jposthau.portfolio.backend.data;

import org.springframework.data.repository.CrudRepository;

import com.jposthau.portfolio.backend.bo.WorkExperienceBO;

/**
 * @author Jordan Posthauer
 *
 */
public interface WorkExperienceRepository extends CrudRepository<WorkExperienceBO, Long> {

}
