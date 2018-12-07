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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a resolver.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/Resolver" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resolver implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resolver type name.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The resolver field name.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * The resolver data source name.
     * </p>
     */
    private String dataSourceName;
    /**
     * <p>
     * The resolver ARN.
     * </p>
     */
    private String resolverArn;
    /**
     * <p>
     * The request mapping template.
     * </p>
     */
    private String requestMappingTemplate;
    /**
     * <p>
     * The response mapping template.
     * </p>
     */
    private String responseMappingTemplate;
    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     */
    private String kind;
    /**
     * <p>
     * The <code>PipelineConfig</code>.
     * </p>
     */
    private PipelineConfig pipelineConfig;

    /**
     * <p>
     * The resolver type name.
     * </p>
     * 
     * @param typeName
     *        The resolver type name.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The resolver type name.
     * </p>
     * 
     * @return The resolver type name.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The resolver type name.
     * </p>
     * 
     * @param typeName
     *        The resolver type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolver withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The resolver field name.
     * </p>
     * 
     * @param fieldName
     *        The resolver field name.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The resolver field name.
     * </p>
     * 
     * @return The resolver field name.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The resolver field name.
     * </p>
     * 
     * @param fieldName
     *        The resolver field name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolver withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * The resolver data source name.
     * </p>
     * 
     * @param dataSourceName
     *        The resolver data source name.
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * The resolver data source name.
     * </p>
     * 
     * @return The resolver data source name.
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * The resolver data source name.
     * </p>
     * 
     * @param dataSourceName
     *        The resolver data source name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolver withDataSourceName(String dataSourceName) {
        setDataSourceName(dataSourceName);
        return this;
    }

    /**
     * <p>
     * The resolver ARN.
     * </p>
     * 
     * @param resolverArn
     *        The resolver ARN.
     */

    public void setResolverArn(String resolverArn) {
        this.resolverArn = resolverArn;
    }

    /**
     * <p>
     * The resolver ARN.
     * </p>
     * 
     * @return The resolver ARN.
     */

    public String getResolverArn() {
        return this.resolverArn;
    }

    /**
     * <p>
     * The resolver ARN.
     * </p>
     * 
     * @param resolverArn
     *        The resolver ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolver withResolverArn(String resolverArn) {
        setResolverArn(resolverArn);
        return this;
    }

    /**
     * <p>
     * The request mapping template.
     * </p>
     * 
     * @param requestMappingTemplate
     *        The request mapping template.
     */

    public void setRequestMappingTemplate(String requestMappingTemplate) {
        this.requestMappingTemplate = requestMappingTemplate;
    }

    /**
     * <p>
     * The request mapping template.
     * </p>
     * 
     * @return The request mapping template.
     */

    public String getRequestMappingTemplate() {
        return this.requestMappingTemplate;
    }

    /**
     * <p>
     * The request mapping template.
     * </p>
     * 
     * @param requestMappingTemplate
     *        The request mapping template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolver withRequestMappingTemplate(String requestMappingTemplate) {
        setRequestMappingTemplate(requestMappingTemplate);
        return this;
    }

    /**
     * <p>
     * The response mapping template.
     * </p>
     * 
     * @param responseMappingTemplate
     *        The response mapping template.
     */

    public void setResponseMappingTemplate(String responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
    }

    /**
     * <p>
     * The response mapping template.
     * </p>
     * 
     * @return The response mapping template.
     */

    public String getResponseMappingTemplate() {
        return this.responseMappingTemplate;
    }

    /**
     * <p>
     * The response mapping template.
     * </p>
     * 
     * @param responseMappingTemplate
     *        The response mapping template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolver withResponseMappingTemplate(String responseMappingTemplate) {
        setResponseMappingTemplate(responseMappingTemplate);
        return this;
    }

    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The resolver type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables
     *        you to execute a GraphQL query against a single data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     *        <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query
     *        against multiple data sources.
     *        </p>
     *        </li>
     * @see ResolverKind
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resolver type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables
     *         you to execute a GraphQL query against a single data source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     *         <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query
     *         against multiple data sources.
     *         </p>
     *         </li>
     * @see ResolverKind
     */

    public String getKind() {
        return this.kind;
    }

    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The resolver type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables
     *        you to execute a GraphQL query against a single data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     *        <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query
     *        against multiple data sources.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverKind
     */

    public Resolver withKind(String kind) {
        setKind(kind);
        return this;
    }

    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The resolver type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables
     *        you to execute a GraphQL query against a single data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     *        <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query
     *        against multiple data sources.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverKind
     */

    public Resolver withKind(ResolverKind kind) {
        this.kind = kind.toString();
        return this;
    }

    /**
     * <p>
     * The <code>PipelineConfig</code>.
     * </p>
     * 
     * @param pipelineConfig
     *        The <code>PipelineConfig</code>.
     */

    public void setPipelineConfig(PipelineConfig pipelineConfig) {
        this.pipelineConfig = pipelineConfig;
    }

    /**
     * <p>
     * The <code>PipelineConfig</code>.
     * </p>
     * 
     * @return The <code>PipelineConfig</code>.
     */

    public PipelineConfig getPipelineConfig() {
        return this.pipelineConfig;
    }

    /**
     * <p>
     * The <code>PipelineConfig</code>.
     * </p>
     * 
     * @param pipelineConfig
     *        The <code>PipelineConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resolver withPipelineConfig(PipelineConfig pipelineConfig) {
        setPipelineConfig(pipelineConfig);
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
        if (getDataSourceName() != null)
            sb.append("DataSourceName: ").append(getDataSourceName()).append(",");
        if (getResolverArn() != null)
            sb.append("ResolverArn: ").append(getResolverArn()).append(",");
        if (getRequestMappingTemplate() != null)
            sb.append("RequestMappingTemplate: ").append(getRequestMappingTemplate()).append(",");
        if (getResponseMappingTemplate() != null)
            sb.append("ResponseMappingTemplate: ").append(getResponseMappingTemplate()).append(",");
        if (getKind() != null)
            sb.append("Kind: ").append(getKind()).append(",");
        if (getPipelineConfig() != null)
            sb.append("PipelineConfig: ").append(getPipelineConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resolver == false)
            return false;
        Resolver other = (Resolver) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getDataSourceName() == null ^ this.getDataSourceName() == null)
            return false;
        if (other.getDataSourceName() != null && other.getDataSourceName().equals(this.getDataSourceName()) == false)
            return false;
        if (other.getResolverArn() == null ^ this.getResolverArn() == null)
            return false;
        if (other.getResolverArn() != null && other.getResolverArn().equals(this.getResolverArn()) == false)
            return false;
        if (other.getRequestMappingTemplate() == null ^ this.getRequestMappingTemplate() == null)
            return false;
        if (other.getRequestMappingTemplate() != null && other.getRequestMappingTemplate().equals(this.getRequestMappingTemplate()) == false)
            return false;
        if (other.getResponseMappingTemplate() == null ^ this.getResponseMappingTemplate() == null)
            return false;
        if (other.getResponseMappingTemplate() != null && other.getResponseMappingTemplate().equals(this.getResponseMappingTemplate()) == false)
            return false;
        if (other.getKind() == null ^ this.getKind() == null)
            return false;
        if (other.getKind() != null && other.getKind().equals(this.getKind()) == false)
            return false;
        if (other.getPipelineConfig() == null ^ this.getPipelineConfig() == null)
            return false;
        if (other.getPipelineConfig() != null && other.getPipelineConfig().equals(this.getPipelineConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode());
        hashCode = prime * hashCode + ((getResolverArn() == null) ? 0 : getResolverArn().hashCode());
        hashCode = prime * hashCode + ((getRequestMappingTemplate() == null) ? 0 : getRequestMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getResponseMappingTemplate() == null) ? 0 : getResponseMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getKind() == null) ? 0 : getKind().hashCode());
        hashCode = prime * hashCode + ((getPipelineConfig() == null) ? 0 : getPipelineConfig().hashCode());
        return hashCode;
    }

    @Override
    public Resolver clone() {
        try {
            return (Resolver) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.ResolverMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
