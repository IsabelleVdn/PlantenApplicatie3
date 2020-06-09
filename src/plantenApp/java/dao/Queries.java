package plantenApp.java.dao;

public interface Queries {
    //region GETBYID
    String GETPLANTBYID =
            "SELECT * FROM plant WHERE plant_id = ?";
    String GETPLANTSBYIDS =
            "SELECT * FROM plant WHERE plant_id IN ?";

    String GETFENOTYPEBYPLANTID =
            "SELECT * FROM fenotype WHERE plant_id = ?";
    String GETFENOTYPEMULTIBYPLANTID =
            "SELECT * FROM fenotype_multi WHERE plant_id = ?";

    String GETABIOTISCHBYPLANTID =
            "SELECT * FROM abiotische_factoren WHERE plant_id = ?";
    String GETABIOTISCHBMULTIYPLANTID =
            "SELECT * FROM abiotisch_multi WHERE plant_id = ?";

    String GETCOMMENSALISMEBYPLANTID =
            "SELECT * FROM commensalisme WHERE plant_id = ?";
    String GETCOMMENSALISMEMULTIBYPLANTID =
            "SELECT * FROM commensalisme_multi WHERE plant_id = ?";

    String GETBEHEERBYPLANTID =
            "SELECT * FROM beheer_multi WHERE plant_id = ?";

    String GETEXTRABYPLANTID =
            "SELECT * FROM extra WHERE plant_id = ?";

    String GETFOTOBYPLANTID =
            "SELECT * FROM foto WHERE plant_id = ?";
    //endregion

    //region GETIDSBYKENMERKEN
    String GETIDSBYPLANT =
            "SELECT plant_id FROM plant " +
                    "WHERE (planttype = ? OR  1=?) " +
                    "AND (familie = ? OR 1=?) " +
                    "AND (fgsv LIKE ? OR 1=?) ";

    String GETIDSBYEXTRA =
            "SELECT plant_id FROM extra " +
                    "WHERE plant_id IN (?) " +
                    "AND (nectarwaarde = ? OR 1=?) " +
                    "AND (pollenwaarde = ? OR 1=?) " +
                    "AND (vlindervriendelijk = ? OR 1=?) " +
                    "AND (bijvriendelijk = ? OR 1=?) " +
                    "AND (eetbaar = ? OR 1=?) " +
                    "AND (kruidgebruik = ? OR 1=?) " +
                    "AND (geurend = ? OR 1=?) " +
                    "AND (vorstgevoelig = ? OR 1=?) ";

    String GETIDSBYABIO =
            "SELECT plant_id FROM abiotische_factoren " +
                    "WHERE plant_id IN (?) " +
                    "AND (bezonning = ? OR 1=?) " +
                    "AND (grondsoort = ? OR 1=?) " +
                    "AND (vochtbehoefte = ? OR 1=?) " +
                    "AND (voedingsbehoefte = ? OR 1=?) " +
                    "AND (reactie_antagonistische_omg = ? OR 1=?) ";

    String GETIDSBYABIOMULTI =
            "SELECT plant_id FROM abiotisch_multi " +
                    "WHERE plant_id IN (?) " +
                    "AND eigenschap = ? " +
                    "AND waarde = ? ";

    String GETIDSBYCOMM =
            "SELECT plant_id FROM commensalisme " +
                    "WHERE plant_id IN (?) " +
                    "AND (strategie = ? OR 1=?) " +
                    "AND (ontwikkelingssnelheid = ? OR 1=?) ";

