/*
 * Copyright 2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.api.aws;

import androidx.annotation.NonNull;

import java.util.Collections;
import java.util.List;

/**
 * Copy of DefaultGraphQLRequestOptions, with LeafSerializationBehavior set to JUST_ID
 * and maxDepth of 1.
 */
public final class JustIDGraphQLRequestOptions implements GraphQLRequestOptions {
    private static final String ITEMS_KEY = "items";
    private static final String NEXT_TOKEN_KEY = "nextToken";

    @NonNull
    @Override
    public List<String> paginationFields() {
        return Collections.singletonList(NEXT_TOKEN_KEY);
    }

    @NonNull
    @Override
    public List<String> modelMetaFields() {
        return Collections.emptyList();
    }

    @NonNull
    @Override
    public String listField() {
        return ITEMS_KEY;
    }

    @Override
    public int maxDepth() {
        return 1;
    }

    @NonNull
    @Override
    public LeafSerializationBehavior leafSerializationBehavior() {
        return LeafSerializationBehavior.JUST_ID;
    }
}
