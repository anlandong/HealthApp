package com.example.healtheye.Model.Retrofit2Model;


import java.util.List;

public class FoodSearch {

    private ListBean list;

    public ListBean getList() {
        return list;
    }

    public void setList(ListBean list) {
        this.list = list;
    }

    public static class ListBean {

        private List<ItemBean> item;

        public List<ItemBean> getItem() {
            return item;
        }

        public void setItem(List<ItemBean> item) {
            this.item = item;
        }

        public static class ItemBean {

            private int offset;
            private String group;
            private String name;
            private String ndbno;
            private String ds;
            private String manu;

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNdbno() {
                return ndbno;
            }

            public void setNdbno(String ndbno) {
                this.ndbno = ndbno;
            }

            public String getDs() {
                return ds;
            }

            public void setDs(String ds) {
                this.ds = ds;
            }

            public String getManu() {
                return manu;
            }

            public void setManu(String manu) {
                this.manu = manu;
            }
        }
    }
}