package rs.invado.wo.domain.prod;
// Generated Dec 11, 2012 10:40:41 PM by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProdCenovnik generated by hbm2java
 */
@Entity
@Table(name="PROD_CENOVNIK"
    ,schema="DAREX"
)
public class ProdCenovnik  implements java.io.Serializable {


     private ProdCenovnikId id;
     private ProdCenovnik prodCenovnik;
     private BigDecimal koeficijent;
     private Date datumOd;
     private Date datumDo;
     private Date datumOv;
     private Integer radnikOv;
     private Date datum;
     private Integer radnik;
     private String tipCeneRef;
     private BigDecimal rabat;
     private Date datumVer;
     private Integer radnikVer;
     private Set prodStavkaCenovnikas = new HashSet(0);
     private Set prodCenovniks = new HashSet(0);

    public ProdCenovnik() {
    }

	
    public ProdCenovnik(ProdCenovnikId id) {
        this.id = id;
    }
    public ProdCenovnik(ProdCenovnikId id, ProdCenovnik prodCenovnik, BigDecimal koeficijent, Date datumOd, Date datumDo, Date datumOv, Integer radnikOv, Date datum, Integer radnik, String tipCeneRef, BigDecimal rabat, Date datumVer, Integer radnikVer, Set prodStavkaCenovnikas, Set prodCenovniks) {
       this.id = id;
       this.prodCenovnik = prodCenovnik;
       this.koeficijent = koeficijent;
       this.datumOd = datumOd;
       this.datumDo = datumDo;
       this.datumOv = datumOv;
       this.radnikOv = radnikOv;
       this.datum = datum;
       this.radnik = radnik;
       this.tipCeneRef = tipCeneRef;
       this.rabat = rabat;
       this.datumVer = datumVer;
       this.radnikVer = radnikVer;
       this.prodStavkaCenovnikas = prodStavkaCenovnikas;
       this.prodCenovniks = prodCenovniks;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="organizacionaJedinica", column=@Column(name="ORGANIZACIONA_JEDINICA#", nullable=false, precision=5, scale=0) ), 
        @AttributeOverride(name="idCenovnik", column=@Column(name="ID_CENOVNIK", nullable=false, precision=5, scale=0) ), 
        @AttributeOverride(name="idKlasaCene", column=@Column(name="ID_KLASA_CENE", nullable=false, precision=2, scale=0) ) } )
    public ProdCenovnikId getId() {
        return this.id;
    }
    
    public void setId(ProdCenovnikId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="ORGANIZACIONA_JEDINICA#_P", referencedColumnName="ORGANIZACIONA_JEDINICA#"), 
        @JoinColumn(name="ID_CENOVNIK_P", referencedColumnName="ID_CENOVNIK"), 
        @JoinColumn(name="ID_KLASA_CENE_P", referencedColumnName="ID_KLASA_CENE") } )
    public ProdCenovnik getProdCenovnik() {
        return this.prodCenovnik;
    }
    
    public void setProdCenovnik(ProdCenovnik prodCenovnik) {
        this.prodCenovnik = prodCenovnik;
    }

    
    @Column(name="KOEFICIJENT", precision=8, scale=4)
    public BigDecimal getKoeficijent() {
        return this.koeficijent;
    }
    
    public void setKoeficijent(BigDecimal koeficijent) {
        this.koeficijent = koeficijent;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATUM_OD", length=7)
    public Date getDatumOd() {
        return this.datumOd;
    }
    
    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATUM_DO", length=7)
    public Date getDatumDo() {
        return this.datumDo;
    }
    
    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATUM_OV", length=7)
    public Date getDatumOv() {
        return this.datumOv;
    }
    
    public void setDatumOv(Date datumOv) {
        this.datumOv = datumOv;
    }

    
    @Column(name="RADNIK#_OV", precision=6, scale=0)
    public Integer getRadnikOv() {
        return this.radnikOv;
    }
    
    public void setRadnikOv(Integer radnikOv) {
        this.radnikOv = radnikOv;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATUM", length=7)
    public Date getDatum() {
        return this.datum;
    }
    
    public void setDatum(Date datum) {
        this.datum = datum;
    }

    
    @Column(name="RADNIK#", precision=6, scale=0)
    public Integer getRadnik() {
        return this.radnik;
    }
    
    public void setRadnik(Integer radnik) {
        this.radnik = radnik;
    }

    
    @Column(name="TIP_CENE_REF", length=2)
    public String getTipCeneRef() {
        return this.tipCeneRef;
    }
    
    public void setTipCeneRef(String tipCeneRef) {
        this.tipCeneRef = tipCeneRef;
    }

    
    @Column(name="RABAT", precision=5)
    public BigDecimal getRabat() {
        return this.rabat;
    }
    
    public void setRabat(BigDecimal rabat) {
        this.rabat = rabat;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATUM_VER", length=7)
    public Date getDatumVer() {
        return this.datumVer;
    }
    
    public void setDatumVer(Date datumVer) {
        this.datumVer = datumVer;
    }

    
    @Column(name="RADNIK#_VER", precision=6, scale=0)
    public Integer getRadnikVer() {
        return this.radnikVer;
    }
    
    public void setRadnikVer(Integer radnikVer) {
        this.radnikVer = radnikVer;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="prodCenovnik")
    public Set<ProdStavkaCenovnika> getProdStavkaCenovnikas() {
        return this.prodStavkaCenovnikas;
    }
    
    public void setProdStavkaCenovnikas(Set prodStavkaCenovnikas) {
        this.prodStavkaCenovnikas = prodStavkaCenovnikas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="prodCenovnik")
    public Set<ProdCenovnik> getProdCenovniks() {
        return this.prodCenovniks;
    }
    
    public void setProdCenovniks(Set prodCenovniks) {
        this.prodCenovniks = prodCenovniks;
    }




}

