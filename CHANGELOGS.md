SEEKER

0.65
  - The ClearCommands mod no longer removes fleets spawned at the start of the game. (Requires a new game to take effect)

0.64
  - Version checker now links to the new git repo. Thus, auto-update support is now present.
  - Edited bounties to avoid job_show_distance being "vague"
  - Fix staged bounties showing up when they shouldn't
  - Changed rarity of plague weapons and wings so random autofitted plague fleets actually use plague weapons.
  - Roughly aligned the siegfried's flux torpedoes

0.63
  - Edited the terrible (tactical laser + integrated point defense) combo on several ships. Either by removing the IPDA, or replacing the tach lasers with LRPD.
  - Added no_dealer to relevant hulls: All Exotics, Titanic, Blitzkrieg, and Demeter.
  - Placed old guardian ship files into "old" directory under hulls, to avoid the error that it's missing in ship_data.csv in the logs.
  - Changed description of Demeter's farm hullmod, hopefully making it more clear where it does and doesn't work.
  - Changed Demeter's farm hullmod to not work for planet's with mild climates.

0.62
  - Added codex_unlockable tags to relevant ships and hullmods. Now you can discover and see new ships in the codex.
  - Possibly fix only marksman ships showing up when on a nexerelin new game, and clicking "Random" on the "Grand Fleet" option.
  - Also possibly fix marksman doomstacks. Related to previous issue.

0.61
  - Tweaked faction variant doctrine values again
  - Removed relationship requirements for every bounty.
  - Prevent bounties from showing up if related custom start is used.
  - Fixed pirate halligan/adze having an extra engine on when using their burn system
  - Gave pirates access to more ships

0.6
  - Seeker exploration content now generates mid save
  - Boss fleets set to MemFlags.FLEET_FIGHT_TO_THE_LAST, so that they don't try to retreat, in case they did.

0.510
  - Improved voulgeStart planet finding logic for the inital colony placement.

0.59
 - Compiled using java 17
 - Fixed pre-existing bounties such as the safeguard and rampage.
 - Adjusted hull availability across multiple factions with the intent to reduce consistency in individual ship presence, but ideally increase overall variety. More like a splash of occasional spice, instead of ever present or not present at all.
 - Adjusted mount on the voulge to be aligned
 - Fix invincibility issue on bosses if a ship is under them when they warp in
 - Redhand start again prevents red hand bounty from showing up.
 - Voulge custom start now shows nexerelin starting bonuses ui for the colony.
 - Voulge custom start now removes debt from the initial time pass.
 - Pre existing bounties now show up in the MagicLib bounty board. (need magiclib version 1.5.7 or above)
 - Fixed crash on game load, where every fleet's flagship name is read, and thus crashes if a fleet for some reason doesn't have a flagship.

0.57M
 - Attempt to fix Rampage teleporting out at 0% hull by tweaking  SKR_warpDriveEffect.java, changed retreat warp out effect to consider if ship is alive. Alternative fix is waiting, just commented out of this does not work(alternative fix thanks to JamesTripleQ).
 - Attempt to fix Cataclysm invulnerable modules, gave each module a unique ship, variant, and graphics file(thanks JamesTripleQ)
 - Fix missing _ on Red Hand start that caused player to start with a Nebula instead of a Falcon

0.56M
 - Recompiled all java scripts, fixed deprecated magiclib import calls and methods(4 addTrailMemberAdvanced methods are unupdated since I have no idea on what to update them to).
 - Fixed Seeker ship hulls dominating the factions.

0.53

 - Added 3 new Nexerelin custom starts:
   . Mulligan!
   . Break-up Hanghover 
   . A Knight's Tale

 - Fixed boss bounties not showing up
 - Fixed missing Siegfried description
 - Added missing limited descriptions for the bosses

 - Guru: 850 armor (+150), 7000 hull (-1000), 550 dissipation (+150)   
 - Devotee: 6 DP (+2)
 - Believer: Built-in ECCM and Expanded Missile Racks.
 - Cultist: Plasma Jets instead of Maneuvering Jets, 400 armor (+100)
 - Haymaker: hit feedback improved, 6 ammo (+2), 0 EMP (-400), 250 sustained DPS (+94)
 - Eager: hit feedback improved

