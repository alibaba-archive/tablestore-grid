package com.aliyun.tablestore.grid;

import com.alicloud.openservices.tablestore.model.search.IndexSchema;
import com.alicloud.openservices.tablestore.model.search.query.Query;
import com.aliyun.tablestore.grid.model.GridDataSetMeta;
import com.aliyun.tablestore.grid.model.QueryGridDataSetResult;
import com.aliyun.tablestore.grid.model.QueryParams;

public interface GridStore {

    /**
     * 创建相关的meta、data表，数据录入前调用。
     * @throws Exception
     */
    void createStore() throws Exception;

    /**
     * 写入gridDataSet的meta信息。
     * @param meta
     * @throws Exception
     */
    void putDataSetMeta(GridDataSetMeta meta) throws Exception;

    /**
     * 更新meta信息。
     * @param meta
     * @throws Exception
     */
    void updateDataSetMeta(GridDataSetMeta meta) throws Exception;

    /**
     * 通过gridDataSetId获取meta。
     * @param dataSetId
     * @return
     * @throws Exception
     */
    GridDataSetMeta getDataSetMeta(String dataSetId) throws Exception;

    /**
     * // 创建meta表的多元索引。
     * @param indexName
     * @param indexSchema
     * @throws Exception
     */
    void createMetaIndex(String indexName, IndexSchema indexSchema) throws Exception;

    /**
     * 通过多种查询条件来查询符合条件的数据集。
     * @param indexName 多元索引名。
     * @param query 查询条件，可以通过QueryBuilder构建。
     * @param queryParams 查询相关参数，包括offset、limit、sort等。
     * @return
     * @throws Exception
     */
    QueryGridDataSetResult queryDataSets(String indexName, Query query, QueryParams queryParams) throws Exception;

    /**
     * 获取GridDataWriter用于写入数据。
     * @param meta
     * @return
     */
    GridDataWriter getDataWriter(GridDataSetMeta meta);

    /**
     * 获取GridDataFetcher用于读取数据。
     * @param meta
     * @return
     */
    GridDataFetcher getDataFetcher(GridDataSetMeta meta);

    /**
     * 释放资源。
     */
    void close();

}
