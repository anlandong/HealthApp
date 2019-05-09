package com.example.healtheye.Model.Retrofit2Model;

import java.util.List;

public class FoodReport {

    private int count;
    private int notfound;
    private int api;
    private List<FoodsBean> foods;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getNotfound() {
        return notfound;
    }

    public void setNotfound(int notfound) {
        this.notfound = notfound;
    }

    public int getApi() {
        return api;
    }

    public void setApi(int api) {
        this.api = api;
    }

    public List<FoodsBean> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodsBean> foods) {
        this.foods = foods;
    }

    public static class FoodsBean {

        private FoodBean food;
        private String error;

        public FoodBean getFood() {
            return food;
        }

        public void setFood(FoodBean food) {
            this.food = food;
        }

        public String getError() {
            return error;
        }

        public void setError(String error) {
            this.error = error;
        }

        public static class FoodBean {

            private String sr;
            private String type;
            private DescBean desc;
            private List<NutrientsBean> nutrients;
            private List<?> footnotes;

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public DescBean getDesc() {
                return desc;
            }

            public void setDesc(DescBean desc) {
                this.desc = desc;
            }

            public List<NutrientsBean> getNutrients() {
                return nutrients;
            }

            public void setNutrients(List<NutrientsBean> nutrients) {
                this.nutrients = nutrients;
            }

            public List<?> getFootnotes() {
                return footnotes;
            }

            public void setFootnotes(List<?> footnotes) {
                this.footnotes = footnotes;
            }

            public static class DescBean {
                /**
                 * ndbno : 01009
                 * name : Cheese, cheddar (Includes foods for USDA's Food Distribution Program)
                 * ds : Standard Reference
                 * manu :
                 * ru : g
                 */

                private String ndbno;
                private String name;
                private String ds;
                private String manu;
                private String ru;

                public String getNdbno() {
                    return ndbno;
                }

                public void setNdbno(String ndbno) {
                    this.ndbno = ndbno;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
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

                public String getRu() {
                    return ru;
                }

                public void setRu(String ru) {
                    this.ru = ru;
                }
            }

            public static class NutrientsBean {

                private String nutrient_id;
                private String name;
                private String derivation;
                private String group;
                private String unit;
                private String value;

                public String getNutrient_id() {
                    return nutrient_id;
                }

                public void setNutrient_id(String nutrient_id) {
                    this.nutrient_id = nutrient_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDerivation() {
                    return derivation;
                }

                public void setDerivation(String derivation) {
                    this.derivation = derivation;
                }

                public String getGroup() {
                    return group;
                }

                public void setGroup(String group) {
                    this.group = group;
                }

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }


            }
        }
    }
}
