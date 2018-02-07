package com.bdqn.utils;

import java.io.Serializable;

public class PageUtils implements Serializable {
    //当前页
    private Integer index;
    //页量
    private Integer pageSize;
    //总页数
    private Integer totalPages;
    //总条数
    private Integer totalCount;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages=totalCount % pageSize == 0 ? totalCount/pageSize : totalCount/pageSize+1;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


}
