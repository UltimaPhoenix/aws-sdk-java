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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Tag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource to which to add tags.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the resource to which to add tags.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource to which to add tags.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource to which to add tags.
     * </p>
     * 
     * @return The ARN of the resource to which to add tags.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource to which to add tags.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource to which to add tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys
     *         can have a maximum character length of 128 characters, and tag values can have a maximum length of 256
     *         characters.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys
     *        can have a maximum character length of 128 characters, and tag values can have a maximum length of 256
     *        characters.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The tags to add to the specified resource. A tag is a string-to-string map of key-value pairs. Tag keys
     *        can have a maximum character length of 128 characters, and tag values can have a maximum length of 256
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public TagRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagRequest clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagRequest == false)
            return false;
        TagRequest other = (TagRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagRequest clone() {
        return (TagRequest) super.clone();
    }

}
