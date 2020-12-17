package io.github.strikerrocker;

import com.sun.org.apache.xpath.internal.operations.Mod;
import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;

public class ModMenuCompat implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent-> AutoConfig.getConfigScreen(ModConfig.class,parent).get();
    }
}