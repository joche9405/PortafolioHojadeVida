package com.joseluistapia.portafolio_backend.service;

import com.joseluistapia.portafolio_backend.repository.ProjecRepository;
import com.joseluistapia.portafolio_backend.model.Project;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjecRepository projectRepository;

    public ProjectServiceImpl(ProjecRepository projecRepository) {
        this.projectRepository = projecRepository;
    }

    @Override
    public List<Project> getProjectsByProfile(String profileId) {
        return projectRepository.findByProfileId(profileId);
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void deleteProject(String id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project updateProject(String id, Project project) {
        project.setId(id);
        return projectRepository.save(project);
    }
}
