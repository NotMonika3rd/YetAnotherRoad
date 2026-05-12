Items.TOTEM_OF_UNDYING.setMaxStackSize(64)
var sbr = [item('ebwizardry:magic_wand'),item('ebwizardry:novice_ice_wand'),item('ebwizardry:novice_lightning_wand'),item('ebwizardry:novice_necromancy_wand'),item('ebwizardry:novice_earth_wand'),item('ebwizardry:novice_sorcery_wand'),item('ebwizardry:novice_healing_wand')]
for (r in sbr) {
    crafting.removeByOutput(r);
}
crafting.removeByOutput(item('choco:pickaxe_chocolate'))