[RC2] 
 - Fixed crash related to the bosses' loot generation,
 - Fixed issue with Rampage not deploying,
 - Fixed issues related to the bosses' spawn locations,
 - Fixed issue with Plague-bearer wings not launching,
 - Fixed the Reality Drill script not being applied.

BALANCING:
 - Minor and major tweaks to the Umpire Beam and Whiplash Blaster.
 - Augur-class EMP Discharge system cooldown halved down to 8s.
 - Hedone-class Time Splitter system CR cost doubled to 2% per use.

BUGFIXES/IMPROVEMENTS:
 - Fixed an issue with the Balisong system.
 - Fixed Tumbleweed's Drone system missing a description.
 - The Titanic wreck should spawn further away from blackholes.
 - BOSSES:
   . Clarified some special items descriptions,
   . Lots of improvements and fine-tuning,
   . Double wreck drops should hopefully no longer happen,
   . Added more ways to get pointed in the right directions,
   . Broke the monolithic fleets in multiple smaller ones,
   . Changed the final boss' ship system,
   . All bosses ships have exceedingly slow post battle repairs. Go at them a second time if the first assault failed without losing your "progress",
   . Boss bounties now have a 10 years deadline,
   . More goodies in salvage!
 - Plague-Bearer LCPs can no longer be mounted on non Plague-Bearer ships, removed the Quarantined Flight Deck hullmod.
 - Proofreading...

0.51

[RC2] Fixed most (all?) crashes related to the "Lucky Strike" Nexerelin start.

NEW CONTENT:
 - Added 6 new special bounties that point towards exploration-based content (if you have yet to find it after a certain amount of time).
 - Added 2 new Nexerelin custom starts to twist the formula a bit.

BUGFIXES/IMPROVEMENTS:
 - 557-class: Fixed system not applying the main gun extra ammo properly.
 - Improved armor grid of the Halligan and the other gunships. They are now also displayed "naked" in refit.
 - All the rare-but-not-unique bounties now have much spicier loadouts.
 - All bounty captains now have better suited skills.
 - Many ship descriptions got a much needed polish pass.
 - Made all the plague-bearer encounters approximatively 267% audio-visually more impressive.


0.50

NEW CONTENT:

 - Added 13 special bounties to hunt the unique ships. Those no longer appear in random fleets.
 - Added 10 early-to-mid-game bounties giving access to rare ships if you are up to the challenge.
 - Plague-bearers:
   . Now spawn in random systems. 
   . Will aggressively hunt the player once attacked.
   . Drop some *very* compelling new rewards.
   . Now has a custom musical theme, composed by Mesotronik, and made possible by the donations from all my generous patrons.

