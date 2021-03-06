/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.am.gateway.handler.vertx.auth.handler;

import io.gravitee.am.gateway.handler.vertx.auth.handler.impl.ClientCredentialsAuthHandlerImpl;
import io.vertx.ext.auth.AuthProvider;
import io.vertx.reactivex.ext.web.handler.AuthHandler;

/**
 * @author David BRASSELY (david.brassely at graviteesource.com)
 * @author GraviteeSource Team
 */
public interface ClientCredentialsAuthHandler {

    /**
     * Create an oauth2 client auth handler based on request parameters.
     *
     * @param authProvider  the auth provider to use
     * @return the auth handler
     */
    static AuthHandler create(AuthProvider authProvider) {
        return AuthHandler.newInstance(new ClientCredentialsAuthHandlerImpl(authProvider));
    }
}
