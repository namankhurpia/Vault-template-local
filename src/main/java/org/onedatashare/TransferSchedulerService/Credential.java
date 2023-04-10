package org.onedatashare.TransferSchedulerService;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("lnews")
public class Credential {
    public String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Credential(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
