package com.luna.ce.module.classes;

import com.luna.ce.manager.ManagerModule;
import com.luna.ce.module.EnumModuleType;
import com.luna.ce.module.Module;
import com.luna.ce.util.gl.GuiUtils;
import com.luna.lib.annotations.reflection.loading.Experimental;
import com.luna.lib.annotations.reflection.loading.Loadable;

@Loadable
@Experimental
public class ModuleArrayList extends Module {

    public ModuleArrayList() {
        super("ArrayList", "Draws a list of enabled modules on-screen", EnumModuleType.MISC);
    }

    @Override
    public void onWorldRender() {
    }

    @Override
    public void onWorldTick() {
    }

    @Override
    public void onGuiRender() {
        int offset = -getFontRenderer().FONT_HEIGHT + 2;
        if (!getGameSettings().showDebugInfo) {
            for (final Module e : ManagerModule.getInstance().getModules()) {
                if (e.equals(this)) {
                    continue;
                }
                if (e.getActive()) {
                    getFontRenderer().drawStringWithShadow(e.getName(),
                            GuiUtils.getWidth() - getFontRenderer().getStringWidth(e.getName()) - 2,
                            offset += getFontRenderer().FONT_HEIGHT + 1, e.getType().getColor());
                }
            }
        }
    }
}
