// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Percent Rank_Exc Request Builder.
 */
public class WorkbookFunctionsPercentRank_ExcRequestBuilder extends BaseWorkbookFunctionsPercentRank_ExcRequestBuilder implements IWorkbookFunctionsPercentRank_ExcRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPercentRank_Exc
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public WorkbookFunctionsPercentRank_ExcRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement x, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions, array, x, significance);
    }
}
