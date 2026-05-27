package data.scripts.world;

import com.fs.starfarer.api.PluginPick;
import com.fs.starfarer.api.campaign.*;

import java.util.Objects;

public class SEEKER_CampaignPlugin extends BaseCampaignPlugin {
    @Override
    public String getId() {
        return "SEEKER_CampaignPlugin";
    }

    @Override
    public boolean isTransient() {
        return true;
    }

    @Override
    public PluginPick<BattleCreationPlugin> pickBattleCreationPlugin(SectorEntityToken opponent) {
        FactionAPI faction = opponent.getFaction();

        if (Objects.equals(faction.getId(), "plague")) {
            return new PluginPick<BattleCreationPlugin>(new PlagueBattleCreationPlugin(), PickPriority.MOD_SET);
        } else {
            return super.pickBattleCreationPlugin(opponent);
        }
    }
}