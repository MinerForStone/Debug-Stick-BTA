package minerforstone.debugstick;

import minerforstone.debugstick.item.DebugStick;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.tag.ItemTags;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class Main implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "debugstick";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("The stick is ready to debug!");
    }

	@Override
	public void beforeGameStart() {
		ItemHelper.createItem(MOD_ID, new DebugStick("debug_stick", 19000), "debug_stick.png").withTags(ItemTags.renderFullbright).setFull3D();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {

	}
}
