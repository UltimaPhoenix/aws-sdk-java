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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVpcEndpointRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateVpcEndpoint.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVpcEndpointRequest> {

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     */
    private String vpcEndpointType;
    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The service name. To get a list of available services, use the <a>DescribeVpcEndpointServices</a> request, or get
     * the name from the service provider.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * (Gateway endpoint) A policy to attach to the endpoint that controls access to the service. The policy must be in
     * valid JSON format. If this parameter is not specified, we attach a default policy that allows full access to the
     * service.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> routeTableIds;
    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate with the endpoint network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The private
     * hosted zone contains a record set for the default public DNS name for the service for the region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of the endpoint network
     * interfaces in the VPC. This enables you to make requests to the default public DNS name for the service instead
     * of the public DNS names that are automatically generated by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     * <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the VPC
     * attributes.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean privateDnsEnabled;

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * 
     * @param vpcEndpointType
     *        The type of endpoint.</p>
     *        <p>
     *        Default: Gateway
     * @see VpcEndpointType
     */

    public void setVpcEndpointType(String vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * 
     * @return The type of endpoint.</p>
     *         <p>
     *         Default: Gateway
     * @see VpcEndpointType
     */

    public String getVpcEndpointType() {
        return this.vpcEndpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * 
     * @param vpcEndpointType
     *        The type of endpoint.</p>
     *        <p>
     *        Default: Gateway
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointType
     */

    public CreateVpcEndpointRequest withVpcEndpointType(String vpcEndpointType) {
        setVpcEndpointType(vpcEndpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * <p>
     * Default: Gateway
     * </p>
     * 
     * @param vpcEndpointType
     *        The type of endpoint.</p>
     *        <p>
     *        Default: Gateway
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VpcEndpointType
     */

    public CreateVpcEndpointRequest withVpcEndpointType(VpcEndpointType vpcEndpointType) {
        this.vpcEndpointType = vpcEndpointType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the endpoint will be used.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     * 
     * @return The ID of the VPC in which the endpoint will be used.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the endpoint will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The service name. To get a list of available services, use the <a>DescribeVpcEndpointServices</a> request, or get
     * the name from the service provider.
     * </p>
     * 
     * @param serviceName
     *        The service name. To get a list of available services, use the <a>DescribeVpcEndpointServices</a> request,
     *        or get the name from the service provider.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The service name. To get a list of available services, use the <a>DescribeVpcEndpointServices</a> request, or get
     * the name from the service provider.
     * </p>
     * 
     * @return The service name. To get a list of available services, use the <a>DescribeVpcEndpointServices</a>
     *         request, or get the name from the service provider.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The service name. To get a list of available services, use the <a>DescribeVpcEndpointServices</a> request, or get
     * the name from the service provider.
     * </p>
     * 
     * @param serviceName
     *        The service name. To get a list of available services, use the <a>DescribeVpcEndpointServices</a> request,
     *        or get the name from the service provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) A policy to attach to the endpoint that controls access to the service. The policy must be in
     * valid JSON format. If this parameter is not specified, we attach a default policy that allows full access to the
     * service.
     * </p>
     * 
     * @param policyDocument
     *        (Gateway endpoint) A policy to attach to the endpoint that controls access to the service. The policy must
     *        be in valid JSON format. If this parameter is not specified, we attach a default policy that allows full
     *        access to the service.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * (Gateway endpoint) A policy to attach to the endpoint that controls access to the service. The policy must be in
     * valid JSON format. If this parameter is not specified, we attach a default policy that allows full access to the
     * service.
     * </p>
     * 
     * @return (Gateway endpoint) A policy to attach to the endpoint that controls access to the service. The policy
     *         must be in valid JSON format. If this parameter is not specified, we attach a default policy that allows
     *         full access to the service.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * (Gateway endpoint) A policy to attach to the endpoint that controls access to the service. The policy must be in
     * valid JSON format. If this parameter is not specified, we attach a default policy that allows full access to the
     * service.
     * </p>
     * 
     * @param policyDocument
     *        (Gateway endpoint) A policy to attach to the endpoint that controls access to the service. The policy must
     *        be in valid JSON format. If this parameter is not specified, we attach a default policy that allows full
     *        access to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     * 
     * @return (Gateway endpoint) One or more route table IDs.
     */

    public java.util.List<String> getRouteTableIds() {
        if (routeTableIds == null) {
            routeTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return routeTableIds;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     * 
     * @param routeTableIds
     *        (Gateway endpoint) One or more route table IDs.
     */

    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new com.amazonaws.internal.SdkInternalList<String>(routeTableIds);
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTableIds(java.util.Collection)} or {@link #withRouteTableIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param routeTableIds
     *        (Gateway endpoint) One or more route table IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withRouteTableIds(String... routeTableIds) {
        if (this.routeTableIds == null) {
            setRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(routeTableIds.length));
        }
        for (String ele : routeTableIds) {
            this.routeTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs.
     * </p>
     * 
     * @param routeTableIds
     *        (Gateway endpoint) One or more route table IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     * </p>
     * 
     * @return (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     * </p>
     * 
     * @param subnetIds
     *        (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     * </p>
     * 
     * @param subnetIds
     *        (Interface endpoint) The ID of one or more subnets in which to create an endpoint network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate with the endpoint network interface.
     * </p>
     * 
     * @return (Interface endpoint) The ID of one or more security groups to associate with the endpoint network
     *         interface.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate with the endpoint network interface.
     * </p>
     * 
     * @param securityGroupIds
     *        (Interface endpoint) The ID of one or more security groups to associate with the endpoint network
     *        interface.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate with the endpoint network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        (Interface endpoint) The ID of one or more security groups to associate with the endpoint network
     *        interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) The ID of one or more security groups to associate with the endpoint network interface.
     * </p>
     * 
     * @param securityGroupIds
     *        (Interface endpoint) The ID of one or more security groups to associate with the endpoint network
     *        interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The private
     * hosted zone contains a record set for the default public DNS name for the service for the region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of the endpoint network
     * interfaces in the VPC. This enables you to make requests to the default public DNS name for the service instead
     * of the public DNS names that are automatically generated by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     * <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the VPC
     * attributes.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param privateDnsEnabled
     *        (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The
     *        private hosted zone contains a record set for the default public DNS name for the service for the region
     *        (for example, <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of
     *        the endpoint network interfaces in the VPC. This enables you to make requests to the default public DNS
     *        name for the service instead of the public DNS names that are automatically generated by the VPC endpoint
     *        service.</p>
     *        <p>
     *        To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     *        <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set
     *        the VPC attributes.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The private
     * hosted zone contains a record set for the default public DNS name for the service for the region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of the endpoint network
     * interfaces in the VPC. This enables you to make requests to the default public DNS name for the service instead
     * of the public DNS names that are automatically generated by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     * <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the VPC
     * attributes.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The
     *         private hosted zone contains a record set for the default public DNS name for the service for the region
     *         (for example, <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of
     *         the endpoint network interfaces in the VPC. This enables you to make requests to the default public DNS
     *         name for the service instead of the public DNS names that are automatically generated by the VPC endpoint
     *         service.</p>
     *         <p>
     *         To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     *         <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set
     *         the VPC attributes.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getPrivateDnsEnabled() {
        return this.privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The private
     * hosted zone contains a record set for the default public DNS name for the service for the region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of the endpoint network
     * interfaces in the VPC. This enables you to make requests to the default public DNS name for the service instead
     * of the public DNS names that are automatically generated by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     * <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the VPC
     * attributes.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param privateDnsEnabled
     *        (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The
     *        private hosted zone contains a record set for the default public DNS name for the service for the region
     *        (for example, <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of
     *        the endpoint network interfaces in the VPC. This enables you to make requests to the default public DNS
     *        name for the service instead of the public DNS names that are automatically generated by the VPC endpoint
     *        service.</p>
     *        <p>
     *        To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     *        <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set
     *        the VPC attributes.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withPrivateDnsEnabled(Boolean privateDnsEnabled) {
        setPrivateDnsEnabled(privateDnsEnabled);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The private
     * hosted zone contains a record set for the default public DNS name for the service for the region (for example,
     * <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of the endpoint network
     * interfaces in the VPC. This enables you to make requests to the default public DNS name for the service instead
     * of the public DNS names that are automatically generated by the VPC endpoint service.
     * </p>
     * <p>
     * To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     * <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set the VPC
     * attributes.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return (Interface endpoint) Indicate whether to associate a private hosted zone with the specified VPC. The
     *         private hosted zone contains a record set for the default public DNS name for the service for the region
     *         (for example, <code>kinesis.us-east-1.amazonaws.com</code>) which resolves to the private IP addresses of
     *         the endpoint network interfaces in the VPC. This enables you to make requests to the default public DNS
     *         name for the service instead of the public DNS names that are automatically generated by the VPC endpoint
     *         service.</p>
     *         <p>
     *         To use a private hosted zone, you must set the following VPC attributes to <code>true</code>:
     *         <code>enableDnsHostnames</code> and <code>enableDnsSupport</code>. Use <a>ModifyVpcAttribute</a> to set
     *         the VPC attributes.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isPrivateDnsEnabled() {
        return this.privateDnsEnabled;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpcEndpointRequest> getDryRunRequest() {
        Request<CreateVpcEndpointRequest> request = new CreateVpcEndpointRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVpcEndpointType() != null)
            sb.append("VpcEndpointType: ").append(getVpcEndpointType()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: ").append(getRouteTableIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getPrivateDnsEnabled() != null)
            sb.append("PrivateDnsEnabled: ").append(getPrivateDnsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcEndpointRequest == false)
            return false;
        CreateVpcEndpointRequest other = (CreateVpcEndpointRequest) obj;
        if (other.getVpcEndpointType() == null ^ this.getVpcEndpointType() == null)
            return false;
        if (other.getVpcEndpointType() != null && other.getVpcEndpointType().equals(this.getVpcEndpointType()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getPrivateDnsEnabled() == null ^ this.getPrivateDnsEnabled() == null)
            return false;
        if (other.getPrivateDnsEnabled() != null && other.getPrivateDnsEnabled().equals(this.getPrivateDnsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointType() == null) ? 0 : getVpcEndpointType().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsEnabled() == null) ? 0 : getPrivateDnsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcEndpointRequest clone() {
        return (CreateVpcEndpointRequest) super.clone();
    }
}