    String GETIDSBYCOMMMULTI =
            "SELECT plant_id FROM commensalisme_multi " +
                    "WHERE plant_id IN (?) " +
                    "AND eigenschap = ? " +
                    "AND waarde = ? ";
    String GETIDSBYFENO =
            "SELECT plant_id FROM fenotype " +
                    "WHERE plant_id IN (?) " +
                    "AND (bladvorm = ? OR 1=?) " +
                    "AND (levensvorm = ? OR 1=?) " +
                    "AND (habitus = ? OR 1=?) " +
                    "AND (bloeiwijze = ? OR 1=?) " +
                    "AND (bladgrootte = ? OR 1=?) " +
                    "AND (ratio_bloei_blad = ? OR 1=?) " +
                    "AND (spruitfenologie = ? OR 1=?) ";
    String GETIDSBYFENOMULTI =
            "SELECT plant_id FROM fenotype_multi " +
                    "WHERE plant_id IN (?) " +
                    "AND eigenschap = ? " +
                    "AND jan = ? " +
                    "AND feb = ? " +
                    "AND maa = ? " +
                    "AND apr = ? " +
                    "AND mei = ? " +
                    "AND jun = ? " +
                    "AND jul = ? " +
                    "AND aug = ? " +
                    "AND sep = ? " +
                    "AND okt = ? " +
                    "AND nov = ? " +
                    "AND dec = ? ";
    String GETIDSBYFENOMULTISINGLE =
            "SELECT plant_id FROM fenotype_multi " +
                    "WHERE plant_id IN (?) " +
                    "AND eigenschap = ? " +
                    "AND " +
                    "(jan = ? " +
                    "OR feb = ? " +
                    "OR maa = ? " +
                    "OR apr = ? " +
                    "OR mei = ? " +
                    "OR jun = ? " +
                    "OR jul = ? " +
                    "OR aug = ? " +
                    "OR sep = ? " +
                    "OR okt = ? " +
                    "OR nov = ? " +
                    "OR dec = ?) ";
    String GETIDSBYFENOMULTIHOOGTEMIN =
            "SELECT plant_id FROM fenotype_multi " +
                    "WHERE plant_id IN (?) " +
                    "AND eigenschap = ? " +
                    "AND (jan > ?) " +
                    "AND (feb > ?) " +
                    "AND (maa > ?) " +
                    "AND (apr > ?) " +
                    "AND (mei > ?) " +
                    "AND (jun > ?) " +
                    "AND (jul > ?) " +
                    "AND (aug > ?) " +
                    "AND (sep > ?) " +
                    "AND (okt > ?) " +
                    "AND (nov > ?) " +
                    "AND (dec > ?) ";
    String GETIDSBYFENOMULTIHOOGTEMAX =
            "SELECT plant_id FROM fenotype_multi " +
                    "WHERE plant_id IN (?) " +
                    "AND eigenschap = ? " +
                    "AND (jan < ?) " +
                    "AND (feb < ?) " +
                    "AND (maa < ?) " +
                    "AND (apr < ?) " +
                    "AND (mei < ?) " +
                    "AND (jun < ?) " +
                    "AND (jul < ?) " +
                    "AND (aug < ?) " +
                    "AND (sep < ?) " +
                    "AND (okt < ?) " +
                    "AND (nov < ?) " +
                    "AND (dec < ?) ";
    String GETIDSBYFENOMULTIHOOGTESINGLE =
            "SELECT plant_id FROM fenotype_multi " +
                    "WHERE plant_id IN (?) " +
                    "AND eigenschap = ? " +
                    "AND " +
                    "((jan BETWEEN ? AND ?) " +
                    "OR (feb BETWEEN ? AND ?) " +
                    "OR (maa BETWEEN ? AND ?) " +
                    "OR (apr BETWEEN ? AND ?) " +
                    "OR (mei BETWEEN ? AND ?) " +
                    "OR (jun BETWEEN ? AND ?) " +
                    "OR (jul BETWEEN ? AND ?) " +
                    "OR (aug BETWEEN ? AND ?) " +
                    "OR (sep BETWEEN ? AND ?) " +
                    "OR (okt BETWEEN ? AND ?) " +
                    "OR (nov BETWEEN ? AND ?) " +
                    "OR (dec BETWEEN ? AND ?)) ";
    String GETIDSBYBEHEER =
            "SELECT plant_id FROM beheer_multi " +
                    "WHERE plant_id IN (?) " +
                    "AND (beheerdaad = ? OR 1=?) " +
                    "AND (maand = ? OR 1=?) " +
                    "AND (frequentie_jaar = ? OR 1=?) ";
//endregion

    //region NAAKTETABELLEN

    String NTTYPE =
            "SELECT planttype_naam FROM planttype";

    String NTFAMILIE =
            "SELECT familie_naam FROM familie";

    String NTFAMILIEBYTYPE =
            "SELECT familie_naam FROM familie where type_id = ?";

    String NTLEVENSDUURCONCURRENTIEKRACHT =
            "SELECT waarde FROM levensduur_concurrentiekracht";

    String NTSTRATEGIE =
            "SELECT waarde FROM strategie";

    String NTONTWIKKELINGSSNELHEID =
            "SELECT waarde FROM ontwikkelingssnelheid";

    String NTVOEDINGSBEHOEFTE =
            "SELECT waarde FROM voedingsbehoefte";

    String NTVOCHTBEHOEFTE =
            "SELECT waarde FROM vochtbehoefte";

    String NTHABITAT =
            "SELECT waarde FROM habitat";

    String NTREACTIEOMGEVING =
            "SELECT waarde FROM reactieomgeving";

    String NTGRONDSOORT =
            "SELECT waarde FROM grondsoort";

    String NTBEZONNING =
            "SELECT waarde FROM bezonning";

    String NTHABITUS =
            "SELECT waarde FROM habitus";

    String NTKLEUREN =
            "SELECT kleur FROM kleuren";

    String NTBLADVORM =
            "SELECT waarde FROM bladvorm";

    String NTRATIOBLOEIBLAD =
            "SELECT waarde FROM ratio_bloeiblad";

    String NTSPRUITFENOLOGIE =
            "SELECT waarde FROM spruitfenologie";

    String NTBLOEIWIJZE =
            "SELECT waarde FROM bloeiwijze";

    String NTSOCIABILITEIT =
            "SELECT waarde FROM sociabiliteit";

    String NTBEHEERDAAD =
            "SELECT waarde FROM beheerdaad";

    String NTNECTARWAARDE =
            "SELECT waarde FROM nectarwaarde";

    String NTPOLLENWAARDE =
            "SELECT waarde FROM pollenwaarde";

    String NTBLADGROOTTE =
            "SELECT waarde FROM maxbladgrootte";

    String NTFOTOHABITUS =
            "SELECT * FROM habitus";
    //endregion
}

