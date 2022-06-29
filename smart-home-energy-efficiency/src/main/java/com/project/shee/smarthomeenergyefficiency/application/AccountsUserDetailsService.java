package com.project.shee.smarthomeenergyefficiency.application;

import com.project.shee.smarthomeenergyefficiency.registration.token.ConfirmationToken;
import com.project.shee.smarthomeenergyefficiency.registration.token.ConfirmationTokenService;
import com.project.shee.smarthomeenergyefficiency.application.entities.Accounts;
import com.project.shee.smarthomeenergyefficiency.application.repositories.AccountsRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AccountsUserDetailsService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG =
            "user with email %s not found";
    private AccountsRepository accountsRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private ConfirmationTokenService confirmationTokenService;

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
                return accountsRepository.findByAccounts(account)
                        .orElseThrow(() ->new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, account)));
    }

    public String signUpUser(Accounts accounts) {
        boolean accountExists = accountsRepository
                .findByAccounts(accounts.getName())
                .isPresent();

        if (accountExists) {
            // TODO check of attributes are the same and
            // TODO if email not confirmed send confirmation email.

            throw new IllegalStateException("account name is already taken");
        }

        String encodedPassword = bCryptPasswordEncoder
                .encode(accounts.getPassword());

        accounts.setPassword(encodedPassword);

        accountsRepository.save(accounts);

        String token =  UUID.randomUUID().toString();

        ConfirmationToken confirmationToken = new ConfirmationToken(
                token,
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(15),
                accounts
        );

        confirmationTokenService.saveConfirmationToken(confirmationToken);

//        TODO: SEND EMAIL

        return token;
    }

    public int enableAccountUser(String account) {
        return accountsRepository.enableAccountUser(account);
    }
}
