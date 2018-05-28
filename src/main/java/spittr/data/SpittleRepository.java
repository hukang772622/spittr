package spittr.data;

import spittr.Spittle;
import java.util.List;

/**
 * Created by Administrator on 2018/5/22.
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);
}
