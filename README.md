# Alloys Spring Boot

Example of a Spring Boot Starter

## Annotations

1. **@AutoConfigurationPackage**

    Register every Entity and Repositories in the package & subpackages

2. **@AutoConfiguration**

    Mark an autoconfiguration that will be processed after the user configs (@Configuration)

3. **@Import({})**

    Registers the provided classes (no interface) in the context (@Service, @Controller, @Component)

4. **@ConditionalOnMissingBean**

    All Conditional can be used to mark a fallback bean (default implementation)

## Do not use in starters

1. @EntityScan
2. @ComponentScan
3. @EnableJpaRepositories

## Register autoconfigs

Create a file in resources/META-INF/spring called:

org.springframework.boot.autoconfigure.AutoConfiguration.imports

## Project structure

Look at the repo structure

## IntelliJ warnings

1. Cannot autowire repositories
    Go in Project Settings -> Facets\
    Select Spring -> Click the +\
    Other files and select the repository file\
    This will create a Context with the repository in it
