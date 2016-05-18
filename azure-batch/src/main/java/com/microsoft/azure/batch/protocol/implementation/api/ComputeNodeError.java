/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.implementation.api;

import java.util.List;

/**
 * An error encountered by a compute node.
 */
public class ComputeNodeError {
    /**
     * Gets or sets an identifier for the compute node error.  Codes are
     * invariant and are intended to be consumed programmatically.
     */
    private String code;

    /**
     * Gets or sets a message describing the compute node error, intended to
     * be suitable for display in a user interface.
     */
    private String message;

    /**
     * Gets or sets the list of additional error details related to the
     * compute node error.
     */
    private List<NameValuePair> errorDetails;

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the ComputeNodeError object itself.
     */
    public ComputeNodeError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the ComputeNodeError object itself.
     */
    public ComputeNodeError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the errorDetails value.
     *
     * @return the errorDetails value
     */
    public List<NameValuePair> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errorDetails value.
     *
     * @param errorDetails the errorDetails value to set
     * @return the ComputeNodeError object itself.
     */
    public ComputeNodeError setErrorDetails(List<NameValuePair> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

}