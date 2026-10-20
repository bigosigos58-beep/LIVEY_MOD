package com.livey;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LiveyMod implements ModInitializer {
    public static final String MOD_ID = "livey_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("LIVEY_MOD v1.3.2 zaladowany!");
    }
}