BALANCING:

 - Augur-class frigate: 
   . Added one small missile hardpoint to improve the ship's behavior and its use of the system,
   . EMP Discharge system cooldown raised to 15s from 10,
   . Shield efficiency improved to 0.6 from 0.7,
   . OP amount raised to 50 from 40.

 - Endymion-class frigate:
   . Hull and armor raised to 2250/200 from 1000/100,
   . Flux dissipation raised to 350 from 275,
   . Small hardpoints now UNIVERSAL from MISSILE,
   . OP amount raised to 70 from 60.
   > The Hyperion got such a huge jump in power in 0.95! 

 - Hedone-class: 
   . Time Splitter system default time acceleration reduced to x10 from x16,
   . Time Splitter time acceleration raised to x15 with the System Expertise skill,
   . OP available raised to 50 from 45.
   > The Hedone should still be amazing while it lasts, but also a smidgen more versatile now

 - Marksman-class:
   . Perfect reloads now triples the damage of the next shot instead of doubling it.
   . Reload system tweaked to behave better with high level officers.
   . Reload system gets much easier to use with the System Expertise skill.
   . Hull and armor raised to 7000/750 from 5000/500.
   > The ship was a bit underwhelming for its fragility so this should fix that.

 - 557-class:
   . Flux dissipation increased to 600 from 400.
   . Redline ship-system no longer generates flux on activation.
   > While somewhat fun, it was difficult to let the main gun rip given how flux starved the ship was 

 - Bullhorn-class: Booster system now gains charges from the System Expertise skill instead of the Expanded Ammo Racks hullmod.

 - Tumbleweed-class:
   . Medium turret is now UNIVERSAL from HYBRID (to avoid some possible weapon type issues when restoring the pirate variant into a regular Tumbleweed)
   . Drone system now now has 2 charges from 8,
   . Now gets one additional drone every 20s.
   > Mostly cleanup for odd behaviors.

 - Balisong-class:
   . System charging no longer affects the engines performances (it still dramatically lowers the firepower)
   . System charging is now significantly faster with the System Expertise skill.
   . Shield is now a bubble front shield at 0.7 efficiency, from a omni 180deg shield at 0.8 efficiency.
   > That last change should hopefully fix most of the issues with modules getting shot off through shields.

 - Clipper-class: Missile Fab system now generates ammo faster with the System Expertise skill.

 - Quicksilver-class:
   . A few mounts are now UNIVERSAL from ENERGY and SYNERGY.
   . Denial Pulse system range lowered to 1200 from 2000, but respects the x2 System Expertise skill bonus.
   . Overload duration now scales with hull sizes. Unchanged at 3s for frigates, up to 6s for a capital ship.
   . Charge up slightly shortened.
   > The pulse effect was a bit anemic compared to how grandiose it is visually.

 - Siegfried-class dreadnought:
   . Now uses a hullmod-swap system to change the configuration of the hull rather than three different hulls.
   . Choose between ATC plus High Maintenance or a true shield,
   . two flight decks plus a Burn Drive system on toggle or the Flux Torpedoes system, 
   . two built-in Firecane turrets or a broadsider configuration with four additional large slots plus HBI.
   > The system is currently a bit jank and is most likely to be replaced by a proper paid-for dry-dock reconfiguration at some point. But given that it is now a unique ship, this will have to do for the moment.

 - Titanic-class: Now has Advanced Ground Support.

 - Erasmus-class wing:
   . Rocket pod ammo reduced to 10 from 15,
   . Fire-rate increased to 240 rpm from 45,
   . Minor tweaks to make it more usable by the AI.
   > This wing should now properly operate like bombers.

 - Gatling Lance weapon:
   . Flux requirement lowered to 480 from 600.
   . Now causes Strong Interferences instead of Mild.
   > Using two of them will cause a 160 flux dissipation reduction from interferences, meaning you are still 80 dissipation ahead from before when firing. A more interesting proposition imo...

 - Plague-Bearers:
   . Assortment of buffs to some weapons, and slight nerfs to some of the ships.


BUGFIXES/IMPROVEMENTS:
 - Avatar of Vengeance Nexerelin start is restored.
 - Fixed White-dwarf's inverted guns and their modules.
 - Plague weapons and LCPs should no longer drop from research stations.
 - Fixed NPE with the Marksman-class system under AI control.
 - Fixed NPE with the Augur-class system.
 - Fixed mission crash due to missing background.
 - Fixed Demeter-class generating revenue while mothballed.
 - Kaleidoscope will ignore flares if IPDAI is installed.

0.42

Barebone compatibility update for 0.95a

0.41
BALANCING:
 - Quicksilver-class: increased OP amount to 230 from 200.

0.409

BALANCING:
 - Most non-missile "Plagued" weapons received small buffs. 
 - Butterfly-class:
   . OP reduced to 55 from 60,
   . Now has built-in Missile Racks, and Expanded Magazines. 
 - Marksman-class:
   . Shield arc widened to 180 deg from 120,
   . Shield upkeep lowered to 0.4 from 0.5,
   . Shield efficiency improved to 0.9 from 1.0.

BUGFIXES/IMPROVEMENTS:
 - Moved all settings to the modSettings.json file and modFiles folder.


0.408
BUGFIXES/IMPROVEMENTS:
 - Fixed Malet-class cost typo.
 - Fixed Halligan (P) not restored into its regular version.
 - Fixed some weapon render order issues.
 - Made the Minigun turret sprite slightly thinner.
 - Made the Bullhorn's medium covers slightly larger.
 - Fixed outdated Five-Five-Seven's Redline system description.

0.407

