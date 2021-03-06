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
 * The class for the Base Workbook Range Cell Request Builder.
 */
public class BaseWorkbookRangeCellRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeCell
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeCellRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions, final Integer row, final Integer column) {
        super(requestUrl, client, requestOptions);
        mFunctionOptions.add(new FunctionOption("row", row));
        mFunctionOptions.add(new FunctionOption("column", column));
    }

    /**
     * Creates the IWorkbookRangeCellRequest
     *
     * @return The IWorkbookRangeCellRequest instance
     */
    public IWorkbookRangeCellRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeCellRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookRangeCellRequest instance
     */
    public IWorkbookRangeCellRequest buildRequest(final List<Option> requestOptions) {
        WorkbookRangeCellRequest request = new WorkbookRangeCellRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : mFunctionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
