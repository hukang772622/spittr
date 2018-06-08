package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/5/22.
 */
@Component
public class SpittleRepositoryImpl implements SpittleRepository {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        Spittle s1 = new Spittle("111", new Date());
        Spittle s2 = new Spittle("222", new Date());
        List<Spittle> spittles = new ArrayList<>();
        spittles.add(s1);
        spittles.add(s2);
        return spittles;
    }
    @Override
    public Spittle findOne(long spittleId) {
//        Spittle spittle = new Spittle("成功", new Date());
        return null;
    }
}
