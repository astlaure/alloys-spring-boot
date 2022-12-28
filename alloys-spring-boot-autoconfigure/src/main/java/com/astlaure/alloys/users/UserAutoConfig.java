package com.astlaure.alloys.users;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({UserController.class, UserService.class})
public class UserAutoConfig { }
