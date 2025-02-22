/**
 * Copyright (c) 2023, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth.par.cache;

import org.wso2.carbon.identity.application.authentication.framework.cache.AuthenticationBaseCache;
import org.wso2.carbon.identity.oauth.par.common.ParConstants;
import org.wso2.carbon.identity.oauth.par.model.ParRequestCacheEntry;

/**
 * Cache implementation for PAR requests.
 */
public class ParCache extends AuthenticationBaseCache<String, ParRequestCacheEntry> {

    private static final ParCache instance = new ParCache();


    /**
     * Constructor for ParCache.
     */
    public ParCache() {

        super(ParConstants.CACHE_NAME);
    }

    /**
     * Retrieve ParCache instance.
     *
     * @return Instance of ParCache.
     */
    public static ParCache getInstance() {

        return instance;
    }
}
