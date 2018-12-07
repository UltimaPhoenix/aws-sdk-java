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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ListClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose
     * names start with this prefix.
     * </p>
     */
    private String clusterNameFilter;
    /**
     * <p>
     * The maximum number of clusters to return in the response. If there are more clusters, the response includes a
     * NextToken parameter.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     * NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose
     * names start with this prefix.
     * </p>
     * 
     * @param clusterNameFilter
     *        Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters
     *        whose names start with this prefix.
     */

    public void setClusterNameFilter(String clusterNameFilter) {
        this.clusterNameFilter = clusterNameFilter;
    }

    /**
     * <p>
     * Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose
     * names start with this prefix.
     * </p>
     * 
     * @return Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters
     *         whose names start with this prefix.
     */

    public String getClusterNameFilter() {
        return this.clusterNameFilter;
    }

    /**
     * <p>
     * Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose
     * names start with this prefix.
     * </p>
     * 
     * @param clusterNameFilter
     *        Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters
     *        whose names start with this prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withClusterNameFilter(String clusterNameFilter) {
        setClusterNameFilter(clusterNameFilter);
        return this;
    }

    /**
     * <p>
     * The maximum number of clusters to return in the response. If there are more clusters, the response includes a
     * NextToken parameter.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of clusters to return in the response. If there are more clusters, the response
     *        includes a NextToken parameter.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of clusters to return in the response. If there are more clusters, the response includes a
     * NextToken parameter.
     * </p>
     * 
     * @return The maximum number of clusters to return in the response. If there are more clusters, the response
     *         includes a NextToken parameter.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of clusters to return in the response. If there are more clusters, the response includes a
     * NextToken parameter.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of clusters to return in the response. If there are more clusters, the response
     *        includes a NextToken parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     * NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     *        NextToken in the response. To get another batch of clusters, provide this token in your next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     * NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * </p>
     * 
     * @return The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     *         NextToken in the response. To get another batch of clusters, provide this token in your next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     * NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * </p>
     * 
     * @param nextToken
     *        The paginated results marker. When the result of a ListClusters operation is truncated, the call returns
     *        NextToken in the response. To get another batch of clusters, provide this token in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClustersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getClusterNameFilter() != null)
            sb.append("ClusterNameFilter: ").append(getClusterNameFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClustersRequest == false)
            return false;
        ListClustersRequest other = (ListClustersRequest) obj;
        if (other.getClusterNameFilter() == null ^ this.getClusterNameFilter() == null)
            return false;
        if (other.getClusterNameFilter() != null && other.getClusterNameFilter().equals(this.getClusterNameFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterNameFilter() == null) ? 0 : getClusterNameFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClustersRequest clone() {
        return (ListClustersRequest) super.clone();
    }

}
