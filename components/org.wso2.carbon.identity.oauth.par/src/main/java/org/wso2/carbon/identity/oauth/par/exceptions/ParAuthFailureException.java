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

package org.wso2.carbon.identity.oauth.par.exceptions;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;

/**
 * PAR Authorization flow failure.
 */
public class ParAuthFailureException extends OAuthProblemException {

    private String errorCode;
    private String errorMsg;

    /**
     * Constructor with error message.
     *
     * @param errorMsg Error message.
     */
    public ParAuthFailureException(String errorMsg) {

        super(errorMsg);
    }

    /**
     * Get error code.
     *
     * @return Error code.
     */
    public String getErrorCode() {

        return errorCode;
    }

    /**
     * Get error message.
     *
     * @return Error message.
     */
    public String getErrorMsg() {

        return errorMsg;
    }

    /**
     * Set error code.
     *
     * @param errorCode Error code.
     */
    public void setErrorCode(String errorCode) {

        this.errorCode = errorCode;
    }

    /**
     * Set error message.
     *
     * @param  errorMsg Error message.
     */
    public void setErrorMsg(String errorMsg) {

        this.errorMsg = errorMsg;
    }
}
