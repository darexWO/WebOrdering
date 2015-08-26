package rs.invado.wo.domain.prod;
// Generated Jan 7, 2013 9:06:09 PM by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * ProdPpRabatStavka generated by hbm2java
 */


@Entity
@Table(name="PROD_PP_RABAT_STAVKA"
    ,schema="DAREX"
)
@NamedNativeQuery(name = "findRabatZaProizvod", query = "{ ? = call WOFAKTURISANJE.rabat_za_proizvod_hib (:idProizvoda, :poslovniPartner, trunc(sysdate), :oj)}",
        resultClass = ProdPpRabatStavka.class, hints = { @javax.persistence.QueryHint(name = "org.hibernate.callable", value = "true") })
public class ProdPpRabatStavka  implements java.io.Serializable {


     private ProdPpRabatStavkaId id;
     private ProdPpRabat prodPpRabat;
     private BigDecimal rabat;
     private Date datumIVremePromene;
     private int radnikPromenio;
     private BigDecimal tezina;
     private BigDecimal tezinaOtpreme;
     private BigDecimal vrednost;
     private BigDecimal fakVrednost;

    public ProdPpRabatStavka() {
    }

	
    public ProdPpRabatStavka(ProdPpRabatStavkaId id, ProdPpRabat prodPpRabat, BigDecimal rabat, Date datumIVremePromene, int radnikPromenio) {
        this.id = id;
        this.prodPpRabat = prodPpRabat;
        this.rabat = rabat;
        this.datumIVremePromene = datumIVremePromene;
        this.radnikPromenio = radnikPromenio;
    }
    public ProdPpRabatStavka(ProdPpRabatStavkaId id, ProdPpRabat prodPpRabat, BigDecimal rabat, Date datumIVremePromene, int radnikPromenio, BigDecimal tezina, BigDecimal tezinaOtpreme, BigDecimal vrednost, BigDecimal fakVrednost) {
       this.id = id;
       this.prodPpRabat = prodPpRabat;
       this.rabat = rabat;
       this.datumIVremePromene = datumIVremePromene;
       this.radnikPromenio = radnikPromenio;
       this.tezina = tezina;
       this.tezinaOtpreme = tezinaOtpreme;
       this.vrednost = vrednost;
       this.fakVrednost = fakVrednost;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="ID", nullable=false, precision=7, scale=0) ), 
        @AttributeOverride(name="vrstaKlasifikacije#", column=@Column(name="VRSTA_KLASIFIKACIJE#", nullable=false, precision=6, scale=0) ), 
        @AttributeOverride(name="klasifikacija#", column=@Column(name="KLASIFIKACIJA#", nullable=false, length=15) ) } )
    public ProdPpRabatStavkaId getId() {
        return this.id;
    }
    
    public void setId(ProdPpRabatStavkaId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID", nullable=false, insertable=false, updatable=false)
    public ProdPpRabat getProdPpRabat() {
        return this.prodPpRabat;
    }
    
    public void setProdPpRabat(ProdPpRabat prodPpRabat) {
        this.prodPpRabat = prodPpRabat;
    }

    
    @Column(name="RABAT", nullable=false, precision=18, scale=3)
    public BigDecimal getRabat() {
        return this.rabat;
    }
    
    public void setRabat(BigDecimal rabat) {
        this.rabat = rabat;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATUM_I_VREME_PROMENE", nullable=false, length=7)
    public Date getDatumIVremePromene() {
        return this.datumIVremePromene;
    }
    
    public void setDatumIVremePromene(Date datumIVremePromene) {
        this.datumIVremePromene = datumIVremePromene;
    }

    
    @Column(name="RADNIK#_PROMENIO", nullable=false, precision=6, scale=0)
    public int getRadnikPromenio() {
        return this.radnikPromenio;
    }
    
    public void setRadnikPromenio(int radnikPromenio) {
        this.radnikPromenio = radnikPromenio;
    }

    
    @Column(name="TEZINA", precision=18, scale=3)
    public BigDecimal getTezina() {
        return this.tezina;
    }
    
    public void setTezina(BigDecimal tezina) {
        this.tezina = tezina;
    }

    
    @Column(name="TEZINA_OTPREME", precision=18, scale=3)
    public BigDecimal getTezinaOtpreme() {
        return this.tezinaOtpreme;
    }
    
    public void setTezinaOtpreme(BigDecimal tezinaOtpreme) {
        this.tezinaOtpreme = tezinaOtpreme;
    }

    
    @Column(name="VREDNOST", precision=21, scale=3)
    public BigDecimal getVrednost() {
        return this.vrednost;
    }
    
    public void setVrednost(BigDecimal vrednost) {
        this.vrednost = vrednost;
    }

    
    @Column(name="FAK_VREDNOST", precision=21, scale=3)
    public BigDecimal getFakVrednost() {
        return this.fakVrednost;
    }
    
    public void setFakVrednost(BigDecimal fakVrednost) {
        this.fakVrednost = fakVrednost;
    }




}

