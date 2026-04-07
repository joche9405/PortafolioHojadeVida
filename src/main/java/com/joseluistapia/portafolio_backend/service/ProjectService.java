package com.joseluistapia.portafolio_backend.service;

import java.util.List;

import com.joseluistapia.portafolio_backend.model.Project;

public interface ProjectService {
    List<Project> getProjectsByProfile(String profileId);

    Project saveProject(Project project);

    void deleteProject(String id);

    Project updateProject(String id, Project project);
}
