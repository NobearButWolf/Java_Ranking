package tanbo.wu.data.Rank;

import java.util.*;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现计算数字出现频率的功能
 * @Date: 2019/11/13
 * @Modified By:2017110342_吴谭波
 */
class FrequencyCalculator {
    private Map<Integer,Integer>  numMap = new HashMap<>();

    Map<Integer, Integer> getNumMap() {
        return numMap;
    }

    /**
     * 添加一个整数
     */
    void add(int num){
        if (numMap.get(num) == null){
            numMap.put(num,1);
        }
        else{
            int count = numMap.get(num);
            count++;
            numMap.put(num,count);
        }
    }

    /**
     * 添加多个整数
     */
    void add(int[] nums){
        for (int num : nums) {
            this.add(num);
        }
    }

    /**
     * 返回出现频率最高的三个数字
     */
    List<Map<Integer,Integer>> getHighest(){
        if (numMap.size() == 0){
            try {
                throw new NoNumberException();
            } catch (NoNumberException e){
                System.out.println("没有整数可以排序!");
            }
        }

        List<Map.Entry<Integer,Integer>> rankList = new ArrayList<>(numMap.entrySet());
        rankList.sort(Comparator.comparing(Map.Entry::getValue));

        List<Map<Integer,Integer>> returnList = new ArrayList<>();
        Map<Integer,Integer> returnMap = new HashMap<>();
        for(Map.Entry<Integer,Integer> searchMap:rankList){
            returnMap.put(searchMap.getKey(),searchMap.getValue());
            if(returnMap.size() == 3){
                break;
            }
        }
        returnList.add(returnMap);

        return returnList;
    }

    /**
     * 返回出现频率最低的三个数字
     */
    List<Map<Integer,Integer>> getLowest(){
        if (numMap.size() == 0){
            try {
                throw new NoNumberException();
            } catch (NoNumberException e){
                System.out.println("没有整数可以排序!");
            }
        }

        List<Map.Entry<Integer,Integer>> rankList = new ArrayList<>(numMap.entrySet());
        rankList.sort(Comparator.comparing(Map.Entry::getValue));

        List<Map<Integer,Integer>> returnList = new ArrayList<>();
        Map<Integer,Integer> returnMap = new HashMap<>();
        for(Map.Entry<Integer,Integer> searchMap:rankList){
            returnMap.put(searchMap.getKey(),searchMap.getValue());
            if(returnMap.size() == 3){
                break;
            }
        }
        returnList.add(returnMap);

        return returnList;
    }

    /**
     * 清除所有添加的整数
     */
    void clearAll(){
        numMap.clear();
    }
}
