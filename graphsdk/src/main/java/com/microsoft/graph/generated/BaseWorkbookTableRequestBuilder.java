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
 * The class for the Base Workbook Table Request Builder.
 */
public class BaseWorkbookTableRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookTableRequestBuilder {

    /**
     * The request builder for the WorkbookTable
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableRequestBuilder(final String requestUrl, final IBaseClient client, final List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookTableRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookTableRequest buildRequest(final List<Option> requestOptions) {
        return new WorkbookTableRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookTableColumnCollectionRequestBuilder getColumns() {
        return new WorkbookTableColumnCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    public IWorkbookTableColumnRequestBuilder getColumns(final String id) {
        return new WorkbookTableColumnRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    public IWorkbookTableRowCollectionRequestBuilder getRows() {
        return new WorkbookTableRowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rows"), getClient(), null);
    }

    public IWorkbookTableRowRequestBuilder getRows(final String id) {
        return new WorkbookTableRowRequestBuilder(getRequestUrlWithAdditionalSegment("rows") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookTableSort.
     */
    public IWorkbookTableSortRequestBuilder getSort() {
        return new WorkbookTableSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet.
     */
    public IWorkbookWorksheetRequestBuilder getWorksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }

    public IWorkbookTableClearFiltersRequestBuilder getClearFilters() {
        return new WorkbookTableClearFiltersRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clearFilters"), getClient(), null);
    }

    public IWorkbookTableConvertToRangeRequestBuilder getConvertToRange() {
        return new WorkbookTableConvertToRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.convertToRange"), getClient(), null);
    }

    public IWorkbookTableReapplyFiltersRequestBuilder getReapplyFilters() {
        return new WorkbookTableReapplyFiltersRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reapplyFilters"), getClient(), null);
    }

    public IWorkbookTableDataBodyRangeRequestBuilder getDataBodyRange() {
        return new WorkbookTableDataBodyRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.dataBodyRange"), getClient(), null);
    }

    public IWorkbookTableHeaderRowRangeRequestBuilder getHeaderRowRange() {
        return new WorkbookTableHeaderRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.headerRowRange"), getClient(), null);
    }

    public IWorkbookTableRangeRequestBuilder getRange() {
        return new WorkbookTableRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.range"), getClient(), null);
    }

    public IWorkbookTableTotalRowRangeRequestBuilder getTotalRowRange() {
        return new WorkbookTableTotalRowRangeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.totalRowRange"), getClient(), null);
    }
}
