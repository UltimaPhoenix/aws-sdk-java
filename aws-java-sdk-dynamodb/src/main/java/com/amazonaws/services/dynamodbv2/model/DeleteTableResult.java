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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>DeleteTable</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/DeleteTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Represents the properties of a table.
     * </p>
     */
    private TableDescription tableDescription;

    /**
     * <p>
     * Represents the properties of a table.
     * </p>
     * 
     * @param tableDescription
     *        Represents the properties of a table.
     */

    public void setTableDescription(TableDescription tableDescription) {
        this.tableDescription = tableDescription;
    }

    /**
     * <p>
     * Represents the properties of a table.
     * </p>
     * 
     * @return Represents the properties of a table.
     */

    public TableDescription getTableDescription() {
        return this.tableDescription;
    }

    /**
     * <p>
     * Represents the properties of a table.
     * </p>
     * 
     * @param tableDescription
     *        Represents the properties of a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTableResult withTableDescription(TableDescription tableDescription) {
        setTableDescription(tableDescription);
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
        if (getTableDescription() != null)
            sb.append("TableDescription: ").append(getTableDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTableResult == false)
            return false;
        DeleteTableResult other = (DeleteTableResult) obj;
        if (other.getTableDescription() == null ^ this.getTableDescription() == null)
            return false;
        if (other.getTableDescription() != null && other.getTableDescription().equals(this.getTableDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableDescription() == null) ? 0 : getTableDescription().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTableResult clone() {
        try {
            return (DeleteTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
