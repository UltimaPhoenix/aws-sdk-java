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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/Tag" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length and
     * cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits,
     * white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * </p>
     */
    private String key;
    /**
     * <p>
     * A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in length and
     * cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits,
     * white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * </p>
     */
    private String value;

    /**
     * <p>
     * A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length and
     * cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits,
     * white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * </p>
     * 
     * @param key
     *        A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length
     *        and cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters,
     *        digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length and
     * cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits,
     * white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * </p>
     * 
     * @return A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length
     *         and cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode
     *         letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *         "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length and
     * cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits,
     * white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * </p>
     * 
     * @param key
     *        A key is the required name of the tag. The string value can be from 1 to 128 Unicode characters in length
     *        and cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters,
     *        digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in length and
     * cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits,
     * white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * </p>
     * 
     * @param value
     *        A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in
     *        length and cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode
     *        letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *        "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in length and
     * cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits,
     * white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * </p>
     * 
     * @return A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in
     *         length and cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode
     *         letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *         "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in length and
     * cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode letters, digits,
     * white-space, '_', '.', '/', '=', '+', '-' (Java regex: "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * </p>
     * 
     * @param value
     *        A value is the optional value of the tag. The string value can be from 1 to 256 Unicode characters in
     *        length and cannot be prefixed with "aws:" or "dms:". The string can only contain only the set of Unicode
     *        letters, digits, white-space, '_', '.', '/', '=', '+', '-' (Java regex:
     *        "^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-]*)$").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tag withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.TagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