NEW CONTENT:
 - Augur-class support frigate:
   . Assault focused Omen,
   . Same weapons but the EMP system mostly hits a single target within a very short span of time.

 - Endymion-class assault frigate:
   . DPS focused Hyperion,
   . Same weapons but the ship system has been swapped for a Temporal Shell device.
   . Yes, this is insane, and that ship will be a unique one in the future.

 - Malet-class frigate:
   . Tougher and better armed than a Lasher,
   . But also slower.

 - Adze-class destroyer:
   . A mix of an Enforcer and a Hammerhead, 
   . More maneuverable than either,
   . Not quite as durable as the former,
   . Can't output the same DPS spikes as the latter.

 - Halligan-class cruiser:
   . Heavier Eagle,
   . Can't outmaneuver its target as well,
   . Much better armored.

 - "Minigun" support weapon:
   . Very long range fragmentation pea shooter,
   . Won't kill much of anything,
   . But it will force the enemy to raise their shield, lowering their top speed. 

BALANCING:
 - 557-class:
   . System no longer reduces speed but cost flux to activate. (I swear I will make that ship fun to fly somehow)
 - More tweaks to the hidden stuff!

BUGFIXES/IMPROVEMENTS:
 - Space farm now displays the daily revenue from auctioning produce.
 - Lowered the frequency of some rare ships.
 - Attempted another fix for the Marksman system crash in rare circumstances.
 - Nova is now a unique "boss-like" fleet patrolling a remnant system.
 - Onyx is now a unique derelict that has to be found and salvaged.

0.406

BALANCING:
 - Onyx-class:
   . Sprite rework,
   . Built-in weapons removed,
   . Loadout buffed,
   . System now scales with the flux level, has less charges but much longer duration.

 - 557-class:
   . System no longer affects flux stats but improves maneuverability (still increase ballistic ROF and loads the main gun with extra ammo)
   . Asteismos gun now has only 2/3rd of the ammo, but 1.5 times the damage per shell.

 - Various buffs to most of the bosses, more content, polish, locations further randomized.

BUGFIXES/IMPROVEMENTS:

 - Set some "SYSTEM" weapons such as flares to "HIDDEN" so that they don't get disabled by EMP arcs. 
 - Set all 557-class variants as Goal variants so that they can be selected in refit.
 - Fixed a CTD with the Marksman's system when used while in autopilot as the player ship.


0.405 (2020/11/18)

NEW CONTENT:
 - 557-class bounty-hunter destroyer:
   . Flashy coat of paint,
   . Big gun that makes a big noise,
   . Daredevil attitude,
   . Bad-ass in every way.
 - Four bosses:
   . They have quite a spirited composure,
   . Facing them unprepared will incur significant emotional events,
   . But defeating them is the only way to snatch a few legendary weapons and fighter LPCs.

BALANCING:
 - Bullhorn-class: ammo hull-mods affect the ship system's charges.
 - Demeter-class: 
   . Spaceborne Farm hull-mod effect floor raised to only generate revenue from colonies size 5 and up from 3 and up,
   . Spaceborne Farm hull-mod revenue per population level has been raised by 1000% and un-capped.
 - Titanic-class: Now has the Ground Support built-in hull-mod.
 - Dawn-class: 
   . Reworked sprite, new weapon mounts,
   . OP raised to 280 from 230.
 - Marksman: Flux dissipation raised to 350 from 300.
 - Voulge/Gawon:
   . Reworked sprite, new weapon mounts (more mediums, fewer smalls),
   . OP raised to 260/275 from 230/200.
 - Quicksilver: Denial Pulse system significantly buffed.

 - Sunburst mine-layer: 
   . Mine damage increased to 500 dmg from 300,
   . Duration increased to 20s from 10,
   . Mines now creeps toward their target.
 - Glare beam:
   . Damage per burst increased to 2000 from 1500 dmg,
   . Armor penetration halved.
 - MODS: missile hitpoints raised to 500 from 300. 
 - Reality Drill:
   . Range increased to 900 from 700,
   . Charge-up improved to 0.66s from 2,
   . Projectile speed raised to 300su/s from 100.
   . Damage along path increased.
 - Gawk:
   . DPS increased to 1000 from 750,
   . Flux efficency raised to 0.75 from 1.5.
 - Gatling Lance:
   . DPS increased to 600 from 550.
   . Accuracy slightly increased in turret mounts, significantly increased in hard-points, and can be affected by skills and hull-mods reducing recoil.

2020/04/??

Removed all content that has been ported to Torchships And Deadly Armaments. (yes that will break saves)

