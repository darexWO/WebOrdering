package rs.invado.wo.domain.ocp;
// Generated Dec 9, 2012 6:19:17 PM by Hibernate Tools 3.4.0.CR1


import rs.invado.wo.domain.prod.ProdPpRabat;
import rs.invado.wo.domain.wo.WoKompanijaKorisnik;
import rs.invado.wo.domain.wo.WoPartnerSetting;
import rs.invado.wo.domain.wo.WoUser;

import javax.persistence.*;
import java.util.*;

/**
 * OcpPoslovniPartner generated by hbm2java
 */
@Entity
@Table(name = "OCP_POSLOVNI_PARTNER"
        , schema = "DAREX"
)
public class OcpPoslovniPartner implements java.io.Serializable {


    private int poslovniPartner;
    private OcpPoslovniPartner ocpPoslovniPartner;
    private OcpRadnik ocpRadnik;
    private OcpMesto ocpMesto;
    private OcpOrganizacionaJedinica ocpOrganizacionaJedinica;
    private String maticniBroj;
    private String naziv;
    private String adresa;
    private String ediAdresa;
    private Integer vrstaPreduzeca;
    private Integer oblikSvojine;
    private Date datumOtvaranja;
    private Date datumBrisanja;
    private Integer obrisaoRadnik;
    private String dodatniNaziv;
    private String teren;
    private String pib;
    private Integer tipclref;
    private String pdv;
    private String intNapomena;
    private String adrZaSlanjePoste;
    private String brisanApr;
    private String utuzen;
    private String pustenaMenica;
    private String email;
    private Boolean poslatiracunpdf;
    private transient List<WoUser> woUsers = new ArrayList<WoUser>(0);
    private transient Set ocpZiroRacuns = new HashSet(0);
    private transient Set ocpPoslovniPartners = new HashSet(0);
    private transient Set ocpRadniks = new HashSet(0);
    private transient Set ocpLiceZaKontakts = new HashSet(0);
    private transient WoKompanijaKorisnik woKompanijaKorisnik;
    private transient List<WoPartnerSetting> woPartnerSetting = new ArrayList<WoPartnerSetting>(0);
    private transient List<ProdPpRabat> prodPpRabats = new ArrayList<ProdPpRabat>(0);


    public OcpPoslovniPartner() {
    }


    public OcpPoslovniPartner(int poslovniPartner, OcpMesto ocpMesto, String naziv, Date datumOtvaranja) {
        this.poslovniPartner = poslovniPartner;
        this.ocpMesto = ocpMesto;
        this.naziv = naziv;
        this.datumOtvaranja = datumOtvaranja;
    }

    public OcpPoslovniPartner(int poslovniPartner, OcpPoslovniPartner ocpPoslovniPartner, OcpRadnik ocpRadnik, OcpMesto ocpMesto, OcpOrganizacionaJedinica ocpOrganizacionaJedinica, String maticniBroj, String naziv, String adresa, String ediAdresa, Integer vrstaPreduzeca, Integer oblikSvojine, Date datumOtvaranja, Date datumBrisanja, Integer obrisaoRadnik, String dodatniNaziv, String teren, String pib, Integer tipclref, String pdv, String intNapomena, String adrZaSlanjePoste, String brisanApr, String utuzen, String pustenaMenica, String email, Boolean poslatiracunpdf, Set ocpZiroRacuns, Set ocpPoslovniPartners, Set ocpRadniks, Set ocpLiceZaKontakts) {
        this.poslovniPartner = poslovniPartner;
        this.ocpPoslovniPartner = ocpPoslovniPartner;
        this.ocpRadnik = ocpRadnik;
        this.ocpMesto = ocpMesto;
        this.ocpOrganizacionaJedinica = ocpOrganizacionaJedinica;
        this.maticniBroj = maticniBroj;
        this.naziv = naziv;
        this.adresa = adresa;
        this.ediAdresa = ediAdresa;
        this.vrstaPreduzeca = vrstaPreduzeca;
        this.oblikSvojine = oblikSvojine;
        this.datumOtvaranja = datumOtvaranja;
        this.datumBrisanja = datumBrisanja;
        this.obrisaoRadnik = obrisaoRadnik;
        this.dodatniNaziv = dodatniNaziv;
        this.teren = teren;
        this.pib = pib;
        this.tipclref = tipclref;
        this.pdv = pdv;
        this.intNapomena = intNapomena;
        this.adrZaSlanjePoste = adrZaSlanjePoste;
        this.brisanApr = brisanApr;
        this.utuzen = utuzen;
        this.pustenaMenica = pustenaMenica;
        this.email = email;
        this.poslatiracunpdf = poslatiracunpdf;
        this.ocpZiroRacuns = ocpZiroRacuns;
        this.ocpPoslovniPartners = ocpPoslovniPartners;
        this.ocpRadniks = ocpRadniks;
        this.ocpLiceZaKontakts = ocpLiceZaKontakts;
    }

