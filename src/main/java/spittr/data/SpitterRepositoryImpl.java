package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

/**
 * Created by Administrator on 2018/5/24.
 */
@Component
public class SpitterRepositoryImpl implements SpitterRepository {
    @Override
    public Spitter findByUsername(String username) {
        Spitter spitter = new Spitter();
        spitter.setFirstName("www");
        spitter.setLastName("aaa");
        spitter.setUsername(username);
        spitter.setPassword("1234");
        return spitter;
    }

    @Override
    public void save(Spitter spitter) {
        System.out.println(spitter.getFirstName() + "---" + spitter.getLastName() + "---" + spitter.getUsername() + "---" + spitter.getPassword());
    }
}
