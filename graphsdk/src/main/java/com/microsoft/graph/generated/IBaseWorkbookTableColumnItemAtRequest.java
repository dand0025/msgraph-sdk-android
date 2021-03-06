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

import com.google.gson.JsonObject;
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Table Column Item At Request.
 */
public interface IBaseWorkbookTableColumnItemAtRequest {

    /**
     * Patches the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn The WorkbookTableColumn with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    void patch(WorkbookTableColumn srcWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    /**
     * Patches the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn The WorkbookTableColumn with which to PATCH
     * @return The WorkbookTableColumn
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
    WorkbookTableColumn patch(WorkbookTableColumn srcWorkbookTableColumn) throws ClientException;

    /**
     * Puts the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn The WorkbookTableColumn to PUT
     * @param callback The callback to be called after success or failure
     */
    void put(WorkbookTableColumn srcWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    /**
     * Puts the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn The WorkbookTableColumn to PUT
     * @return The WorkbookTableColumn
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     WorkbookTableColumn put(WorkbookTableColumn srcWorkbookTableColumn) throws ClientException;
    /**
     * Gets the WorkbookTableColumn
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookTableColumn> callback);

    /**
     * Gets the WorkbookTableColumn
     *
     * @return The WorkbookTableColumn
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    WorkbookTableColumn get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IWorkbookTableColumnItemAtRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IWorkbookTableColumnItemAtRequest expand(final String value);

}
