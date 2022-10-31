package com.tuna.toa;

public enum ToANpc
{

HET_OBELISK(11707),

ZEBAK(11730),
ZEBAK_ENRAGED(11732),
WARDEN_CORE(11770),
WARDEN_OBELISK(11751),
WARDEN_TUMEKEN_INACTIVE_P1(11749),
WARDEN_TUMEKEN_INACTIVE_P2(11758),
WARDEN_TUMEKEN_INACTIVE_P3(11760),
WARDEN_TUMEKEN_RANGE(11756),
WARDEN_TUMEKEN_MAGE(11757),
WARDEN_TUMEKEN_FINAL(11762),
WARDEN_ELIDINIS_INACTIVE_P1(11748),
WARDEN_ELIDINIS_INACTIVE_P2(11755),
WARDEN_ELIDINIS_INACTIVE_P3(11759),
WARDEN_ELIDINIS_MAGE(11753),
WARDEN_ELIDINIS_RANGE(11754),
WARDEN_ELIDINIS_FINAL(11761),
BABOON_BRAWLER(11709),
BABOON_THROWER(11710),
BABOON_MAGE(11711),
BABOON_SHAMAN(11715),
BABOON_THRALL(11718),
BABOON_CURSED(11717),
BABOON_VOLATILE(11716),
BABA(11778),
BOULDER(11783),
SCARAB_ARCANE(11726),
SCARAB_SPITTING(11725),
SCARAB_SOLDIER(11724);


  
    public final int ToANpc;
    private static final Map<int, ToANpc> TOA_NPC_MAP = new HashMap<>();
    
    static {
        for (ToANpc e: values()) {
            REGION_MAP.put(e.ToANpc, e);
        }
    }

    public static ToANpc valueOfLabel(int regionID) {
        return TOA_NPC_MAP.get(ToANpc);
    }
  
}
