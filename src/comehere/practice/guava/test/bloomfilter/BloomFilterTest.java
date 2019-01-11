package comehere.practice.guava.test.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @author sortinn
 * @create 2018.11.26 9:28 AM
 * @description Guava布隆过滤测试
 **/
public class BloomFilterTest {


    public static void main(String[] args) {
        BloomFilter bloomFilter = BloomFilter.create(Funnels.integerFunnel(),
                10000000, 0.01);

        long start = System.nanoTime();

        for (int i = 0; i < 10000000; i++) {
            bloomFilter.put(i);
        }

        System.out.println(bloomFilter.mightContain(3));
        System.out.println(bloomFilter.mightContain(35));
        System.out.println(bloomFilter.mightContain(366));
        System.out.println(bloomFilter.mightContain(-1));
        System.out.println(bloomFilter.mightContain(10000000));

        System.out.println("执行时间：" + (System.nanoTime() - start) / 1000000000 + " s ");
    }
}
