package com.joseluistapia.portafolio_backend.service;

import java.util.List;
import java.util.Optional;
import com.joseluistapia.portafolio_backend.model.Profile;

public interface ProfileService {

    Optional<Profile> getByTipoPerfil(String tipoPerfil);

    Profile save(Profile profile);

    List<Profile> findAll();

}