    @Id


    @Column(name = "POSLOVNI_PARTNER#", unique = true, nullable = false, precision = 7, scale = 0)
    public int getPoslovniPartner() {
        return this.poslovniPartner;
    }

    public void setPoslovniPartner(int poslovniPartner) {
        this.poslovniPartner = poslovniPartner;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NADREDJENI_PP")
    public OcpPoslovniPartner getOcpPoslovniPartner() {
        return this.ocpPoslovniPartner;
    }

    public void setOcpPoslovniPartner(OcpPoslovniPartner ocpPoslovniPartner) {
        this.ocpPoslovniPartner = ocpPoslovniPartner;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RADNIK#")
    public OcpRadnik getOcpRadnik() {
        return this.ocpRadnik;
    }

    public void setOcpRadnik(OcpRadnik ocpRadnik) {
        this.ocpRadnik = ocpRadnik;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MESTA", nullable = false)
    public OcpMesto getOcpMesto() {
        return this.ocpMesto;
    }

    public void setOcpMesto(OcpMesto ocpMesto) {
        this.ocpMesto = ocpMesto;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGANIZACIONA_JEDINICA#")
    public OcpOrganizacionaJedinica getOcpOrganizacionaJedinica() {
        return this.ocpOrganizacionaJedinica;
    }

    public void setOcpOrganizacionaJedinica(OcpOrganizacionaJedinica ocpOrganizacionaJedinica) {
        this.ocpOrganizacionaJedinica = ocpOrganizacionaJedinica;
    }


    @Column(name = "MATICNI_BROJ", length = 20)
    public String getMaticniBroj() {
        return this.maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }


    @Column(name = "NAZIV", nullable = false, length = 80)
    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }


    @Column(name = "ADRESA", length = 40)
    public String getAdresa() {
        return this.adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }


    @Column(name = "EDI_ADRESA", length = 40)
    public String getEdiAdresa() {
        return this.ediAdresa;
    }

    public void setEdiAdresa(String ediAdresa) {
        this.ediAdresa = ediAdresa;
    }


    @Column(name = "VRSTA_PREDUZECA#", precision = 6, scale = 0)
    public Integer getVrstaPreduzeca() {
        return this.vrstaPreduzeca;
    }

    public void setVrstaPreduzeca(Integer vrstaPreduzeca) {
        this.vrstaPreduzeca = vrstaPreduzeca;
    }


    @Column(name = "OBLIK_SVOJINE#", precision = 6, scale = 0)
    public Integer getOblikSvojine() {
        return this.oblikSvojine;
    }

    public void setOblikSvojine(Integer oblikSvojine) {
        this.oblikSvojine = oblikSvojine;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATUM_OTVARANJA", nullable = false, length = 7)
    public Date getDatumOtvaranja() {
        return this.datumOtvaranja;
    }

    public void setDatumOtvaranja(Date datumOtvaranja) {
        this.datumOtvaranja = datumOtvaranja;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATUM_BRISANJA", length = 7)
    public Date getDatumBrisanja() {
        return this.datumBrisanja;
    }

    public void setDatumBrisanja(Date datumBrisanja) {
        this.datumBrisanja = datumBrisanja;
    }


    @Column(name = "OBRISAO_RADNIK#", precision = 6, scale = 0)
    public Integer getObrisaoRadnik() {
        return this.obrisaoRadnik;
    }

    public void setObrisaoRadnik(Integer obrisaoRadnik) {
        this.obrisaoRadnik = obrisaoRadnik;
    }


    @Column(name = "DODATNI_NAZIV", length = 100)
    public String getDodatniNaziv() {
        return this.dodatniNaziv;
    }

    public void setDodatniNaziv(String dodatniNaziv) {
        this.dodatniNaziv = dodatniNaziv;
    }


    @Column(name = "TEREN#", length = 15)
    public String getTeren() {
        return this.teren;
    }

    public void setTeren(String teren) {
        this.teren = teren;
    }


    @Column(name = "PIB", length = 13)
    public String getPib() {
        return this.pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }


    @Column(name = "TIPCLREF", precision = 5, scale = 0)
    public Integer getTipclref() {
        return this.tipclref;
    }

    public void setTipclref(Integer tipclref) {
        this.tipclref = tipclref;
    }


    @Column(name = "PDV", length = 13)
    public String getPdv() {
        return this.pdv;
    }

    public void setPdv(String pdv) {
        this.pdv = pdv;
    }


    @Column(name = "INT_NAPOMENA", length = 500)
    public String getIntNapomena() {
        return this.intNapomena;
    }

    public void setIntNapomena(String intNapomena) {
        this.intNapomena = intNapomena;
    }


    @Column(name = "ADR_ZA_SLANJE_POSTE", length = 500)
    public String getAdrZaSlanjePoste() {
        return this.adrZaSlanjePoste;
    }

    public void setAdrZaSlanjePoste(String adrZaSlanjePoste) {
        this.adrZaSlanjePoste = adrZaSlanjePoste;
    }


    @Column(name = "BRISAN_APR", length = 2)
    public String getBrisanApr() {
        return this.brisanApr;
    }

    public void setBrisanApr(String brisanApr) {
        this.brisanApr = brisanApr;
    }


    @Column(name = "UTUZEN", length = 2)
    public String getUtuzen() {
        return this.utuzen;
    }

    public void setUtuzen(String utuzen) {
        this.utuzen = utuzen;
    }


    @Column(name = "PUSTENA_MENICA", length = 2)
    public String getPustenaMenica() {
        return this.pustenaMenica;
    }

    public void setPustenaMenica(String pustenaMenica) {
        this.pustenaMenica = pustenaMenica;
    }


    @Column(name = "EMAIL", length = 200)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Column(name = "POSLATIRACUNPDF", precision = 1, scale = 0)
    public Boolean getPoslatiracunpdf() {
        return this.poslatiracunpdf;
    }

    public void setPoslatiracunpdf(Boolean poslatiracunpdf) {
        this.poslatiracunpdf = poslatiracunpdf;
    }

    @OneToMany(targetEntity = OcpZiroRacun.class, fetch = FetchType.LAZY, mappedBy = "ocpPoslovniPartner")
    public Set getOcpZiroRacuns() {
        return this.ocpZiroRacuns;
    }

    public void setOcpZiroRacuns(Set ocpZiroRacuns) {
        this.ocpZiroRacuns = ocpZiroRacuns;
    }

    @OneToMany(targetEntity = OcpPoslovniPartner.class, fetch = FetchType.LAZY, mappedBy = "ocpPoslovniPartner")
    public Set getOcpPoslovniPartners() {
        return this.ocpPoslovniPartners;
    }

    public void setOcpPoslovniPartners(Set ocpPoslovniPartners) {
        this.ocpPoslovniPartners = ocpPoslovniPartners;
    }

    @OneToMany(targetEntity = OcpRadnik.class, fetch = FetchType.LAZY, mappedBy = "ocpPoslovniPartner")
    public Set getOcpRadniks() {
        return this.ocpRadniks;
    }

    public void setOcpRadniks(Set ocpRadniks) {
        this.ocpRadniks = ocpRadniks;
    }

    @OneToMany(targetEntity = OcpLiceZaKontakt.class, fetch = FetchType.LAZY, mappedBy = "ocpPoslovniPartner")
    public Set getOcpLiceZaKontakts() {
        return this.ocpLiceZaKontakts;
    }

    public void setOcpLiceZaKontakts(Set ocpLiceZaKontakts) {
        this.ocpLiceZaKontakts = ocpLiceZaKontakts;
    }

    @OneToMany(targetEntity = WoUser.class, fetch = FetchType.LAZY, mappedBy = "ocpPoslovniPartner")
    public List<WoUser> getWoUsers() {
        return woUsers;
    }

    public void setWoUsers(List<WoUser> woUsers) {
        this.woUsers = woUsers;
    }


    @OneToOne(mappedBy="ocpPoslovniPartnerMaticni", cascade=CascadeType.ALL)
     public WoKompanijaKorisnik getWoKompanijaKorisnik() {
        return woKompanijaKorisnik;
    }

    public void setWoKompanijaKorisnik(WoKompanijaKorisnik woKompanijaKorisnik) {
        this.woKompanijaKorisnik = woKompanijaKorisnik;
    }

    @OneToMany(targetEntity = WoPartnerSetting.class, fetch = FetchType.LAZY, mappedBy = "poslovniPartner")
    public List<WoPartnerSetting> getWoPartnerSetting() {

        return woPartnerSetting;
    }

    public void setWoPartnerSetting(List<WoPartnerSetting> woPartnerSetting) {
        this.woPartnerSetting = woPartnerSetting;
    }


    @OneToMany(targetEntity = ProdPpRabat.class, fetch = FetchType.EAGER, mappedBy = "poslovniPartner")
    public List<ProdPpRabat> getProdPpRabats() {
        return prodPpRabats;
    }

    public void setProdPpRabats(List<ProdPpRabat> prodPpRabats) {
        this.prodPpRabats = prodPpRabats;
    }

}


