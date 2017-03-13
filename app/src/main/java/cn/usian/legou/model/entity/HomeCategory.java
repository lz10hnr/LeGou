package cn.usian.legou.model.entity;

import java.util.List;

/**
 * Created by TuLing on 2017/3/13.
 */
public class HomeCategory {


    /**
     * data : [{"cat_id":"1","cat_name":"手机类型","parent_id":"0","sort_order":"0"},{"cat_id":"6","cat_name":"手机配件","parent_id":"0","sort_order":"0"},{"cat_id":"12","cat_name":"充值卡","parent_id":"0","sort_order":"0"}]
     * res : 1
     */

    private int res;
    /**
     * cat_id : 1
     * cat_name : 手机类型
     * parent_id : 0
     * sort_order : 0
     */

    private List<DataBean> data;

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String cat_id;
        private String cat_name;
        private String parent_id;
        private String sort_order;

        public String getCat_id() {
            return cat_id;
        }

        public void setCat_id(String cat_id) {
            this.cat_id = cat_id;
        }

        public String getCat_name() {
            return cat_name;
        }

        public void setCat_name(String cat_name) {
            this.cat_name = cat_name;
        }

        public String getParent_id() {
            return parent_id;
        }

        public void setParent_id(String parent_id) {
            this.parent_id = parent_id;
        }

        public String getSort_order() {
            return sort_order;
        }

        public void setSort_order(String sort_order) {
            this.sort_order = sort_order;
        }
    }
}