BALANCING:
 -  Butterfly:
   . Built-in weapons replaced by Revolver Pulse Lances (very high damage very short duration beams with charges)

 - Voulge/Gawon:
   . OP amount raised by 10/30.
   . Middle medium turrets changed to large hardpoints.
   . System charge regeneration slowed by 25%.
   . Gawon rear mediums arc tweaked.

 - Glare:
   . Push-back effect now a slow down effect.
   . Damage output slightly increased.
   . Interference rating lowered to Mild from Strong.

 - Onyx:
   . Reduced flux dissipation to 900 from 1500.
   . Ship system now has a more pronounced effect for a much shorter duration (overall half as effective).
   . PPT increased by 120s.

 - Gatling Lance:
   . Range increased to 1250 from 1000.
   . Interference rating lowered to Mild from Strong.

 - Nova:
   . Added two rearward medium turrets. 
   . Added weak shield to the tail module.

BUGFIXES/IMPROVEMENTS:
 - Externalized all compiled strings to help translators.

2020/02/02

DELISTED content ported to Torchships And Deadly Armaments

CONTENT:
 - Added Bullhorn-class assault cruiser:
   . Brickity bwoocky, she's comin' for that bounty.

2019/08/10

BALANCING:
 - Marksman-class destroyer buffs to armor and speed, nerf to turn rate
 - Voulge-class battlecruiser significant OP buff.

BUGFIXES/IMPROVEMENTS:
 - Fixed variant and faction files issues that prevented both the Voulge and Gawon from spawning.
 - Halved the power of the Hedone ship system to prevent some issues with AI controlled ships.
 - Hopefully fixed the ship with modules retreat bug.

2019/08/04

CONTENT:

 - Added Marksman-class destroyer:
   . Nimble but packs a punch.
   . Has a manual reload system, Synthetic/Gears of War style.
   . Do not get flanked though.
   . DO NOT GET FLANKED.

2019/07/12

CONTENT:

 - Added Voulge-class battlecruiser:
   . Not-crazy original version of the Gawon-class.
   . No built-in Gawk beam, large turret emplacement instead.
   . Arcs slightly tweaked for the worse compared to the Gawon-class.

BALANCING:
 - Big "campaign-side" balancing pass (it was quite off after all the combat adjustments):
   . Lots of small buffs to deployment costs, cargos, PPTs, etc.
   . A few significant nerfs too.
   . Some High Maintenance hullmods removed.
 - Small weapons adjustments for better generated variants.
 - Gawon-class battlecruiser:
   . Alcubiere Drive system charges regen halved.
   . Gawk range reduced to 600 from 750, flux per second increased to 1500 from 1000.
 - Attrition-class cruiser:
   . Removed large turret mount.
   . Added a small turret mount in place.
   . Added built-in ATC hullmod.
   . OP amount reduced to 160 from 175.


2019/06/28

 - [RC2] Avatar of Vengeance start:
   . Replaced Colossus (P) with Crane (P)
   . Added Phaeton-class and Buffalo (P)-class logistic ships to the fleet.
   . Removed Erratic Fuel Injector d-mod from the Red Hand.
   . Relations with the Independents raised to Suspicious from Inhospitable.
   . Massively increased the loot you get from the initial debris field.
   . Added "Your Hideout" abandoned station to stash your stuff.
   . Added some supplies to your hideout.

CONTENT:
 - Added Gawon-class battlecruiser. 
   . Swift on the battlefield,
   . Strong in dire situations,
   . Will pierce your eardrums if you get too close.
 - Added Akita missile launcher.
   . Long range fast and sturdy torpedoe.
   . As agile as a drunk truck driver on ice.
   . Also large as a barn.
 - Added "Avatar of Vengeance" custom Nexerelin start.

