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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stream ID.
     * </p>
     */
    private String streamId;
    /**
     * <p>
     * The description of the stream.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The files associated with the stream.
     * </p>
     */
    private java.util.List<StreamFile> files;
    /**
     * <p>
     * An IAM role that allows the IoT service principal assumes to access your S3 files.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The stream ID.
     * </p>
     * 
     * @param streamId
     *        The stream ID.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * The stream ID.
     * </p>
     * 
     * @return The stream ID.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * The stream ID.
     * </p>
     * 
     * @param streamId
     *        The stream ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withStreamId(String streamId) {
        setStreamId(streamId);
        return this;
    }

    /**
     * <p>
     * The description of the stream.
     * </p>
     * 
     * @param description
     *        The description of the stream.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the stream.
     * </p>
     * 
     * @return The description of the stream.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the stream.
     * </p>
     * 
     * @param description
     *        The description of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The files associated with the stream.
     * </p>
     * 
     * @return The files associated with the stream.
     */

    public java.util.List<StreamFile> getFiles() {
        return files;
    }

    /**
     * <p>
     * The files associated with the stream.
     * </p>
     * 
     * @param files
     *        The files associated with the stream.
     */

    public void setFiles(java.util.Collection<StreamFile> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<StreamFile>(files);
    }

    /**
     * <p>
     * The files associated with the stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiles(java.util.Collection)} or {@link #withFiles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param files
     *        The files associated with the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withFiles(StreamFile... files) {
        if (this.files == null) {
            setFiles(new java.util.ArrayList<StreamFile>(files.length));
        }
        for (StreamFile ele : files) {
            this.files.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files associated with the stream.
     * </p>
     * 
     * @param files
     *        The files associated with the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withFiles(java.util.Collection<StreamFile> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * An IAM role that allows the IoT service principal assumes to access your S3 files.
     * </p>
     * 
     * @param roleArn
     *        An IAM role that allows the IoT service principal assumes to access your S3 files.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An IAM role that allows the IoT service principal assumes to access your S3 files.
     * </p>
     * 
     * @return An IAM role that allows the IoT service principal assumes to access your S3 files.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An IAM role that allows the IoT service principal assumes to access your S3 files.
     * </p>
     * 
     * @param roleArn
     *        An IAM role that allows the IoT service principal assumes to access your S3 files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStreamRequest == false)
            return false;
        UpdateStreamRequest other = (UpdateStreamRequest) obj;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStreamRequest clone() {
        return (UpdateStreamRequest) super.clone();
    }

}
