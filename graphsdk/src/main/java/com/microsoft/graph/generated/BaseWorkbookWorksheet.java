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
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Worksheet.
 */
public class BaseWorkbookWorksheet extends Entity implements IJsonBackedObject {


    public BaseWorkbookWorksheet() {
        oDataType = "microsoft.graph.workbookWorksheet";
    }

    /**
     * The Name.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Position.
     */
    @SerializedName("position")
    @Expose
    public Integer position;

    /**
     * The Visibility.
     */
    @SerializedName("visibility")
    @Expose
    public String visibility;

    /**
     * The Charts.
     */
    public transient WorkbookChartCollectionPage charts;

    /**
     * The Protection.
     */
    @SerializedName("protection")
    @Expose
    public WorkbookWorksheetProtection protection;

    /**
     * The Tables.
     */
    public transient WorkbookTableCollectionPage tables;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("charts")) {
            final BaseWorkbookChartCollectionResponse response = new BaseWorkbookChartCollectionResponse();
            if (json.has("charts@odata.nextLink")) {
                response.nextLink = json.get("charts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("charts").toString(), JsonObject[].class);
            final WorkbookChart[] array = new WorkbookChart[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookChart.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            charts = new WorkbookChartCollectionPage(response, null);
        }

        if (json.has("tables")) {
            final BaseWorkbookTableCollectionResponse response = new BaseWorkbookTableCollectionResponse();
            if (json.has("tables@odata.nextLink")) {
                response.nextLink = json.get("tables@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tables").toString(), JsonObject[].class);
            final WorkbookTable[] array = new WorkbookTable[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookTable.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tables = new WorkbookTableCollectionPage(response, null);
        }
    }
}
