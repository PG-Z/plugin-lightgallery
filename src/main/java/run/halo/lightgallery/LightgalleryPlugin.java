package run.halo.lightgallery;

import org.pf4j.PluginWrapper;
import org.springframework.stereotype.Component;
import run.halo.app.plugin.BasePlugin;

/**
 * @author guqing
 * @since 2.0.0
 */
@Component
public class LightgalleryPlugin extends BasePlugin {

    public LightgalleryPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }
}
