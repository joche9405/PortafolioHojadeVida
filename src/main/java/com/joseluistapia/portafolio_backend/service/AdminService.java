package com.joseluistapia.portafolio_backend.service;

import com.joseluistapia.portafolio_backend.model.Admin;

public interface AdminService {

    Admin createAdmin(Admin admin);

    String login(String username, String password);

    void changePassword(String username, String oldPassword, String newPassword);

}
