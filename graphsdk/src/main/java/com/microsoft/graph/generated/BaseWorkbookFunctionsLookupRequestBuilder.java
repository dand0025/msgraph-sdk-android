// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.List;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Lookup Request Builder.
 */
public class BaseWorkbookFunctionsLookupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsLookup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsLookupRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement lookupVector, final com.google.gson.JsonElement resultVector) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("lookupValue", lookupValue);
        mBodyParams.put("lookupVector", lookupVector);
        mBodyParams.put("resultVector", resultVector);
    }

    /**
     * Creates the IWorkbookFunctionsLookupRequest
     *
     * @return The IWorkbookFunctionsLookupRequest instance
     */
    public IWorkbookFunctionsLookupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsLookupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsLookupRequest instance
     */
    public IWorkbookFunctionsLookupRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsLookupRequest request = new WorkbookFunctionsLookupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lookupValue")) {
            request.mBody.lookupValue = getParameter("lookupValue");
        }

        if (hasParameter("lookupVector")) {
            request.mBody.lookupVector = getParameter("lookupVector");
        }

        if (hasParameter("resultVector")) {
            request.mBody.resultVector = getParameter("resultVector");
        }

        return request;
    }
}