BALANCING:

 - High-Tide-class missile boat:
   . Removed shield.
   . Slightly lowered the Pilum Waves sustained fire-rate.
 - Pest (P) Chemical Torch:
   . Now High Explosive damage from Energy.
 - Ravager Model 3:
   . Shield instability effect increased by 25%.
   . Now causes a micro overload if the target's shield is shrunk to near 0. (only reliably done using two Ravagers or HEF)
 - Twin Burn Chamber system: 
   . No longer affects accelerations.
   . AI tweaked to be smarter about using the system.
 - Siegfried-class dreadnoughts:
   . Regular and ATC variant burn rate increased to 5 from 3.
   . Broadside variant burn rate increased to 6 from 5. OP amount increased to 300 from 275.
 - Quicksilver EMP Pulse: 
   . No longer overloads allies.
   . No longer pierce shields.
 - Clipper-class cruiser:
   . Missile Fabricator system now has 10s cooldown.
   . Deployment cost raised to 36 from 24, monthly maintenance unchanged.

BUGFIXES/IMPROVEMENTS:
 - Demeter-class space farm now generates some revenue while in an inhabited system with a bright star.
 - Added New Beginnings blacklists

2019/06/05

BALANCING:
 - Balisong Cruiser:
   . Removed built-in Bushwhacker.
   . Replaced two medium energy hardpoints. 
   . Removed Flight Deck.
   . Replaced by a rear facing small energy turret.
   . Removed PD weapon from the arm modules.
   . Added a potent PD drone system to the modules.
   . Pulse Overdrive built-in weapons range cut to 750 from 900.
   . Charges reduced to 16 from 24.
   . Overcharge system now keeps raising the Pulse weapons ammo even after reaching its maximum level when Expanded Magazines are installed.
   . Overcharge system now dramatically increases the ship's dissipation when released. 
   . Overcharge system now reduces both the hard and soft flux levels in the same proportion upon release instead of removing all soft flux entirely.
 - Butterfly's Revolvers:
   . Damage increased to 350 from 250.

BUGFIXES/IMPROVEMENTS:
 - Further reworked some ships frequency.

2019/05/23

BALANCING:
 - Costs adjusted for 0.9.1a.
 - Catalized Torch:
   . Damage per shot raised to 30 from 25.
   . Flux decreased to 10 from 20.
 - High-Tide Pilum Wave weapons:
   . Ammo reduced to 10 from 15.
   . Refire delay lowered to 8s from 13.
 - Clipper (D) now gets restored to the pristine variant.

BUGFIXES/IMPROVEMENTS:
 - Added MANY new Nexerelin starts.
 - Fixed ghost flight deck D-mod.

2019/04/08

 - Fixed skin-only Destroyed Fighter Gantry "D-mod" applied to other damaged ships 
 - Mining Pike flux per shot reduced to 350 from 600
 - Firecane fire-rate reduced to 20 rpm from 30 (750 dps from 1125)

