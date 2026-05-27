package data.scripts.world;

import com.fs.starfarer.api.combat.BattleCreationContext;
import com.fs.starfarer.api.impl.combat.BattleCreationPluginImpl;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;

class PlagueBattleCreationPlugin extends BattleCreationPluginImpl {

    @Override
    public void initBattle(BattleCreationContext context, MissionDefinitionAPI api) {
        super.initBattle(context, api);
        context.aiRetreatAllowed = false;
        context.fightToTheLast = true; // Should already be set but do it again.
    }
}