package com.aliyun.tablestore.grid;

import com.aliyun.tablestore.grid.model.grid.Grid2D;

public interface GridDataWriter {
    /**
     * 写入一个二维平面。
     * @param variable 变量名。
     * @param t 时间维的值。
     * @param z 高度维的值。
     * @param grid2D 平面数据。
     * @throws Exception
     */
    void writeGrid2D(String variable, int t, int z, Grid2D grid2D) throws Exception;
}
