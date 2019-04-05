/**
 * 
 */
package com.jposthau.portfolio.backend.data;

import org.springframework.data.repository.CrudRepository;

import com.jposthau.portfolio.backend.bo.ResumeBO;

/**
 * @author Jordan Posthauer
 *
 */
public interface ResumeRepository extends CrudRepository<ResumeBO, Long> {

}
