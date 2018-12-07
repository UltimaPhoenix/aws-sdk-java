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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Details about an email identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetEmailIdentity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEmailIdentityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The email identity type.
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * The feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     */
    private Boolean feedbackForwardingStatus;
    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     */
    private Boolean verifiedForSendingStatus;
    /**
     * <p>
     * An object that contains information about the DKIM attributes for the identity. This object includes the tokens
     * that you use to create the CNAME records that are required to complete the DKIM verification process.
     * </p>
     */
    private DkimAttributes dkimAttributes;
    /**
     * <p>
     * An object that contains information about the Mail-From attributes for the email identity.
     * </p>
     */
    private MailFromAttributes mailFromAttributes;

    /**
     * <p>
     * The email identity type.
     * </p>
     * 
     * @param identityType
     *        The email identity type.
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * The email identity type.
     * </p>
     * 
     * @return The email identity type.
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * The email identity type.
     * </p>
     * 
     * @param identityType
     *        The email identity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public GetEmailIdentityResult withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * The email identity type.
     * </p>
     * 
     * @param identityType
     *        The email identity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public GetEmailIdentityResult withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param feedbackForwardingStatus
     *        The feedback forwarding configuration for the identity.</p>
     *        <p>
     *        If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint
     *        events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path
     *        header of the original email.
     *        </p>
     *        <p>
     *        When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other
     *        mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to have
     *        a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce
     *        or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if
     *        this setting is disabled).
     */

    public void setFeedbackForwardingStatus(Boolean feedbackForwardingStatus) {
        this.feedbackForwardingStatus = feedbackForwardingStatus;
    }

    /**
     * <p>
     * The feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @return The feedback forwarding configuration for the identity.</p>
     *         <p>
     *         If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint
     *         events occur. Amazon Pinpoint sends this notification to the address that you specified in the
     *         Return-Path header of the original email.
     *         </p>
     *         <p>
     *         When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other
     *         mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to
     *         have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving
     *         bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur
     *         (even if this setting is disabled).
     */

    public Boolean getFeedbackForwardingStatus() {
        return this.feedbackForwardingStatus;
    }

    /**
     * <p>
     * The feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param feedbackForwardingStatus
     *        The feedback forwarding configuration for the identity.</p>
     *        <p>
     *        If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint
     *        events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path
     *        header of the original email.
     *        </p>
     *        <p>
     *        When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other
     *        mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to have
     *        a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce
     *        or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if
     *        this setting is disabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEmailIdentityResult withFeedbackForwardingStatus(Boolean feedbackForwardingStatus) {
        setFeedbackForwardingStatus(feedbackForwardingStatus);
        return this;
    }

    /**
     * <p>
     * The feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @return The feedback forwarding configuration for the identity.</p>
     *         <p>
     *         If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint
     *         events occur. Amazon Pinpoint sends this notification to the address that you specified in the
     *         Return-Path header of the original email.
     *         </p>
     *         <p>
     *         When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other
     *         mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to
     *         have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving
     *         bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur
     *         (even if this setting is disabled).
     */

    public Boolean isFeedbackForwardingStatus() {
        return this.feedbackForwardingStatus;
    }

    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     * 
     * @param verifiedForSendingStatus
     *        Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from
     *        verified email addresses or domains. For more information about verifying identities, see the <a
     *        href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon
     *        Pinpoint User Guide</a>.
     */

    public void setVerifiedForSendingStatus(Boolean verifiedForSendingStatus) {
        this.verifiedForSendingStatus = verifiedForSendingStatus;
    }

    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     * 
     * @return Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from
     *         verified email addresses or domains. For more information about verifying identities, see the <a
     *         href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon
     *         Pinpoint User Guide</a>.
     */

    public Boolean getVerifiedForSendingStatus() {
        return this.verifiedForSendingStatus;
    }

    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     * 
     * @param verifiedForSendingStatus
     *        Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from
     *        verified email addresses or domains. For more information about verifying identities, see the <a
     *        href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon
     *        Pinpoint User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEmailIdentityResult withVerifiedForSendingStatus(Boolean verifiedForSendingStatus) {
        setVerifiedForSendingStatus(verifiedForSendingStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from verified
     * email addresses or domains. For more information about verifying identities, see the <a
     * href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon Pinpoint
     * User Guide</a>.
     * </p>
     * 
     * @return Specifies whether or not the identity is verified. In Amazon Pinpoint, you can only send email from
     *         verified email addresses or domains. For more information about verifying identities, see the <a
     *         href="http://docs.aws.amazon.com/pinpoint/latest/userguide/channels-email-manage-verify.html">Amazon
     *         Pinpoint User Guide</a>.
     */

    public Boolean isVerifiedForSendingStatus() {
        return this.verifiedForSendingStatus;
    }

    /**
     * <p>
     * An object that contains information about the DKIM attributes for the identity. This object includes the tokens
     * that you use to create the CNAME records that are required to complete the DKIM verification process.
     * </p>
     * 
     * @param dkimAttributes
     *        An object that contains information about the DKIM attributes for the identity. This object includes the
     *        tokens that you use to create the CNAME records that are required to complete the DKIM verification
     *        process.
     */

    public void setDkimAttributes(DkimAttributes dkimAttributes) {
        this.dkimAttributes = dkimAttributes;
    }

    /**
     * <p>
     * An object that contains information about the DKIM attributes for the identity. This object includes the tokens
     * that you use to create the CNAME records that are required to complete the DKIM verification process.
     * </p>
     * 
     * @return An object that contains information about the DKIM attributes for the identity. This object includes the
     *         tokens that you use to create the CNAME records that are required to complete the DKIM verification
     *         process.
     */

    public DkimAttributes getDkimAttributes() {
        return this.dkimAttributes;
    }

    /**
     * <p>
     * An object that contains information about the DKIM attributes for the identity. This object includes the tokens
     * that you use to create the CNAME records that are required to complete the DKIM verification process.
     * </p>
     * 
     * @param dkimAttributes
     *        An object that contains information about the DKIM attributes for the identity. This object includes the
     *        tokens that you use to create the CNAME records that are required to complete the DKIM verification
     *        process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEmailIdentityResult withDkimAttributes(DkimAttributes dkimAttributes) {
        setDkimAttributes(dkimAttributes);
        return this;
    }

    /**
     * <p>
     * An object that contains information about the Mail-From attributes for the email identity.
     * </p>
     * 
     * @param mailFromAttributes
     *        An object that contains information about the Mail-From attributes for the email identity.
     */

    public void setMailFromAttributes(MailFromAttributes mailFromAttributes) {
        this.mailFromAttributes = mailFromAttributes;
    }

    /**
     * <p>
     * An object that contains information about the Mail-From attributes for the email identity.
     * </p>
     * 
     * @return An object that contains information about the Mail-From attributes for the email identity.
     */

    public MailFromAttributes getMailFromAttributes() {
        return this.mailFromAttributes;
    }

    /**
     * <p>
     * An object that contains information about the Mail-From attributes for the email identity.
     * </p>
     * 
     * @param mailFromAttributes
     *        An object that contains information about the Mail-From attributes for the email identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEmailIdentityResult withMailFromAttributes(MailFromAttributes mailFromAttributes) {
        setMailFromAttributes(mailFromAttributes);
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
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getFeedbackForwardingStatus() != null)
            sb.append("FeedbackForwardingStatus: ").append(getFeedbackForwardingStatus()).append(",");
        if (getVerifiedForSendingStatus() != null)
            sb.append("VerifiedForSendingStatus: ").append(getVerifiedForSendingStatus()).append(",");
        if (getDkimAttributes() != null)
            sb.append("DkimAttributes: ").append(getDkimAttributes()).append(",");
        if (getMailFromAttributes() != null)
            sb.append("MailFromAttributes: ").append(getMailFromAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEmailIdentityResult == false)
            return false;
        GetEmailIdentityResult other = (GetEmailIdentityResult) obj;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getFeedbackForwardingStatus() == null ^ this.getFeedbackForwardingStatus() == null)
            return false;
        if (other.getFeedbackForwardingStatus() != null && other.getFeedbackForwardingStatus().equals(this.getFeedbackForwardingStatus()) == false)
            return false;
        if (other.getVerifiedForSendingStatus() == null ^ this.getVerifiedForSendingStatus() == null)
            return false;
        if (other.getVerifiedForSendingStatus() != null && other.getVerifiedForSendingStatus().equals(this.getVerifiedForSendingStatus()) == false)
            return false;
        if (other.getDkimAttributes() == null ^ this.getDkimAttributes() == null)
            return false;
        if (other.getDkimAttributes() != null && other.getDkimAttributes().equals(this.getDkimAttributes()) == false)
            return false;
        if (other.getMailFromAttributes() == null ^ this.getMailFromAttributes() == null)
            return false;
        if (other.getMailFromAttributes() != null && other.getMailFromAttributes().equals(this.getMailFromAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getFeedbackForwardingStatus() == null) ? 0 : getFeedbackForwardingStatus().hashCode());
        hashCode = prime * hashCode + ((getVerifiedForSendingStatus() == null) ? 0 : getVerifiedForSendingStatus().hashCode());
        hashCode = prime * hashCode + ((getDkimAttributes() == null) ? 0 : getDkimAttributes().hashCode());
        hashCode = prime * hashCode + ((getMailFromAttributes() == null) ? 0 : getMailFromAttributes().hashCode());
        return hashCode;
    }

    @Override
    public GetEmailIdentityResult clone() {
        try {
            return (GetEmailIdentityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
