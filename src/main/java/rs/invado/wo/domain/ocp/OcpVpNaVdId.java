package rs.invado.wo.domain.ocp;
// Generated Dec 9, 2012 6:19:17 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OcpVpNaVdId generated by hbm2java
 */
@Embeddable
public class OcpVpNaVdId  implements java.io.Serializable {


     private short vrstaStavke;
     private short idVd;
     private byte vrstaProizvoda;

    public OcpVpNaVdId() {
    }

    public OcpVpNaVdId(short vrstaStavke, short idVd, byte vrstaProizvoda) {
       this.vrstaStavke = vrstaStavke;
       this.idVd = idVd;
       this.vrstaProizvoda = vrstaProizvoda;
    }
   


    @Column(name="VRSTA_STAVKE#", nullable=false, precision=3, scale=0)
    public short getVrstaStavke() {
        return this.vrstaStavke;
    }
    
    public void setVrstaStavke(short vrstaStavke) {
        this.vrstaStavke = vrstaStavke;
    }


    @Column(name="ID_VD", nullable=false, precision=3, scale=0)
    public short getIdVd() {
        return this.idVd;
    }
    
    public void setIdVd(short idVd) {
        this.idVd = idVd;
    }


    @Column(name="VRSTA_PROIZVODA#", nullable=false, precision=2, scale=0)
    public byte getVrstaProizvoda() {
        return this.vrstaProizvoda;
    }
    
    public void setVrstaProizvoda(byte vrstaProizvoda) {
        this.vrstaProizvoda = vrstaProizvoda;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OcpVpNaVdId) ) return false;
		 OcpVpNaVdId castOther = ( OcpVpNaVdId ) other; 
         
		 return (this.getVrstaStavke()==castOther.getVrstaStavke())
 && (this.getIdVd()==castOther.getIdVd())
 && (this.getVrstaProizvoda()==castOther.getVrstaProizvoda());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getVrstaStavke();
         result = 37 * result + this.getIdVd();
         result = 37 * result + this.getVrstaProizvoda();
         return result;
   }   


}


