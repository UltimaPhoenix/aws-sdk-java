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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of a cluster whose properties you are requesting. This parameter is case sensitive.
     * </p>
     * <p>
     * The default is that all clusters defined for an account are returned.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeClusters</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a value in
     * the <code>Marker</code> field of the response. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     * not both.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A tag key or keys for which you want to return all matching clusters that are associated with the specified key
     * or keys. For example, suppose that you have clusters that are tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag keys associated with them.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;
    /**
     * <p>
     * A tag value or values for which you want to return all matching clusters that are associated with the specified
     * tag value or values. For example, suppose that you have clusters that are tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the clusters that have either or both of these tag values associated with them.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagValues;

    /**
     * <p>
     * The unique identifier of a cluster whose properties you are requesting. This parameter is case sensitive.
     * </p>
     * <p>
     * The default is that all clusters defined for an account are returned.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of a cluster whose properties you are requesting. This parameter is case
     *        sensitive.</p>
     *        <p>
     *        The default is that all clusters defined for an account are returned.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a cluster whose properties you are requesting. This parameter is case sensitive.
     * </p>
     * <p>
     * The default is that all clusters defined for an account are returned.
     * </p>
     * 
     * @return The unique identifier of a cluster whose properties you are requesting. This parameter is case
     *         sensitive.</p>
     *         <p>
     *         The default is that all clusters defined for an account are returned.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a cluster whose properties you are requesting. This parameter is case sensitive.
     * </p>
     * <p>
     * The default is that all clusters defined for an account are returned.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of a cluster whose properties you are requesting. This parameter is case
     *        sensitive.</p>
     *        <p>
     *        The default is that all clusters defined for an account are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @return The maximum number of response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         marker value. </p>
     *         <p>
     *         Default: <code>100</code>
     *         </p>
     *         <p>
     *         Constraints: minimum 20, maximum 100.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned marker value.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * <p>
     * Constraints: minimum 20, maximum 100.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned marker
     *        value. </p>
     *        <p>
     *        Default: <code>100</code>
     *        </p>
     *        <p>
     *        Constraints: minimum 20, maximum 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeClusters</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a value in
     * the <code>Marker</code> field of the response. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     * not both.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeClusters</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     *        returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request. </p>
     *        <p>
     *        Constraints: You can specify either the <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter,
     *        but not both.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeClusters</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a value in
     * the <code>Marker</code> field of the response. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     * not both.
     * </p>
     * 
     * @return An optional parameter that specifies the starting point to return a set of response records. When the
     *         results of a <a>DescribeClusters</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     *         returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *         response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *         the request. </p>
     *         <p>
     *         Constraints: You can specify either the <b>ClusterIdentifier</b> parameter or the <b>Marker</b>
     *         parameter, but not both.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point to return a set of response records. When the results of
     * a <a>DescribeClusters</a> request exceed the value specified in <code>MaxRecords</code>, AWS returns a value in
     * the <code>Marker</code> field of the response. You can retrieve the next set of response records by providing the
     * returned marker value in the <code>Marker</code> parameter and retrying the request.
     * </p>
     * <p>
     * Constraints: You can specify either the <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter, but
     * not both.
     * </p>
     * 
     * @param marker
     *        An optional parameter that specifies the starting point to return a set of response records. When the
     *        results of a <a>DescribeClusters</a> request exceed the value specified in <code>MaxRecords</code>, AWS
     *        returns a value in the <code>Marker</code> field of the response. You can retrieve the next set of
     *        response records by providing the returned marker value in the <code>Marker</code> parameter and retrying
     *        the request. </p>
     *        <p>
     *        Constraints: You can specify either the <b>ClusterIdentifier</b> parameter or the <b>Marker</b> parameter,
     *        but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching clusters that are associated with the specified key
     * or keys. For example, suppose that you have clusters that are tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag keys associated with them.
     * </p>
     * 
     * @return A tag key or keys for which you want to return all matching clusters that are associated with the
     *         specified key or keys. For example, suppose that you have clusters that are tagged with keys called
     *         <code>owner</code> and <code>environment</code>. If you specify both of these tag keys in the request,
     *         Amazon Redshift returns a response with the clusters that have either or both of these tag keys
     *         associated with them.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching clusters that are associated with the specified key
     * or keys. For example, suppose that you have clusters that are tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag keys associated with them.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching clusters that are associated with the
     *        specified key or keys. For example, suppose that you have clusters that are tagged with keys called
     *        <code>owner</code> and <code>environment</code>. If you specify both of these tag keys in the request,
     *        Amazon Redshift returns a response with the clusters that have either or both of these tag keys associated
     *        with them.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(tagKeys);
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching clusters that are associated with the specified key
     * or keys. For example, suppose that you have clusters that are tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag keys associated with them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching clusters that are associated with the
     *        specified key or keys. For example, suppose that you have clusters that are tagged with keys called
     *        <code>owner</code> and <code>environment</code>. If you specify both of these tag keys in the request,
     *        Amazon Redshift returns a response with the clusters that have either or both of these tag keys associated
     *        with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A tag key or keys for which you want to return all matching clusters that are associated with the specified key
     * or keys. For example, suppose that you have clusters that are tagged with keys called <code>owner</code> and
     * <code>environment</code>. If you specify both of these tag keys in the request, Amazon Redshift returns a
     * response with the clusters that have either or both of these tag keys associated with them.
     * </p>
     * 
     * @param tagKeys
     *        A tag key or keys for which you want to return all matching clusters that are associated with the
     *        specified key or keys. For example, suppose that you have clusters that are tagged with keys called
     *        <code>owner</code> and <code>environment</code>. If you specify both of these tag keys in the request,
     *        Amazon Redshift returns a response with the clusters that have either or both of these tag keys associated
     *        with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching clusters that are associated with the specified
     * tag value or values. For example, suppose that you have clusters that are tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the clusters that have either or both of these tag values associated with them.
     * </p>
     * 
     * @return A tag value or values for which you want to return all matching clusters that are associated with the
     *         specified tag value or values. For example, suppose that you have clusters that are tagged with values
     *         called <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request,
     *         Amazon Redshift returns a response with the clusters that have either or both of these tag values
     *         associated with them.
     */

    public java.util.List<String> getTagValues() {
        if (tagValues == null) {
            tagValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagValues;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching clusters that are associated with the specified
     * tag value or values. For example, suppose that you have clusters that are tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the clusters that have either or both of these tag values associated with them.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching clusters that are associated with the
     *        specified tag value or values. For example, suppose that you have clusters that are tagged with values
     *        called <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request,
     *        Amazon Redshift returns a response with the clusters that have either or both of these tag values
     *        associated with them.
     */

    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new com.amazonaws.internal.SdkInternalList<String>(tagValues);
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching clusters that are associated with the specified
     * tag value or values. For example, suppose that you have clusters that are tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the clusters that have either or both of these tag values associated with them.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching clusters that are associated with the
     *        specified tag value or values. For example, suppose that you have clusters that are tagged with values
     *        called <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request,
     *        Amazon Redshift returns a response with the clusters that have either or both of these tag values
     *        associated with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withTagValues(String... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new com.amazonaws.internal.SdkInternalList<String>(tagValues.length));
        }
        for (String ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A tag value or values for which you want to return all matching clusters that are associated with the specified
     * tag value or values. For example, suppose that you have clusters that are tagged with values called
     * <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request, Amazon Redshift
     * returns a response with the clusters that have either or both of these tag values associated with them.
     * </p>
     * 
     * @param tagValues
     *        A tag value or values for which you want to return all matching clusters that are associated with the
     *        specified tag value or values. For example, suppose that you have clusters that are tagged with values
     *        called <code>admin</code> and <code>test</code>. If you specify both of these tag values in the request,
     *        Amazon Redshift returns a response with the clusters that have either or both of these tag values
     *        associated with them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys()).append(",");
        if (getTagValues() != null)
            sb.append("TagValues: ").append(getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeClustersRequest == false)
            return false;
        DescribeClustersRequest other = (DescribeClustersRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClustersRequest clone() {
        return (DescribeClustersRequest) super.clone();
    }

}
