package com.example.healtheye.Model;


import java.util.List;

public class FoodSearch {


    /**
     * list : {"q":"butter","sr":"1","ds":"any","start":0,"end":25,"total":4671,"group":"","sort":"n","item":[{"offset":0,"group":"Branded Food Products Database","name":"ABBOTT, EAS, MYOPLEX 30 BUILD MUSCLE BAR, CHOCOLATE PEANUT BUTTER, UPC: 791083622813","ndbno":"45258948","ds":"LI","manu":"Ross Products Division"},{"offset":1,"group":"Branded Food Products Database","name":"ABC, PEANUT BUTTER, UPC: 837991219186","ndbno":"45166992","ds":"LI","manu":"none"},{"offset":2,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn Pantry Pack, UNPREPARED, GTIN: 00076150090208","ndbno":"45130519","ds":"GDSN","manu":"Conagra Brands"},{"offset":3,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150017861","ndbno":"45130172","ds":"GDSN","manu":"ConAgra Foods Inc."},{"offset":4,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150232547","ndbno":"45130180","ds":"GDSN","manu":"ConAgra Foods Inc."},{"offset":5,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150232301","ndbno":"45130530","ds":"GDSN","manu":"Conagra Brands"},{"offset":6,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150011159","ndbno":"45130738","ds":"GDSN","manu":"Conagra Brands"},{"offset":7,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150232585","ndbno":"45130770","ds":"GDSN","manu":"Conagra Brands"},{"offset":8,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150232530","ndbno":"45133744","ds":"GDSN","manu":"ConAgra Foods Inc."},{"offset":9,"group":"Branded Food Products Database","name":"ACT II Butter Lovers, UNPREPARED, GTIN: 00076150232486","ndbno":"45130507","ds":"GDSN","manu":"Conagra Brands"},{"offset":10,"group":"Branded Food Products Database","name":"ACT II Butter Lovers, UNPREPARED, GTIN: 00076150230178","ndbno":"45130521","ds":"GDSN","manu":"Conagra Brands"},{"offset":11,"group":"Branded Food Products Database","name":"ACT II Butter Lovers, UNPREPARED, GTIN: 00076150232523","ndbno":"45130769","ds":"GDSN","manu":"Conagra Brands"},{"offset":12,"group":"Branded Food Products Database","name":"ACT II Butter Popcorn, UNPREPARED, GTIN: 00076150200249","ndbno":"45135012","ds":"GDSN","manu":"Conagra Brands"},{"offset":13,"group":"Branded Food Products Database","name":"ACT II Butter Popcorn, UNPREPARED, GTIN: 00076150232028","ndbno":"45135014","ds":"GDSN","manu":"Conagra Brands"},{"offset":14,"group":"Branded Food Products Database","name":"ACT II Butter Popcorn, UNPREPARED, GTIN: 00076150201437","ndbno":"45130563","ds":"GDSN","manu":"Conagra Brands"},{"offset":15,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150200102","ndbno":"45135010","ds":"GDSN","manu":"Conagra Brands"},{"offset":16,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150232219","ndbno":"45135033","ds":"GDSN","manu":"Conagra Brands"},{"offset":17,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150232226","ndbno":"45135036","ds":"GDSN","manu":"Conagra Brands"},{"offset":18,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150232233","ndbno":"45135038","ds":"GDSN","manu":"Conagra Brands"},{"offset":19,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150232271","ndbno":"45135043","ds":"GDSN","manu":"Conagra Brands"},{"offset":20,"group":"Branded Food Products Database","name":"ACT II Extra Movie Butter, UNPREPARED, GTIN: 00076150332308","ndbno":"45135047","ds":"GDSN","manu":"Conagra Brands"},{"offset":21,"group":"Branded Food Products Database","name":"ACT II Extreme Butter, UNPREPARED, GTIN: 00076150232080","ndbno":"45135017","ds":"GDSN","manu":"Conagra Brands"},{"offset":22,"group":"Branded Food Products Database","name":"ACT II Extreme Butter, UNPREPARED, GTIN: 00076150232097","ndbno":"45135020","ds":"GDSN","manu":"Conagra Brands"},{"offset":23,"group":"Branded Food Products Database","name":"ACT II Light Butter Popcorn, UNPREPARED, GTIN: 00076150232400","ndbno":"45135044","ds":"GDSN","manu":"Conagra Brands"},{"offset":24,"group":"Branded Food Products Database","name":"ACT II Light Butter, UNPREPARED, GTIN: 00076150232493","ndbno":"45135045","ds":"GDSN","manu":"Conagra Brands"}]}
     */

    private ListBean list;

    public ListBean getList() {
        return list;
    }

