package com.github.cybortronik.registry.bean;

import com.google.gson.JsonElement;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by stanislav on 10/28/15.
 */
public class User extends Bean {
    private String displayName;
    private String email;
    private transient String passwordHash;
    private Set<String> roles;
    private JsonElement details;
    private String companyId;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Collection<String> roles) {
        if (roles == null) {
            roles = new HashSet<>();
            return;
        }
        this.roles = new HashSet<>(roles);
    }

    public void addRole(String role) {
        if (roles == null)
            roles = new HashSet<>();
        roles.add(role);
    }

    public void removeRole(String role) {
        if (roles != null)
            roles.remove(role);
    }

    public boolean hasRole(String role) {
        return roles != null && roles.contains(role);
    }

    public boolean hasAnyRole(String... roles) {
        if (roles == null)
            return false;
        for (String role : roles)
            if (hasRole(role))
                return true;
        return false;
    }

    public JsonElement getDetails() {
        return details;
    }

    public void setDetails(JsonElement details) {
        this.details = details;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
