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
 * The class for the Base Workbook Functions Ispmt Request Builder.
 */
public class BaseWorkbookFunctionsIspmtRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIspmt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsIspmtRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement per, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("rate", rate);
        mBodyParams.put("per", per);
        mBodyParams.put("nper", nper);
        mBodyParams.put("pv", pv);
    }

    /**
     * Creates the IWorkbookFunctionsIspmtRequest
     *
     * @return The IWorkbookFunctionsIspmtRequest instance
     */
    public IWorkbookFunctionsIspmtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsIspmtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsIspmtRequest instance
     */
    public IWorkbookFunctionsIspmtRequest buildRequest(final List<Option> requestOptions) {
        WorkbookFunctionsIspmtRequest request = new WorkbookFunctionsIspmtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.mBody.rate = getParameter("rate");
        }

        if (hasParameter("per")) {
            request.mBody.per = getParameter("per");
        }

        if (hasParameter("nper")) {
            request.mBody.nper = getParameter("nper");
        }

        if (hasParameter("pv")) {
            request.mBody.pv = getParameter("pv");
        }

        return request;
    }
}
