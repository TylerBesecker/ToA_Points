package com.tuna.toa;

public enum ToARegions
{

  MAIN_AREA(14160),
  CHEST_ROOM(14672),
  PUZZLE_MONKEY(15186),
  PUZZLE_CRONDIS(15698),
  PUZZLE_SCABARAS(14162),
  PUZZLE_HET(14674),
  BOSS_BABA(15188),
  BOSS_ZEBAK(15700),
  BOSS_KEPHRI(14164),
  BOSS_AKKHA(14676),
  BOSS_WARDEN(15184),
  BOSS_WARDEN_FINAL(15696);

  
    public final int regionID;
    private static final Map<int, ToARegions> REGION_MAP = new HashMap<>();
    
    static {
        for (ToARegions e: values()) {
            REGION_MAP.put(e.regionID, e);
        }
    }

    public static ToARegions fromRegionID(int regionID) {
        return REGION_MAP.get(regionID);
    }
  
}
