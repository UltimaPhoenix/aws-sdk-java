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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>CompleteWorkflowExecutionFailed</code> event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CompleteWorkflowExecutionFailedEventAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteWorkflowExecutionFailedEventAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     */
    private String cause;
    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>CompleteWorkflowExecution</code> decision to complete this execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     */
    private Long decisionTaskCompletedEventId;

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>
     *        <p>
     *        If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *        </p>
     * @see CompleteWorkflowExecutionFailedCause
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @return The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *         purposes.</p> <note>
     *         <p>
     *         If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *         lacked sufficient permissions. For details and example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *         Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *         </p>
     * @see CompleteWorkflowExecutionFailedCause
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>
     *        <p>
     *        If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompleteWorkflowExecutionFailedCause
     */

    public CompleteWorkflowExecutionFailedEventAttributes withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>
     *        <p>
     *        If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *        </p>
     * @see CompleteWorkflowExecutionFailedCause
     */

    public void setCause(CompleteWorkflowExecutionFailedCause cause) {
        withCause(cause);
    }

    /**
     * <p>
     * The cause of the failure. This information is generated by the system and can be useful for diagnostic purposes.
     * </p>
     * <note>
     * <p>
     * If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it lacked
     * sufficient permissions. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * </note>
     * 
     * @param cause
     *        The cause of the failure. This information is generated by the system and can be useful for diagnostic
     *        purposes.</p> <note>
     *        <p>
     *        If <code>cause</code> is set to <code>OPERATION_NOT_PERMITTED</code>, the decision failed because it
     *        lacked sufficient permissions. For details and example IAM policies, see <a
     *        href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage
     *        Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompleteWorkflowExecutionFailedCause
     */

    public CompleteWorkflowExecutionFailedEventAttributes withCause(CompleteWorkflowExecutionFailedCause cause) {
        this.cause = cause.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>CompleteWorkflowExecution</code> decision to complete this execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>CompleteWorkflowExecution</code> decision to complete this execution. This information can be
     *        useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>CompleteWorkflowExecution</code> decision to complete this execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @return The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted
     *         in the <code>CompleteWorkflowExecution</code> decision to complete this execution. This information can
     *         be useful for diagnosing problems by tracing back the chain of events leading up to this event.
     */

    public Long getDecisionTaskCompletedEventId() {
        return this.decisionTaskCompletedEventId;
    }

    /**
     * <p>
     * The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in the
     * <code>CompleteWorkflowExecution</code> decision to complete this execution. This information can be useful for
     * diagnosing problems by tracing back the chain of events leading up to this event.
     * </p>
     * 
     * @param decisionTaskCompletedEventId
     *        The ID of the <code>DecisionTaskCompleted</code> event corresponding to the decision task that resulted in
     *        the <code>CompleteWorkflowExecution</code> decision to complete this execution. This information can be
     *        useful for diagnosing problems by tracing back the chain of events leading up to this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteWorkflowExecutionFailedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        setDecisionTaskCompletedEventId(decisionTaskCompletedEventId);
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
        if (getCause() != null)
            sb.append("Cause: ").append(getCause()).append(",");
        if (getDecisionTaskCompletedEventId() != null)
            sb.append("DecisionTaskCompletedEventId: ").append(getDecisionTaskCompletedEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteWorkflowExecutionFailedEventAttributes == false)
            return false;
        CompleteWorkflowExecutionFailedEventAttributes other = (CompleteWorkflowExecutionFailedEventAttributes) obj;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null)
            return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode());
        return hashCode;
    }

    @Override
    public CompleteWorkflowExecutionFailedEventAttributes clone() {
        try {
            return (CompleteWorkflowExecutionFailedEventAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.CompleteWorkflowExecutionFailedEventAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