RC whatever
 - Added Pest (P):
   . Has built-in Augmented Drive Field and Unstable Injectors for maximum insane speed
   . Equipped with a built-in "Catalyzed Chemical Torch" aka technobable space flamethrower
 - All bonus stats are now additive percentages changes rather than multiplicatives
 - Hull frequencies slightly adjusted
 - "Outsider tech":
   . Renamed "Exotic tech"
   . Several existing ships have been switched to that tech
 - Mining Pike rework:
   . Range reduced to 600 from 800
   . Secondary damage reduced to 200HE + 200frag (bypass shields) from 200HE + 200HE (bypass shields)
   . Proj speed reduced to 2000 su/s from 5000 su/s
   . Rods can now get lured away by flares or teared off by strong accelerations
   . OP reduced to 13 from 15
 - Urchin Supressor:
   . Flux efficency reduced to 0.33 from 0.25
 - Bully (regular):
   . Main weapon slot changed to a 30deg large turret instead of a 5deg hardpoint
 - Bully (P): 
   . Gets restored to the regular Bully hull
 - Bully (LP):
   . System changed to AAF instead of Missile Ready Racks
 - Missile Ready-Rack system:
   . Added a very slow regen (60s)
 - Bonnethead (P):
   . Added built-in unreliable subsystems (deployment cost raised accordingly)
   . Removed two front small turrets (OP adjusted accordingly)
 - Aethernium:
   . Sprite slightly recolored
   . Engine stats increased by 10 to 20%
 - Ravager MK3:
   . Flux efficiency improved to 1 f/dmg from 1.1f/dmg 
   . Aethernium's built-in set to 0.9f/dmg
   . Price set to 2500
 - Pest:
   . Deplyment cost / maintenance reduced to 3 supplies from 4
 - Owl:
   . Turn rate reduced to 12deg/sec from 15
 - Butterfly:
   . Engine stats lowered by 10-15%
 - Revolver Pulse Cannon:
   . Damage per shot reduced to 250 energy from 300, flux unchanged (now 1:1 ratio)
   . Range increased to 800 from 700
 - Tumbleweed (both)/Poison Ivy:
   . Weapon slot types shuffled around
 - Sensor Drones system:
   . Formation extended outside of the shield
   . Charges raised to 8 from 5
 - Tumbleweed (P):
   . Removed built-in High-Res Sensors and Surveying Equipment hullmods
   . Changed system to Flares instead of Sensor Drones.
 - Obelisk:
   . System changed to Fortress Shield from Phase Skimmer
   . Shield arc raised to 120deg from 90
   . Shield efficiency worsened to 0.8f/dmg from 0.6
 - Balisong:
   . AI forced to Reckless while in overcharge
   . Improved UI feedback for the system status
 - Niagara (all):
   . Hull points reduced to 19000 from 22500
 - Niagara (P):
   . Removed 2 medium missile slots
   . Removed 2 medium rearward turrets
   . Reduced OP to 260 from 300
   . Gets restored to regular Niagara hull
   . Paintjob slightly refined
 - Hightide:
   . Added to default midline blueprint package
 - Hightide (P):
   . Medium turret now Ballistic instead of Hybrid
   . Flight deck removed
   . OP reduced to 45 from 55
   . Gets restored to the regular Hightide hull
   . Paintjob slightly refined
 - Foray:
   . Added to default low tech blueprint package
 - Siegfried Regular
   . OP raised to 250 from 240
   . Removed 2 flight decks
   . Shield efficiency improved to 1f/dmg from 1.2
   . Improved UI feedback for the shield status 
 - Siegfried ATC
   . OP raised to 250 from 240
   . Added 2 flight decks
   . Flux dissipation raised to 1000 from 900
   . Improved UI feedback for the shield status 
 - Siegfried Broadsider
   . Added built-in ITU
   . Raised burn level to 5 from 3
 - Clipper (abandoned):
   . Renamed Clipper (D)
   . Flight deck number reduced to 1 from 2
   . OP reduced to 70 from 80
   . Gets restored to regular Clipper hull
 - Missile Autofab. system: 
   . Regenerates a small amount of hard flux while active
 - Crane:
   . Cargo capacity raised to 700 from 600
   . Fuel capacity reduced to 400 from 500
   . Deployment/maintenance cost reduced to 10 supplies from 15
 - Crane (P):
   . Cargo capacity reduced to 150 from 400
   . Fuel capacity reduced to 100 from 150
   . Crew capacity raised to 300 from 200
   . Added built-in Ground Support hullmod
   . Deployment/maintenance cost reduced to 15 supplies from 20
 - Owl:
   . Added second built-in Beak wing 
 - Cassowary:
   . Minor sprite adjustment
 - Reality Drill:
   . Removed a few effects as an attempt to limit fps drops
 - Dawn
   . Minor sprite adjustments
 - Onyx
   . Reworked sprite
   . Removed 2 small front turrets
   . Removed medium front Energy turret
   . Added 2 medium front Synergy turrets
   . Front small turrets type changed to Energy from Synergy
 - Retiarius/Fresnel:
   . Small sprite adjustments
 - Brillant X:
   . Sprite reworked to look more phase-ish
   . Hull points raised to 7500 from 7000
   . Armor lowered to 1100 from 1250
   . Speed raised to 80 from 75
   . System changed to High Energy Focus from Mine Strike
 - Scintilla X:
   . Sprite reworked to look more phase-ish
   . Speed raised to 90 from 80
   . System changed to EMP Emitter from Acausal Disruptor
 - Shine:
   . Downsized central hardpoint to Medium Synergy
   . OP reduced to 170 from 180
   . System changed to Plasma Jets from HEF


V0.2
"BACK TO THE START"

Minimal ship-pack release with non redacted content.

V0.1
05/06/2015

Initial prototype release

CONTENT
 - Three missions featuring the DCS Lookout Clipper-class Cruiser, the J.W. Gibbs Ubique-class Artifact and the Bone-Breaker Anomaly.
 - Clipper-class Cruiser after restoration
 - Erasmus-class bomber wing
