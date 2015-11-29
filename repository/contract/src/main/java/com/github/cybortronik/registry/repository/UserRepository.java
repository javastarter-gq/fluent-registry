package com.github.cybortronik.registry.repository;

import com.github.cybortronik.registry.bean.User;
import com.github.cybortronik.registry.repository.bean.FilteredUsers;
import com.github.cybortronik.registry.repository.bean.UserFilter;
import com.google.gson.JsonElement;

import java.util.List;
import java.util.UUID;

/**
 * Created by stanislav on 10/28/15.
 */
public interface UserRepository extends Repository<User, String> {

    UUID createUser(String displayName, String email, String passwordHash, String details);

    User findByEmail(String email);

    void addUserRole(String userId, String role);

    void updateDisplayName(String uuid, String displayName);

    void updateEmail(String uuid, String email);

    void setRoles(String uuid, List<String> roles);

    void setPasswordHash(String uuid, String passwordHash);

    FilteredUsers filter(UserFilter userFilter);

    UUID createUser(String displayName, String email, String passwordHash);

    void updateDetails(String uuid, JsonElement details);
}