    public void setList(ListBean list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * q : butter
         * sr : 1
         * ds : any
         * start : 0
         * end : 25
         * total : 4671
         * group :
         * sort : n
         * item : [{"offset":0,"group":"Branded Food Products Database","name":"ABBOTT, EAS, MYOPLEX 30 BUILD MUSCLE BAR, CHOCOLATE PEANUT BUTTER, UPC: 791083622813","ndbno":"45258948","ds":"LI","manu":"Ross Products Division"},{"offset":1,"group":"Branded Food Products Database","name":"ABC, PEANUT BUTTER, UPC: 837991219186","ndbno":"45166992","ds":"LI","manu":"none"},{"offset":2,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn Pantry Pack, UNPREPARED, GTIN: 00076150090208","ndbno":"45130519","ds":"GDSN","manu":"Conagra Brands"},{"offset":3,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150017861","ndbno":"45130172","ds":"GDSN","manu":"ConAgra Foods Inc."},{"offset":4,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150232547","ndbno":"45130180","ds":"GDSN","manu":"ConAgra Foods Inc."},{"offset":5,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150232301","ndbno":"45130530","ds":"GDSN","manu":"Conagra Brands"},{"offset":6,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150011159","ndbno":"45130738","ds":"GDSN","manu":"Conagra Brands"},{"offset":7,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150232585","ndbno":"45130770","ds":"GDSN","manu":"Conagra Brands"},{"offset":8,"group":"Branded Food Products Database","name":"ACT II Butter Lovers Popcorn, UNPREPARED, GTIN: 00076150232530","ndbno":"45133744","ds":"GDSN","manu":"ConAgra Foods Inc."},{"offset":9,"group":"Branded Food Products Database","name":"ACT II Butter Lovers, UNPREPARED, GTIN: 00076150232486","ndbno":"45130507","ds":"GDSN","manu":"Conagra Brands"},{"offset":10,"group":"Branded Food Products Database","name":"ACT II Butter Lovers, UNPREPARED, GTIN: 00076150230178","ndbno":"45130521","ds":"GDSN","manu":"Conagra Brands"},{"offset":11,"group":"Branded Food Products Database","name":"ACT II Butter Lovers, UNPREPARED, GTIN: 00076150232523","ndbno":"45130769","ds":"GDSN","manu":"Conagra Brands"},{"offset":12,"group":"Branded Food Products Database","name":"ACT II Butter Popcorn, UNPREPARED, GTIN: 00076150200249","ndbno":"45135012","ds":"GDSN","manu":"Conagra Brands"},{"offset":13,"group":"Branded Food Products Database","name":"ACT II Butter Popcorn, UNPREPARED, GTIN: 00076150232028","ndbno":"45135014","ds":"GDSN","manu":"Conagra Brands"},{"offset":14,"group":"Branded Food Products Database","name":"ACT II Butter Popcorn, UNPREPARED, GTIN: 00076150201437","ndbno":"45130563","ds":"GDSN","manu":"Conagra Brands"},{"offset":15,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150200102","ndbno":"45135010","ds":"GDSN","manu":"Conagra Brands"},{"offset":16,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150232219","ndbno":"45135033","ds":"GDSN","manu":"Conagra Brands"},{"offset":17,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150232226","ndbno":"45135036","ds":"GDSN","manu":"Conagra Brands"},{"offset":18,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150232233","ndbno":"45135038","ds":"GDSN","manu":"Conagra Brands"},{"offset":19,"group":"Branded Food Products Database","name":"ACT II Butter, UNPREPARED, GTIN: 00076150232271","ndbno":"45135043","ds":"GDSN","manu":"Conagra Brands"},{"offset":20,"group":"Branded Food Products Database","name":"ACT II Extra Movie Butter, UNPREPARED, GTIN: 00076150332308","ndbno":"45135047","ds":"GDSN","manu":"Conagra Brands"},{"offset":21,"group":"Branded Food Products Database","name":"ACT II Extreme Butter, UNPREPARED, GTIN: 00076150232080","ndbno":"45135017","ds":"GDSN","manu":"Conagra Brands"},{"offset":22,"group":"Branded Food Products Database","name":"ACT II Extreme Butter, UNPREPARED, GTIN: 00076150232097","ndbno":"45135020","ds":"GDSN","manu":"Conagra Brands"},{"offset":23,"group":"Branded Food Products Database","name":"ACT II Light Butter Popcorn, UNPREPARED, GTIN: 00076150232400","ndbno":"45135044","ds":"GDSN","manu":"Conagra Brands"},{"offset":24,"group":"Branded Food Products Database","name":"ACT II Light Butter, UNPREPARED, GTIN: 00076150232493","ndbno":"45135045","ds":"GDSN","manu":"Conagra Brands"}]
         */

        private List<ItemBean> item;

        public List<ItemBean> getItem() {
            return item;
        }

        public void setItem(List<ItemBean> item) {
            this.item = item;
        }

        public static class ItemBean {
            /**
             * offset : 0
             * group : Branded Food Products Database
             * name : ABBOTT, EAS, MYOPLEX 30 BUILD MUSCLE BAR, CHOCOLATE PEANUT BUTTER, UPC: 791083622813
             * ndbno : 45258948
             * ds : LI
             * manu : Ross Products Division
             */

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