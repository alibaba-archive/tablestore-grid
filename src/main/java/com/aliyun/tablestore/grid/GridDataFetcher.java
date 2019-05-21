package com.aliyun.tablestore.grid;

import com.aliyun.tablestore.grid.model.GridDataSet;
import com.aliyun.tablestore.grid.model.grid.Range;

import java.util.Collection;

public interface GridDataFetcher {

    /**
     * 设置要查询的变量。
     * @param variables
     * @return
     */
    GridDataFetcher setVariablesToGet(Collection<String> variables);

    /**
     * 设置要读取的各维度起始点和大小。
     * @param origin 各维度起始点。
     * @param shape 各维度大小。
     * @return
     */
    GridDataFetcher setOriginShape(int[] origin, int[] shape);

    /**
     * 获取数据。
     * @return
     * @throws Exception
     */
    GridDataSet fetch() throws Exception;

    GridDataFetcher setT(int t);

    GridDataFetcher setTRange(Range tRange);

    GridDataFetcher setZ(int z);

    GridDataFetcher setZRange(Range zRange);

    GridDataFetcher setX(int x);

    GridDataFetcher setXRange(Range xRange);

    GridDataFetcher setY(int y);

    GridDataFetcher setYRange(Range yRange);
}
