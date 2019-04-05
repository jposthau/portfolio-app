/**
 * 
 */
package com.jposthau.portfolio.backend.data;

import org.springframework.data.repository.CrudRepository;

import com.jposthau.portfolio.backend.bo.ProjectBO;

/**
 * @author Jordan Posthauer
 *
 */
public interface ProjectRepository extends CrudRepository<ProjectBO, Long> {

}
