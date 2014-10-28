/*
 * Copyright 2014 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.servlet.config;

import java.util.Map;

public interface Config extends Map<String, String> {

    /**
     * Returns the context-relative URL of the login view.
     *
     * @return the context-relative URL of the login view.
     */
    String getLoginUrl();

    String getLoginNextUrl();

    String getLogoutUrl();

    String getLogoutNextUrl();

    String getRegisterUrl();

    String getRegisterNextUrl();

    String getVerifyUrl();

    String getVerifyNextUrl();

    String getUnauthorizedUrl();

    CookieConfig getAccountCookieConfig();

}
