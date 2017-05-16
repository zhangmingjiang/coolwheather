package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangmj on 2017/5/15.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private String privinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setPrivinceCode(String privinceCode) {
        this.privinceCode = privinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getPrivinceCode() {
        return privinceCode;
    }
}
