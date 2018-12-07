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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/Source" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Source implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The s3 bucket name.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The s3 object key.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * A hash of the object specified by <code>s3Bucket</code> and <code>s3Key</code>.
     * </p>
     */
    private String etag;
    /**
     * <p>
     * The taget processor architecture for the application.
     * </p>
     */
    private String architecture;

    /**
     * <p>
     * The s3 bucket name.
     * </p>
     * 
     * @param s3Bucket
     *        The s3 bucket name.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The s3 bucket name.
     * </p>
     * 
     * @return The s3 bucket name.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The s3 bucket name.
     * </p>
     * 
     * @param s3Bucket
     *        The s3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The s3 object key.
     * </p>
     * 
     * @param s3Key
     *        The s3 object key.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The s3 object key.
     * </p>
     * 
     * @return The s3 object key.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The s3 object key.
     * </p>
     * 
     * @param s3Key
     *        The s3 object key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * A hash of the object specified by <code>s3Bucket</code> and <code>s3Key</code>.
     * </p>
     * 
     * @param etag
     *        A hash of the object specified by <code>s3Bucket</code> and <code>s3Key</code>.
     */

    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * <p>
     * A hash of the object specified by <code>s3Bucket</code> and <code>s3Key</code>.
     * </p>
     * 
     * @return A hash of the object specified by <code>s3Bucket</code> and <code>s3Key</code>.
     */

    public String getEtag() {
        return this.etag;
    }

    /**
     * <p>
     * A hash of the object specified by <code>s3Bucket</code> and <code>s3Key</code>.
     * </p>
     * 
     * @param etag
     *        A hash of the object specified by <code>s3Bucket</code> and <code>s3Key</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withEtag(String etag) {
        setEtag(etag);
        return this;
    }

    /**
     * <p>
     * The taget processor architecture for the application.
     * </p>
     * 
     * @param architecture
     *        The taget processor architecture for the application.
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The taget processor architecture for the application.
     * </p>
     * 
     * @return The taget processor architecture for the application.
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The taget processor architecture for the application.
     * </p>
     * 
     * @param architecture
     *        The taget processor architecture for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public Source withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The taget processor architecture for the application.
     * </p>
     * 
     * @param architecture
     *        The taget processor architecture for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public Source withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key()).append(",");
        if (getEtag() != null)
            sb.append("Etag: ").append(getEtag()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Source == false)
            return false;
        Source other = (Source) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getEtag() == null ^ this.getEtag() == null)
            return false;
        if (other.getEtag() != null && other.getEtag().equals(this.getEtag()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getEtag() == null) ? 0 : getEtag().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        return hashCode;
    }

    @Override
    public Source clone() {
        try {
            return (Source) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.SourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
