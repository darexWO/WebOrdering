package rs.invado.wo.domain.ocp;
// Generated Dec 9, 2012 6:19:17 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * OcpOrganizacionaJedinica generated by hbm2java
 */
@Entity
@Table(name = "OCP_ORGANIZACIONA_JEDINICA"
        , schema = "DAREX"
)
@SqlResultSetMapping(name = "organizacionaJedinicaRM", entities =
        {@EntityResult(entityClass = rs.invado.wo.domain.ocp.OcpOrganizacionaJedinica.class, fields = {
                @FieldResult(name = "organizacionaJedinica", column = "ORGANIZACIONA_JEDINICA#"),
                @FieldResult(name = "ocpOrganizacionaJedinicaNad", column = "NADREDJENA_OJ"),
                @FieldResult(name = "naziv", column = "NAZIV"),
                @FieldResult(name = "telefon", column = "TELEFON"),
                @FieldResult(name = "fax", column = "FAX"),
                @FieldResult(name = "adresa", column = "ADRESA"),
                @FieldResult(name = "datumOtvaranja", column = "DATUM_OTVARANJA"),
                @FieldResult(name = "radnik", column = "RADNIK#"),
                @FieldResult(name = "idSkladista", column = "ID_SKLADISTA"),
                @FieldResult(name = "poslovniPartner", column = "POSLOVNI_PARTNER#"),
                @FieldResult(name = "oznaka", column = "OZNAKA"),
                @FieldResult(name = "radnikZatvorio", column = "RADNIK#_ZATVORIO"),
                @FieldResult(name = "datumZatvaranja", column = "DATUM_ZATVARANJA"),
                @FieldResult(name = "zavisiOd", column = "ZAVISI_OD")
        })})
@NamedNativeQuery(name = "proveraOJHijerarhije", query = " select o.ORGANIZACIONA_JEDINICA#, o.NADREDJENA_OJ, " +
        " o.NAZIV, o.TELEFON, o.FAX, o.ADRESA, o.DATUM_OTVARANJA, o.RADNIK#, o.ID_SKLADISTA, o.POSLOVNI_PARTNER#, o.OZNAKA, o.RADNIK#_ZATVORIO, " +
        " o.DATUM_ZATVARANJA, o.ZAVISI_OD " +
        " from ocp_organizaciona_jedinica o " +
        " where o.organizaciona_jedinica# = :oj " +
        " start with o.organizaciona_jedinica# = :rootOJ " +
        " connect by prior o.organizaciona_jedinica# = o.nadredjena_oj ", resultSetMapping = "organizacionaJedinicaRM")

public class OcpOrganizacionaJedinica implements java.io.Serializable {


    private int organizacionaJedinica;
    private Integer ocpOrganizacionaJedinicaNad;
    private String naziv;
    private String telefon;
    private String fax;
    private String adresa;
    private Date datumOtvaranja;
    private Integer radnik;
    private Short idSkladista;
    private Integer poslovniPartner;
    private String oznaka;
    private Integer radnikZatvorio;
    private Date datumZatvaranja;
    private Integer zavisiOd;

    public OcpOrganizacionaJedinica() {
    }


    public OcpOrganizacionaJedinica(int organizacionaJedinica, String naziv) {
        this.organizacionaJedinica = organizacionaJedinica;
        this.naziv = naziv;
    }

    public OcpOrganizacionaJedinica(int organizacionaJedinica, Integer ocpOrganizacionaJedinicaNad, String naziv, String telefon, String fax, String adresa, Date datumOtvaranja, Integer ptt, Integer radnik, Short idSkladista, String kodPrihoda, String kodTroska, Integer poslovniPartner, String skracenicaPoIso, String oznaka, Integer radnikZatvorio, Date datumZatvaranja, Integer zavisiOd, Set ocpPoslovniPartners, Set ocpOrganizacionaJedinicas, Set ocpRadniks) {
        this.organizacionaJedinica = organizacionaJedinica;
        this.ocpOrganizacionaJedinicaNad = ocpOrganizacionaJedinicaNad;
        this.naziv = naziv;
        this.telefon = telefon;
        this.fax = fax;
        this.adresa = adresa;
        this.datumOtvaranja = datumOtvaranja;
        this.radnik = radnik;
        this.idSkladista = idSkladista;
        this.poslovniPartner = poslovniPartner;
        this.oznaka = oznaka;
        this.radnikZatvorio = radnikZatvorio;
        this.datumZatvaranja = datumZatvaranja;
        this.zavisiOd = zavisiOd;
    }

    @Id


    @Column(name = "ORGANIZACIONA_JEDINICA#", nullable = false, precision = 5, scale = 0)
    public int getOrganizacionaJedinica() {
        return this.organizacionaJedinica;
    }

    public void setOrganizacionaJedinica(int organizacionaJedinica) {
        this.organizacionaJedinica = organizacionaJedinica;
    }

    @Column(name = "NADREDJENA_OJ")
    public Integer getOcpOrganizacionaJedinicaNad() {
        return this.ocpOrganizacionaJedinicaNad;
    }

    public void setOcpOrganizacionaJedinicaNad(Integer ocpOrganizacionaJedinicaNad) {
        this.ocpOrganizacionaJedinicaNad = ocpOrganizacionaJedinicaNad;
    }


    @Column(name = "NAZIV", nullable = false, length = 60)
    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


    @Column(name = "TELEFON", length = 20)
    public String getTelefon() {
        return this.telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    @Column(name = "FAX", length = 20)
    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }


    @Column(name = "ADRESA", length = 40)
    public String getAdresa() {
        return this.adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATUM_OTVARANJA", length = 7)
    public Date getDatumOtvaranja() {
        return this.datumOtvaranja;
    }

    public void setDatumOtvaranja(Date datumOtvaranja) {
        this.datumOtvaranja = datumOtvaranja;
    }


    @Column(name = "RADNIK#", precision = 6, scale = 0)
    public Integer getRadnik() {
        return this.radnik;
    }

    public void setRadnik(Integer radnik) {
        this.radnik = radnik;
    }


    @Column(name = "ID_SKLADISTA", precision = 3, scale = 0)
    public Short getIdSkladista() {
        return this.idSkladista;
    }

    public void setIdSkladista(Short idSkladista) {
        this.idSkladista = idSkladista;
    }


    @Column(name = "POSLOVNI_PARTNER#", precision = 7, scale = 0)
    public Integer getPoslovniPartner() {
        return this.poslovniPartner;
    }

    public void setPoslovniPartner(Integer poslovniPartner) {
        this.poslovniPartner = poslovniPartner;
    }


    @Column(name = "OZNAKA", length = 60)
    public String getOznaka() {
        return this.oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }


    @Column(name = "RADNIK#_ZATVORIO", precision = 6, scale = 0)
    public Integer getRadnikZatvorio() {
        return this.radnikZatvorio;
    }

    public void setRadnikZatvorio(Integer radnikZatvorio) {
        this.radnikZatvorio = radnikZatvorio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATUM_ZATVARANJA", length = 7)
    public Date getDatumZatvaranja() {
        return this.datumZatvaranja;
    }

    public void setDatumZatvaranja(Date datumZatvaranja) {
        this.datumZatvaranja = datumZatvaranja;
    }


    @Column(name = "ZAVISI_OD", precision = 5, scale = 0)
    public Integer getZavisiOd() {
        return this.zavisiOd;
    }

    public void setZavisiOd(Integer zavisiOd) {
        this.zavisiOd = zavisiOd;
    }


}


