<b>1. What is Keycloak ? <b>
   
Keycloak is a an Identity and Access Management tool which is open source and uses standard protocols like
OAuth 2.0, OpenID Connect ( OIDC ) and SAML for securing web applications and services. First release was in 2014 and it’s developed and maintained by RedHat licensed with Apache License 2.0



Authentication Flow OIDC

![keycloak_flow.png](keycloak_flow.png)


A User requests a protected page on a browser. So browser visits application for requested page.

• The Application finds out that the user is not logged in and redirects the browser to the Keycloak login page with additional redirect url parameter as callback.

• The user types his username and password. Keycloak authenticates the user and creates one time, short live temporary code.

• Keycloak redirects the user back to the Application with additonal temporary code as query parameter.

• The Application gets the temporary code from the parameters and make a request to the Keycloak to Exchange one time temporary code with identity, Access and refresh token.
Identity Token : contains informations about the logged in user like username, email etc.
Access Token: digitally signed by realm and contains access informations such as user role mappings.
Refresh Token: allows the application to get a new valid Access token after it expires.