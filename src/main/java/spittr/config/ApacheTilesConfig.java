package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * Created by Administrator on 2018/5/31.
 */
@Configuration
public class ApacheTilesConfig {

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tiles = new TilesConfigurer();
        tiles.setDefinitions(new String[] {"/WEB-INF/layout/tiles.xml"});
        tiles.setCheckRefresh(true);
        return tiles;
    }

    @Bean
    public ViewResolver viewResolver() {
        return new TilesViewResolver();
    }
}
