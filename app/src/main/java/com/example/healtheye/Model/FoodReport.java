package com.example.healtheye.Model;

import java.util.List;

public class FoodReport {


    /**
     * foods : [{"food":{"sr":"1","type":"b","desc":{"ndbno":"01009","name":"Cheese, cheddar (Includes foods for USDA's Food Distribution Program)","ds":"Standard Reference","manu":"","ru":"g"},"nutrients":[{"nutrient_id":"255","name":"Water","derivation":"NONE","group":"Proximates","unit":"g","value":"36.75","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"48.51"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"89.67"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"41.53"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"10.42"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"6.25"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"10.29"}]},{"nutrient_id":"208","name":"Energy","derivation":"NC","group":"Proximates","unit":"kcal","value":"403","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"532"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"983"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"455"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"114"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"69"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"113"}]},{"nutrient_id":"203","name":"Protein","derivation":"NONE","group":"Proximates","unit":"g","value":"22.87","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"30.19"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"55.80"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"25.84"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"6.48"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"3.89"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"6.40"}]},{"nutrient_id":"204","name":"Total lipid (fat)","derivation":"NONE","group":"Proximates","unit":"g","value":"33.31","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"43.97"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"81.28"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"37.64"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"9.44"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5.66"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"9.33"}]},{"nutrient_id":"205","name":"Carbohydrate, by difference","derivation":"NC","group":"Proximates","unit":"g","value":"3.37","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"4.45"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"8.22"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"3.81"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.96"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.57"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.94"}]},{"nutrient_id":"291","name":"Fiber, total dietary","derivation":"NONE","group":"Proximates","unit":"g","value":"0.0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.0"}]},{"nutrient_id":"269","name":"Sugars, total","derivation":"AS","group":"Proximates","unit":"g","value":"0.48","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.63"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.17"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.54"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.14"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.08"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.13"}]},{"nutrient_id":"301","name":"Calcium, Ca","derivation":"NONE","group":"Minerals","unit":"mg","value":"710","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"937"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1732"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"802"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"201"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"121"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"199"}]},{"nutrient_id":"303","name":"Iron, Fe","derivation":"NONE","group":"Minerals","unit":"mg","value":"0.14","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.18"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.34"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.16"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.04"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.02"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.04"}]},{"nutrient_id":"304","name":"Magnesium, Mg","derivation":"NONE","group":"Minerals","unit":"mg","value":"27","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"36"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"66"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"31"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"8"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"8"}]},{"nutrient_id":"305","name":"Phosphorus, P","derivation":"NONE","group":"Minerals","unit":"mg","value":"455","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"601"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1110"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"514"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"129"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"77"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"127"}]},{"nutrient_id":"306","name":"Potassium, K","derivation":"NONE","group":"Minerals","unit":"mg","value":"76","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"100"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"185"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"86"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"22"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"13"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"21"}]},{"nutrient_id":"307","name":"Sodium, Na","derivation":"NONE","group":"Minerals","unit":"mg","value":"653","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"862"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1593"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"738"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"185"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"111"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"183"}]},{"nutrient_id":"309","name":"Zinc, Zn","derivation":"NONE","group":"Minerals","unit":"mg","value":"3.64","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"4.80"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"8.88"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"4.11"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"1.03"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.62"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"1.02"}]},{"nutrient_id":"401","name":"Vitamin C, total ascorbic acid","derivation":"AS","group":"Vitamins","unit":"mg","value":"0.0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.0"}]},{"nutrient_id":"404","name":"Thiamin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.029","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.038"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.071"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.033"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.008"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.005"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.008"}]},{"nutrient_id":"405","name":"Riboflavin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.428","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.565"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.044"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.484"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.121"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.073"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.120"}]},{"nutrient_id":"406","name":"Niacin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.059","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.078"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.144"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.067"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.017"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.010"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.017"}]},{"nutrient_id":"415","name":"Vitamin B-6","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.066","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.087"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.161"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.075"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.019"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.011"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.018"}]},{"nutrient_id":"435","name":"Folate, DFE","derivation":"NC","group":"Vitamins","unit":"µg","value":"27","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"36"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"66"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"31"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"8"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"8"}]},{"nutrient_id":"418","name":"Vitamin B-12","derivation":"NONE","group":"Vitamins","unit":"µg","value":"1.10","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1.45"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"2.68"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1.24"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.31"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.19"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.31"}]},{"nutrient_id":"320","name":"Vitamin A, RAE","derivation":"NC","group":"Vitamins","unit":"µg","value":"337","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"445"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"822"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"381"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"96"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"57"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"94"}]},{"nutrient_id":"318","name":"Vitamin A, IU","derivation":"NC","group":"Vitamins","unit":"IU","value":"1242","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1639"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"3030"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1403"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"352"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"211"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"348"}]},{"nutrient_id":"323","name":"Vitamin E (alpha-tocopherol)","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.71","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.94"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.73"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.80"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.20"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.12"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.20"}]},{"nutrient_id":"328","name":"Vitamin D (D2 + D3)","derivation":"AS","group":"Vitamins","unit":"µg","value":"0.6","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.8"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.5"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.7"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.2"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.1"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.2"}]},{"nutrient_id":"324","name":"Vitamin D","derivation":"BFFN","group":"Vitamins","unit":"IU","value":"24","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"32"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"59"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"27"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"7"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"4"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"7"}]},{"nutrient_id":"430","name":"Vitamin K (phylloquinone)","derivation":"NONE","group":"Vitamins","unit":"µg","value":"2.4","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"3.2"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"5.9"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"2.7"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.7"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.4"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.7"}]},{"nutrient_id":"606","name":"Fatty acids, total saturated","derivation":"NC","group":"Lipids","unit":"g","value":"18.867","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"24.904"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"46.035"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"21.320"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"5.349"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"3.207"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"5.283"}]},{"nutrient_id":"645","name":"Fatty acids, total monounsaturated","derivation":"NONE","group":"Lipids","unit":"g","value":"9.391","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"12.396"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"22.914"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"10.612"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"2.662"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"1.596"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"2.629"}]},{"nutrient_id":"646","name":"Fatty acids, total polyunsaturated","derivation":"NONE","group":"Lipids","unit":"g","value":"0.942","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1.243"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"2.298"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1.064"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.267"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.160"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.264"}]},{"nutrient_id":"601","name":"Cholesterol","derivation":"NONE","group":"Lipids","unit":"mg","value":"99","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"131"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"242"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"112"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"28"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"17"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"28"}]},{"nutrient_id":"262","name":"Caffeine","derivation":"NONE","group":"Other","unit":"mg","value":"0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0"}]}],"footnotes":[]}},{"error":"No data for ndbno 45202763"},{"food":{"sr":"1","type":"b","desc":{"ndbno":"35193","name":"Agave, cooked (Southwest)","ds":"Standard Reference","manu":"","ru":"g"},"nutrients":[{"nutrient_id":"255","name":"Water","derivation":"NONE","group":"Proximates","unit":"g","value":"65.40","measures":[]},{"nutrient_id":"208","name":"Energy","derivation":"NC","group":"Proximates","unit":"kcal","value":"135","measures":[]},{"nutrient_id":"203","name":"Protein","derivation":"BFSN","group":"Proximates","unit":"g","value":"0.99","measures":[]},{"nutrient_id":"204","name":"Total lipid (fat)","derivation":"BFSN","group":"Proximates","unit":"g","value":"0.29","measures":[]},{"nutrient_id":"205","name":"Carbohydrate, by difference","derivation":"NC","group":"Proximates","unit":"g","value":"32.00","measures":[]},{"nutrient_id":"291","name":"Fiber, total dietary","derivation":"NONE","group":"Proximates","unit":"g","value":"10.6","measures":[]},{"nutrient_id":"269","name":"Sugars, total","derivation":"NONE","group":"Proximates","unit":"g","value":"20.87","measures":[]},{"nutrient_id":"301","name":"Calcium, Ca","derivation":"NONE","group":"Minerals","unit":"mg","value":"460","measures":[]},{"nutrient_id":"303","name":"Iron, Fe","derivation":"NONE","group":"Minerals","unit":"mg","value":"3.55","measures":[]},{"nutrient_id":"304","name":"Magnesium, Mg","derivation":"NONE","group":"Minerals","unit":"mg","value":"39","measures":[]},{"nutrient_id":"305","name":"Phosphorus, P","derivation":"NONE","group":"Minerals","unit":"mg","value":"9","measures":[]},{"nutrient_id":"306","name":"Potassium, K","derivation":"NONE","group":"Minerals","unit":"mg","value":"59","measures":[]},{"nutrient_id":"307","name":"Sodium, Na","derivation":"NONE","group":"Minerals","unit":"mg","value":"13","measures":[]},{"nutrient_id":"309","name":"Zinc, Zn","derivation":"NONE","group":"Minerals","unit":"mg","value":"0.25","measures":[]},{"nutrient_id":"401","name":"Vitamin C, total ascorbic acid","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.3","measures":[]},{"nutrient_id":"404","name":"Thiamin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.012","measures":[]},{"nutrient_id":"405","name":"Riboflavin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.099","measures":[]},{"nutrient_id":"406","name":"Niacin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.162","measures":[]},{"nutrient_id":"415","name":"Vitamin B-6","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.087","measures":[]},{"nutrient_id":"435","name":"Folate, DFE","derivation":"NC","group":"Vitamins","unit":"µg","value":"3","measures":[]},{"nutrient_id":"418","name":"Vitamin B-12","derivation":"NONE","group":"Vitamins","unit":"µg","value":"0.00","measures":[]},{"nutrient_id":"320","name":"Vitamin A, RAE","derivation":"AS","group":"Vitamins","unit":"µg","value":"6","measures":[]},{"nutrient_id":"318","name":"Vitamin A, IU","derivation":"AS","group":"Vitamins","unit":"IU","value":"113","measures":[]},{"nutrient_id":"323","name":"Vitamin E (alpha-tocopherol)","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.36","measures":[]},{"nutrient_id":"328","name":"Vitamin D (D2 + D3)","derivation":"NONE","group":"Vitamins","unit":"µg","value":"0.0","measures":[]},{"nutrient_id":"324","name":"Vitamin D","derivation":"NONE","group":"Vitamins","unit":"IU","value":"0","measures":[]},{"nutrient_id":"430","name":"Vitamin K (phylloquinone)","derivation":"NONE","group":"Vitamins","unit":"µg","value":"4.9","measures":[]},{"nutrient_id":"601","name":"Cholesterol","derivation":"NONE","group":"Lipids","unit":"mg","value":"0","measures":[]},{"nutrient_id":"262","name":"Caffeine","derivation":"NONE","group":"Other","unit":"mg","value":"0","measures":[]}],"footnotes":[]}}]
     * count : 3
     * notfound : 1
     * api : 2
     */

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
        /**
         * food : {"sr":"1","type":"b","desc":{"ndbno":"01009","name":"Cheese, cheddar (Includes foods for USDA's Food Distribution Program)","ds":"Standard Reference","manu":"","ru":"g"},"nutrients":[{"nutrient_id":"255","name":"Water","derivation":"NONE","group":"Proximates","unit":"g","value":"36.75","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"48.51"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"89.67"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"41.53"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"10.42"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"6.25"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"10.29"}]},{"nutrient_id":"208","name":"Energy","derivation":"NC","group":"Proximates","unit":"kcal","value":"403","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"532"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"983"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"455"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"114"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"69"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"113"}]},{"nutrient_id":"203","name":"Protein","derivation":"NONE","group":"Proximates","unit":"g","value":"22.87","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"30.19"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"55.80"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"25.84"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"6.48"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"3.89"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"6.40"}]},{"nutrient_id":"204","name":"Total lipid (fat)","derivation":"NONE","group":"Proximates","unit":"g","value":"33.31","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"43.97"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"81.28"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"37.64"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"9.44"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5.66"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"9.33"}]},{"nutrient_id":"205","name":"Carbohydrate, by difference","derivation":"NC","group":"Proximates","unit":"g","value":"3.37","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"4.45"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"8.22"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"3.81"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.96"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.57"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.94"}]},{"nutrient_id":"291","name":"Fiber, total dietary","derivation":"NONE","group":"Proximates","unit":"g","value":"0.0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.0"}]},{"nutrient_id":"269","name":"Sugars, total","derivation":"AS","group":"Proximates","unit":"g","value":"0.48","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.63"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.17"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.54"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.14"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.08"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.13"}]},{"nutrient_id":"301","name":"Calcium, Ca","derivation":"NONE","group":"Minerals","unit":"mg","value":"710","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"937"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1732"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"802"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"201"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"121"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"199"}]},{"nutrient_id":"303","name":"Iron, Fe","derivation":"NONE","group":"Minerals","unit":"mg","value":"0.14","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.18"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.34"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.16"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.04"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.02"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.04"}]},{"nutrient_id":"304","name":"Magnesium, Mg","derivation":"NONE","group":"Minerals","unit":"mg","value":"27","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"36"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"66"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"31"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"8"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"8"}]},{"nutrient_id":"305","name":"Phosphorus, P","derivation":"NONE","group":"Minerals","unit":"mg","value":"455","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"601"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1110"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"514"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"129"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"77"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"127"}]},{"nutrient_id":"306","name":"Potassium, K","derivation":"NONE","group":"Minerals","unit":"mg","value":"76","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"100"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"185"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"86"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"22"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"13"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"21"}]},{"nutrient_id":"307","name":"Sodium, Na","derivation":"NONE","group":"Minerals","unit":"mg","value":"653","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"862"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1593"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"738"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"185"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"111"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"183"}]},{"nutrient_id":"309","name":"Zinc, Zn","derivation":"NONE","group":"Minerals","unit":"mg","value":"3.64","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"4.80"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"8.88"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"4.11"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"1.03"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.62"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"1.02"}]},{"nutrient_id":"401","name":"Vitamin C, total ascorbic acid","derivation":"AS","group":"Vitamins","unit":"mg","value":"0.0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.0"}]},{"nutrient_id":"404","name":"Thiamin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.029","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.038"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.071"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.033"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.008"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.005"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.008"}]},{"nutrient_id":"405","name":"Riboflavin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.428","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.565"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.044"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.484"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.121"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.073"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.120"}]},{"nutrient_id":"406","name":"Niacin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.059","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.078"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.144"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.067"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.017"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.010"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.017"}]},{"nutrient_id":"415","name":"Vitamin B-6","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.066","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.087"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.161"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.075"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.019"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.011"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.018"}]},{"nutrient_id":"435","name":"Folate, DFE","derivation":"NC","group":"Vitamins","unit":"µg","value":"27","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"36"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"66"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"31"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"8"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"8"}]},{"nutrient_id":"418","name":"Vitamin B-12","derivation":"NONE","group":"Vitamins","unit":"µg","value":"1.10","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1.45"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"2.68"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1.24"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.31"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.19"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.31"}]},{"nutrient_id":"320","name":"Vitamin A, RAE","derivation":"NC","group":"Vitamins","unit":"µg","value":"337","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"445"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"822"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"381"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"96"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"57"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"94"}]},{"nutrient_id":"318","name":"Vitamin A, IU","derivation":"NC","group":"Vitamins","unit":"IU","value":"1242","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1639"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"3030"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1403"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"352"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"211"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"348"}]},{"nutrient_id":"323","name":"Vitamin E (alpha-tocopherol)","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.71","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.94"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.73"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.80"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.20"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.12"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.20"}]},{"nutrient_id":"328","name":"Vitamin D (D2 + D3)","derivation":"AS","group":"Vitamins","unit":"µg","value":"0.6","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.8"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.5"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.7"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.2"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.1"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.2"}]},{"nutrient_id":"324","name":"Vitamin D","derivation":"BFFN","group":"Vitamins","unit":"IU","value":"24","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"32"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"59"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"27"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"7"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"4"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"7"}]},{"nutrient_id":"430","name":"Vitamin K (phylloquinone)","derivation":"NONE","group":"Vitamins","unit":"µg","value":"2.4","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"3.2"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"5.9"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"2.7"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.7"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.4"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.7"}]},{"nutrient_id":"606","name":"Fatty acids, total saturated","derivation":"NC","group":"Lipids","unit":"g","value":"18.867","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"24.904"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"46.035"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"21.320"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"5.349"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"3.207"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"5.283"}]},{"nutrient_id":"645","name":"Fatty acids, total monounsaturated","derivation":"NONE","group":"Lipids","unit":"g","value":"9.391","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"12.396"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"22.914"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"10.612"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"2.662"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"1.596"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"2.629"}]},{"nutrient_id":"646","name":"Fatty acids, total polyunsaturated","derivation":"NONE","group":"Lipids","unit":"g","value":"0.942","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1.243"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"2.298"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1.064"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.267"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.160"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.264"}]},{"nutrient_id":"601","name":"Cholesterol","derivation":"NONE","group":"Lipids","unit":"mg","value":"99","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"131"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"242"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"112"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"28"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"17"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"28"}]},{"nutrient_id":"262","name":"Caffeine","derivation":"NONE","group":"Other","unit":"mg","value":"0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0"}]}],"footnotes":[]}
         * error : No data for ndbno 45202763
         */

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
            /**
             * sr : 1
             * type : b
             * desc : {"ndbno":"01009","name":"Cheese, cheddar (Includes foods for USDA's Food Distribution Program)","ds":"Standard Reference","manu":"","ru":"g"}
             * nutrients : [{"nutrient_id":"255","name":"Water","derivation":"NONE","group":"Proximates","unit":"g","value":"36.75","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"48.51"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"89.67"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"41.53"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"10.42"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"6.25"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"10.29"}]},{"nutrient_id":"208","name":"Energy","derivation":"NC","group":"Proximates","unit":"kcal","value":"403","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"532"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"983"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"455"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"114"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"69"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"113"}]},{"nutrient_id":"203","name":"Protein","derivation":"NONE","group":"Proximates","unit":"g","value":"22.87","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"30.19"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"55.80"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"25.84"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"6.48"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"3.89"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"6.40"}]},{"nutrient_id":"204","name":"Total lipid (fat)","derivation":"NONE","group":"Proximates","unit":"g","value":"33.31","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"43.97"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"81.28"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"37.64"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"9.44"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5.66"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"9.33"}]},{"nutrient_id":"205","name":"Carbohydrate, by difference","derivation":"NC","group":"Proximates","unit":"g","value":"3.37","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"4.45"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"8.22"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"3.81"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.96"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.57"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.94"}]},{"nutrient_id":"291","name":"Fiber, total dietary","derivation":"NONE","group":"Proximates","unit":"g","value":"0.0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.0"}]},{"nutrient_id":"269","name":"Sugars, total","derivation":"AS","group":"Proximates","unit":"g","value":"0.48","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.63"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.17"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.54"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.14"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.08"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.13"}]},{"nutrient_id":"301","name":"Calcium, Ca","derivation":"NONE","group":"Minerals","unit":"mg","value":"710","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"937"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1732"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"802"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"201"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"121"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"199"}]},{"nutrient_id":"303","name":"Iron, Fe","derivation":"NONE","group":"Minerals","unit":"mg","value":"0.14","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.18"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.34"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.16"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.04"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.02"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.04"}]},{"nutrient_id":"304","name":"Magnesium, Mg","derivation":"NONE","group":"Minerals","unit":"mg","value":"27","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"36"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"66"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"31"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"8"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"8"}]},{"nutrient_id":"305","name":"Phosphorus, P","derivation":"NONE","group":"Minerals","unit":"mg","value":"455","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"601"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1110"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"514"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"129"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"77"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"127"}]},{"nutrient_id":"306","name":"Potassium, K","derivation":"NONE","group":"Minerals","unit":"mg","value":"76","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"100"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"185"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"86"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"22"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"13"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"21"}]},{"nutrient_id":"307","name":"Sodium, Na","derivation":"NONE","group":"Minerals","unit":"mg","value":"653","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"862"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1593"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"738"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"185"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"111"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"183"}]},{"nutrient_id":"309","name":"Zinc, Zn","derivation":"NONE","group":"Minerals","unit":"mg","value":"3.64","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"4.80"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"8.88"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"4.11"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"1.03"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.62"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"1.02"}]},{"nutrient_id":"401","name":"Vitamin C, total ascorbic acid","derivation":"AS","group":"Vitamins","unit":"mg","value":"0.0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.0"}]},{"nutrient_id":"404","name":"Thiamin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.029","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.038"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.071"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.033"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.008"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.005"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.008"}]},{"nutrient_id":"405","name":"Riboflavin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.428","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.565"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.044"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.484"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.121"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.073"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.120"}]},{"nutrient_id":"406","name":"Niacin","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.059","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.078"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.144"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.067"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.017"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.010"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.017"}]},{"nutrient_id":"415","name":"Vitamin B-6","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.066","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.087"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0.161"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.075"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.019"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.011"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.018"}]},{"nutrient_id":"435","name":"Folate, DFE","derivation":"NC","group":"Vitamins","unit":"µg","value":"27","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"36"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"66"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"31"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"8"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"5"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"8"}]},{"nutrient_id":"418","name":"Vitamin B-12","derivation":"NONE","group":"Vitamins","unit":"µg","value":"1.10","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1.45"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"2.68"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1.24"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.31"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.19"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.31"}]},{"nutrient_id":"320","name":"Vitamin A, RAE","derivation":"NC","group":"Vitamins","unit":"µg","value":"337","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"445"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"822"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"381"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"96"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"57"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"94"}]},{"nutrient_id":"318","name":"Vitamin A, IU","derivation":"NC","group":"Vitamins","unit":"IU","value":"1242","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1639"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"3030"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1403"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"352"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"211"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"348"}]},{"nutrient_id":"323","name":"Vitamin E (alpha-tocopherol)","derivation":"NONE","group":"Vitamins","unit":"mg","value":"0.71","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.94"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.73"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.80"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.20"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.12"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.20"}]},{"nutrient_id":"328","name":"Vitamin D (D2 + D3)","derivation":"AS","group":"Vitamins","unit":"µg","value":"0.6","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0.8"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"1.5"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0.7"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.2"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.1"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.2"}]},{"nutrient_id":"324","name":"Vitamin D","derivation":"BFFN","group":"Vitamins","unit":"IU","value":"24","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"32"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"59"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"27"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"7"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"4"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"7"}]},{"nutrient_id":"430","name":"Vitamin K (phylloquinone)","derivation":"NONE","group":"Vitamins","unit":"µg","value":"2.4","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"3.2"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"5.9"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"2.7"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.7"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.4"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.7"}]},{"nutrient_id":"606","name":"Fatty acids, total saturated","derivation":"NC","group":"Lipids","unit":"g","value":"18.867","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"24.904"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"46.035"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"21.320"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"5.349"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"3.207"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"5.283"}]},{"nutrient_id":"645","name":"Fatty acids, total monounsaturated","derivation":"NONE","group":"Lipids","unit":"g","value":"9.391","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"12.396"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"22.914"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"10.612"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"2.662"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"1.596"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"2.629"}]},{"nutrient_id":"646","name":"Fatty acids, total polyunsaturated","derivation":"NONE","group":"Lipids","unit":"g","value":"0.942","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"1.243"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"2.298"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"1.064"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0.267"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0.160"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0.264"}]},{"nutrient_id":"601","name":"Cholesterol","derivation":"NONE","group":"Lipids","unit":"mg","value":"99","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"131"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"242"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"112"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"28"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"17"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"28"}]},{"nutrient_id":"262","name":"Caffeine","derivation":"NONE","group":"Other","unit":"mg","value":"0","measures":[{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"0"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"0"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"0"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"0"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"0"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"0"}]}]
             * footnotes : []
             */

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
                /**
                 * nutrient_id : 255
                 * name : Water
                 * derivation : NONE
                 * group : Proximates
                 * unit : g
                 * value : 36.75
                 * measures : [{"label":"cup, diced","eqv":132,"eunit":"g","qty":1,"value":"48.51"},{"label":"cup, melted","eqv":244,"eunit":"g","qty":1,"value":"89.67"},{"label":"cup, shredded","eqv":113,"eunit":"g","qty":1,"value":"41.53"},{"label":"oz","eqv":28.35,"eunit":"g","qty":1,"value":"10.42"},{"label":"cubic inch","eqv":17,"eunit":"g","qty":1,"value":"6.25"},{"label":"slice (1 oz)","eqv":28,"eunit":"g","qty":1,"value":"10.29"}]
                 */

                private String nutrient_id;
                private String name;
                private String derivation;
                private String group;
                private String unit;
                private String value;
                private List<MeasuresBean> measures;

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

                public List<MeasuresBean> getMeasures() {
                    return measures;
                }

                public void setMeasures(List<MeasuresBean> measures) {
                    this.measures = measures;
                }

                public static class MeasuresBean {
                    /**
                     * label : cup, diced
                     * eqv : 132
                     * eunit : g
                     * qty : 1
                     * value : 48.51
                     */

                    private String label;
                    private int eqv;
                    private String eunit;
                    private int qty;
                    private String value;

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }

                    public int getEqv() {
                        return eqv;
                    }

                    public void setEqv(int eqv) {
                        this.eqv = eqv;
                    }

                    public String getEunit() {
                        return eunit;
                    }

                    public void setEunit(String eunit) {
                        this.eunit = eunit;
                    }

                    public int getQty() {
                        return qty;
                    }

                    public void setQty(int qty) {
                        this.qty = qty;
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
}
