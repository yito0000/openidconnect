package com.example.openidconnect.openidconnect.adapters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class AuthController {

    @GetMapping("/getOidcUser")
    public ModelAndView getOidcUser(@AuthenticationPrincipal OidcUser oidcUser) {
        return new ModelAndView("refer-oidc-user");
    }
}
