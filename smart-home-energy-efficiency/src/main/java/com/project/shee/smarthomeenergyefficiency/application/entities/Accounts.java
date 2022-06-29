package com.project.shee.smarthomeenergyefficiency.application.entities;

import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.sql.Date;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name = "Accounts")
public class Accounts implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer account_id;
    @OneToOne
    @JoinColumn(name = "account_type_type_id")
    private AccountType accountType;
    private String password;
    private Boolean locked = false;
    private Boolean enabled = false;


    private Integer type_id;

    @NotEmpty
    @Size(min = 3, max = 50, message = "Name must be greater then 3 and less then 50 characters long.")
    @Pattern(regexp="^[a-zA-ZÀ-ž]*$")
    private String name;

    @NotEmpty
    @Email(message = "Please insert valid email address.")
    private String email;

    @NotNull(message = "Insert valid date.")
    @CreatedDate
    private Date registered;

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(accountType.getAccount_type()));
    }

    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
