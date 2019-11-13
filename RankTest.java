package tanbo.wu.data.Rank;

/**
 * @Author:2017110342_吴谭波
 * @Description:实现测试功能
 * @Date: 2019/11/13
 * @Modified By:2017110342_吴谭波
 */
public class RankTest {
    public static void main(String[] args){
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator();

        //添加一个整数
        frequencyCalculator.add(1);
        frequencyCalculator.add(1);
        frequencyCalculator.add(4);
        frequencyCalculator.add(5);
        frequencyCalculator.add(5);
        frequencyCalculator.add(7);
        frequencyCalculator.add(7);
        frequencyCalculator.add(9);
        frequencyCalculator.add(2);

        //添加多个整数
        int[] nums = {1,1,4,5,5,7,7,9,2};
        frequencyCalculator.add(nums);

        //返回频率最高的三个数字
        System.out.println("出现频率最高的三个数字:"+ frequencyCalculator.getHighest());

        //返回频率最高的三个数字
        System.out.println("出现频率最低的三个数字:"+ frequencyCalculator.getLowest());

        //清空所有整数
        System.out.println("清空之前大小为:"+ frequencyCalculator.getNumMap().size());
        frequencyCalculator.clearAll();
        System.out.println("清空之后大小为:"+ frequencyCalculator.getNumMap().size());
    }
}
