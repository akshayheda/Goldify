public enum Department {
    ANTH("ANTH"),
    ART("ART"),
    ART_CS("ART CS"),
    ARTHI("ARTHI"),
    ARTST("ARTST"),
    AS_AM("AS AM"),
    ASTRO("ASTRO"),
    BIOL("BIOL"),
    BIOL_CS("BIO CS"),
    BMSE("BMSE"),
    BL_ST("BL ST"),
    CH_E("CH E"),
    CHEM_CS("CHEM CS"),
    CHEM("CHEM"),
    CH_ST("CH ST"),
    CHIN("CHIN"),
    CLASS("CLASS"),
    COMM("COMM"),
    C_LIT("C LIT"),
    CMPSC("CMPSC"),
    CMPSCCS("CPMSCCS"),
    CMPTG("CMPTG"),
    CMPTGCS("CMPTGCS"),
    CNCSP("CNSCP"),
    DANCE("DANCE"),
    DYNS("DYNS"),
    EARTH("EARTH"),
    EACS("EACS"),
    EEMB("EEMB"),
    ECON("ECON"),
    ED("ED"),
    ECE("ECE"),
    ENGR("ENGR"),
    ENGL("ENGL"),
    ESM("ESM"),
    ENV_S("ENV S"),
    ESS("ESS"),
    ES("ES"),
    FEMST("FEMST"),
    FAMST("FAMST"),
    FR("FR"),
    GEN_S("GEN S"),
    GEN_SCS("GEN SCS"),
    GEOG("GEOG"),
    GER("GER"),
    GPS("GPS"),
    GLOBL("GLOBL"),
    GREEK("GREEK"),
    HEB("HEB"),
    HIST("HIST"),
    INT("INT"),
    INT_CS("INT CS"),
    ITAL("ITAL"),
    JAPAN("JAPAN"),
    KOR("KOR"),
    LATIN("LATIN"),
    LAIS("LAIS"),
    LING("LING"),
    LIT("LIT"),
    LIT_CS("LIT CS"),
    MARSC("MARSC"),
    MATRL("MATRL"),
    MATH("MATH"),
    MATH_CS("MATH CS"),
    ME("ME"),
    MAT("MAT"),
    ME_ST("ME ST"),
    MES("MES"),
    MS("MS"),
    MCDB("MCDB"),
    MUS("MUS"),
    MUS_CS("MUS CS"),
    MUS_A("MUS A"),
    PHIL("PHIL"),
    PHYS("PHYS"),
    PHYS_CS("PHYS CS"),
    POL_S("POL S"),
    PORT("PORT"),
    PSY("PSY"),
    RG_ST("RG ST"),
    RENST("RENST"),
    RUSS("RUSS"),
    SLAV("SLAV"),
    SOC("SOC"),
    SPAN("SPAN"),
    SHS("SHS"),
    PSTAT("PSTAT"),
    TMP("TMP"),
    THTR("THTR"),
    WRIT("WRIT"),
    W_L("W&L"),
    W_L_CS("W&L CS")
    ;

    private String departmentCode;

    Department(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getCode() {
        return departmentCode;
    }

}
