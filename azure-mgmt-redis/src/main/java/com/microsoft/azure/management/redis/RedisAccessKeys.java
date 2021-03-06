/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis;


/**
 * Redis cache access keys.
 */
public class RedisAccessKeys {
    /**
     * The current primary key that clients can use to authenticate with redis
     * cache.
     */
    private String primaryKey;

    /**
     * The current secondary key that clients can use to authenticate with
     * redis cache.
     */
    private String secondaryKey;

    /**
     * Get the primaryKey value.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey value.
     *
     * @param primaryKey the primaryKey value to set
     * @return the RedisAccessKeys object itself.
     */
    public RedisAccessKeys withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey value.
     *
     * @return the secondaryKey value
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey value.
     *
     * @param secondaryKey the secondaryKey value to set
     * @return the RedisAccessKeys object itself.
     */
    public RedisAccessKeys withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

}
