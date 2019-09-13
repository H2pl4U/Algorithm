package mianshi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * 题目描述：
为了激励更多的用户发表点评，大众点评在近期组织了一次促评排行榜的活动。在活动期间, 写评价数排名靠前的用户将获得对应的奖励，奖励分为积分、优惠券、贡献值三类。为了让活动更有趣味性，不同排名的用户将获得不同类型的激励。同时，为了保证激励发放效率，这三类激励会并行发放。

我们把问题简单描述一下，假定有一个激励发放的类，如下所示：

class ReviewEncourage {

  public ReviewEncourage(int n) { ... }      // 构造函数,n为中奖用户数

    PrizePool类仅有一个send方法，实现如下：

    public class PrizePool {

        public void send(String input) {

            System.out.print(input);

        }

    }


  public void bonus(PrizePool prizePool) { ... }  // 仅能打印A，表示发放积分

  public void coupon(PrizePool prizePool) { ... }  // 仅能打印B，表示发放优惠券

  public void contribution(PrizePool prizePool) { ... }  // 仅能打印C，表示发放贡献值

}

同一个ReviewEncourage实例将会传递给三个不同的线程用于激励发放：

1.积分发放线程将会调用bonus方法发放积分

2.优惠券发放线程将会调用coupon方法发放优惠券

3.贡献值发放线程将会调用contribution方法发放贡献值

要求依次对不同排位的用户发放不同类型的奖励，其中排位为奇数的用户发放积分，排位为偶数的用户交替发放优惠券和贡献值。

例如一共5个中奖用户，要求对第一个用户发放积分，第二个用户发放优惠券，第三个用户发放积分，第四个用户发放贡献值，第五个用户发放积分，即输出ABACA

要求补全以上代码，输出指定字符串序列

输入
获奖用户数n，n大于0，小于等于100

输出
由A、B、C组成的字符串，长度为n，奇数位为A，偶数位交替为B和C

提示: 三个激励发放线程异步执行，不保证执行顺序


样例输入
1
样例输出
A

提示
输入样例2
4
输出样例2
ABAC

输入样例3
5
输出样例3
ABACA
输入样例4
10
输出样例4
ABACABACAB
 */

public class 美团笔试编程2 {

	public static void main(String[] args) {
		

	}

	

}
