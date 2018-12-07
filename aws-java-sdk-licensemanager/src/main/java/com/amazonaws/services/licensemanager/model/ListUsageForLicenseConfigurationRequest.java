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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListUsageForLicenseConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsageForLicenseConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the targeted <code>LicenseConfiguration</code> object.
     * </p>
     */
    private String licenseConfigurationArn;
    /**
     * <p>
     * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with
     * the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of filters to apply.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * ARN of the targeted <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        ARN of the targeted <code>LicenseConfiguration</code> object.
     */

    public void setLicenseConfigurationArn(String licenseConfigurationArn) {
        this.licenseConfigurationArn = licenseConfigurationArn;
    }

    /**
     * <p>
     * ARN of the targeted <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @return ARN of the targeted <code>LicenseConfiguration</code> object.
     */

    public String getLicenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }

    /**
     * <p>
     * ARN of the targeted <code>LicenseConfiguration</code> object.
     * </p>
     * 
     * @param licenseConfigurationArn
     *        ARN of the targeted <code>LicenseConfiguration</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageForLicenseConfigurationRequest withLicenseConfigurationArn(String licenseConfigurationArn) {
        setLicenseConfigurationArn(licenseConfigurationArn);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with
     * the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single call. To retrieve the remaining results, make another call
     *        with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with
     * the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return Maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with
     * the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single call. To retrieve the remaining results, make another call
     *        with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageForLicenseConfigurationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageForLicenseConfigurationRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of filters to apply.
     * </p>
     * 
     * @return List of filters to apply.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * List of filters to apply.
     * </p>
     * 
     * @param filters
     *        List of filters to apply.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * List of filters to apply.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        List of filters to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageForLicenseConfigurationRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of filters to apply.
     * </p>
     * 
     * @param filters
     *        List of filters to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageForLicenseConfigurationRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getLicenseConfigurationArn() != null)
            sb.append("LicenseConfigurationArn: ").append(getLicenseConfigurationArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsageForLicenseConfigurationRequest == false)
            return false;
        ListUsageForLicenseConfigurationRequest other = (ListUsageForLicenseConfigurationRequest) obj;
        if (other.getLicenseConfigurationArn() == null ^ this.getLicenseConfigurationArn() == null)
            return false;
        if (other.getLicenseConfigurationArn() != null && other.getLicenseConfigurationArn().equals(this.getLicenseConfigurationArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConfigurationArn() == null) ? 0 : getLicenseConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListUsageForLicenseConfigurationRequest clone() {
        return (ListUsageForLicenseConfigurationRequest) super.clone();
    }

}
