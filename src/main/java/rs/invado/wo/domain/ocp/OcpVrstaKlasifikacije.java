package rs.invado.wo.domain.ocp;
// Generated Dec 9, 2012 6:19:17 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * OcpVrstaKlasifikacije generated by hbm2java
 */
@Entity
@Table(name="OCP_VRSTA_KLASIFIKACIJE"
    ,schema="DAREX"
    , uniqueConstraints = @UniqueConstraint(columnNames="ID_NAMENE") 
)
public class OcpVrstaKlasifikacije  implements java.io.Serializable {


     private int vrstaKlasifikacije;
     private Byte idNamene;
     private String imaStrukturu;
     private String obaveznost;
     private String naziv;
     private String opis;
     private Byte duzinaKljuca;
     private Integer tipObjekta;
     private String vrsta;
     private String formiraZk;

    public OcpVrstaKlasifikacije() {
    }

	
    public OcpVrstaKlasifikacije(int vrstaKlasifikacije) {
        this.vrstaKlasifikacije = vrstaKlasifikacije;
    }
    public OcpVrstaKlasifikacije(int vrstaKlasifikacije, Byte idNamene, String imaStrukturu, String obaveznost, String naziv, String opis, Byte duzinaKljuca, Integer tipObjekta, String vrsta, String formiraZk) {
       this.vrstaKlasifikacije = vrstaKlasifikacije;
       this.idNamene = idNamene;
       this.imaStrukturu = imaStrukturu;
       this.obaveznost = obaveznost;
       this.naziv = naziv;
       this.opis = opis;
       this.duzinaKljuca = duzinaKljuca;
       this.tipObjekta = tipObjekta;
       this.vrsta = vrsta;
       this.formiraZk = formiraZk;
    }
   
     @Id 

    
    @Column(name="VRSTA_KLASIFIKACIJE#", nullable=false, precision=6, scale=0)
    public int getVrstaKlasifikacije() {
        return this.vrstaKlasifikacije;
    }
    
    public void setVrstaKlasifikacije(int vrstaKlasifikacije) {
        this.vrstaKlasifikacije = vrstaKlasifikacije;
    }

    
    @Column(name="ID_NAMENE", unique=true, precision=2, scale=0)
    public Byte getIdNamene() {
        return this.idNamene;
    }
    
    public void setIdNamene(Byte idNamene) {
        this.idNamene = idNamene;
    }

    
    @Column(name="IMA_STRUKTURU", length=2)
    public String getImaStrukturu() {
        return this.imaStrukturu;
    }
    
    public void setImaStrukturu(String imaStrukturu) {
        this.imaStrukturu = imaStrukturu;
    }

    
    @Column(name="OBAVEZNOST", length=1)
    public String getObaveznost() {
        return this.obaveznost;
    }
    
    public void setObaveznost(String obaveznost) {
        this.obaveznost = obaveznost;
    }

    
    @Column(name="NAZIV", length=30)
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    
    @Column(name="OPIS", length=240)
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }

    
    @Column(name="DUZINA_KLJUCA", precision=2, scale=0)
    public Byte getDuzinaKljuca() {
        return this.duzinaKljuca;
    }
    
    public void setDuzinaKljuca(Byte duzinaKljuca) {
        this.duzinaKljuca = duzinaKljuca;
    }

    
    @Column(name="TIP_OBJEKTA#", precision=6, scale=0)
    public Integer getTipObjekta() {
        return this.tipObjekta;
    }
    
    public void setTipObjekta(Integer tipObjekta) {
        this.tipObjekta = tipObjekta;
    }

    
    @Column(name="VRSTA", length=1)
    public String getVrsta() {
        return this.vrsta;
    }
    
    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    
    @Column(name="FORMIRA_ZK", length=1)
    public String getFormiraZk() {
        return this.formiraZk;
    }
    
    public void setFormiraZk(String formiraZk) {
        this.formiraZk = formiraZk;
    }




}

