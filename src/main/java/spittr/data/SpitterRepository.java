package spittr.data;

import spittr.Spitter;

/**
 * Created by Administrator on 2018/5/24.
 */
public interface SpitterRepository {
    
    void save(Spitter spitter);

    Spitter findByUsername(String username);
}
