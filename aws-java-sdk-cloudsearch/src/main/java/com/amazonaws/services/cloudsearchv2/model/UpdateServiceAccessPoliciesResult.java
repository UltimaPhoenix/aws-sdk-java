/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of an <code>UpdateServiceAccessPolicies</code> request. Contains the new access policies.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceAccessPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The access rules configured for the domain.
     * </p>
     */
    private AccessPoliciesStatus accessPolicies;

    /**
     * <p>
     * The access rules configured for the domain.
     * </p>
     * 
     * @param accessPolicies
     *        The access rules configured for the domain.
     */

    public void setAccessPolicies(AccessPoliciesStatus accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * The access rules configured for the domain.
     * </p>
     * 
     * @return The access rules configured for the domain.
     */

    public AccessPoliciesStatus getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * The access rules configured for the domain.
     * </p>
     * 
     * @param accessPolicies
     *        The access rules configured for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceAccessPoliciesResult withAccessPolicies(AccessPoliciesStatus accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: ").append(getAccessPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceAccessPoliciesResult == false)
            return false;
        UpdateServiceAccessPoliciesResult other = (UpdateServiceAccessPoliciesResult) obj;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceAccessPoliciesResult clone() {
        try {
            return (UpdateServiceAccessPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
