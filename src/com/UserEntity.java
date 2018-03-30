package com;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "onlinevote")
public class UserEntity {
    private String username;
    private String password;
    private String votingstatus;

    @Id
    @Column(name = "username", nullable = false, length = 10)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 10)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "votingstatus", nullable = false, length = 1)
    public String getVotingstatus() {
        return votingstatus;
    }

    public void setVotingstatus(String votingstatus) {
        this.votingstatus = votingstatus;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (votingstatus != null ? !votingstatus.equals(that.votingstatus) : that.votingstatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (votingstatus != null ? votingstatus.hashCode() : 0);
        return result;
    }*/
}
